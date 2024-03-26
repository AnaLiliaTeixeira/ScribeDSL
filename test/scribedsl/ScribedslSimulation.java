package scribedsl;

import scribedsl.dsl.TextProcessing;

public class ScribedslSimulation {
	
	public static void main (String[] args) {
		
		TextProcessing processor = new TextProcessing();
		String text = "This is an example text to be processed";
		
		ProcessedData tokenizeText = processor.withData(text)
				 .tokenize("\\s+")
				 .build();
		
		ProcessedData filterStopWords = processor.withData(text)
				.tokenize("\\s+")
				.filterStopWords()
				.build();
		
		ProcessedData performStemming = processor.withData(text)
				.tokenize("\\s+")
				.performStemming()
				.build();

		ProcessedData analyseWordFrequency = processor.withData(text)
				.tokenize("\\s+")
				.analyseWordFrequency()
				.build();
		
		ProcessedData stopWordsStemming = processor.withData(text)
				.tokenize("\\s+")
				.filterStopWords()
				.performStemming()
				.build();
		
		ProcessedData stopWordsFrequency = processor.withData(text)
				.tokenize("\\s+")
				.filterStopWords()
				.analyseWordFrequency()
				.build();
		
		ProcessedData stemmingFrequency = processor.withData(text)
				.tokenize("\\s+")
				.performStemming()
				.analyseWordFrequency()
				.build();
		
		ProcessedData analyseText = processor.withData(text)
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
