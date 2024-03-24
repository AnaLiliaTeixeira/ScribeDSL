package ScribedslPackage.dsl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.tartarus.snowball.ext.PorterStemmer;

import ScribedslPackage.ProcessedData;
import ScribedslPackage.ScribedslPackageFactory;
import ScribedslPackage.StopWord;
import ScribedslPackage.Text;
import ScribedslPackage.TextProcessing;
import ScribedslPackage.Token;

public class ScribedslBuilder {

	private static ScribedslPackageFactory factory = ScribedslPackageFactory.eINSTANCE;

    
    public ReadText withData(String text) {
        return new ProcessedDataImpl(factory.createTextProcessing(), text, false);
    }
    
    public ReadText fromFile(String path) {
        return new ProcessedDataImpl(factory.createTextProcessing(), path, true);

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
    
    public static class ProcessedDataImpl implements ReadText, Tokenizer, FilterStopWords, PerformStemming, AnalyseWordFrequency {

    	private TextProcessing processor;
    	private ProcessedData processedData;
    	private Text text;
    	
        public ProcessedDataImpl(TextProcessing textProcessing, String textOrPath, boolean isPath) {
        	this.processor = textProcessing;
	        this.text = factory.createText();
	        
	        if (isPath)
	        	fromFile(textOrPath);
	        else
	        	withData(textOrPath);
	        
	        try (BufferedReader br = new BufferedReader(new FileReader("StopWords.txt"))) {
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
        
		public void withData(String text) {
	        this.text.setValue(text);
		}

		public void fromFile(String path) {
	        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	        	StringBuilder sb = new StringBuilder();
	            String line;
	            while ((line = br.readLine()) != null) {
	            	sb.append(line);
	            }
	            this.text.setValue(sb.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}

		@Override
		public Tokenizer tokenize(String regex) {
        	String[] splitted = this.text.getValue().split(regex);
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
				for (StopWord sw : processor.getStopword()) {
					if (sw.getValue().equals(t.getValue()))
						filteredTokenList.add(t);
				}
			}
			tokenList.clear();
			tokenList.addAll(filteredTokenList);
			return this;
		}

		@Override
		public PerformStemming performStemming() {
			PorterStemmer stemmer = new PorterStemmer();
			List<Token> stemmedTokens = new ArrayList<>();
			for (Token t : processor.getToken()) {
				stemmer.setCurrent(t.getValue());
				stemmer.stem();
				stemmer.getCurrent();
				stemmedTokens.add(t);
			}
			processor.getToken().clear();
			processor.getToken().addAll(stemmedTokens);
			return this;
		}

		@Override
		public AnalyseWordFrequency analyseWordFrequency() {
			for (Token t : processor.getToken()) {
			}
			return this;
		}
        
		@Override
		public ProcessedData build() {
			return processedData;
		}
    }
}
