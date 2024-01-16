/**
 * generated by Xtext 2.23.0
 */
package fr.n7.cSVToTable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.cSVToTable.ColonneID#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link fr.n7.cSVToTable.ColonneID#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see fr.n7.cSVToTable.CSVToTablePackage#getColonneID()
 * @model
 * @generated
 */
public interface ColonneID extends LigneNom
{
  /**
   * Returns the value of the '<em><b>Colonnes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colonnes</em>' attribute list.
   * @see fr.n7.cSVToTable.CSVToTablePackage#getColonneID_Colonnes()
   * @model unique="false"
   * @generated
   */
  EList<String> getColonnes();

  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see fr.n7.cSVToTable.CSVToTablePackage#getColonneID_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link fr.n7.cSVToTable.ColonneID#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

} // ColonneID