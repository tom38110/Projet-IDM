/**
 */
package calcul;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Entree#getValeur <em>Valeur</em>}</li>
 *   <li>{@link calcul.Entree#getPortsortie <em>Portsortie</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getEntree()
 * @model abstract="true"
 * @generated
 */
public interface Entree extends EObject {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(float)
	 * @see calcul.CalculPackage#getEntree_Valeur()
	 * @model required="true"
	 * @generated
	 */
	float getValeur();

	/**
	 * Sets the value of the '{@link calcul.Entree#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(float value);

	/**
	 * Returns the value of the '<em><b>Portsortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portsortie</em>' containment reference.
	 * @see #setPortsortie(PortSortie)
	 * @see calcul.CalculPackage#getEntree_Portsortie()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PortSortie getPortsortie();

	/**
	 * Sets the value of the '{@link calcul.Entree#getPortsortie <em>Portsortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portsortie</em>' containment reference.
	 * @see #getPortsortie()
	 * @generated
	 */
	void setPortsortie(PortSortie value);

} // Entree
