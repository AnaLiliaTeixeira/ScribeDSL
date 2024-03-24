package scribedsl;

import ScribedslPackage.ProcessedData;
import ScribedslPackage.dsl.ScribedslBuilder;

public class ScribedslSimulation {
	
	public static void main (String[] args) {
		
		ScribedslBuilder processor = new ScribedslBuilder();
		ProcessedData tokenizedText = processor.withData("Text").tokenize("\\s+").build();
		
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
