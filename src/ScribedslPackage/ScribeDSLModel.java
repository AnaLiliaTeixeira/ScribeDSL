/**
 */
package ScribedslPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scribe DSL Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ScribedslPackage.ScribeDSLModel#getTextprocessor <em>Textprocessor</em>}</li>
 * </ul>
 *
 * @see ScribedslPackage.ScribedslPackagePackage#getScribeDSLModel()
 * @model
 * @generated
 */
public interface ScribeDSLModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Textprocessor</b></em>' containment reference list.
	 * The list contents are of type {@link ScribedslPackage.TextProcessor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textprocessor</em>' containment reference list.
	 * @see ScribedslPackage.ScribedslPackagePackage#getScribeDSLModel_Textprocessor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TextProcessor> getTextprocessor();

} // ScribeDSLModel
