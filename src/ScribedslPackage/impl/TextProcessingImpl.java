/**
 */
package ScribedslPackage.impl;

import ScribedslPackage.ProcessedData;
import ScribedslPackage.ScribedslPackagePackage;
import ScribedslPackage.Stem;
import ScribedslPackage.StopWord;
import ScribedslPackage.Text;
import ScribedslPackage.TextProcessing;
import ScribedslPackage.Token;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Processing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ScribedslPackage.impl.TextProcessingImpl#getText <em>Text</em>}</li>
 *   <li>{@link ScribedslPackage.impl.TextProcessingImpl#getToken <em>Token</em>}</li>
 *   <li>{@link ScribedslPackage.impl.TextProcessingImpl#getStem <em>Stem</em>}</li>
 *   <li>{@link ScribedslPackage.impl.TextProcessingImpl#getStopword <em>Stopword</em>}</li>
 *   <li>{@link ScribedslPackage.impl.TextProcessingImpl#getWordfrequency <em>Wordfrequency</em>}</li>
 *   <li>{@link ScribedslPackage.impl.TextProcessingImpl#getProcesseddata <em>Processeddata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextProcessingImpl extends MinimalEObjectImpl.Container implements TextProcessing {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> token;

	/**
	 * The cached value of the '{@link #getStem() <em>Stem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStem()
	 * @generated
	 * @ordered
	 */
	protected EList<Stem> stem;

	/**
	 * The cached value of the '{@link #getStopword() <em>Stopword</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopword()
	 * @generated
	 * @ordered
	 */
	protected EList<StopWord> stopword;

	/**
	 * The cached value of the '{@link #getWordfrequency() <em>Wordfrequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordfrequency()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, Integer> wordfrequency;

	/**
	 * The cached value of the '{@link #getProcesseddata() <em>Processeddata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesseddata()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessedData> processeddata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextProcessingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScribedslPackagePackage.Literals.TEXT_PROCESSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Text newText, NotificationChain msgs) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScribedslPackagePackage.TEXT_PROCESSING__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(Text newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScribedslPackagePackage.TEXT_PROCESSING__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScribedslPackagePackage.TEXT_PROCESSING__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribedslPackagePackage.TEXT_PROCESSING__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Token> getToken() {
		if (token == null) {
			token = new EObjectContainmentEList<Token>(Token.class, this, ScribedslPackagePackage.TEXT_PROCESSING__TOKEN);
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stem> getStem() {
		if (stem == null) {
			stem = new EObjectContainmentEList<Stem>(Stem.class, this, ScribedslPackagePackage.TEXT_PROCESSING__STEM);
		}
		return stem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StopWord> getStopword() {
		if (stopword == null) {
			stopword = new EObjectContainmentEList<StopWord>(StopWord.class, this, ScribedslPackagePackage.TEXT_PROCESSING__STOPWORD);
		}
		return stopword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map.Entry<String, Integer> getWordfrequency() {
		if (wordfrequency != null && ((EObject)wordfrequency).eIsProxy()) {
			InternalEObject oldWordfrequency = (InternalEObject)wordfrequency;
			wordfrequency = (Map.Entry<String, Integer>)eResolveProxy(oldWordfrequency);
			if (wordfrequency != oldWordfrequency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScribedslPackagePackage.TEXT_PROCESSING__WORDFREQUENCY, oldWordfrequency, wordfrequency));
			}
		}
		return wordfrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Integer> basicGetWordfrequency() {
		return wordfrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWordfrequency(Map.Entry<String, Integer> newWordfrequency) {
		Map.Entry<String, Integer> oldWordfrequency = wordfrequency;
		wordfrequency = newWordfrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribedslPackagePackage.TEXT_PROCESSING__WORDFREQUENCY, oldWordfrequency, wordfrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessedData> getProcesseddata() {
		if (processeddata == null) {
			processeddata = new EObjectContainmentEList<ProcessedData>(ProcessedData.class, this, ScribedslPackagePackage.TEXT_PROCESSING__PROCESSEDDATA);
		}
		return processeddata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScribedslPackagePackage.TEXT_PROCESSING__TEXT:
				return basicSetText(null, msgs);
			case ScribedslPackagePackage.TEXT_PROCESSING__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
			case ScribedslPackagePackage.TEXT_PROCESSING__STEM:
				return ((InternalEList<?>)getStem()).basicRemove(otherEnd, msgs);
			case ScribedslPackagePackage.TEXT_PROCESSING__STOPWORD:
				return ((InternalEList<?>)getStopword()).basicRemove(otherEnd, msgs);
			case ScribedslPackagePackage.TEXT_PROCESSING__PROCESSEDDATA:
				return ((InternalEList<?>)getProcesseddata()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScribedslPackagePackage.TEXT_PROCESSING__TEXT:
				return getText();
			case ScribedslPackagePackage.TEXT_PROCESSING__TOKEN:
				return getToken();
			case ScribedslPackagePackage.TEXT_PROCESSING__STEM:
				return getStem();
			case ScribedslPackagePackage.TEXT_PROCESSING__STOPWORD:
				return getStopword();
			case ScribedslPackagePackage.TEXT_PROCESSING__WORDFREQUENCY:
				if (resolve) return getWordfrequency();
				return basicGetWordfrequency();
			case ScribedslPackagePackage.TEXT_PROCESSING__PROCESSEDDATA:
				return getProcesseddata();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScribedslPackagePackage.TEXT_PROCESSING__TEXT:
				setText((Text)newValue);
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends Token>)newValue);
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__STEM:
				getStem().clear();
				getStem().addAll((Collection<? extends Stem>)newValue);
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__STOPWORD:
				getStopword().clear();
				getStopword().addAll((Collection<? extends StopWord>)newValue);
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__WORDFREQUENCY:
				setWordfrequency((Map.Entry<String, Integer>)newValue);
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__PROCESSEDDATA:
				getProcesseddata().clear();
				getProcesseddata().addAll((Collection<? extends ProcessedData>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScribedslPackagePackage.TEXT_PROCESSING__TEXT:
				setText((Text)null);
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__TOKEN:
				getToken().clear();
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__STEM:
				getStem().clear();
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__STOPWORD:
				getStopword().clear();
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__WORDFREQUENCY:
				setWordfrequency((Map.Entry<String, Integer>)null);
				return;
			case ScribedslPackagePackage.TEXT_PROCESSING__PROCESSEDDATA:
				getProcesseddata().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScribedslPackagePackage.TEXT_PROCESSING__TEXT:
				return text != null;
			case ScribedslPackagePackage.TEXT_PROCESSING__TOKEN:
				return token != null && !token.isEmpty();
			case ScribedslPackagePackage.TEXT_PROCESSING__STEM:
				return stem != null && !stem.isEmpty();
			case ScribedslPackagePackage.TEXT_PROCESSING__STOPWORD:
				return stopword != null && !stopword.isEmpty();
			case ScribedslPackagePackage.TEXT_PROCESSING__WORDFREQUENCY:
				return wordfrequency != null;
			case ScribedslPackagePackage.TEXT_PROCESSING__PROCESSEDDATA:
				return processeddata != null && !processeddata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TextProcessingImpl
