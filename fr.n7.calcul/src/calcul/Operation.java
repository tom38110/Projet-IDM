/**
 */
package calcul;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Operation#getPortentree <em>Portentree</em>}</li>
 *   <li>{@link calcul.Operation#getPortsortie <em>Portsortie</em>}</li>
 *   <li>{@link calcul.Operation#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends CalculElement {
	/**
	 * Returns the value of the '<em><b>Portentree</b></em>' containment reference list.
	 * The list contents are of type {@link calcul.PortEntree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portentree</em>' containment reference list.
	 * @see calcul.CalculPackage#getOperation_Portentree()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<PortEntree> getPortentree();

	/**
	 * Returns the value of the '<em><b>Portsortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portsortie</em>' containment reference.
	 * @see #setPortsortie(PortSortie)
	 * @see calcul.CalculPackage#getOperation_Portsortie()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PortSortie getPortsortie();

	/**
	 * Sets the value of the '{@link calcul.Operation#getPortsortie <em>Portsortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portsortie</em>' containment reference.
	 * @see #getPortsortie()
	 * @generated
	 */
	void setPortsortie(PortSortie value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link calcul.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see calcul.OperationType
	 * @see #setOperation(OperationType)
	 * @see calcul.CalculPackage#getOperation_Operation()
	 * @model required="true"
	 * @generated
	 */
	OperationType getOperation();

	/**
	 * Sets the value of the '{@link calcul.Operation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see calcul.OperationType
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OperationType value);

} // Operation
