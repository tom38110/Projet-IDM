/**
 */
package calcul.impl;

import calcul.CalculPackage;
import calcul.Entree;
import calcul.PortSortie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.EntreeImpl#getValeur <em>Valeur</em>}</li>
 *   <li>{@link calcul.impl.EntreeImpl#getPortsortie <em>Portsortie</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntreeImpl extends MinimalEObjectImpl.Container implements Entree {
	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final float VALEUR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected float valeur = VALEUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortsortie() <em>Portsortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsortie()
	 * @generated
	 * @ordered
	 */
	protected PortSortie portsortie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.ENTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur(float newValeur) {
		float oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.ENTREE__VALEUR, oldValeur, valeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortSortie getPortsortie() {
		return portsortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortsortie(PortSortie newPortsortie, NotificationChain msgs) {
		PortSortie oldPortsortie = portsortie;
		portsortie = newPortsortie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.ENTREE__PORTSORTIE, oldPortsortie, newPortsortie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsortie(PortSortie newPortsortie) {
		if (newPortsortie != portsortie) {
			NotificationChain msgs = null;
			if (portsortie != null)
				msgs = ((InternalEObject)portsortie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.ENTREE__PORTSORTIE, null, msgs);
			if (newPortsortie != null)
				msgs = ((InternalEObject)newPortsortie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.ENTREE__PORTSORTIE, null, msgs);
			msgs = basicSetPortsortie(newPortsortie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.ENTREE__PORTSORTIE, newPortsortie, newPortsortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculPackage.ENTREE__PORTSORTIE:
				return basicSetPortsortie(null, msgs);
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
			case CalculPackage.ENTREE__VALEUR:
				return getValeur();
			case CalculPackage.ENTREE__PORTSORTIE:
				return getPortsortie();
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
			case CalculPackage.ENTREE__VALEUR:
				setValeur((Float)newValue);
				return;
			case CalculPackage.ENTREE__PORTSORTIE:
				setPortsortie((PortSortie)newValue);
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
			case CalculPackage.ENTREE__VALEUR:
				setValeur(VALEUR_EDEFAULT);
				return;
			case CalculPackage.ENTREE__PORTSORTIE:
				setPortsortie((PortSortie)null);
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
			case CalculPackage.ENTREE__VALEUR:
				return valeur != VALEUR_EDEFAULT;
			case CalculPackage.ENTREE__PORTSORTIE:
				return portsortie != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //EntreeImpl
