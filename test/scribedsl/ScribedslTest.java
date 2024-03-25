package scribedsl;

import java.util.List;

public class ScribedslTest {

	public static void main(String[] args) {
		
		ScribedslFactory factory = ScribedslFactory.eINSTANCE;
		
		//1. Create the processor
		Processor processor = factory.createProcessor();
		
		//2. Create an instance of a processed data
		ProcessedData processedData = factory.createProcessedData();
		
		//3. Create one text
		Text text = factory.createText();
		text.setValue("This is an example to be processed");
		processor.setText(text);
				
		System.out.println("This is the text: " + processor.getText().getValue());
		
		List<Token> tokens = processor.getToken();
		for (Token t : tokens) {
			System.out.println(t.getValue());
		}
		
		
	}
}
