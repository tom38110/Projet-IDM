/**
 */
package calcul.impl;

import calcul.CalculPackage;
import calcul.Operation;
import calcul.OperationType;
import calcul.PortEntree;
import calcul.PortSortie;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.OperationImpl#getPortentree <em>Portentree</em>}</li>
 *   <li>{@link calcul.impl.OperationImpl#getPortsortie <em>Portsortie</em>}</li>
 *   <li>{@link calcul.impl.OperationImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends CalculElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getPortentree() <em>Portentree</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortentree()
	 * @generated
	 * @ordered
	 */
	protected EList<PortEntree> portentree;

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
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final OperationType OPERATION_EDEFAULT = OperationType.ADD;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected OperationType operation = OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortEntree> getPortentree() {
		if (portentree == null) {
			portentree = new EObjectContainmentEList<PortEntree>(PortEntree.class, this, CalculPackage.OPERATION__PORTENTREE);
		}
		return portentree;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.OPERATION__PORTSORTIE, oldPortsortie, newPortsortie);
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
				msgs = ((InternalEObject)portsortie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.OPERATION__PORTSORTIE, null, msgs);
			if (newPortsortie != null)
				msgs = ((InternalEObject)newPortsortie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.OPERATION__PORTSORTIE, null, msgs);
			msgs = basicSetPortsortie(newPortsortie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.OPERATION__PORTSORTIE, newPortsortie, newPortsortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(OperationType newOperation) {
		OperationType oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.OPERATION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculPackage.OPERATION__PORTENTREE:
				return ((InternalEList<?>)getPortentree()).basicRemove(otherEnd, msgs);
			case CalculPackage.OPERATION__PORTSORTIE:
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
			case CalculPackage.OPERATION__PORTENTREE:
				return getPortentree();
			case CalculPackage.OPERATION__PORTSORTIE:
				return getPortsortie();
			case CalculPackage.OPERATION__OPERATION:
				return getOperation();
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
			case CalculPackage.OPERATION__PORTENTREE:
				getPortentree().clear();
				getPortentree().addAll((Collection<? extends PortEntree>)newValue);
				return;
			case CalculPackage.OPERATION__PORTSORTIE:
				setPortsortie((PortSortie)newValue);
				return;
			case CalculPackage.OPERATION__OPERATION:
				setOperation((OperationType)newValue);
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
			case CalculPackage.OPERATION__PORTENTREE:
				getPortentree().clear();
				return;
			case CalculPackage.OPERATION__PORTSORTIE:
				setPortsortie((PortSortie)null);
				return;
			case CalculPackage.OPERATION__OPERATION:
				setOperation(OPERATION_EDEFAULT);
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
			case CalculPackage.OPERATION__PORTENTREE:
				return portentree != null && !portentree.isEmpty();
			case CalculPackage.OPERATION__PORTSORTIE:
				return portsortie != null;
			case CalculPackage.OPERATION__OPERATION:
				return operation != OPERATION_EDEFAULT;
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
