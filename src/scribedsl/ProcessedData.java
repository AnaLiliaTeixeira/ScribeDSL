/**
 */
package scribedsl;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference list.
	 * The list contents are of type {@link scribedsl.Processor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference list.
	 * @see scribedsl.ScribedslPackage#getProcessedData_Processor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Processor> getProcessor();

} // ProcessedData
