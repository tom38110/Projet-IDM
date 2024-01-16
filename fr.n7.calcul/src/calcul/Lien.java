/**
 */
package calcul;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Lien#getCible <em>Cible</em>}</li>
 *   <li>{@link calcul.Lien#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getLien()
 * @model
 * @generated
 */
public interface Lien extends CalculElement {
	/**
	 * Returns the value of the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cible</em>' reference.
	 * @see #setCible(PortEntree)
	 * @see calcul.CalculPackage#getLien_Cible()
	 * @model required="true"
	 * @generated
	 */
	PortEntree getCible();

	/**
	 * Sets the value of the '{@link calcul.Lien#getCible <em>Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible</em>' reference.
	 * @see #getCible()
	 * @generated
	 */
	void setCible(PortEntree value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PortSortie)
	 * @see calcul.CalculPackage#getLien_Source()
	 * @model required="true"
	 * @generated
	 */
	PortSortie getSource();

	/**
	 * Sets the value of the '{@link calcul.Lien#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PortSortie value);

} // Lien
