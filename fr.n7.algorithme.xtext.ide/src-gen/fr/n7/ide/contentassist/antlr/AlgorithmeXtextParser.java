/*
 * generated by Xtext 2.23.0
 */
package fr.n7.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.n7.ide.contentassist.antlr.internal.InternalAlgorithmeXtextParser;
import fr.n7.services.AlgorithmeXtextGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AlgorithmeXtextParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AlgorithmeXtextGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AlgorithmeXtextGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAlgorithmeElementAccess().getAlternatives(), "rule__AlgorithmeElement__Alternatives");
			builder.put(grammarAccess.getSortieAccess().getAlternatives_2(), "rule__Sortie__Alternatives_2");
			builder.put(grammarAccess.getArgumentAccess().getAlternatives(), "rule__Argument__Alternatives");
			builder.put(grammarAccess.getTypeAlgoAccess().getAlternatives(), "rule__TypeAlgo__Alternatives");
			builder.put(grammarAccess.getAlgorithmeAccess().getGroup(), "rule__Algorithme__Group__0");
			builder.put(grammarAccess.getNomAccess().getGroup(), "rule__Nom__Group__0");
			builder.put(grammarAccess.getNomAccess().getGroup_1(), "rule__Nom__Group_1__0");
			builder.put(grammarAccess.getRessourceAccess().getGroup(), "rule__Ressource__Group__0");
			builder.put(grammarAccess.getCheminAccess().getGroup(), "rule__Chemin__Group__0");
			builder.put(grammarAccess.getCheminAccess().getGroup_2(), "rule__Chemin__Group_2__0");
			builder.put(grammarAccess.getSortieAccess().getGroup(), "rule__Sortie__Group__0");
			builder.put(grammarAccess.getSortieAccess().getGroup_2_0(), "rule__Sortie__Group_2_0__0");
			builder.put(grammarAccess.getEntreeAccess().getGroup(), "rule__Entree__Group__0");
			builder.put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
			builder.put(grammarAccess.getAlgorithmeAccess().getNomAssignment_1(), "rule__Algorithme__NomAssignment_1");
			builder.put(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAssignment_2(), "rule__Algorithme__AlgorithmeElementAssignment_2");
			builder.put(grammarAccess.getRessourceAccess().getNomAssignment_1(), "rule__Ressource__NomAssignment_1");
			builder.put(grammarAccess.getRessourceAccess().getTypeAssignment_3(), "rule__Ressource__TypeAssignment_3");
			builder.put(grammarAccess.getSortieAccess().getNomAssignment_1(), "rule__Sortie__NomAssignment_1");
			builder.put(grammarAccess.getSortieAccess().getValeurAssignment_2_0_1(), "rule__Sortie__ValeurAssignment_2_0_1");
			builder.put(grammarAccess.getEntreeAccess().getNomAssignment_1(), "rule__Entree__NomAssignment_1");
			builder.put(grammarAccess.getEntreeAccess().getArgumentAssignment_3(), "rule__Entree__ArgumentAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AlgorithmeXtextGrammarAccess grammarAccess;

	@Override
	protected InternalAlgorithmeXtextParser createParser() {
		InternalAlgorithmeXtextParser result = new InternalAlgorithmeXtextParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AlgorithmeXtextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AlgorithmeXtextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
