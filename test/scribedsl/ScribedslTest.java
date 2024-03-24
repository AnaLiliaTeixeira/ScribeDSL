package scribedsl;

public class ScribedslTest {

	public static void main(String[] args) {
		
		ScribedslFactory factory = ScribedslFactory.eINSTANCE;
		
		Processor processor = factory.createProcessor();
		
		Text text = factory.createText();
		text.setValue("This is an example to be processed");
		
		ProcessedData tokenizedText = factory.createProcessedData();
		
	}
}
