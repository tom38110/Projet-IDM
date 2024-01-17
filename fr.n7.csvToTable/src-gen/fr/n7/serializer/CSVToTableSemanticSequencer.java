/*
 * generated by Xtext 2.23.0
 */
package fr.n7.serializer;

import com.google.inject.Inject;
import fr.n7.cSVToTable.CSVToTablePackage;
import fr.n7.cSVToTable.ColonneID;
import fr.n7.cSVToTable.LigneNom;
import fr.n7.cSVToTable.LigneValeur;
import fr.n7.services.CSVToTableGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CSVToTableSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CSVToTableGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CSVToTablePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CSVToTablePackage.COLONNE_ID:
				sequence_ColonneID(context, (ColonneID) semanticObject); 
				return; 
			case CSVToTablePackage.LIGNE_NOM:
				if (rule == grammarAccess.getLigneNomRule()) {
					sequence_LigneNom(context, (LigneNom) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTableauRule()) {
					sequence_LigneNom_Tableau(context, (LigneNom) semanticObject); 
					return; 
				}
				else break;
			case CSVToTablePackage.LIGNE_VALEUR:
				sequence_LigneValeur(context, (LigneValeur) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ColonneID returns ColonneID
	 *
	 * Constraint:
	 *     nom=ID
	 */
	protected void sequence_ColonneID(ISerializationContext context, ColonneID semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CSVToTablePackage.Literals.COLONNE_ID__NOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSVToTablePackage.Literals.COLONNE_ID__NOM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColonneIDAccess().getNomIDTerminalRuleCall_0(), semanticObject.getNom());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LigneNom returns LigneNom
	 *
	 * Constraint:
	 *     (colonnes+=ID colonnes+=ID*)
	 */
	protected void sequence_LigneNom(ISerializationContext context, LigneNom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tableau returns LigneNom
	 *
	 * Constraint:
	 *     (colonnes+=ID colonnes+=ID* lines+=LigneValeur)
	 */
	protected void sequence_LigneNom_Tableau(ISerializationContext context, LigneNom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LigneValeur returns LigneValeur
	 *
	 * Constraint:
	 *     (valeurs+=Donnee valeurs+=Donnee*)
	 */
	protected void sequence_LigneValeur(ISerializationContext context, LigneValeur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
