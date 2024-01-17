/**
 * generated by Xtext 2.23.0
 */
package fr.n7.cSVToTable.impl;

import fr.n7.cSVToTable.CSVToTableFactory;
import fr.n7.cSVToTable.CSVToTablePackage;
import fr.n7.cSVToTable.ColonneID;
import fr.n7.cSVToTable.LigneNom;
import fr.n7.cSVToTable.LigneValeur;
import fr.n7.cSVToTable.Tableau;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSVToTablePackageImpl extends EPackageImpl implements CSVToTablePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableauEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligneNomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colonneIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligneValeurEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.n7.cSVToTable.CSVToTablePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CSVToTablePackageImpl()
  {
    super(eNS_URI, CSVToTableFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link CSVToTablePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CSVToTablePackage init()
  {
    if (isInited) return (CSVToTablePackage)EPackage.Registry.INSTANCE.getEPackage(CSVToTablePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredCSVToTablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    CSVToTablePackageImpl theCSVToTablePackage = registeredCSVToTablePackage instanceof CSVToTablePackageImpl ? (CSVToTablePackageImpl)registeredCSVToTablePackage : new CSVToTablePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theCSVToTablePackage.createPackageContents();

    // Initialize created meta-data
    theCSVToTablePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCSVToTablePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CSVToTablePackage.eNS_URI, theCSVToTablePackage);
    return theCSVToTablePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTableau()
  {
    return tableauEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLigneNom()
  {
    return ligneNomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLigneNom_Lines()
  {
    return (EReference)ligneNomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLigneNom_Colonnes()
  {
    return (EAttribute)ligneNomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getColonneID()
  {
    return colonneIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getColonneID_Nom()
  {
    return (EAttribute)colonneIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLigneValeur()
  {
    return ligneValeurEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLigneValeur_Valeurs()
  {
    return (EAttribute)ligneValeurEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CSVToTableFactory getCSVToTableFactory()
  {
    return (CSVToTableFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    tableauEClass = createEClass(TABLEAU);

    ligneNomEClass = createEClass(LIGNE_NOM);
    createEReference(ligneNomEClass, LIGNE_NOM__LINES);
    createEAttribute(ligneNomEClass, LIGNE_NOM__COLONNES);

    colonneIDEClass = createEClass(COLONNE_ID);
    createEAttribute(colonneIDEClass, COLONNE_ID__NOM);

    ligneValeurEClass = createEClass(LIGNE_VALEUR);
    createEAttribute(ligneValeurEClass, LIGNE_VALEUR__VALEURS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ligneNomEClass.getESuperTypes().add(this.getTableau());

    // Initialize classes and features; add operations and parameters
    initEClass(tableauEClass, Tableau.class, "Tableau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ligneNomEClass, LigneNom.class, "LigneNom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLigneNom_Lines(), this.getLigneValeur(), null, "lines", null, 0, -1, LigneNom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLigneNom_Colonnes(), ecorePackage.getEString(), "colonnes", null, 0, -1, LigneNom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colonneIDEClass, ColonneID.class, "ColonneID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColonneID_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, ColonneID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ligneValeurEClass, LigneValeur.class, "LigneValeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLigneValeur_Valeurs(), ecorePackage.getEString(), "valeurs", null, 0, -1, LigneValeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CSVToTablePackageImpl
