package scribedsl;

import java.util.List;
import java.util.Map.Entry;

import scribedsl.dsl.TextProcessing;

public class ScribedslTest {

	public static void main(String[] args) {

		TextProcessing processor = new TextProcessing();
		String text = "This is an example text to be processed";

		// Test 1 - Tokenize text
		ProcessedData tokenizeText = processor.withData(text).tokenize("\\s+").build();

		System.out.println("===== Test 1: Tokenize text =====");
		System.out.print("Token list: [");
		List<Token> tokens = tokenizeText.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
//			tokens.indexOf(t) == tokens.size() ? System.out.println(); : System.out.print(",");
		}
		System.out.print("]\n");

		// Test 2 - Tokenize text and filter stop words
		ProcessedData filterStopWords = processor.withData(text).tokenize("\\s+").filterStopWords().build();

		System.out.println("\n===== Test 2: Tokenize text and filter stop words =====");
		System.out.print("Token list: [");
		tokens = filterStopWords.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
		}
		System.out.print("]\n");

		// Test 3 - Tokenize text and perform stemming
		ProcessedData performStemming = processor.withData(text).tokenize("\\s+").performStemming().build();

		System.out.println("\n===== Test 3: Tokenize text and perform stemming =====");
		System.out.print("Token list: [");
		tokens = performStemming.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
		}
		System.out.print("]\n");

		// Test 4 - Tokenize text and analyse word frequency
		ProcessedData analyseWordFrequency = processor.withData(text).tokenize("\\s+").analyseWordFrequency().build();

		System.out.println("\n===== Test 4: Tokenize text and analyse word frequency =====");
		System.out.print("Token list: [");
		tokens = analyseWordFrequency.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
		}
		System.out.print("]\n");
		System.out.print("Analyse word frequency: [");
		for (Entry<String, Integer> e : analyseWordFrequency.getProcessor().getWordfrequency()) {
			System.out.print("(\"" + e.getKey() + "\" " + e.getValue() + "), ");
		}
		System.out.print("]\n");

		// Test 5 - Tokenize text, filter stop words and perform stemming
		ProcessedData stopWordsStemming = processor.withData(text).tokenize("\\s+").filterStopWords().performStemming()
				.build();

		System.out.println("\n===== Test 5: Tokenize text, filter stop words and perform stemming =====");
		System.out.print("Token list: [");
		tokens = stopWordsStemming.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
		}
		System.out.print("]\n");

		// Test 6 - Tokenize text, filter stop words and analyse word frequency
		ProcessedData stopWordsFrequency = processor.withData(text).tokenize("\\s+").filterStopWords()
				.analyseWordFrequency().build();

		System.out.println("\n===== Test 6: Tokenize text, filter stop words and analyse word frequency =====");
		System.out.print("Token list: [");
		tokens = stopWordsFrequency.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
		}
		System.out.print("]\n");
		System.out.print("Analyse word frequency: [");
		for (Entry<String, Integer> e : stopWordsFrequency.getProcessor().getWordfrequency()) {
			System.out.print("(\"" + e.getKey() + "\" " + e.getValue() + "), ");
		}
		System.out.print("]\n");

		// Test 7 - Tokenize text, perform stemming and analyse word frequency
		ProcessedData stemmingFrequency = processor.withData(text).tokenize("\\s+").performStemming()
				.analyseWordFrequency().build();

		System.out.println("\n===== Test 7: Tokenize text, perform stemming and analyse word frequency =====");
		System.out.print("Token list: [");
		tokens = stemmingFrequency.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
		}
		System.out.print("]\n");
		System.out.print("Analyse word frequency: [");
		for (Entry<String, Integer> e : stemmingFrequency.getProcessor().getWordfrequency()) {
			System.out.print("(\"" + e.getKey() + "\" " + e.getValue() + "), ");
		}
		System.out.print("]\n");

		// Test 8 - Tokenize text, filter stop words, perform stemming and analyse word
		// frequency
		ProcessedData analyseText = processor.withData(text).tokenize("\\s+").filterStopWords().performStemming()
				.analyseWordFrequency().build();

		System.out.println("\n===== Test 6: Tokenize text, filter stop words and analyse word frequency =====");
		System.out.print("Token list: [");
		tokens = analyseText.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
		}
		System.out.print("]\n");
		System.out.print("Analyse word frequency: [");
		for (Entry<String, Integer> e : analyseText.getProcessor().getWordfrequency()) {
			System.out.print("(\"" + e.getKey() + "\", " + e.getValue() + "), ");
		}
		System.out.print("]\n");

		// Test 9 - Read a text from a file, tokenize the text, filter stop words,
		// perform stemming and analyse word frequency
		ProcessedData textFromFile = processor.fromFile("input.txt").tokenize("\\s+").filterStopWords()
				.performStemming().analyseWordFrequency().build();

		System.out.println(
				"\n===== Test 9: Read a text from a file, tokenize the text, filter stop words, perform stemming and analyse word frequency =====");
		System.out.print("Token list: [");
		tokens = textFromFile.getProcessor().getToken();
		for (Token t : tokens) {
			System.out.print("\"" + t.getValue() + "\", ");
		}
		System.out.print("]\n");
		System.out.print("Analyse word frequency: [");
		for (Entry<String, Integer> e : textFromFile.getProcessor().getWordfrequency()) {
			System.out.print("(\"" + e.getKey() + "\", " + e.getValue() + "), ");
		}
		System.out.print("]\n");

	}
}
