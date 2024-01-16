/**
 * generated by Xtext 2.23.0
 */
package fr.n7.cSVToTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ligne Valeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.cSVToTable.LigneValeur#getValeurs <em>Valeurs</em>}</li>
 * </ul>
 *
 * @see fr.n7.cSVToTable.CSVToTablePackage#getLigneValeur()
 * @model
 * @generated
 */
public interface LigneValeur extends EObject
{
  /**
   * Returns the value of the '<em><b>Valeurs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valeurs</em>' attribute list.
   * @see fr.n7.cSVToTable.CSVToTablePackage#getLigneValeur_Valeurs()
   * @model unique="false"
   * @generated
   */
  EList<String> getValeurs();

} // LigneValeur