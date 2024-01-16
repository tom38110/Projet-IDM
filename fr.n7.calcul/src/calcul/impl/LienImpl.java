/**
 */
package calcul.impl;

import calcul.CalculPackage;
import calcul.Lien;
import calcul.PortEntree;
import calcul.PortSortie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.LienImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link calcul.impl.LienImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienImpl extends CalculElementImpl implements Lien {
	/**
	 * The cached value of the '{@link #getCible() <em>Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCible()
	 * @generated
	 * @ordered
	 */
	protected PortEntree cible;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PortSortie source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.LIEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortEntree getCible() {
		if (cible != null && cible.eIsProxy()) {
			InternalEObject oldCible = (InternalEObject)cible;
			cible = (PortEntree)eResolveProxy(oldCible);
			if (cible != oldCible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculPackage.LIEN__CIBLE, oldCible, cible));
			}
		}
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortEntree basicGetCible() {
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCible(PortEntree newCible) {
		PortEntree oldCible = cible;
		cible = newCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.LIEN__CIBLE, oldCible, cible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortSortie getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (PortSortie)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculPackage.LIEN__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortSortie basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PortSortie newSource) {
		PortSortie oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.LIEN__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CalculPackage.LIEN__CIBLE:
				if (resolve) return getCible();
				return basicGetCible();
			case CalculPackage.LIEN__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case CalculPackage.LIEN__CIBLE:
				setCible((PortEntree)newValue);
				return;
			case CalculPackage.LIEN__SOURCE:
				setSource((PortSortie)newValue);
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
			case CalculPackage.LIEN__CIBLE:
				setCible((PortEntree)null);
				return;
			case CalculPackage.LIEN__SOURCE:
				setSource((PortSortie)null);
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
			case CalculPackage.LIEN__CIBLE:
				return cible != null;
			case CalculPackage.LIEN__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //LienImpl
