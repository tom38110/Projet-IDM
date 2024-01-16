/**
 */
package calcul;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see calcul.CalculFactory
 * @model kind="package"
 * @generated
 */
public interface CalculPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calcul";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://calcul";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "calcul";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalculPackage eINSTANCE = calcul.impl.CalculPackageImpl.init();

	/**
	 * The meta object id for the '{@link calcul.impl.CalculImpl <em>Calcul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.CalculImpl
	 * @see calcul.impl.CalculPackageImpl#getCalcul()
	 * @generated
	 */
	int CALCUL = 0;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL__SORTIE = 0;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL__ENTREE = 1;

	/**
	 * The number of structural features of the '<em>Calcul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Calcul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calcul.impl.CalculElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.CalculElementImpl
	 * @see calcul.impl.CalculPackageImpl#getCalculElement()
	 * @generated
	 */
	int CALCUL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calcul.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.EntreeImpl
	 * @see calcul.impl.CalculPackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 2;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__VALEUR = 0;

	/**
	 * The feature id for the '<em><b>Portsortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__PORTSORTIE = 1;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calcul.impl.FonctionImpl <em>Fonction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.FonctionImpl
	 * @see calcul.impl.CalculPackageImpl#getFonction()
	 * @generated
	 */
	int FONCTION = 3;

	/**
	 * The feature id for the '<em><b>Fonction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__FONCTION = CALCUL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portsortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__PORTSORTIE = CALCUL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portentree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__PORTENTREE = CALCUL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_FEATURE_COUNT = CALCUL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_OPERATION_COUNT = CALCUL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.impl.PortSortieImpl <em>Port Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.PortSortieImpl
	 * @see calcul.impl.CalculPackageImpl#getPortSortie()
	 * @generated
	 */
	int PORT_SORTIE = 4;

	/**
	 * The number of structural features of the '<em>Port Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE_FEATURE_COUNT = CALCUL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SORTIE_OPERATION_COUNT = CALCUL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.impl.LienImpl <em>Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.LienImpl
	 * @see calcul.impl.CalculPackageImpl#getLien()
	 * @generated
	 */
	int LIEN = 5;

	/**
	 * The feature id for the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__CIBLE = CALCUL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__SOURCE = CALCUL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_FEATURE_COUNT = CALCUL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_OPERATION_COUNT = CALCUL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.SortieImpl
	 * @see calcul.impl.CalculPackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 6;

	/**
	 * The feature id for the '<em><b>Portentree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__PORTENTREE = 0;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calcul.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.OperationImpl
	 * @see calcul.impl.CalculPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Portentree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PORTENTREE = CALCUL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portsortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PORTSORTIE = CALCUL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION = CALCUL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = CALCUL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = CALCUL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.impl.PortFixeImpl <em>Port Fixe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.PortFixeImpl
	 * @see calcul.impl.CalculPackageImpl#getPortFixe()
	 * @generated
	 */
	int PORT_FIXE = 8;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FIXE__VALEUR = ENTREE__VALEUR;

	/**
	 * The feature id for the '<em><b>Portsortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FIXE__PORTSORTIE = ENTREE__PORTSORTIE;

	/**
	 * The number of structural features of the '<em>Port Fixe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FIXE_FEATURE_COUNT = ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fixe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FIXE_OPERATION_COUNT = ENTREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.ArgumentImpl
	 * @see calcul.impl.CalculPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 9;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VALEUR = ENTREE__VALEUR;

	/**
	 * The feature id for the '<em><b>Portsortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__PORTSORTIE = ENTREE__PORTSORTIE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NOM = ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = ENTREE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = ENTREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.impl.PortEntreeImpl <em>Port Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.PortEntreeImpl
	 * @see calcul.impl.CalculPackageImpl#getPortEntree()
	 * @generated
	 */
	int PORT_ENTREE = 10;

	/**
	 * The number of structural features of the '<em>Port Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE_FEATURE_COUNT = CALCUL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ENTREE_OPERATION_COUNT = CALCUL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.OperationType
	 * @see calcul.impl.CalculPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 11;

	/**
	 * The meta object id for the '{@link calcul.FonctionType <em>Fonction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.FonctionType
	 * @see calcul.impl.CalculPackageImpl#getFonctionType()
	 * @generated
	 */
	int FONCTION_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link calcul.Calcul <em>Calcul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calcul</em>'.
	 * @see calcul.Calcul
	 * @generated
	 */
	EClass getCalcul();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Calcul#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sortie</em>'.
	 * @see calcul.Calcul#getSortie()
	 * @see #getCalcul()
	 * @generated
	 */
	EReference getCalcul_Sortie();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Calcul#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entree</em>'.
	 * @see calcul.Calcul#getEntree()
	 * @see #getCalcul()
	 * @generated
	 */
	EReference getCalcul_Entree();

	/**
	 * Returns the meta object for class '{@link calcul.CalculElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see calcul.CalculElement
	 * @generated
	 */
	EClass getCalculElement();

	/**
	 * Returns the meta object for class '{@link calcul.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see calcul.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for the attribute '{@link calcul.Entree#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see calcul.Entree#getValeur()
	 * @see #getEntree()
	 * @generated
	 */
	EAttribute getEntree_Valeur();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Entree#getPortsortie <em>Portsortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portsortie</em>'.
	 * @see calcul.Entree#getPortsortie()
	 * @see #getEntree()
	 * @generated
	 */
	EReference getEntree_Portsortie();

	/**
	 * Returns the meta object for class '{@link calcul.Fonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction</em>'.
	 * @see calcul.Fonction
	 * @generated
	 */
	EClass getFonction();

	/**
	 * Returns the meta object for the attribute '{@link calcul.Fonction#getFonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fonction</em>'.
	 * @see calcul.Fonction#getFonction()
	 * @see #getFonction()
	 * @generated
	 */
	EAttribute getFonction_Fonction();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Fonction#getPortsortie <em>Portsortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portsortie</em>'.
	 * @see calcul.Fonction#getPortsortie()
	 * @see #getFonction()
	 * @generated
	 */
	EReference getFonction_Portsortie();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Fonction#getPortentree <em>Portentree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portentree</em>'.
	 * @see calcul.Fonction#getPortentree()
	 * @see #getFonction()
	 * @generated
	 */
	EReference getFonction_Portentree();

	/**
	 * Returns the meta object for class '{@link calcul.PortSortie <em>Port Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Sortie</em>'.
	 * @see calcul.PortSortie
	 * @generated
	 */
	EClass getPortSortie();

	/**
	 * Returns the meta object for class '{@link calcul.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien</em>'.
	 * @see calcul.Lien
	 * @generated
	 */
	EClass getLien();

	/**
	 * Returns the meta object for the reference '{@link calcul.Lien#getCible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cible</em>'.
	 * @see calcul.Lien#getCible()
	 * @see #getLien()
	 * @generated
	 */
	EReference getLien_Cible();

	/**
	 * Returns the meta object for the reference '{@link calcul.Lien#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see calcul.Lien#getSource()
	 * @see #getLien()
	 * @generated
	 */
	EReference getLien_Source();

	/**
	 * Returns the meta object for class '{@link calcul.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie</em>'.
	 * @see calcul.Sortie
	 * @generated
	 */
	EClass getSortie();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Sortie#getPortentree <em>Portentree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portentree</em>'.
	 * @see calcul.Sortie#getPortentree()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_Portentree();

	/**
	 * Returns the meta object for class '{@link calcul.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see calcul.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link calcul.Operation#getPortentree <em>Portentree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portentree</em>'.
	 * @see calcul.Operation#getPortentree()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Portentree();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Operation#getPortsortie <em>Portsortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portsortie</em>'.
	 * @see calcul.Operation#getPortsortie()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Portsortie();

	/**
	 * Returns the meta object for the attribute '{@link calcul.Operation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see calcul.Operation#getOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Operation();

	/**
	 * Returns the meta object for class '{@link calcul.PortFixe <em>Port Fixe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fixe</em>'.
	 * @see calcul.PortFixe
	 * @generated
	 */
	EClass getPortFixe();

	/**
	 * Returns the meta object for class '{@link calcul.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see calcul.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link calcul.Argument#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see calcul.Argument#getNom()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Nom();

	/**
	 * Returns the meta object for class '{@link calcul.PortEntree <em>Port Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Entree</em>'.
	 * @see calcul.PortEntree
	 * @generated
	 */
	EClass getPortEntree();

	/**
	 * Returns the meta object for enum '{@link calcul.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see calcul.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link calcul.FonctionType <em>Fonction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fonction Type</em>'.
	 * @see calcul.FonctionType
	 * @generated
	 */
	EEnum getFonctionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CalculFactory getCalculFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link calcul.impl.CalculImpl <em>Calcul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.CalculImpl
		 * @see calcul.impl.CalculPackageImpl#getCalcul()
		 * @generated
		 */
		EClass CALCUL = eINSTANCE.getCalcul();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCUL__SORTIE = eINSTANCE.getCalcul_Sortie();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCUL__ENTREE = eINSTANCE.getCalcul_Entree();

		/**
		 * The meta object literal for the '{@link calcul.impl.CalculElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.CalculElementImpl
		 * @see calcul.impl.CalculPackageImpl#getCalculElement()
		 * @generated
		 */
		EClass CALCUL_ELEMENT = eINSTANCE.getCalculElement();

		/**
		 * The meta object literal for the '{@link calcul.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.EntreeImpl
		 * @see calcul.impl.CalculPackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE__VALEUR = eINSTANCE.getEntree_Valeur();

		/**
		 * The meta object literal for the '<em><b>Portsortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE__PORTSORTIE = eINSTANCE.getEntree_Portsortie();

		/**
		 * The meta object literal for the '{@link calcul.impl.FonctionImpl <em>Fonction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.FonctionImpl
		 * @see calcul.impl.CalculPackageImpl#getFonction()
		 * @generated
		 */
		EClass FONCTION = eINSTANCE.getFonction();

		/**
		 * The meta object literal for the '<em><b>Fonction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONCTION__FONCTION = eINSTANCE.getFonction_Fonction();

		/**
		 * The meta object literal for the '<em><b>Portsortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONCTION__PORTSORTIE = eINSTANCE.getFonction_Portsortie();

		/**
		 * The meta object literal for the '<em><b>Portentree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONCTION__PORTENTREE = eINSTANCE.getFonction_Portentree();

		/**
		 * The meta object literal for the '{@link calcul.impl.PortSortieImpl <em>Port Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.PortSortieImpl
		 * @see calcul.impl.CalculPackageImpl#getPortSortie()
		 * @generated
		 */
		EClass PORT_SORTIE = eINSTANCE.getPortSortie();

		/**
		 * The meta object literal for the '{@link calcul.impl.LienImpl <em>Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.LienImpl
		 * @see calcul.impl.CalculPackageImpl#getLien()
		 * @generated
		 */
		EClass LIEN = eINSTANCE.getLien();

		/**
		 * The meta object literal for the '<em><b>Cible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN__CIBLE = eINSTANCE.getLien_Cible();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN__SOURCE = eINSTANCE.getLien_Source();

		/**
		 * The meta object literal for the '{@link calcul.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.SortieImpl
		 * @see calcul.impl.CalculPackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

		/**
		 * The meta object literal for the '<em><b>Portentree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__PORTENTREE = eINSTANCE.getSortie_Portentree();

		/**
		 * The meta object literal for the '{@link calcul.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.OperationImpl
		 * @see calcul.impl.CalculPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Portentree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PORTENTREE = eINSTANCE.getOperation_Portentree();

		/**
		 * The meta object literal for the '<em><b>Portsortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PORTSORTIE = eINSTANCE.getOperation_Portsortie();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION = eINSTANCE.getOperation_Operation();

		/**
		 * The meta object literal for the '{@link calcul.impl.PortFixeImpl <em>Port Fixe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.PortFixeImpl
		 * @see calcul.impl.CalculPackageImpl#getPortFixe()
		 * @generated
		 */
		EClass PORT_FIXE = eINSTANCE.getPortFixe();

		/**
		 * The meta object literal for the '{@link calcul.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.ArgumentImpl
		 * @see calcul.impl.CalculPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NOM = eINSTANCE.getArgument_Nom();

		/**
		 * The meta object literal for the '{@link calcul.impl.PortEntreeImpl <em>Port Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.PortEntreeImpl
		 * @see calcul.impl.CalculPackageImpl#getPortEntree()
		 * @generated
		 */
		EClass PORT_ENTREE = eINSTANCE.getPortEntree();

		/**
		 * The meta object literal for the '{@link calcul.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.OperationType
		 * @see calcul.impl.CalculPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link calcul.FonctionType <em>Fonction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.FonctionType
		 * @see calcul.impl.CalculPackageImpl#getFonctionType()
		 * @generated
		 */
		EEnum FONCTION_TYPE = eINSTANCE.getFonctionType();

	}

} //CalculPackage
