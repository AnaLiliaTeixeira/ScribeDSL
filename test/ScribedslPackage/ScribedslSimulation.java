package ScribedslPackage;

import ScribedslPackage.dsl.ScribedslBuilder;
import ScribedslPackage.dsl.ScribedslBuilder.ProcessedData;

public class ScribedslSimulation {
	
	public static void main (String[] args) {
		
		ScribedslBuilder processor = new ScribedslBuilder();
		ProcessedData tokenizedText = processor.withData("Text").tokenize("\\s+").build();
		System.out.println(tokenizedText);
	}
}
