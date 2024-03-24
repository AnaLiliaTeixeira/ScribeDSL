/**
 */
package scribedsl;

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
 * @see scribedsl.ScribedslFactory
 * @model kind="package"
 * @generated
 */
public interface ScribedslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scribedsl";

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
	ScribedslPackage eINSTANCE = scribedsl.impl.ScribedslPackageImpl.init();

	/**
	 * The meta object id for the '{@link scribedsl.impl.ProcessedDataImpl <em>Processed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribedsl.impl.ProcessedDataImpl
	 * @see scribedsl.impl.ScribedslPackageImpl#getProcessedData()
	 * @generated
	 */
	int PROCESSED_DATA = 0;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_DATA__PROCESSOR = 0;

	/**
	 * The number of structural features of the '<em>Processed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Processed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scribedsl.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribedsl.impl.ProcessorImpl
	 * @see scribedsl.impl.ScribedslPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Stopword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__STOPWORD = 2;

	/**
	 * The feature id for the '<em><b>Wordfrequency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__WORDFREQUENCY = 3;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scribedsl.impl.WordFrequencyImpl <em>Word Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribedsl.impl.WordFrequencyImpl
	 * @see scribedsl.impl.ScribedslPackageImpl#getWordFrequency()
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
	 * The meta object id for the '{@link scribedsl.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribedsl.impl.TextImpl
	 * @see scribedsl.impl.ScribedslPackageImpl#getText()
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
	 * The meta object id for the '{@link scribedsl.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribedsl.impl.TokenImpl
	 * @see scribedsl.impl.ScribedslPackageImpl#getToken()
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
	 * The meta object id for the '{@link scribedsl.impl.StopWordImpl <em>Stop Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scribedsl.impl.StopWordImpl
	 * @see scribedsl.impl.ScribedslPackageImpl#getStopWord()
	 * @generated
	 */
	int STOP_WORD = 5;

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
	 * Returns the meta object for class '{@link scribedsl.ProcessedData <em>Processed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processed Data</em>'.
	 * @see scribedsl.ProcessedData
	 * @generated
	 */
	EClass getProcessedData();

	/**
	 * Returns the meta object for the containment reference list '{@link scribedsl.ProcessedData#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see scribedsl.ProcessedData#getProcessor()
	 * @see #getProcessedData()
	 * @generated
	 */
	EReference getProcessedData_Processor();

	/**
	 * Returns the meta object for class '{@link scribedsl.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see scribedsl.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link scribedsl.Processor#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see scribedsl.Processor#getText()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link scribedsl.Processor#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token</em>'.
	 * @see scribedsl.Processor#getToken()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link scribedsl.Processor#getStopword <em>Stopword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stopword</em>'.
	 * @see scribedsl.Processor#getStopword()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Stopword();

	/**
	 * Returns the meta object for the reference list '{@link scribedsl.Processor#getWordfrequency <em>Wordfrequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wordfrequency</em>'.
	 * @see scribedsl.Processor#getWordfrequency()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Wordfrequency();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Word Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word Frequency</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject"
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
	 * Returns the meta object for class '{@link scribedsl.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see scribedsl.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link scribedsl.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scribedsl.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link scribedsl.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see scribedsl.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link scribedsl.Token#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scribedsl.Token#getValue()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Value();

	/**
	 * Returns the meta object for class '{@link scribedsl.StopWord <em>Stop Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Word</em>'.
	 * @see scribedsl.StopWord
	 * @generated
	 */
	EClass getStopWord();

	/**
	 * Returns the meta object for the attribute '{@link scribedsl.StopWord#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scribedsl.StopWord#getValue()
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
	ScribedslFactory getScribedslFactory();

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
		 * The meta object literal for the '{@link scribedsl.impl.ProcessedDataImpl <em>Processed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribedsl.impl.ProcessedDataImpl
		 * @see scribedsl.impl.ScribedslPackageImpl#getProcessedData()
		 * @generated
		 */
		EClass PROCESSED_DATA = eINSTANCE.getProcessedData();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSED_DATA__PROCESSOR = eINSTANCE.getProcessedData_Processor();

		/**
		 * The meta object literal for the '{@link scribedsl.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribedsl.impl.ProcessorImpl
		 * @see scribedsl.impl.ScribedslPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__TEXT = eINSTANCE.getProcessor_Text();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__TOKEN = eINSTANCE.getProcessor_Token();

		/**
		 * The meta object literal for the '<em><b>Stopword</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__STOPWORD = eINSTANCE.getProcessor_Stopword();

		/**
		 * The meta object literal for the '<em><b>Wordfrequency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__WORDFREQUENCY = eINSTANCE.getProcessor_Wordfrequency();

		/**
		 * The meta object literal for the '{@link scribedsl.impl.WordFrequencyImpl <em>Word Frequency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribedsl.impl.WordFrequencyImpl
		 * @see scribedsl.impl.ScribedslPackageImpl#getWordFrequency()
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
		 * The meta object literal for the '{@link scribedsl.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribedsl.impl.TextImpl
		 * @see scribedsl.impl.ScribedslPackageImpl#getText()
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
		 * The meta object literal for the '{@link scribedsl.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribedsl.impl.TokenImpl
		 * @see scribedsl.impl.ScribedslPackageImpl#getToken()
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
		 * The meta object literal for the '{@link scribedsl.impl.StopWordImpl <em>Stop Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scribedsl.impl.StopWordImpl
		 * @see scribedsl.impl.ScribedslPackageImpl#getStopWord()
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

} //ScribedslPackage
