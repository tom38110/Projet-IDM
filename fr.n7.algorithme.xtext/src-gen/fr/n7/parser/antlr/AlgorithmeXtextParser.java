/*
 * generated by Xtext 2.23.0
 */
package fr.n7.parser.antlr;

import com.google.inject.Inject;
import fr.n7.parser.antlr.internal.InternalAlgorithmeXtextParser;
import fr.n7.services.AlgorithmeXtextGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AlgorithmeXtextParser extends AbstractAntlrParser {

	@Inject
	private AlgorithmeXtextGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAlgorithmeXtextParser createParser(XtextTokenStream stream) {
		return new InternalAlgorithmeXtextParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Algorithme";
	}

	public AlgorithmeXtextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AlgorithmeXtextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
