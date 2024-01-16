/**
 */
package calcul;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calcul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Calcul#getSortie <em>Sortie</em>}</li>
 *   <li>{@link calcul.Calcul#getEntree <em>Entree</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getCalcul()
 * @model
 * @generated
 */
public interface Calcul extends EObject {
	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' containment reference.
	 * @see #setSortie(Sortie)
	 * @see calcul.CalculPackage#getCalcul_Sortie()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sortie getSortie();

	/**
	 * Sets the value of the '{@link calcul.Calcul#getSortie <em>Sortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' containment reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Sortie value);

	/**
	 * Returns the value of the '<em><b>Entree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' containment reference.
	 * @see #setEntree(Entree)
	 * @see calcul.CalculPackage#getCalcul_Entree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entree getEntree();

	/**
	 * Sets the value of the '{@link calcul.Calcul#getEntree <em>Entree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree</em>' containment reference.
	 * @see #getEntree()
	 * @generated
	 */
	void setEntree(Entree value);

} // Calcul
