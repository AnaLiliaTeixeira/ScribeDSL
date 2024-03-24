/**
 */
package ScribedslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ScribedslPackage.ScribedslPackageFactory
 * @model kind="package"
 * @generated
 */
public interface ScribedslPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ScribedslPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Scribedsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Scribedsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScribedslPackagePackage eINSTANCE = ScribedslPackage.impl.ScribedslPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link ScribedslPackage.impl.ScribeDSLModelImpl <em>Scribe DSL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.ScribeDSLModelImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getScribeDSLModel()
	 * @generated
	 */
	int SCRIBE_DSL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Textprocessor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIBE_DSL_MODEL__TEXTPROCESSOR = 0;

	/**
	 * The number of structural features of the '<em>Scribe DSL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIBE_DSL_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scribe DSL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIBE_DSL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScribedslPackage.impl.TextProcessorImpl <em>Text Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.TextProcessorImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getTextProcessor()
	 * @generated
	 */
	int TEXT_PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Stem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__STEM = 2;

	/**
	 * The feature id for the '<em><b>Stopword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__STOPWORD = 3;

	/**
	 * The feature id for the '<em><b>Wordfrequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__WORDFREQUENCY = 4;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR__FILE = 5;

	/**
	 * The number of structural features of the '<em>Text Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Text Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScribedslPackage.impl.WordFrequencyImpl <em>Word Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.WordFrequencyImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getWordFrequency()
	 * @generated
	 */
	int WORD_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FREQUENCY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FREQUENCY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Word Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FREQUENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Word Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FREQUENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScribedslPackage.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.TextImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScribedslPackage.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.TokenImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScribedslPackage.impl.StemImpl <em>Stem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.StemImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getStem()
	 * @generated
	 */
	int STEM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Stem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScribedslPackage.impl.StopWordImpl <em>Stop Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.StopWordImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getStopWord()
	 * @generated
	 */
	int STOP_WORD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_WORD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Stop Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_WORD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stop Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_WORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScribedslPackage.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.FileImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ScribedslPackage.ScribeDSLModel <em>Scribe DSL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scribe DSL Model</em>'.
	 * @see ScribedslPackage.ScribeDSLModel
	 * @generated
	 */
	EClass getScribeDSLModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ScribedslPackage.ScribeDSLModel#getTextprocessor <em>Textprocessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textprocessor</em>'.
	 * @see ScribedslPackage.ScribeDSLModel#getTextprocessor()
	 * @see #getScribeDSLModel()
	 * @generated
	 */
	EReference getScribeDSLModel_Textprocessor();

	/**
	 * Returns the meta object for class '{@link ScribedslPackage.TextProcessor <em>Text Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Processor</em>'.
	 * @see ScribedslPackage.TextProcessor
	 * @generated
	 */
	EClass getTextProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link ScribedslPackage.TextProcessor#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see ScribedslPackage.TextProcessor#getText()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link ScribedslPackage.TextProcessor#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token</em>'.
	 * @see ScribedslPackage.TextProcessor#getToken()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link ScribedslPackage.TextProcessor#getStem <em>Stem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stem</em>'.
	 * @see ScribedslPackage.TextProcessor#getStem()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Stem();

	/**
	 * Returns the meta object for the containment reference list '{@link ScribedslPackage.TextProcessor#getStopword <em>Stopword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stopword</em>'.
	 * @see ScribedslPackage.TextProcessor#getStopword()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Stopword();

	/**
	 * Returns the meta object for the reference '{@link ScribedslPackage.TextProcessor#getWordfrequency <em>Wordfrequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wordfrequency</em>'.
	 * @see ScribedslPackage.TextProcessor#getWordfrequency()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_Wordfrequency();

	/**
	 * Returns the meta object for the containment reference '{@link ScribedslPackage.TextProcessor#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see ScribedslPackage.TextProcessor#getFile()
	 * @see #getTextProcessor()
	 * @generated
	 */
	EReference getTextProcessor_File();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Word Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word Frequency</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EInt"
	 * @generated
	 */
	EClass getWordFrequency();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWordFrequency()
	 * @generated
	 */
	EAttribute getWordFrequency_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWordFrequency()
	 * @generated
	 */
	EAttribute getWordFrequency_Value();

	/**
	 * Returns the meta object for class '{@link ScribedslPackage.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see ScribedslPackage.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link ScribedslPackage.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ScribedslPackage.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link ScribedslPackage.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see ScribedslPackage.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link ScribedslPackage.Token#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ScribedslPackage.Token#getName()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Name();

	/**
	 * Returns the meta object for class '{@link ScribedslPackage.Stem <em>Stem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stem</em>'.
	 * @see ScribedslPackage.Stem
	 * @generated
	 */
	EClass getStem();

	/**
	 * Returns the meta object for the attribute '{@link ScribedslPackage.Stem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ScribedslPackage.Stem#getName()
	 * @see #getStem()
	 * @generated
	 */
	EAttribute getStem_Name();

	/**
	 * Returns the meta object for class '{@link ScribedslPackage.StopWord <em>Stop Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Word</em>'.
	 * @see ScribedslPackage.StopWord
	 * @generated
	 */
	EClass getStopWord();

	/**
	 * Returns the meta object for the attribute '{@link ScribedslPackage.StopWord#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ScribedslPackage.StopWord#getName()
	 * @see #getStopWord()
	 * @generated
	 */
	EAttribute getStopWord_Name();

	/**
	 * Returns the meta object for class '{@link ScribedslPackage.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see ScribedslPackage.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference '{@link ScribedslPackage.File#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see ScribedslPackage.File#getText()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScribedslPackageFactory getScribedslPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ScribedslPackage.impl.ScribeDSLModelImpl <em>Scribe DSL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.ScribeDSLModelImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getScribeDSLModel()
		 * @generated
		 */
		EClass SCRIBE_DSL_MODEL = eINSTANCE.getScribeDSLModel();

		/**
		 * The meta object literal for the '<em><b>Textprocessor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIBE_DSL_MODEL__TEXTPROCESSOR = eINSTANCE.getScribeDSLModel_Textprocessor();

		/**
		 * The meta object literal for the '{@link ScribedslPackage.impl.TextProcessorImpl <em>Text Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.TextProcessorImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getTextProcessor()
		 * @generated
		 */
		EClass TEXT_PROCESSOR = eINSTANCE.getTextProcessor();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__TEXT = eINSTANCE.getTextProcessor_Text();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__TOKEN = eINSTANCE.getTextProcessor_Token();

		/**
		 * The meta object literal for the '<em><b>Stem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__STEM = eINSTANCE.getTextProcessor_Stem();

		/**
		 * The meta object literal for the '<em><b>Stopword</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__STOPWORD = eINSTANCE.getTextProcessor_Stopword();

		/**
		 * The meta object literal for the '<em><b>Wordfrequency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__WORDFREQUENCY = eINSTANCE.getTextProcessor_Wordfrequency();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSOR__FILE = eINSTANCE.getTextProcessor_File();

		/**
		 * The meta object literal for the '{@link ScribedslPackage.impl.WordFrequencyImpl <em>Word Frequency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.WordFrequencyImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getWordFrequency()
		 * @generated
		 */
		EClass WORD_FREQUENCY = eINSTANCE.getWordFrequency();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD_FREQUENCY__KEY = eINSTANCE.getWordFrequency_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD_FREQUENCY__VALUE = eINSTANCE.getWordFrequency_Value();

		/**
		 * The meta object literal for the '{@link ScribedslPackage.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.TextImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link ScribedslPackage.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.TokenImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__NAME = eINSTANCE.getToken_Name();

		/**
		 * The meta object literal for the '{@link ScribedslPackage.impl.StemImpl <em>Stem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.StemImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getStem()
		 * @generated
		 */
		EClass STEM = eINSTANCE.getStem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEM__NAME = eINSTANCE.getStem_Name();

		/**
		 * The meta object literal for the '{@link ScribedslPackage.impl.StopWordImpl <em>Stop Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.StopWordImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getStopWord()
		 * @generated
		 */
		EClass STOP_WORD = eINSTANCE.getStopWord();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_WORD__NAME = eINSTANCE.getStopWord_Name();

		/**
		 * The meta object literal for the '{@link ScribedslPackage.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.FileImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__TEXT = eINSTANCE.getFile_Text();

	}

} //ScribedslPackagePackage
