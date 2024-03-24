package scribedsl;

import java.util.Iterator;

import ScribedslPackage.ProcessedData;
import ScribedslPackage.dsl.ScribedslBuilder;
import ScribedslPackage.dsl.ScribedslBuilder.Initial;

public class ScribedslSimulation {
	
	public static void main (String[] args) {
		
		ScribedslBuilder builder = new ScribedslBuilder();
		Initial processor1 = builder.builder();
		ProcessedData tokenizedText = processor1.withData("Text").tokenize("\\s+").build();

	}
}
