/**
 */
package scribedsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processed Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scribedsl.ProcessedData#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @see scribedsl.ScribedslPackage#getProcessedData()
 * @model
 * @generated
 */
public interface ProcessedData extends EObject {
	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference.
	 * @see #setProcessor(Processor)
	 * @see scribedsl.ScribedslPackage#getProcessedData_Processor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link scribedsl.ProcessedData#getProcessor <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' containment reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

} // ProcessedData
