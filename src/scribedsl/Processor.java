/**
 */
package scribedsl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scribedsl.Processor#getText <em>Text</em>}</li>
 *   <li>{@link scribedsl.Processor#getToken <em>Token</em>}</li>
 *   <li>{@link scribedsl.Processor#getStopword <em>Stopword</em>}</li>
 *   <li>{@link scribedsl.Processor#getWordfrequency <em>Wordfrequency</em>}</li>
 * </ul>
 *
 * @see scribedsl.ScribedslPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Text)
	 * @see scribedsl.ScribedslPackage#getProcessor_Text()
	 * @model containment="true"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link scribedsl.Processor#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference list.
	 * The list contents are of type {@link scribedsl.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference list.
	 * @see scribedsl.ScribedslPackage#getProcessor_Token()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getToken();

	/**
	 * Returns the value of the '<em><b>Stopword</b></em>' containment reference list.
	 * The list contents are of type {@link scribedsl.StopWord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stopword</em>' containment reference list.
	 * @see scribedsl.ScribedslPackage#getProcessor_Stopword()
	 * @model containment="true"
	 * @generated
	 */
	EList<StopWord> getStopword();

	/**
	 * Returns the value of the '<em><b>Wordfrequency</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, java.lang.Integer&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordfrequency</em>' reference list.
	 * @see scribedsl.ScribedslPackage#getProcessor_Wordfrequency()
	 * @model mapType="scribedsl.WordFrequency&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, Integer>> getWordfrequency();

} // Processor
