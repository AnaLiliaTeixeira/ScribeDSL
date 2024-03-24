/**
 */
package scribedsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see scribedsl.ScribedslPackage
 * @generated
 */
public interface ScribedslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScribedslFactory eINSTANCE = scribedsl.impl.ScribedslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Processed Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processed Data</em>'.
	 * @generated
	 */
	ProcessedData createProcessedData();

	/**
	 * Returns a new object of class '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor</em>'.
	 * @generated
	 */
	Processor createProcessor();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Stop Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Word</em>'.
	 * @generated
	 */
	StopWord createStopWord();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScribedslPackage getScribedslPackage();

} //ScribedslFactory
