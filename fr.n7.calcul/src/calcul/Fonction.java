/**
 */
package calcul;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Fonction#getFonction <em>Fonction</em>}</li>
 *   <li>{@link calcul.Fonction#getPortsortie <em>Portsortie</em>}</li>
 *   <li>{@link calcul.Fonction#getPortentree <em>Portentree</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getFonction()
 * @model
 * @generated
 */
public interface Fonction extends CalculElement {
	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' attribute.
	 * The literals are from the enumeration {@link calcul.FonctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' attribute.
	 * @see calcul.FonctionType
	 * @see #setFonction(FonctionType)
	 * @see calcul.CalculPackage#getFonction_Fonction()
	 * @model required="true"
	 * @generated
	 */
	FonctionType getFonction();

	/**
	 * Sets the value of the '{@link calcul.Fonction#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' attribute.
	 * @see calcul.FonctionType
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(FonctionType value);

	/**
	 * Returns the value of the '<em><b>Portsortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portsortie</em>' containment reference.
	 * @see #setPortsortie(PortSortie)
	 * @see calcul.CalculPackage#getFonction_Portsortie()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PortSortie getPortsortie();

	/**
	 * Sets the value of the '{@link calcul.Fonction#getPortsortie <em>Portsortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portsortie</em>' containment reference.
	 * @see #getPortsortie()
	 * @generated
	 */
	void setPortsortie(PortSortie value);

	/**
	 * Returns the value of the '<em><b>Portentree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portentree</em>' containment reference.
	 * @see #setPortentree(PortEntree)
	 * @see calcul.CalculPackage#getFonction_Portentree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PortEntree getPortentree();

	/**
	 * Sets the value of the '{@link calcul.Fonction#getPortentree <em>Portentree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portentree</em>' containment reference.
	 * @see #getPortentree()
	 * @generated
	 */
	void setPortentree(PortEntree value);

} // Fonction
