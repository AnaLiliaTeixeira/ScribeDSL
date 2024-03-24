package ScribedslPackage.dsl;

import java.util.ArrayList;
import java.util.List;

import ScribedslPackage.ScribeDSLModel;
import ScribedslPackage.ScribedslPackageFactory;
import ScribedslPackage.Text;
import ScribedslPackage.TextProcessor;
import ScribedslPackage.Token;

public class ScribedslBuilder {

	private static ScribedslPackageFactory factory = ScribedslPackageFactory.eINSTANCE;

    
    public Initial withData(String text) {
        return new ProcessedData(factory.createTextProcessor(), text);
    }
    
    public interface Initial {
    	public AfterTokenizer tokenize(String regex);
    	public FromFile fromFile(String path);
    }
    
    public interface FromFile {
    	public AfterTokenizer tokenize(String regex);
    }
    
    public interface AfterTokenizer {
    	public ScribeDSLModel build();
    	public FilterStopWords filterStopWords();
    	public PerformStemming performStemming();
    	public AnalyseWordFrequency analyseWordFrequency();
    }
    
    public interface FilterStopWords {
    	public PerformStemming performStemming();
    	public AnalyseWordFrequency analyseWordFrequency();
    	public ScribeDSLModel build();
    }
    
    public interface PerformStemming {
    	public AnalyseWordFrequency analyseWordFrequency();
    	public ScribeDSLModel build();
    }
    
    public interface AnalyseWordFrequency {
    	public ScribeDSLModel build();
    }
    
    public static class ProcessedData implements Initial, FromFile, AfterTokenizer, FilterStopWords, PerformStemming {

    	
        public ProcessedData(TextProcessor textProcessor, String text) {
        	
        }
		@Override
		public ScribeDSLModel build() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public FilterStopWords filterStopWords() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public PerformStemming performStemming() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public AnalyseWordFrequency analyseWordFrequency() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public AfterTokenizer tokenize(String regex) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public FromFile fromFile(String path) {
			// TODO Auto-generated method stub
			return null;
		}
		
//		public Text getText() {
//			return text;
//		}
//
//		public void setText(Text text) {
//			this.text = text;
//		}
    }
}
