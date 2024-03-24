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
	 * The meta object id for the '{@link ScribedslPackage.impl.ProcessedDataImpl <em>Processed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.ProcessedDataImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getProcessedData()
	 * @generated
	 */
	int PROCESSED_DATA = 0;

	/**
	 * The number of structural features of the '<em>Processed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Processed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScribedslPackage.impl.TextProcessingImpl <em>Text Processing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScribedslPackage.impl.TextProcessingImpl
	 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getTextProcessing()
	 * @generated
	 */
	int TEXT_PROCESSING = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSING__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSING__TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Stem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSING__STEM = 2;

	/**
	 * The feature id for the '<em><b>Stopword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSING__STOPWORD = 3;

	/**
	 * The feature id for the '<em><b>Wordfrequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSING__WORDFREQUENCY = 4;

	/**
	 * The feature id for the '<em><b>Processeddata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSING__PROCESSEDDATA = 5;

	/**
	 * The number of structural features of the '<em>Text Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Text Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROCESSING_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__VALUE = 0;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEM__VALUE = 0;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_WORD__VALUE = 0;

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
	 * Returns the meta object for class '{@link ScribedslPackage.ProcessedData <em>Processed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processed Data</em>'.
	 * @see ScribedslPackage.ProcessedData
	 * @generated
	 */
	EClass getProcessedData();

	/**
	 * Returns the meta object for class '{@link ScribedslPackage.TextProcessing <em>Text Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Processing</em>'.
	 * @see ScribedslPackage.TextProcessing
	 * @generated
	 */
	EClass getTextProcessing();

	/**
	 * Returns the meta object for the containment reference '{@link ScribedslPackage.TextProcessing#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see ScribedslPackage.TextProcessing#getText()
	 * @see #getTextProcessing()
	 * @generated
	 */
	EReference getTextProcessing_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link ScribedslPackage.TextProcessing#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token</em>'.
	 * @see ScribedslPackage.TextProcessing#getToken()
	 * @see #getTextProcessing()
	 * @generated
	 */
	EReference getTextProcessing_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link ScribedslPackage.TextProcessing#getStem <em>Stem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stem</em>'.
	 * @see ScribedslPackage.TextProcessing#getStem()
	 * @see #getTextProcessing()
	 * @generated
	 */
	EReference getTextProcessing_Stem();

	/**
	 * Returns the meta object for the containment reference list '{@link ScribedslPackage.TextProcessing#getStopword <em>Stopword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stopword</em>'.
	 * @see ScribedslPackage.TextProcessing#getStopword()
	 * @see #getTextProcessing()
	 * @generated
	 */
	EReference getTextProcessing_Stopword();

	/**
	 * Returns the meta object for the reference '{@link ScribedslPackage.TextProcessing#getWordfrequency <em>Wordfrequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wordfrequency</em>'.
	 * @see ScribedslPackage.TextProcessing#getWordfrequency()
	 * @see #getTextProcessing()
	 * @generated
	 */
	EReference getTextProcessing_Wordfrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link ScribedslPackage.TextProcessing#getProcesseddata <em>Processeddata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processeddata</em>'.
	 * @see ScribedslPackage.TextProcessing#getProcesseddata()
	 * @see #getTextProcessing()
	 * @generated
	 */
	EReference getTextProcessing_Processeddata();

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
	 * Returns the meta object for the attribute '{@link ScribedslPackage.Token#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ScribedslPackage.Token#getValue()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Value();

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
	 * Returns the meta object for the attribute '{@link ScribedslPackage.Stem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ScribedslPackage.Stem#getValue()
	 * @see #getStem()
	 * @generated
	 */
	EAttribute getStem_Value();

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
	 * Returns the meta object for the attribute '{@link ScribedslPackage.StopWord#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ScribedslPackage.StopWord#getValue()
	 * @see #getStopWord()
	 * @generated
	 */
	EAttribute getStopWord_Value();

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
		 * The meta object literal for the '{@link ScribedslPackage.impl.ProcessedDataImpl <em>Processed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.ProcessedDataImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getProcessedData()
		 * @generated
		 */
		EClass PROCESSED_DATA = eINSTANCE.getProcessedData();

		/**
		 * The meta object literal for the '{@link ScribedslPackage.impl.TextProcessingImpl <em>Text Processing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScribedslPackage.impl.TextProcessingImpl
		 * @see ScribedslPackage.impl.ScribedslPackagePackageImpl#getTextProcessing()
		 * @generated
		 */
		EClass TEXT_PROCESSING = eINSTANCE.getTextProcessing();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSING__TEXT = eINSTANCE.getTextProcessing_Text();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSING__TOKEN = eINSTANCE.getTextProcessing_Token();

		/**
		 * The meta object literal for the '<em><b>Stem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSING__STEM = eINSTANCE.getTextProcessing_Stem();

		/**
		 * The meta object literal for the '<em><b>Stopword</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSING__STOPWORD = eINSTANCE.getTextProcessing_Stopword();

		/**
		 * The meta object literal for the '<em><b>Wordfrequency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSING__WORDFREQUENCY = eINSTANCE.getTextProcessing_Wordfrequency();

		/**
		 * The meta object literal for the '<em><b>Processeddata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PROCESSING__PROCESSEDDATA = eINSTANCE.getTextProcessing_Processeddata();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__VALUE = eINSTANCE.getToken_Value();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEM__VALUE = eINSTANCE.getStem_Value();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_WORD__VALUE = eINSTANCE.getStopWord_Value();

	}

} //ScribedslPackagePackage
