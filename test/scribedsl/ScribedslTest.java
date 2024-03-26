package scribedsl;

import java.util.List;
import java.util.Map.Entry;

import scribedsl.dsl.TextProcessing;

public class ScribedslTest {

	public static void main(String[] args) {
		
		ScribedslFactory factory = ScribedslFactory.eINSTANCE;
		
		//1. Create the processor
//		Processor processor = factory.createProcessor();
		
		//2. Create an instance of a processed data
//		ProcessedData processedData = factory.createProcessedData();
		//3. Create one text
//		processor.setText(text);
//		Text text = factory.createText();
//		text.setValue("This is an example to be processed");
//				
//		System.out.println("This is the text: " + text.getValue());
		
		TextProcessing processor = new TextProcessing();
		ProcessedData analyseText = processor.withData("This is an example text to be processed")
											 .tokenize("\\s+")
											 .build();
		
		System.out.println("Text: " + analyseText.getProcessor().getText().getValue());
		List<Token> tokens = analyseText.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.println(t.getValue());
		}
		System.out.println();
		
		ProcessedData analyseText2 = processor.withData("This is an example text to be processed like an example")
				 .tokenize("\\s+")
				 .filterStopWords()
				 .performStemming()
				 .analyseWordFrequency()
				 .build();
		
		System.out.println();
		
		System.out.println("Text: " + analyseText2.getProcessor().getText().getValue());
		List<Token> tokens2 = analyseText2.getProcessor().getToken();
		for (Token t : tokens2) {
			System.out.println(t.getValue());
		}
		
		System.out.println("Analysing word frequency:");
		for (Entry<String, Integer> e : analyseText2.getProcessor().getWordfrequency()) {
			System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
		}
		
		System.out.println();
		
		ProcessedData analyseText3 = processor.fromFile("input.txt")
				 .tokenize("\\s+")
				 .filterStopWords()
				 .performStemming()
				 .analyseWordFrequency()
				 .build();
		
		System.out.println("Text: " + analyseText3.getProcessor().getText().getValue());
		List<Token> tokens3 = analyseText3.getProcessor().getToken();
		for (Token t : tokens3) {
			System.out.println(t.getValue());
		}
		
		System.out.println("Analysing word frequency:");
		for (Entry<String, Integer> e : analyseText3.getProcessor().getWordfrequency()) {
			System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
		}
	}
}
