/**
 */
package calcul.impl;

import calcul.CalculPackage;
import calcul.PortEntree;
import calcul.Sortie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.SortieImpl#getPortentree <em>Portentree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortieImpl extends MinimalEObjectImpl.Container implements Sortie {
	/**
	 * The cached value of the '{@link #getPortentree() <em>Portentree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortentree()
	 * @generated
	 * @ordered
	 */
	protected PortEntree portentree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.SORTIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortEntree getPortentree() {
		return portentree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortentree(PortEntree newPortentree, NotificationChain msgs) {
		PortEntree oldPortentree = portentree;
		portentree = newPortentree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.SORTIE__PORTENTREE, oldPortentree, newPortentree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortentree(PortEntree newPortentree) {
		if (newPortentree != portentree) {
			NotificationChain msgs = null;
			if (portentree != null)
				msgs = ((InternalEObject)portentree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.SORTIE__PORTENTREE, null, msgs);
			if (newPortentree != null)
				msgs = ((InternalEObject)newPortentree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.SORTIE__PORTENTREE, null, msgs);
			msgs = basicSetPortentree(newPortentree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.SORTIE__PORTENTREE, newPortentree, newPortentree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculPackage.SORTIE__PORTENTREE:
				return basicSetPortentree(null, msgs);
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
			case CalculPackage.SORTIE__PORTENTREE:
				return getPortentree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CalculPackage.SORTIE__PORTENTREE:
				setPortentree((PortEntree)newValue);
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
			case CalculPackage.SORTIE__PORTENTREE:
				setPortentree((PortEntree)null);
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
			case CalculPackage.SORTIE__PORTENTREE:
				return portentree != null;
		}
		return super.eIsSet(featureID);
	}

} //SortieImpl
