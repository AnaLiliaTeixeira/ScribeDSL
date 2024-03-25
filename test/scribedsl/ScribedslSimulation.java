package scribedsl;

import scribedsl.dsl.TextProcessing;

public class ScribedslSimulation {
	
	public static void main (String[] args) {
		
		TextProcessing processor = new TextProcessing();
		
		ProcessedData analyseText = processor.withData("Text")
											 .tokenize("\\s+")
											 .filterStopWords()
											 .performStemming()
											 .analyseWordFrequency()
											 .build();

		ProcessedData textFromFile = processor.fromFile("input.txt")
				 .tokenize("\\s+")
				 .filterStopWords()
				 .performStemming()
				 .analyseWordFrequency()
				 .build();
	}
}
