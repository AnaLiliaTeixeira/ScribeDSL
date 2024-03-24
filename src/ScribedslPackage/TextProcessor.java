/**
 */
package ScribedslPackage;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ScribedslPackage.TextProcessor#getText <em>Text</em>}</li>
 *   <li>{@link ScribedslPackage.TextProcessor#getToken <em>Token</em>}</li>
 *   <li>{@link ScribedslPackage.TextProcessor#getStem <em>Stem</em>}</li>
 *   <li>{@link ScribedslPackage.TextProcessor#getStopword <em>Stopword</em>}</li>
 *   <li>{@link ScribedslPackage.TextProcessor#getWordfrequency <em>Wordfrequency</em>}</li>
 *   <li>{@link ScribedslPackage.TextProcessor#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see ScribedslPackage.ScribedslPackagePackage#getTextProcessor()
 * @model
 * @generated
 */
public interface TextProcessor extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Text)
	 * @see ScribedslPackage.ScribedslPackagePackage#getTextProcessor_Text()
	 * @model containment="true"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link ScribedslPackage.TextProcessor#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference list.
	 * The list contents are of type {@link ScribedslPackage.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference list.
	 * @see ScribedslPackage.ScribedslPackagePackage#getTextProcessor_Token()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getToken();

	/**
	 * Returns the value of the '<em><b>Stem</b></em>' containment reference list.
	 * The list contents are of type {@link ScribedslPackage.Stem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stem</em>' containment reference list.
	 * @see ScribedslPackage.ScribedslPackagePackage#getTextProcessor_Stem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stem> getStem();

	/**
	 * Returns the value of the '<em><b>Stopword</b></em>' containment reference list.
	 * The list contents are of type {@link ScribedslPackage.StopWord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stopword</em>' containment reference list.
	 * @see ScribedslPackage.ScribedslPackagePackage#getTextProcessor_Stopword()
	 * @model containment="true"
	 * @generated
	 */
	EList<StopWord> getStopword();

	/**
	 * Returns the value of the '<em><b>Wordfrequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordfrequency</em>' reference.
	 * @see #setWordfrequency(Map.Entry)
	 * @see ScribedslPackage.ScribedslPackagePackage#getTextProcessor_Wordfrequency()
	 * @model mapType="ScribedslPackage.WordFrequency&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EInt&gt;"
	 * @generated
	 */
	Map.Entry<String, Integer> getWordfrequency();

	/**
	 * Sets the value of the '{@link ScribedslPackage.TextProcessor#getWordfrequency <em>Wordfrequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordfrequency</em>' reference.
	 * @see #getWordfrequency()
	 * @generated
	 */
	void setWordfrequency(Map.Entry<String, Integer> value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(File)
	 * @see ScribedslPackage.ScribedslPackagePackage#getTextProcessor_File()
	 * @model containment="true"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link ScribedslPackage.TextProcessor#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

} // TextProcessor
