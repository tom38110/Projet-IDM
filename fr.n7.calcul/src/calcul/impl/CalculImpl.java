/**
 */
package calcul.impl;

import calcul.Calcul;
import calcul.CalculPackage;
import calcul.Entree;
import calcul.Sortie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calcul</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.CalculImpl#getSortie <em>Sortie</em>}</li>
 *   <li>{@link calcul.impl.CalculImpl#getEntree <em>Entree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculImpl extends MinimalEObjectImpl.Container implements Calcul {
	/**
	 * The cached value of the '{@link #getSortie() <em>Sortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie()
	 * @generated
	 * @ordered
	 */
	protected Sortie sortie;

	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected Entree entree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.CALCUL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sortie getSortie() {
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortie(Sortie newSortie, NotificationChain msgs) {
		Sortie oldSortie = sortie;
		sortie = newSortie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.CALCUL__SORTIE, oldSortie, newSortie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortie(Sortie newSortie) {
		if (newSortie != sortie) {
			NotificationChain msgs = null;
			if (sortie != null)
				msgs = ((InternalEObject)sortie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.CALCUL__SORTIE, null, msgs);
			if (newSortie != null)
				msgs = ((InternalEObject)newSortie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.CALCUL__SORTIE, null, msgs);
			msgs = basicSetSortie(newSortie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.CALCUL__SORTIE, newSortie, newSortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entree getEntree() {
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntree(Entree newEntree, NotificationChain msgs) {
		Entree oldEntree = entree;
		entree = newEntree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.CALCUL__ENTREE, oldEntree, newEntree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntree(Entree newEntree) {
		if (newEntree != entree) {
			NotificationChain msgs = null;
			if (entree != null)
				msgs = ((InternalEObject)entree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.CALCUL__ENTREE, null, msgs);
			if (newEntree != null)
				msgs = ((InternalEObject)newEntree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.CALCUL__ENTREE, null, msgs);
			msgs = basicSetEntree(newEntree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.CALCUL__ENTREE, newEntree, newEntree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculPackage.CALCUL__SORTIE:
				return basicSetSortie(null, msgs);
			case CalculPackage.CALCUL__ENTREE:
				return basicSetEntree(null, msgs);
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
			case CalculPackage.CALCUL__SORTIE:
				return getSortie();
			case CalculPackage.CALCUL__ENTREE:
				return getEntree();
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
			case CalculPackage.CALCUL__SORTIE:
				setSortie((Sortie)newValue);
				return;
			case CalculPackage.CALCUL__ENTREE:
				setEntree((Entree)newValue);
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
			case CalculPackage.CALCUL__SORTIE:
				setSortie((Sortie)null);
				return;
			case CalculPackage.CALCUL__ENTREE:
				setEntree((Entree)null);
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
			case CalculPackage.CALCUL__SORTIE:
				return sortie != null;
			case CalculPackage.CALCUL__ENTREE:
				return entree != null;
		}
		return super.eIsSet(featureID);
	}

} //CalculImpl
