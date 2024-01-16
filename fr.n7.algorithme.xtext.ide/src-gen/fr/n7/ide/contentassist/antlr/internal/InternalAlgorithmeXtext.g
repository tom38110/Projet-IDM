/*
 * generated by Xtext 2.23.0
 */
grammar InternalAlgorithmeXtext;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.n7.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.n7.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.n7.services.AlgorithmeXtextGrammarAccess;

}
@parser::members {
	private AlgorithmeXtextGrammarAccess grammarAccess;

	public void setGrammarAccess(AlgorithmeXtextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleAlgorithme
entryRuleAlgorithme
:
{ before(grammarAccess.getAlgorithmeRule()); }
	 ruleAlgorithme
{ after(grammarAccess.getAlgorithmeRule()); } 
	 EOF 
;

// Rule Algorithme
ruleAlgorithme 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAlgorithmeAccess().getGroup()); }
		(rule__Algorithme__Group__0)
		{ after(grammarAccess.getAlgorithmeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNom
entryRuleNom
:
{ before(grammarAccess.getNomRule()); }
	 ruleNom
{ after(grammarAccess.getNomRule()); } 
	 EOF 
;

// Rule Nom
ruleNom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNomAccess().getGroup()); }
		(rule__Nom__Group__0)
		{ after(grammarAccess.getNomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAlgorithmeElement
entryRuleAlgorithmeElement
:
{ before(grammarAccess.getAlgorithmeElementRule()); }
	 ruleAlgorithmeElement
{ after(grammarAccess.getAlgorithmeElementRule()); } 
	 EOF 
;

// Rule AlgorithmeElement
ruleAlgorithmeElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAlgorithmeElementAccess().getAlternatives()); }
		(rule__AlgorithmeElement__Alternatives)
		{ after(grammarAccess.getAlgorithmeElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRessource
entryRuleRessource
:
{ before(grammarAccess.getRessourceRule()); }
	 ruleRessource
{ after(grammarAccess.getRessourceRule()); } 
	 EOF 
;

// Rule Ressource
ruleRessource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRessourceAccess().getGroup()); }
		(rule__Ressource__Group__0)
		{ after(grammarAccess.getRessourceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChemin
entryRuleChemin
:
{ before(grammarAccess.getCheminRule()); }
	 ruleChemin
{ after(grammarAccess.getCheminRule()); } 
	 EOF 
;

// Rule Chemin
ruleChemin 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getCheminAccess().getGroup()); }
			(rule__Chemin__Group__0)
			{ after(grammarAccess.getCheminAccess().getGroup()); }
		)
		(
			{ before(grammarAccess.getCheminAccess().getGroup()); }
			(rule__Chemin__Group__0)*
			{ after(grammarAccess.getCheminAccess().getGroup()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSortie
entryRuleSortie
:
{ before(grammarAccess.getSortieRule()); }
	 ruleSortie
{ after(grammarAccess.getSortieRule()); } 
	 EOF 
;

// Rule Sortie
ruleSortie 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSortieAccess().getGroup()); }
		(rule__Sortie__Group__0)
		{ after(grammarAccess.getSortieAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleResultat
entryRuleResultat
:
{ before(grammarAccess.getResultatRule()); }
	 ruleResultat
{ after(grammarAccess.getResultatRule()); } 
	 EOF 
;

// Rule Resultat
ruleResultat 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getResultatAccess().getIDTerminalRuleCall()); }
		RULE_ID
		{ after(grammarAccess.getResultatAccess().getIDTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntree
entryRuleEntree
:
{ before(grammarAccess.getEntreeRule()); }
	 ruleEntree
{ after(grammarAccess.getEntreeRule()); } 
	 EOF 
;

// Rule Entree
ruleEntree 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntreeAccess().getGroup()); }
		(rule__Entree__Group__0)
		{ after(grammarAccess.getEntreeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArgument
entryRuleArgument
:
{ before(grammarAccess.getArgumentRule()); }
	 ruleArgument
{ after(grammarAccess.getArgumentRule()); } 
	 EOF 
;

// Rule Argument
ruleArgument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArgumentAccess().getAlternatives()); }
		(rule__Argument__Alternatives)
		{ after(grammarAccess.getArgumentAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeAlgo
entryRuleTypeAlgo
:
{ before(grammarAccess.getTypeAlgoRule()); }
	 ruleTypeAlgo
{ after(grammarAccess.getTypeAlgoRule()); } 
	 EOF 
;

// Rule TypeAlgo
ruleTypeAlgo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAlgoAccess().getAlternatives()); }
		(rule__TypeAlgo__Alternatives)
		{ after(grammarAccess.getTypeAlgoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScript
entryRuleScript
:
{ before(grammarAccess.getScriptRule()); }
	 ruleScript
{ after(grammarAccess.getScriptRule()); } 
	 EOF 
;

// Rule Script
ruleScript 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScriptAccess().getGroup()); }
		(rule__Script__Group__0)
		{ after(grammarAccess.getScriptAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProgramme
entryRuleProgramme
:
{ before(grammarAccess.getProgrammeRule()); }
	 ruleProgramme
{ after(grammarAccess.getProgrammeRule()); } 
	 EOF 
;

// Rule Programme
ruleProgramme 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgrammeAccess().getIDTerminalRuleCall()); }
		RULE_ID
		{ after(grammarAccess.getProgrammeAccess().getIDTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCalcul
entryRuleCalcul
:
{ before(grammarAccess.getCalculRule()); }
	 ruleCalcul
{ after(grammarAccess.getCalculRule()); } 
	 EOF 
;

// Rule Calcul
ruleCalcul 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getCalculAccess().getIDTerminalRuleCall()); }
			(RULE_ID)
			{ after(grammarAccess.getCalculAccess().getIDTerminalRuleCall()); }
		)
		(
			{ before(grammarAccess.getCalculAccess().getIDTerminalRuleCall()); }
			(RULE_ID)*
			{ after(grammarAccess.getCalculAccess().getIDTerminalRuleCall()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlgorithmeElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlgorithmeElementAccess().getRessourceParserRuleCall_0()); }
		ruleRessource
		{ after(grammarAccess.getAlgorithmeElementAccess().getRessourceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAlgorithmeElementAccess().getEntreeParserRuleCall_1()); }
		ruleEntree
		{ after(grammarAccess.getAlgorithmeElementAccess().getEntreeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAlgorithmeElementAccess().getSortieParserRuleCall_2()); }
		ruleSortie
		{ after(grammarAccess.getAlgorithmeElementAccess().getSortieParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSortieAccess().getGroup_2_0()); }
		(rule__Sortie__Group_2_0__0)
		{ after(grammarAccess.getSortieAccess().getGroup_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getSortieAccess().getAssociAuRetourDeLaFonctionKeyword_2_1()); }
		'associ\u00E9 au retour de la fonction'
		{ after(grammarAccess.getSortieAccess().getAssociAuRetourDeLaFonctionKeyword_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArgumentAccess().getIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getArgumentAccess().getIDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getArgumentAccess().getINTTerminalRuleCall_1()); }
		RULE_INT
		{ after(grammarAccess.getArgumentAccess().getINTTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeAlgo__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAlgoAccess().getCalculParserRuleCall_0()); }
		ruleCalcul
		{ after(grammarAccess.getTypeAlgoAccess().getCalculParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAlgoAccess().getScriptParserRuleCall_1()); }
		ruleScript
		{ after(grammarAccess.getTypeAlgoAccess().getScriptParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Algorithme__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Algorithme__Group__0__Impl
	rule__Algorithme__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Algorithme__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0()); }
	'Algorithme'
	{ after(grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Algorithme__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Algorithme__Group__1__Impl
	rule__Algorithme__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Algorithme__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlgorithmeAccess().getNomAssignment_1()); }
	(rule__Algorithme__NomAssignment_1)
	{ after(grammarAccess.getAlgorithmeAccess().getNomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Algorithme__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Algorithme__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Algorithme__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAssignment_2()); }
		(rule__Algorithme__AlgorithmeElementAssignment_2)
		{ after(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAssignment_2()); }
	)
	(
		{ before(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAssignment_2()); }
		(rule__Algorithme__AlgorithmeElementAssignment_2)*
		{ after(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Nom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nom__Group__0__Impl
	rule__Nom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Nom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNomAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getNomAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nom__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Nom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNomAccess().getGroup_1()); }
	(rule__Nom__Group_1__0)*
	{ after(grammarAccess.getNomAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Nom__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nom__Group_1__0__Impl
	rule__Nom__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Nom__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNomAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getNomAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nom__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nom__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Nom__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNomAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getNomAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ressource__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__0__Impl
	rule__Ressource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); }
	'Ressource :'
	{ after(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__1__Impl
	rule__Ressource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getNomAssignment_1()); }
	(rule__Ressource__NomAssignment_1)
	{ after(grammarAccess.getRessourceAccess().getNomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__2__Impl
	rule__Ressource__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getDeTypeKeyword_2()); }
	'de type'
	{ after(grammarAccess.getRessourceAccess().getDeTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ressource__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRessourceAccess().getTypeAssignment_3()); }
	(rule__Ressource__TypeAssignment_3)
	{ after(grammarAccess.getRessourceAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Chemin__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chemin__Group__0__Impl
	rule__Chemin__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Chemin__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheminAccess().getSolidusKeyword_0()); }
	'/'
	{ after(grammarAccess.getCheminAccess().getSolidusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chemin__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chemin__Group__1__Impl
	rule__Chemin__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Chemin__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheminAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getCheminAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chemin__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chemin__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Chemin__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheminAccess().getGroup_2()); }
	(rule__Chemin__Group_2__0)*
	{ after(grammarAccess.getCheminAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Chemin__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chemin__Group_2__0__Impl
	rule__Chemin__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Chemin__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheminAccess().getFullStopKeyword_2_0()); }
	'.'
	{ after(grammarAccess.getCheminAccess().getFullStopKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chemin__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chemin__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Chemin__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCheminAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getCheminAccess().getIDTerminalRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sortie__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sortie__Group__0__Impl
	rule__Sortie__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSortieAccess().getPortSortieKeyword_0()); }
	'Port sortie'
	{ after(grammarAccess.getSortieAccess().getPortSortieKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sortie__Group__1__Impl
	rule__Sortie__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSortieAccess().getNomAssignment_1()); }
	(rule__Sortie__NomAssignment_1)
	{ after(grammarAccess.getSortieAccess().getNomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sortie__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSortieAccess().getAlternatives_2()); }
	(rule__Sortie__Alternatives_2)
	{ after(grammarAccess.getSortieAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sortie__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sortie__Group_2_0__0__Impl
	rule__Sortie__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSortieAccess().getAssociRSultatKeyword_2_0_0()); }
	'associ\u00E9 \u00E0 r\u00E9sultat'
	{ after(grammarAccess.getSortieAccess().getAssociRSultatKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sortie__Group_2_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSortieAccess().getValeurAssignment_2_0_1()); }
	(rule__Sortie__ValeurAssignment_2_0_1)
	{ after(grammarAccess.getSortieAccess().getValeurAssignment_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entree__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entree__Group__0__Impl
	rule__Entree__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entree__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntreeAccess().getPortEntrEKeyword_0()); }
	'Port entr\u00E9e'
	{ after(grammarAccess.getEntreeAccess().getPortEntrEKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entree__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entree__Group__1__Impl
	rule__Entree__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entree__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntreeAccess().getNomAssignment_1()); }
	(rule__Entree__NomAssignment_1)
	{ after(grammarAccess.getEntreeAccess().getNomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entree__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entree__Group__2__Impl
	rule__Entree__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entree__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntreeAccess().getAssociArgumentKeyword_2()); }
	'associ\u00E9 \u00E0 argument'
	{ after(grammarAccess.getEntreeAccess().getAssociArgumentKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entree__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entree__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entree__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntreeAccess().getArgumentAssignment_3()); }
	(rule__Entree__ArgumentAssignment_3)
	{ after(grammarAccess.getEntreeAccess().getArgumentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Script__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__0__Impl
	rule__Script__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getScriptAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__1__Impl
	rule__Script__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getSousProgrammeKeyword_1()); }
	', sous-programme'
	{ after(grammarAccess.getScriptAccess().getSousProgrammeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getProgrammeParserRuleCall_2()); }
	ruleProgramme
	{ after(grammarAccess.getScriptAccess().getProgrammeParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Algorithme__NomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlgorithmeAccess().getNomNomParserRuleCall_1_0()); }
		ruleNom
		{ after(grammarAccess.getAlgorithmeAccess().getNomNomParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Algorithme__AlgorithmeElementAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAlgorithmeElementParserRuleCall_2_0()); }
		ruleAlgorithmeElement
		{ after(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAlgorithmeElementParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__NomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRessourceAccess().getNomCheminParserRuleCall_1_0()); }
		ruleChemin
		{ after(grammarAccess.getRessourceAccess().getNomCheminParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ressource__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRessourceAccess().getTypeTypeAlgoParserRuleCall_3_0()); }
		ruleTypeAlgo
		{ after(grammarAccess.getRessourceAccess().getTypeTypeAlgoParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__NomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSortieAccess().getNomNomParserRuleCall_1_0()); }
		ruleNom
		{ after(grammarAccess.getSortieAccess().getNomNomParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sortie__ValeurAssignment_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSortieAccess().getValeurResultatParserRuleCall_2_0_1_0()); }
		ruleResultat
		{ after(grammarAccess.getSortieAccess().getValeurResultatParserRuleCall_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entree__NomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntreeAccess().getNomNomParserRuleCall_1_0()); }
		ruleNom
		{ after(grammarAccess.getEntreeAccess().getNomNomParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entree__ArgumentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntreeAccess().getArgumentArgumentParserRuleCall_3_0()); }
		ruleArgument
		{ after(grammarAccess.getEntreeAccess().getArgumentArgumentParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
