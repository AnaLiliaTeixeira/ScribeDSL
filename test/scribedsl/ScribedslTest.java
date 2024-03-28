package scribedsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import scribedsl.dsl.TextProcessing;

public class ScribedslTest {

	public static void main(String[] args) {

		TextProcessing processor = new TextProcessing();
		List<Token> tokens = new ArrayList<>();
		String text = "This is an example text to be processed";

		// Test 1 - Tokenize text
		ProcessedData tokenizeText = processor.withData(text).tokenize("\\s+").build();

		System.out.println("===== Test 1: Tokenize text =====");
		printTokenList(tokens, tokenizeText);

		// Test 2 - Tokenize text and filter stop words
		ProcessedData filterStopWords = processor.withData(text).tokenize("\\s+").filterStopWords().build();

		System.out.println("\n===== Test 2: Tokenize text and filter stop words =====");
		printTokenList(tokens, filterStopWords);

		// Test 3 - Tokenize text and perform stemming
		ProcessedData performStemming = processor.withData(text).tokenize("\\s+").performStemming().build();

		System.out.println("\n===== Test 3: Tokenize text and perform stemming =====");
		printTokenList(tokens, performStemming);

		// Test 4 - Tokenize text and analyse word frequency
		ProcessedData analyseWordFrequency = processor.withData(text).tokenize("\\s+").analyseWordFrequency().build();

		System.out.println("\n===== Test 4: Tokenize text and analyse word frequency =====");
		printListAnalyseFrequency(tokens, analyseWordFrequency);
		
		// Test 4.1 - Tokenize text and analyse word frequency
		String text1 = "This text example is an example text to be processed";
		ProcessedData analyseWordFrequency1 = processor.withData(text1).tokenize("\\s+").analyseWordFrequency().build();

		System.out.println("\n===== Test 4.1: Tokenize text and analyse word frequency =====");
		printListAnalyseFrequency(tokens, analyseWordFrequency1);

		// Test 5 - Tokenize text, filter stop words and perform stemming
		ProcessedData stopWordsStemming = processor.withData(text).tokenize("\\s+").filterStopWords().performStemming()
				.build();

		System.out.println("\n===== Test 5: Tokenize text, filter stop words and perform stemming =====");
		printTokenList(tokens, stopWordsStemming);

		// Test 6 - Tokenize text, filter stop words and analyse word frequency
		ProcessedData stopWordsFrequency = processor.withData(text).tokenize("\\s+").filterStopWords()
				.analyseWordFrequency().build();

		System.out.println("\n===== Test 6: Tokenize text, filter stop words and analyse word frequency =====");
		printListAnalyseFrequency(tokens, stopWordsFrequency);

		// Test 7 - Tokenize text, perform stemming and analyse word frequency
		ProcessedData stemmingFrequency = processor.withData(text).tokenize("\\s+").performStemming()
				.analyseWordFrequency().build();

		System.out.println("\n===== Test 7: Tokenize text, perform stemming and analyse word frequency =====");
		printListAnalyseFrequency(tokens, stemmingFrequency);

		// Test 8 - Tokenize text, filter stop words, perform stemming and analyse word
		// frequency
		ProcessedData analyseText = processor.withData(text).tokenize("\\s+").filterStopWords().performStemming()
				.analyseWordFrequency().build();

		System.out.println(
				"\n===== Test 8: Tokenize text, filter stop words, perform stemming and analyse word frequency =====");
		printListAnalyseFrequency(tokens, analyseText);

		// Test 9 - Read text from file, tokenize text, filter stop words, perform
		// stemming and analyse word frequency
		ProcessedData textFromFile = processor.fromFile("input.txt").tokenize("\\s+").filterStopWords()
				.performStemming().analyseWordFrequency().build();

		System.out.println(
				"\n===== Test 9: Read text from file, tokenize text, filter stop words, perform stemming and analyse word frequency =====");
		printListAnalyseFrequency(tokens, textFromFile);

	}

	public static void printTokenList(List<Token> tokens, ProcessedData processedData) {
		System.out.print("Token list: [");
		tokens = processedData.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
		}
		System.out.print("]\n");
		
		if (hasStopWords(tokens, processedData))
			System.out.println("This list has stop words.");		
		else
			System.out.println("This list doesn't have stop words.");		
	}

	public static void printListAnalyseFrequency(List<Token> tokens, ProcessedData processedData) {
		printTokenList(tokens, processedData);

		System.out.print("Analyse word frequency: [");
		for (Entry<String, Integer> e : processedData.getProcessor().getWordfrequency()) {
			System.out.print("(\"" + e.getKey() + "\", " + e.getValue() + "), ");
		}
		System.out.print("]\n");
	}
	
	public static boolean hasStopWords(List<Token> tokens, ProcessedData processedData) {
		tokens = processedData.getProcessor().getToken();
		List<StopWord> stopWords = processedData.getProcessor().getStopword();
		
		for (Token t : tokens) {
			for (StopWord sw : stopWords) {
				if (sw.getValue().equals(t.getValue().toLowerCase()))
					return true;
			}
		}
		
		return false;
	}
}
