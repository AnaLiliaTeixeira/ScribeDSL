/**
 */
package ScribedslPackage.impl;

import ScribedslPackage.ScribeDSLModel;
import ScribedslPackage.ScribedslPackagePackage;
import ScribedslPackage.TextProcessor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scribe DSL Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ScribedslPackage.impl.ScribeDSLModelImpl#getTextprocessor <em>Textprocessor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScribeDSLModelImpl extends MinimalEObjectImpl.Container implements ScribeDSLModel {
	/**
	 * The cached value of the '{@link #getTextprocessor() <em>Textprocessor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextprocessor()
	 * @generated
	 * @ordered
	 */
	protected EList<TextProcessor> textprocessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScribeDSLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScribedslPackagePackage.Literals.SCRIBE_DSL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextProcessor> getTextprocessor() {
		if (textprocessor == null) {
			textprocessor = new EObjectContainmentEList<TextProcessor>(TextProcessor.class, this, ScribedslPackagePackage.SCRIBE_DSL_MODEL__TEXTPROCESSOR);
		}
		return textprocessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScribedslPackagePackage.SCRIBE_DSL_MODEL__TEXTPROCESSOR:
				return ((InternalEList<?>)getTextprocessor()).basicRemove(otherEnd, msgs);
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
			case ScribedslPackagePackage.SCRIBE_DSL_MODEL__TEXTPROCESSOR:
				return getTextprocessor();
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
			case ScribedslPackagePackage.SCRIBE_DSL_MODEL__TEXTPROCESSOR:
				getTextprocessor().clear();
				getTextprocessor().addAll((Collection<? extends TextProcessor>)newValue);
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
			case ScribedslPackagePackage.SCRIBE_DSL_MODEL__TEXTPROCESSOR:
				getTextprocessor().clear();
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
			case ScribedslPackagePackage.SCRIBE_DSL_MODEL__TEXTPROCESSOR:
				return textprocessor != null && !textprocessor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScribeDSLModelImpl
