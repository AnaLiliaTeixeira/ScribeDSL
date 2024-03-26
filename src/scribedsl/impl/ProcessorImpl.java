/**
 */
package scribedsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import scribedsl.Processor;
import scribedsl.ScribedslPackage;
import scribedsl.StopWord;
import scribedsl.Text;
import scribedsl.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scribedsl.impl.ProcessorImpl#getText <em>Text</em>}</li>
 *   <li>{@link scribedsl.impl.ProcessorImpl#getToken <em>Token</em>}</li>
 *   <li>{@link scribedsl.impl.ProcessorImpl#getStopword <em>Stopword</em>}</li>
 *   <li>{@link scribedsl.impl.ProcessorImpl#getWordfrequency <em>Wordfrequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorImpl extends MinimalEObjectImpl.Container implements Processor {
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
	 * The cached value of the '{@link #getStopword() <em>Stopword</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopword()
	 * @generated
	 * @ordered
	 */
	protected EList<StopWord> stopword;

	/**
	 * The cached value of the '{@link #getWordfrequency() <em>Wordfrequency</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordfrequency()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> wordfrequency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScribedslPackage.Literals.PROCESSOR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScribedslPackage.PROCESSOR__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScribedslPackage.PROCESSOR__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScribedslPackage.PROCESSOR__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribedslPackage.PROCESSOR__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Token> getToken() {
		if (token == null) {
			token = new EObjectContainmentEList<Token>(Token.class, this, ScribedslPackage.PROCESSOR__TOKEN);
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StopWord> getStopword() {
		if (stopword == null) {
			stopword = new EObjectContainmentEList<StopWord>(StopWord.class, this, ScribedslPackage.PROCESSOR__STOPWORD);
		}
		return stopword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Integer> getWordfrequency() {
		if (wordfrequency == null) {
			wordfrequency = new EcoreEMap<String,Integer>(ScribedslPackage.Literals.WORD_FREQUENCY, WordFrequencyImpl.class, this, ScribedslPackage.PROCESSOR__WORDFREQUENCY);
		}
		return wordfrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScribedslPackage.PROCESSOR__TEXT:
				return basicSetText(null, msgs);
			case ScribedslPackage.PROCESSOR__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
			case ScribedslPackage.PROCESSOR__STOPWORD:
				return ((InternalEList<?>)getStopword()).basicRemove(otherEnd, msgs);
			case ScribedslPackage.PROCESSOR__WORDFREQUENCY:
				return ((InternalEList<?>)getWordfrequency()).basicRemove(otherEnd, msgs);
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
			case ScribedslPackage.PROCESSOR__TEXT:
				return getText();
			case ScribedslPackage.PROCESSOR__TOKEN:
				return getToken();
			case ScribedslPackage.PROCESSOR__STOPWORD:
				return getStopword();
			case ScribedslPackage.PROCESSOR__WORDFREQUENCY:
				if (coreType) return getWordfrequency();
				else return getWordfrequency().map();
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
			case ScribedslPackage.PROCESSOR__TEXT:
				setText((Text)newValue);
				return;
			case ScribedslPackage.PROCESSOR__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends Token>)newValue);
				return;
			case ScribedslPackage.PROCESSOR__STOPWORD:
				getStopword().clear();
				getStopword().addAll((Collection<? extends StopWord>)newValue);
				return;
			case ScribedslPackage.PROCESSOR__WORDFREQUENCY:
				((EStructuralFeature.Setting)getWordfrequency()).set(newValue);
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
			case ScribedslPackage.PROCESSOR__TEXT:
				setText((Text)null);
				return;
			case ScribedslPackage.PROCESSOR__TOKEN:
				getToken().clear();
				return;
			case ScribedslPackage.PROCESSOR__STOPWORD:
				getStopword().clear();
				return;
			case ScribedslPackage.PROCESSOR__WORDFREQUENCY:
				getWordfrequency().clear();
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
			case ScribedslPackage.PROCESSOR__TEXT:
				return text != null;
			case ScribedslPackage.PROCESSOR__TOKEN:
				return token != null && !token.isEmpty();
			case ScribedslPackage.PROCESSOR__STOPWORD:
				return stopword != null && !stopword.isEmpty();
			case ScribedslPackage.PROCESSOR__WORDFREQUENCY:
				return wordfrequency != null && !wordfrequency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessorImpl
