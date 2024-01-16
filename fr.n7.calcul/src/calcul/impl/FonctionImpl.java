/**
 */
package calcul.impl;

import calcul.CalculPackage;
import calcul.Fonction;
import calcul.FonctionType;
import calcul.PortEntree;
import calcul.PortSortie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.FonctionImpl#getFonction <em>Fonction</em>}</li>
 *   <li>{@link calcul.impl.FonctionImpl#getPortsortie <em>Portsortie</em>}</li>
 *   <li>{@link calcul.impl.FonctionImpl#getPortentree <em>Portentree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FonctionImpl extends CalculElementImpl implements Fonction {
	/**
	 * The default value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected static final FonctionType FONCTION_EDEFAULT = FonctionType.SIN;

	/**
	 * The cached value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected FonctionType fonction = FONCTION_EDEFAULT;

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
	protected FonctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.FONCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionType getFonction() {
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonction(FonctionType newFonction) {
		FonctionType oldFonction = fonction;
		fonction = newFonction == null ? FONCTION_EDEFAULT : newFonction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.FONCTION__FONCTION, oldFonction, fonction));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.FONCTION__PORTSORTIE, oldPortsortie, newPortsortie);
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
				msgs = ((InternalEObject)portsortie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.FONCTION__PORTSORTIE, null, msgs);
			if (newPortsortie != null)
				msgs = ((InternalEObject)newPortsortie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.FONCTION__PORTSORTIE, null, msgs);
			msgs = basicSetPortsortie(newPortsortie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.FONCTION__PORTSORTIE, newPortsortie, newPortsortie));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.FONCTION__PORTENTREE, oldPortentree, newPortentree);
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
				msgs = ((InternalEObject)portentree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.FONCTION__PORTENTREE, null, msgs);
			if (newPortentree != null)
				msgs = ((InternalEObject)newPortentree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.FONCTION__PORTENTREE, null, msgs);
			msgs = basicSetPortentree(newPortentree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.FONCTION__PORTENTREE, newPortentree, newPortentree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculPackage.FONCTION__PORTSORTIE:
				return basicSetPortsortie(null, msgs);
			case CalculPackage.FONCTION__PORTENTREE:
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
			case CalculPackage.FONCTION__FONCTION:
				return getFonction();
			case CalculPackage.FONCTION__PORTSORTIE:
				return getPortsortie();
			case CalculPackage.FONCTION__PORTENTREE:
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
			case CalculPackage.FONCTION__FONCTION:
				setFonction((FonctionType)newValue);
				return;
			case CalculPackage.FONCTION__PORTSORTIE:
				setPortsortie((PortSortie)newValue);
				return;
			case CalculPackage.FONCTION__PORTENTREE:
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
			case CalculPackage.FONCTION__FONCTION:
				setFonction(FONCTION_EDEFAULT);
				return;
			case CalculPackage.FONCTION__PORTSORTIE:
				setPortsortie((PortSortie)null);
				return;
			case CalculPackage.FONCTION__PORTENTREE:
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
			case CalculPackage.FONCTION__FONCTION:
				return fonction != FONCTION_EDEFAULT;
			case CalculPackage.FONCTION__PORTSORTIE:
				return portsortie != null;
			case CalculPackage.FONCTION__PORTENTREE:
				return portentree != null;
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
		result.append(" (fonction: ");
		result.append(fonction);
		result.append(')');
		return result.toString();
	}

} //FonctionImpl
