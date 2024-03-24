/**
 */
package ScribedslPackage.impl;

import ScribedslPackage.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScribedslPackageFactoryImpl extends EFactoryImpl implements ScribedslPackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScribedslPackageFactory init() {
		try {
			ScribedslPackageFactory theScribedslPackageFactory = (ScribedslPackageFactory)EPackage.Registry.INSTANCE.getEFactory(ScribedslPackagePackage.eNS_URI);
			if (theScribedslPackageFactory != null) {
				return theScribedslPackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScribedslPackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScribedslPackageFactoryImpl() {
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
			case ScribedslPackagePackage.SCRIBE_DSL_MODEL: return createScribeDSLModel();
			case ScribedslPackagePackage.TEXT_PROCESSOR: return createTextProcessor();
			case ScribedslPackagePackage.WORD_FREQUENCY: return (EObject)createWordFrequency();
			case ScribedslPackagePackage.TEXT: return createText();
			case ScribedslPackagePackage.TOKEN: return createToken();
			case ScribedslPackagePackage.STEM: return createStem();
			case ScribedslPackagePackage.STOP_WORD: return createStopWord();
			case ScribedslPackagePackage.FILE: return createFile();
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
	public ScribeDSLModel createScribeDSLModel() {
		ScribeDSLModelImpl scribeDSLModel = new ScribeDSLModelImpl();
		return scribeDSLModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextProcessor createTextProcessor() {
		TextProcessorImpl textProcessor = new TextProcessorImpl();
		return textProcessor;
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
	public Stem createStem() {
		StemImpl stem = new StemImpl();
		return stem;
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
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScribedslPackagePackage getScribedslPackagePackage() {
		return (ScribedslPackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScribedslPackagePackage getPackage() {
		return ScribedslPackagePackage.eINSTANCE;
	}

} //ScribedslPackageFactoryImpl
