/**
 */
package ScribedslPackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ScribedslPackage.ScribedslPackagePackage
 * @generated
 */
public interface ScribedslPackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScribedslPackageFactory eINSTANCE = ScribedslPackage.impl.ScribedslPackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Processed Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processed Data</em>'.
	 * @generated
	 */
	ProcessedData createProcessedData();

	/**
	 * Returns a new object of class '<em>Text Processing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Processing</em>'.
	 * @generated
	 */
	TextProcessing createTextProcessing();

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
	 * Returns a new object of class '<em>Stem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stem</em>'.
	 * @generated
	 */
	Stem createStem();

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
	ScribedslPackagePackage getScribedslPackagePackage();

} //ScribedslPackageFactory
