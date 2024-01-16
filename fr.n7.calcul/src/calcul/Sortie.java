/**
 */
package calcul;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Sortie#getPortentree <em>Portentree</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getSortie()
 * @model
 * @generated
 */
public interface Sortie extends EObject {
	/**
	 * Returns the value of the '<em><b>Portentree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portentree</em>' containment reference.
	 * @see #setPortentree(PortEntree)
	 * @see calcul.CalculPackage#getSortie_Portentree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PortEntree getPortentree();

	/**
	 * Sets the value of the '{@link calcul.Sortie#getPortentree <em>Portentree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portentree</em>' containment reference.
	 * @see #getPortentree()
	 * @generated
	 */
	void setPortentree(PortEntree value);

} // Sortie
