/**
 */
package scribedsl.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import scribedsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScribedslFactoryImpl extends EFactoryImpl implements ScribedslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScribedslFactory init() {
		try {
			ScribedslFactory theScribedslFactory = (ScribedslFactory)EPackage.Registry.INSTANCE.getEFactory(ScribedslPackage.eNS_URI);
			if (theScribedslFactory != null) {
				return theScribedslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScribedslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScribedslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScribedslPackage.PROCESSED_DATA: return createProcessedData();
			case ScribedslPackage.PROCESSOR: return createProcessor();
			case ScribedslPackage.WORD_FREQUENCY: return (EObject)createWordFrequency();
			case ScribedslPackage.TEXT: return createText();
			case ScribedslPackage.TOKEN: return createToken();
			case ScribedslPackage.STOP_WORD: return createStopWord();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessedData createProcessedData() {
		ProcessedDataImpl processedData = new ProcessedDataImpl();
		return processedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Integer> createWordFrequency() {
		WordFrequencyImpl wordFrequency = new WordFrequencyImpl();
		return wordFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopWord createStopWord() {
		StopWordImpl stopWord = new StopWordImpl();
		return stopWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScribedslPackage getScribedslPackage() {
		return (ScribedslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScribedslPackage getPackage() {
		return ScribedslPackage.eINSTANCE;
	}

} //ScribedslFactoryImpl
