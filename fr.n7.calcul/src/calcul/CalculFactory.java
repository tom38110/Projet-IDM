/**
 */
package calcul;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see calcul.CalculPackage
 * @generated
 */
public interface CalculFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalculFactory eINSTANCE = calcul.impl.CalculFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Calcul</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calcul</em>'.
	 * @generated
	 */
	Calcul createCalcul();

	/**
	 * Returns a new object of class '<em>Fonction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fonction</em>'.
	 * @generated
	 */
	Fonction createFonction();

	/**
	 * Returns a new object of class '<em>Port Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Sortie</em>'.
	 * @generated
	 */
	PortSortie createPortSortie();

	/**
	 * Returns a new object of class '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lien</em>'.
	 * @generated
	 */
	Lien createLien();

	/**
	 * Returns a new object of class '<em>Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sortie</em>'.
	 * @generated
	 */
	Sortie createSortie();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Port Fixe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fixe</em>'.
	 * @generated
	 */
	PortFixe createPortFixe();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Port Entree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Entree</em>'.
	 * @generated
	 */
	PortEntree createPortEntree();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CalculPackage getCalculPackage();

} //CalculFactory
