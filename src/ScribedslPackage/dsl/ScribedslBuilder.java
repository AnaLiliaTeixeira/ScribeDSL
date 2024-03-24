package ScribedslPackage.dsl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ScribedslPackage.ProcessedData;
import ScribedslPackage.ScribedslPackageFactory;
import ScribedslPackage.StopWord;
import ScribedslPackage.Text;
import ScribedslPackage.TextProcessing;
import ScribedslPackage.Token;

public class ScribedslBuilder {

	private static ScribedslPackageFactory factory = ScribedslPackageFactory.eINSTANCE;

    
    public Initial builder() {
        return new ProcessedDataImpl(factory.createTextProcessing());
    }
    
    public interface Initial {	
    	public ReadText withData(String text);
    	public ReadText fromFile(String path);
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
    
    public static class ProcessedDataImpl implements Initial, ReadText, Tokenizer, FilterStopWords, PerformStemming, AnalyseWordFrequency {

    	private TextProcessing processor;
    	private Text text;
    	
        public ProcessedDataImpl(TextProcessing textProcessing) {
        	this.processor = textProcessing;
	        this.text = factory.createText();
	        
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
        
		@Override
		public ReadText withData(String text) {
	        this.text.setValue(text);
			return this;
		}

		@Override
		public ReadText fromFile(String path) {
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
			return this;
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
			for (Token t : processor.getToken()) {
//				if (processor.getStopword(((s) -> s.getName().equals(t.getName())))) {
//					processor.getToken().remove(t);
//				}
			}
			return this;
		}

		@Override
		public PerformStemming performStemming() {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		public AnalyseWordFrequency analyseWordFrequency() {
			for (Token t : processor.getToken()) {
//				processor.set;
			}
			return this;
		}
        
		@Override
		public ProcessedData build() {
			// TODO Auto-generated method stub
			return null;
		}
    }
}
