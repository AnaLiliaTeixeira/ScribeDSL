package scribedsl.dsl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EMap;

import opennlp.tools.stemmer.PorterStemmer;
import scribedsl.ProcessedData;
import scribedsl.Processor;
import scribedsl.ScribedslFactory;
import scribedsl.StopWord;
import scribedsl.Text;
import scribedsl.Token;

public class TextProcessing {

	private static ScribedslFactory factory = ScribedslFactory.eINSTANCE;

	public ReadText withData(String text) {
		return new ProcessedDataImpl(text, false);
	}

	public ReadText fromFile(String path) {
		return new ProcessedDataImpl(path, true);

	}

	public interface ReadText {
		public Tokenizer tokenize(String regex);
	}

	public interface Tokenizer {
		public ProcessedData build();
		public FilterStopWords filterStopWords();
		public PerformStemming performStemming();
		public AnalyseWordFrequency analyseWordFrequency();
	}

	public interface FilterStopWords {
		public PerformStemming performStemming();
		public AnalyseWordFrequency analyseWordFrequency();
		public ProcessedData build();
	}

	public interface PerformStemming {
		public AnalyseWordFrequency analyseWordFrequency();
		public ProcessedData build();
	}

	public interface AnalyseWordFrequency {
		public ProcessedData build();
	}

	public static class ProcessedDataImpl
			implements ReadText, Tokenizer, FilterStopWords, PerformStemming, AnalyseWordFrequency {

		private Processor processor;
		private ProcessedData processedData;

		public ProcessedDataImpl(String textOrPath, boolean isPath) {
			this.processor = factory.createProcessor();
			this.processedData = factory.createProcessedData();	
			this.processedData.setProcessor(processor);

			if (isPath)
				fromFile(textOrPath);
			else
				withData(textOrPath);

			try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("stopWords.txt")))) {
				String line;
				while ((line = br.readLine()) != null) {
					StopWord sw = factory.createStopWord();
					sw.setValue(line.trim());
					processor.getStopword().add(sw);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void sayHello() {
			System.out.println("Hello!!");
		}

		public void withData(String textName) {
			Text text = factory.createText();
			text.setValue(textName);
			processor.setText(text);
		}

		public void fromFile(String path) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)))) {
				StringBuilder sb = new StringBuilder();
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line).append(" ");
				}
				withData(sb.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public Tokenizer tokenize(String regex) {
			String[] splitted = processor.getText().getValue().split(regex);
			for (String s : splitted) {
				Token tokenToAdd = factory.createToken();
				tokenToAdd.setValue(s);
				processor.getToken().add(tokenToAdd);
			}
			return this;
		}

		@Override
		public FilterStopWords filterStopWords() {
			List<Token> tokenList = processor.getToken();
			List<Token> filteredTokenList = new ArrayList<>();

			for (Token t : tokenList) {
				boolean isStopWord = false;
				for (StopWord sw : processor.getStopword()) {
					if (sw.getValue().equals(t.getValue().toLowerCase()))
						isStopWord = true;
				}
				if (!isStopWord)
					filteredTokenList.add(t);
			}
			tokenList.clear();
			tokenList.addAll(filteredTokenList);
			return this;
		}

		@Override
		public PerformStemming performStemming() {
			PorterStemmer stemmer = new PorterStemmer();
			List<Token> stemmedTokens = new ArrayList<>();
			List<Token> tokens = processor.getToken();
			
			for (Token t : tokens) {
				
				stemmer.stem(t.getValue());
				t.setValue(stemmer.toString());
				
				stemmedTokens.add(t);
			}
			tokens.clear();
			tokens.addAll(stemmedTokens);
			return this;
		}

		@Override
		public AnalyseWordFrequency analyseWordFrequency() {
			EMap<String, Integer> wordFrequencyMap = processor.getWordfrequency();
			for (Token t : processor.getToken()) {
	            String word = t.getValue();
	            if (wordFrequencyMap.containsKey(word)) {
	                wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
	            } else {
	                wordFrequencyMap.put(word, 1);
	            }
			}
			return this;
		}

		@Override
		public ProcessedData build() {
			return processedData;
		}
		
		public Processor getProcessor() {
			return processor;
		}

		public void setProcessor(Processor processor) {
			this.processor = processor;
		}
	}
}
