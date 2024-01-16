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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlgorithmeXtextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'associ\\u00E9 au retour de la fonction'", "'Algorithme'", "'.'", "'Ressource :'", "'de type'", "'/'", "'Port sortie'", "'associ\\u00E9 \\u00E0 r\\u00E9sultat'", "'Port entr\\u00E9e'", "'associ\\u00E9 \\u00E0 argument'", "', sous-programme'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAlgorithmeXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlgorithmeXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlgorithmeXtextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlgorithmeXtext.g"; }


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



    // $ANTLR start "entryRuleAlgorithme"
    // InternalAlgorithmeXtext.g:53:1: entryRuleAlgorithme : ruleAlgorithme EOF ;
    public final void entryRuleAlgorithme() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:54:1: ( ruleAlgorithme EOF )
            // InternalAlgorithmeXtext.g:55:1: ruleAlgorithme EOF
            {
             before(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithme();

            state._fsp--;

             after(grammarAccess.getAlgorithmeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalAlgorithmeXtext.g:62:1: ruleAlgorithme : ( ( rule__Algorithme__Group__0 ) ) ;
    public final void ruleAlgorithme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:66:2: ( ( ( rule__Algorithme__Group__0 ) ) )
            // InternalAlgorithmeXtext.g:67:2: ( ( rule__Algorithme__Group__0 ) )
            {
            // InternalAlgorithmeXtext.g:67:2: ( ( rule__Algorithme__Group__0 ) )
            // InternalAlgorithmeXtext.g:68:3: ( rule__Algorithme__Group__0 )
            {
             before(grammarAccess.getAlgorithmeAccess().getGroup()); 
            // InternalAlgorithmeXtext.g:69:3: ( rule__Algorithme__Group__0 )
            // InternalAlgorithmeXtext.g:69:4: rule__Algorithme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "entryRuleNom"
    // InternalAlgorithmeXtext.g:78:1: entryRuleNom : ruleNom EOF ;
    public final void entryRuleNom() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:79:1: ( ruleNom EOF )
            // InternalAlgorithmeXtext.g:80:1: ruleNom EOF
            {
             before(grammarAccess.getNomRule()); 
            pushFollow(FOLLOW_1);
            ruleNom();

            state._fsp--;

             after(grammarAccess.getNomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNom"


    // $ANTLR start "ruleNom"
    // InternalAlgorithmeXtext.g:87:1: ruleNom : ( ( rule__Nom__Group__0 ) ) ;
    public final void ruleNom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:91:2: ( ( ( rule__Nom__Group__0 ) ) )
            // InternalAlgorithmeXtext.g:92:2: ( ( rule__Nom__Group__0 ) )
            {
            // InternalAlgorithmeXtext.g:92:2: ( ( rule__Nom__Group__0 ) )
            // InternalAlgorithmeXtext.g:93:3: ( rule__Nom__Group__0 )
            {
             before(grammarAccess.getNomAccess().getGroup()); 
            // InternalAlgorithmeXtext.g:94:3: ( rule__Nom__Group__0 )
            // InternalAlgorithmeXtext.g:94:4: rule__Nom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNom"


    // $ANTLR start "entryRuleAlgorithmeElement"
    // InternalAlgorithmeXtext.g:103:1: entryRuleAlgorithmeElement : ruleAlgorithmeElement EOF ;
    public final void entryRuleAlgorithmeElement() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:104:1: ( ruleAlgorithmeElement EOF )
            // InternalAlgorithmeXtext.g:105:1: ruleAlgorithmeElement EOF
            {
             before(grammarAccess.getAlgorithmeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithmeElement();

            state._fsp--;

             after(grammarAccess.getAlgorithmeElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlgorithmeElement"


    // $ANTLR start "ruleAlgorithmeElement"
    // InternalAlgorithmeXtext.g:112:1: ruleAlgorithmeElement : ( ( rule__AlgorithmeElement__Alternatives ) ) ;
    public final void ruleAlgorithmeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:116:2: ( ( ( rule__AlgorithmeElement__Alternatives ) ) )
            // InternalAlgorithmeXtext.g:117:2: ( ( rule__AlgorithmeElement__Alternatives ) )
            {
            // InternalAlgorithmeXtext.g:117:2: ( ( rule__AlgorithmeElement__Alternatives ) )
            // InternalAlgorithmeXtext.g:118:3: ( rule__AlgorithmeElement__Alternatives )
            {
             before(grammarAccess.getAlgorithmeElementAccess().getAlternatives()); 
            // InternalAlgorithmeXtext.g:119:3: ( rule__AlgorithmeElement__Alternatives )
            // InternalAlgorithmeXtext.g:119:4: rule__AlgorithmeElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AlgorithmeElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithmeElement"


    // $ANTLR start "entryRuleRessource"
    // InternalAlgorithmeXtext.g:128:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:129:1: ( ruleRessource EOF )
            // InternalAlgorithmeXtext.g:130:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalAlgorithmeXtext.g:137:1: ruleRessource : ( ( rule__Ressource__Group__0 ) ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:141:2: ( ( ( rule__Ressource__Group__0 ) ) )
            // InternalAlgorithmeXtext.g:142:2: ( ( rule__Ressource__Group__0 ) )
            {
            // InternalAlgorithmeXtext.g:142:2: ( ( rule__Ressource__Group__0 ) )
            // InternalAlgorithmeXtext.g:143:3: ( rule__Ressource__Group__0 )
            {
             before(grammarAccess.getRessourceAccess().getGroup()); 
            // InternalAlgorithmeXtext.g:144:3: ( rule__Ressource__Group__0 )
            // InternalAlgorithmeXtext.g:144:4: rule__Ressource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleChemin"
    // InternalAlgorithmeXtext.g:153:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:154:1: ( ruleChemin EOF )
            // InternalAlgorithmeXtext.g:155:1: ruleChemin EOF
            {
             before(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getCheminRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalAlgorithmeXtext.g:162:1: ruleChemin : ( ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:166:2: ( ( ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* ) ) )
            // InternalAlgorithmeXtext.g:167:2: ( ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* ) )
            {
            // InternalAlgorithmeXtext.g:167:2: ( ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* ) )
            // InternalAlgorithmeXtext.g:168:3: ( ( rule__Chemin__Group__0 ) ) ( ( rule__Chemin__Group__0 )* )
            {
            // InternalAlgorithmeXtext.g:168:3: ( ( rule__Chemin__Group__0 ) )
            // InternalAlgorithmeXtext.g:169:4: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalAlgorithmeXtext.g:170:4: ( rule__Chemin__Group__0 )
            // InternalAlgorithmeXtext.g:170:5: rule__Chemin__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getGroup()); 

            }

            // InternalAlgorithmeXtext.g:173:3: ( ( rule__Chemin__Group__0 )* )
            // InternalAlgorithmeXtext.g:174:4: ( rule__Chemin__Group__0 )*
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalAlgorithmeXtext.g:175:4: ( rule__Chemin__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlgorithmeXtext.g:175:5: rule__Chemin__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Chemin__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getGroup()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRuleSortie"
    // InternalAlgorithmeXtext.g:185:1: entryRuleSortie : ruleSortie EOF ;
    public final void entryRuleSortie() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:186:1: ( ruleSortie EOF )
            // InternalAlgorithmeXtext.g:187:1: ruleSortie EOF
            {
             before(grammarAccess.getSortieRule()); 
            pushFollow(FOLLOW_1);
            ruleSortie();

            state._fsp--;

             after(grammarAccess.getSortieRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSortie"


    // $ANTLR start "ruleSortie"
    // InternalAlgorithmeXtext.g:194:1: ruleSortie : ( ( rule__Sortie__Group__0 ) ) ;
    public final void ruleSortie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:198:2: ( ( ( rule__Sortie__Group__0 ) ) )
            // InternalAlgorithmeXtext.g:199:2: ( ( rule__Sortie__Group__0 ) )
            {
            // InternalAlgorithmeXtext.g:199:2: ( ( rule__Sortie__Group__0 ) )
            // InternalAlgorithmeXtext.g:200:3: ( rule__Sortie__Group__0 )
            {
             before(grammarAccess.getSortieAccess().getGroup()); 
            // InternalAlgorithmeXtext.g:201:3: ( rule__Sortie__Group__0 )
            // InternalAlgorithmeXtext.g:201:4: rule__Sortie__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sortie__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSortieAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSortie"


    // $ANTLR start "entryRuleResultat"
    // InternalAlgorithmeXtext.g:210:1: entryRuleResultat : ruleResultat EOF ;
    public final void entryRuleResultat() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:211:1: ( ruleResultat EOF )
            // InternalAlgorithmeXtext.g:212:1: ruleResultat EOF
            {
             before(grammarAccess.getResultatRule()); 
            pushFollow(FOLLOW_1);
            ruleResultat();

            state._fsp--;

             after(grammarAccess.getResultatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResultat"


    // $ANTLR start "ruleResultat"
    // InternalAlgorithmeXtext.g:219:1: ruleResultat : ( RULE_ID ) ;
    public final void ruleResultat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:223:2: ( ( RULE_ID ) )
            // InternalAlgorithmeXtext.g:224:2: ( RULE_ID )
            {
            // InternalAlgorithmeXtext.g:224:2: ( RULE_ID )
            // InternalAlgorithmeXtext.g:225:3: RULE_ID
            {
             before(grammarAccess.getResultatAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResultatAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultat"


    // $ANTLR start "entryRuleEntree"
    // InternalAlgorithmeXtext.g:235:1: entryRuleEntree : ruleEntree EOF ;
    public final void entryRuleEntree() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:236:1: ( ruleEntree EOF )
            // InternalAlgorithmeXtext.g:237:1: ruleEntree EOF
            {
             before(grammarAccess.getEntreeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntree();

            state._fsp--;

             after(grammarAccess.getEntreeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntree"


    // $ANTLR start "ruleEntree"
    // InternalAlgorithmeXtext.g:244:1: ruleEntree : ( ( rule__Entree__Group__0 ) ) ;
    public final void ruleEntree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:248:2: ( ( ( rule__Entree__Group__0 ) ) )
            // InternalAlgorithmeXtext.g:249:2: ( ( rule__Entree__Group__0 ) )
            {
            // InternalAlgorithmeXtext.g:249:2: ( ( rule__Entree__Group__0 ) )
            // InternalAlgorithmeXtext.g:250:3: ( rule__Entree__Group__0 )
            {
             before(grammarAccess.getEntreeAccess().getGroup()); 
            // InternalAlgorithmeXtext.g:251:3: ( rule__Entree__Group__0 )
            // InternalAlgorithmeXtext.g:251:4: rule__Entree__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entree__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntreeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntree"


    // $ANTLR start "entryRuleArgument"
    // InternalAlgorithmeXtext.g:260:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:261:1: ( ruleArgument EOF )
            // InternalAlgorithmeXtext.g:262:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalAlgorithmeXtext.g:269:1: ruleArgument : ( ( rule__Argument__Alternatives ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:273:2: ( ( ( rule__Argument__Alternatives ) ) )
            // InternalAlgorithmeXtext.g:274:2: ( ( rule__Argument__Alternatives ) )
            {
            // InternalAlgorithmeXtext.g:274:2: ( ( rule__Argument__Alternatives ) )
            // InternalAlgorithmeXtext.g:275:3: ( rule__Argument__Alternatives )
            {
             before(grammarAccess.getArgumentAccess().getAlternatives()); 
            // InternalAlgorithmeXtext.g:276:3: ( rule__Argument__Alternatives )
            // InternalAlgorithmeXtext.g:276:4: rule__Argument__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleTypeAlgo"
    // InternalAlgorithmeXtext.g:285:1: entryRuleTypeAlgo : ruleTypeAlgo EOF ;
    public final void entryRuleTypeAlgo() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:286:1: ( ruleTypeAlgo EOF )
            // InternalAlgorithmeXtext.g:287:1: ruleTypeAlgo EOF
            {
             before(grammarAccess.getTypeAlgoRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeAlgo();

            state._fsp--;

             after(grammarAccess.getTypeAlgoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeAlgo"


    // $ANTLR start "ruleTypeAlgo"
    // InternalAlgorithmeXtext.g:294:1: ruleTypeAlgo : ( ( rule__TypeAlgo__Alternatives ) ) ;
    public final void ruleTypeAlgo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:298:2: ( ( ( rule__TypeAlgo__Alternatives ) ) )
            // InternalAlgorithmeXtext.g:299:2: ( ( rule__TypeAlgo__Alternatives ) )
            {
            // InternalAlgorithmeXtext.g:299:2: ( ( rule__TypeAlgo__Alternatives ) )
            // InternalAlgorithmeXtext.g:300:3: ( rule__TypeAlgo__Alternatives )
            {
             before(grammarAccess.getTypeAlgoAccess().getAlternatives()); 
            // InternalAlgorithmeXtext.g:301:3: ( rule__TypeAlgo__Alternatives )
            // InternalAlgorithmeXtext.g:301:4: rule__TypeAlgo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeAlgo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAlgoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeAlgo"


    // $ANTLR start "entryRuleScript"
    // InternalAlgorithmeXtext.g:310:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:311:1: ( ruleScript EOF )
            // InternalAlgorithmeXtext.g:312:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalAlgorithmeXtext.g:319:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:323:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalAlgorithmeXtext.g:324:2: ( ( rule__Script__Group__0 ) )
            {
            // InternalAlgorithmeXtext.g:324:2: ( ( rule__Script__Group__0 ) )
            // InternalAlgorithmeXtext.g:325:3: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // InternalAlgorithmeXtext.g:326:3: ( rule__Script__Group__0 )
            // InternalAlgorithmeXtext.g:326:4: rule__Script__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleProgramme"
    // InternalAlgorithmeXtext.g:335:1: entryRuleProgramme : ruleProgramme EOF ;
    public final void entryRuleProgramme() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:336:1: ( ruleProgramme EOF )
            // InternalAlgorithmeXtext.g:337:1: ruleProgramme EOF
            {
             before(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            ruleProgramme();

            state._fsp--;

             after(grammarAccess.getProgrammeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalAlgorithmeXtext.g:344:1: ruleProgramme : ( RULE_ID ) ;
    public final void ruleProgramme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:348:2: ( ( RULE_ID ) )
            // InternalAlgorithmeXtext.g:349:2: ( RULE_ID )
            {
            // InternalAlgorithmeXtext.g:349:2: ( RULE_ID )
            // InternalAlgorithmeXtext.g:350:3: RULE_ID
            {
             before(grammarAccess.getProgrammeAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleCalcul"
    // InternalAlgorithmeXtext.g:360:1: entryRuleCalcul : ruleCalcul EOF ;
    public final void entryRuleCalcul() throws RecognitionException {
        try {
            // InternalAlgorithmeXtext.g:361:1: ( ruleCalcul EOF )
            // InternalAlgorithmeXtext.g:362:1: ruleCalcul EOF
            {
             before(grammarAccess.getCalculRule()); 
            pushFollow(FOLLOW_1);
            ruleCalcul();

            state._fsp--;

             after(grammarAccess.getCalculRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalcul"


    // $ANTLR start "ruleCalcul"
    // InternalAlgorithmeXtext.g:369:1: ruleCalcul : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void ruleCalcul() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:373:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // InternalAlgorithmeXtext.g:374:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // InternalAlgorithmeXtext.g:374:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // InternalAlgorithmeXtext.g:375:3: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // InternalAlgorithmeXtext.g:375:3: ( ( RULE_ID ) )
            // InternalAlgorithmeXtext.g:376:4: ( RULE_ID )
            {
             before(grammarAccess.getCalculAccess().getIDTerminalRuleCall()); 
            // InternalAlgorithmeXtext.g:377:4: ( RULE_ID )
            // InternalAlgorithmeXtext.g:377:5: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_4); 

            }

             after(grammarAccess.getCalculAccess().getIDTerminalRuleCall()); 

            }

            // InternalAlgorithmeXtext.g:380:3: ( ( RULE_ID )* )
            // InternalAlgorithmeXtext.g:381:4: ( RULE_ID )*
            {
             before(grammarAccess.getCalculAccess().getIDTerminalRuleCall()); 
            // InternalAlgorithmeXtext.g:382:4: ( RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlgorithmeXtext.g:382:5: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCalculAccess().getIDTerminalRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalcul"


    // $ANTLR start "rule__AlgorithmeElement__Alternatives"
    // InternalAlgorithmeXtext.g:391:1: rule__AlgorithmeElement__Alternatives : ( ( ruleRessource ) | ( ruleEntree ) | ( ruleSortie ) );
    public final void rule__AlgorithmeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:395:1: ( ( ruleRessource ) | ( ruleEntree ) | ( ruleSortie ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAlgorithmeXtext.g:396:2: ( ruleRessource )
                    {
                    // InternalAlgorithmeXtext.g:396:2: ( ruleRessource )
                    // InternalAlgorithmeXtext.g:397:3: ruleRessource
                    {
                     before(grammarAccess.getAlgorithmeElementAccess().getRessourceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRessource();

                    state._fsp--;

                     after(grammarAccess.getAlgorithmeElementAccess().getRessourceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgorithmeXtext.g:402:2: ( ruleEntree )
                    {
                    // InternalAlgorithmeXtext.g:402:2: ( ruleEntree )
                    // InternalAlgorithmeXtext.g:403:3: ruleEntree
                    {
                     before(grammarAccess.getAlgorithmeElementAccess().getEntreeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntree();

                    state._fsp--;

                     after(grammarAccess.getAlgorithmeElementAccess().getEntreeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlgorithmeXtext.g:408:2: ( ruleSortie )
                    {
                    // InternalAlgorithmeXtext.g:408:2: ( ruleSortie )
                    // InternalAlgorithmeXtext.g:409:3: ruleSortie
                    {
                     before(grammarAccess.getAlgorithmeElementAccess().getSortieParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSortie();

                    state._fsp--;

                     after(grammarAccess.getAlgorithmeElementAccess().getSortieParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgorithmeElement__Alternatives"


    // $ANTLR start "rule__Sortie__Alternatives_2"
    // InternalAlgorithmeXtext.g:418:1: rule__Sortie__Alternatives_2 : ( ( ( rule__Sortie__Group_2_0__0 ) ) | ( 'associ\\u00E9 au retour de la fonction' ) );
    public final void rule__Sortie__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:422:1: ( ( ( rule__Sortie__Group_2_0__0 ) ) | ( 'associ\\u00E9 au retour de la fonction' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlgorithmeXtext.g:423:2: ( ( rule__Sortie__Group_2_0__0 ) )
                    {
                    // InternalAlgorithmeXtext.g:423:2: ( ( rule__Sortie__Group_2_0__0 ) )
                    // InternalAlgorithmeXtext.g:424:3: ( rule__Sortie__Group_2_0__0 )
                    {
                     before(grammarAccess.getSortieAccess().getGroup_2_0()); 
                    // InternalAlgorithmeXtext.g:425:3: ( rule__Sortie__Group_2_0__0 )
                    // InternalAlgorithmeXtext.g:425:4: rule__Sortie__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sortie__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSortieAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgorithmeXtext.g:429:2: ( 'associ\\u00E9 au retour de la fonction' )
                    {
                    // InternalAlgorithmeXtext.g:429:2: ( 'associ\\u00E9 au retour de la fonction' )
                    // InternalAlgorithmeXtext.g:430:3: 'associ\\u00E9 au retour de la fonction'
                    {
                     before(grammarAccess.getSortieAccess().getAssociAuRetourDeLaFonctionKeyword_2_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSortieAccess().getAssociAuRetourDeLaFonctionKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Alternatives_2"


    // $ANTLR start "rule__Argument__Alternatives"
    // InternalAlgorithmeXtext.g:439:1: rule__Argument__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__Argument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:443:1: ( ( RULE_ID ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlgorithmeXtext.g:444:2: ( RULE_ID )
                    {
                    // InternalAlgorithmeXtext.g:444:2: ( RULE_ID )
                    // InternalAlgorithmeXtext.g:445:3: RULE_ID
                    {
                     before(grammarAccess.getArgumentAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getArgumentAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgorithmeXtext.g:450:2: ( RULE_INT )
                    {
                    // InternalAlgorithmeXtext.g:450:2: ( RULE_INT )
                    // InternalAlgorithmeXtext.g:451:3: RULE_INT
                    {
                     before(grammarAccess.getArgumentAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getArgumentAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Alternatives"


    // $ANTLR start "rule__TypeAlgo__Alternatives"
    // InternalAlgorithmeXtext.g:460:1: rule__TypeAlgo__Alternatives : ( ( ruleCalcul ) | ( ruleScript ) );
    public final void rule__TypeAlgo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:464:1: ( ( ruleCalcul ) | ( ruleScript ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==21) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==14||LA6_1==17||LA6_1==19) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlgorithmeXtext.g:465:2: ( ruleCalcul )
                    {
                    // InternalAlgorithmeXtext.g:465:2: ( ruleCalcul )
                    // InternalAlgorithmeXtext.g:466:3: ruleCalcul
                    {
                     before(grammarAccess.getTypeAlgoAccess().getCalculParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCalcul();

                    state._fsp--;

                     after(grammarAccess.getTypeAlgoAccess().getCalculParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgorithmeXtext.g:471:2: ( ruleScript )
                    {
                    // InternalAlgorithmeXtext.g:471:2: ( ruleScript )
                    // InternalAlgorithmeXtext.g:472:3: ruleScript
                    {
                     before(grammarAccess.getTypeAlgoAccess().getScriptParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleScript();

                    state._fsp--;

                     after(grammarAccess.getTypeAlgoAccess().getScriptParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlgo__Alternatives"


    // $ANTLR start "rule__Algorithme__Group__0"
    // InternalAlgorithmeXtext.g:481:1: rule__Algorithme__Group__0 : rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1 ;
    public final void rule__Algorithme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:485:1: ( rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1 )
            // InternalAlgorithmeXtext.g:486:2: rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Algorithme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__0"


    // $ANTLR start "rule__Algorithme__Group__0__Impl"
    // InternalAlgorithmeXtext.g:493:1: rule__Algorithme__Group__0__Impl : ( 'Algorithme' ) ;
    public final void rule__Algorithme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:497:1: ( ( 'Algorithme' ) )
            // InternalAlgorithmeXtext.g:498:1: ( 'Algorithme' )
            {
            // InternalAlgorithmeXtext.g:498:1: ( 'Algorithme' )
            // InternalAlgorithmeXtext.g:499:2: 'Algorithme'
            {
             before(grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__0__Impl"


    // $ANTLR start "rule__Algorithme__Group__1"
    // InternalAlgorithmeXtext.g:508:1: rule__Algorithme__Group__1 : rule__Algorithme__Group__1__Impl rule__Algorithme__Group__2 ;
    public final void rule__Algorithme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:512:1: ( rule__Algorithme__Group__1__Impl rule__Algorithme__Group__2 )
            // InternalAlgorithmeXtext.g:513:2: rule__Algorithme__Group__1__Impl rule__Algorithme__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Algorithme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__1"


    // $ANTLR start "rule__Algorithme__Group__1__Impl"
    // InternalAlgorithmeXtext.g:520:1: rule__Algorithme__Group__1__Impl : ( ( rule__Algorithme__NomAssignment_1 ) ) ;
    public final void rule__Algorithme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:524:1: ( ( ( rule__Algorithme__NomAssignment_1 ) ) )
            // InternalAlgorithmeXtext.g:525:1: ( ( rule__Algorithme__NomAssignment_1 ) )
            {
            // InternalAlgorithmeXtext.g:525:1: ( ( rule__Algorithme__NomAssignment_1 ) )
            // InternalAlgorithmeXtext.g:526:2: ( rule__Algorithme__NomAssignment_1 )
            {
             before(grammarAccess.getAlgorithmeAccess().getNomAssignment_1()); 
            // InternalAlgorithmeXtext.g:527:2: ( rule__Algorithme__NomAssignment_1 )
            // InternalAlgorithmeXtext.g:527:3: rule__Algorithme__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getNomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__1__Impl"


    // $ANTLR start "rule__Algorithme__Group__2"
    // InternalAlgorithmeXtext.g:535:1: rule__Algorithme__Group__2 : rule__Algorithme__Group__2__Impl ;
    public final void rule__Algorithme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:539:1: ( rule__Algorithme__Group__2__Impl )
            // InternalAlgorithmeXtext.g:540:2: rule__Algorithme__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__2"


    // $ANTLR start "rule__Algorithme__Group__2__Impl"
    // InternalAlgorithmeXtext.g:546:1: rule__Algorithme__Group__2__Impl : ( ( ( rule__Algorithme__AlgorithmeElementAssignment_2 ) ) ( ( rule__Algorithme__AlgorithmeElementAssignment_2 )* ) ) ;
    public final void rule__Algorithme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:550:1: ( ( ( ( rule__Algorithme__AlgorithmeElementAssignment_2 ) ) ( ( rule__Algorithme__AlgorithmeElementAssignment_2 )* ) ) )
            // InternalAlgorithmeXtext.g:551:1: ( ( ( rule__Algorithme__AlgorithmeElementAssignment_2 ) ) ( ( rule__Algorithme__AlgorithmeElementAssignment_2 )* ) )
            {
            // InternalAlgorithmeXtext.g:551:1: ( ( ( rule__Algorithme__AlgorithmeElementAssignment_2 ) ) ( ( rule__Algorithme__AlgorithmeElementAssignment_2 )* ) )
            // InternalAlgorithmeXtext.g:552:2: ( ( rule__Algorithme__AlgorithmeElementAssignment_2 ) ) ( ( rule__Algorithme__AlgorithmeElementAssignment_2 )* )
            {
            // InternalAlgorithmeXtext.g:552:2: ( ( rule__Algorithme__AlgorithmeElementAssignment_2 ) )
            // InternalAlgorithmeXtext.g:553:3: ( rule__Algorithme__AlgorithmeElementAssignment_2 )
            {
             before(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAssignment_2()); 
            // InternalAlgorithmeXtext.g:554:3: ( rule__Algorithme__AlgorithmeElementAssignment_2 )
            // InternalAlgorithmeXtext.g:554:4: rule__Algorithme__AlgorithmeElementAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__Algorithme__AlgorithmeElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAssignment_2()); 

            }

            // InternalAlgorithmeXtext.g:557:2: ( ( rule__Algorithme__AlgorithmeElementAssignment_2 )* )
            // InternalAlgorithmeXtext.g:558:3: ( rule__Algorithme__AlgorithmeElementAssignment_2 )*
            {
             before(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAssignment_2()); 
            // InternalAlgorithmeXtext.g:559:3: ( rule__Algorithme__AlgorithmeElementAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14||LA7_0==17||LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAlgorithmeXtext.g:559:4: rule__Algorithme__AlgorithmeElementAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Algorithme__AlgorithmeElementAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__2__Impl"


    // $ANTLR start "rule__Nom__Group__0"
    // InternalAlgorithmeXtext.g:569:1: rule__Nom__Group__0 : rule__Nom__Group__0__Impl rule__Nom__Group__1 ;
    public final void rule__Nom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:573:1: ( rule__Nom__Group__0__Impl rule__Nom__Group__1 )
            // InternalAlgorithmeXtext.g:574:2: rule__Nom__Group__0__Impl rule__Nom__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Nom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nom__Group__0"


    // $ANTLR start "rule__Nom__Group__0__Impl"
    // InternalAlgorithmeXtext.g:581:1: rule__Nom__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Nom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:585:1: ( ( RULE_ID ) )
            // InternalAlgorithmeXtext.g:586:1: ( RULE_ID )
            {
            // InternalAlgorithmeXtext.g:586:1: ( RULE_ID )
            // InternalAlgorithmeXtext.g:587:2: RULE_ID
            {
             before(grammarAccess.getNomAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNomAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nom__Group__0__Impl"


    // $ANTLR start "rule__Nom__Group__1"
    // InternalAlgorithmeXtext.g:596:1: rule__Nom__Group__1 : rule__Nom__Group__1__Impl ;
    public final void rule__Nom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:600:1: ( rule__Nom__Group__1__Impl )
            // InternalAlgorithmeXtext.g:601:2: rule__Nom__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nom__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nom__Group__1"


    // $ANTLR start "rule__Nom__Group__1__Impl"
    // InternalAlgorithmeXtext.g:607:1: rule__Nom__Group__1__Impl : ( ( rule__Nom__Group_1__0 )* ) ;
    public final void rule__Nom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:611:1: ( ( ( rule__Nom__Group_1__0 )* ) )
            // InternalAlgorithmeXtext.g:612:1: ( ( rule__Nom__Group_1__0 )* )
            {
            // InternalAlgorithmeXtext.g:612:1: ( ( rule__Nom__Group_1__0 )* )
            // InternalAlgorithmeXtext.g:613:2: ( rule__Nom__Group_1__0 )*
            {
             before(grammarAccess.getNomAccess().getGroup_1()); 
            // InternalAlgorithmeXtext.g:614:2: ( rule__Nom__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAlgorithmeXtext.g:614:3: rule__Nom__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Nom__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getNomAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nom__Group__1__Impl"


    // $ANTLR start "rule__Nom__Group_1__0"
    // InternalAlgorithmeXtext.g:623:1: rule__Nom__Group_1__0 : rule__Nom__Group_1__0__Impl rule__Nom__Group_1__1 ;
    public final void rule__Nom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:627:1: ( rule__Nom__Group_1__0__Impl rule__Nom__Group_1__1 )
            // InternalAlgorithmeXtext.g:628:2: rule__Nom__Group_1__0__Impl rule__Nom__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Nom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nom__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nom__Group_1__0"


    // $ANTLR start "rule__Nom__Group_1__0__Impl"
    // InternalAlgorithmeXtext.g:635:1: rule__Nom__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Nom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:639:1: ( ( '.' ) )
            // InternalAlgorithmeXtext.g:640:1: ( '.' )
            {
            // InternalAlgorithmeXtext.g:640:1: ( '.' )
            // InternalAlgorithmeXtext.g:641:2: '.'
            {
             before(grammarAccess.getNomAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNomAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nom__Group_1__0__Impl"


    // $ANTLR start "rule__Nom__Group_1__1"
    // InternalAlgorithmeXtext.g:650:1: rule__Nom__Group_1__1 : rule__Nom__Group_1__1__Impl ;
    public final void rule__Nom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:654:1: ( rule__Nom__Group_1__1__Impl )
            // InternalAlgorithmeXtext.g:655:2: rule__Nom__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nom__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nom__Group_1__1"


    // $ANTLR start "rule__Nom__Group_1__1__Impl"
    // InternalAlgorithmeXtext.g:661:1: rule__Nom__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Nom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:665:1: ( ( RULE_ID ) )
            // InternalAlgorithmeXtext.g:666:1: ( RULE_ID )
            {
            // InternalAlgorithmeXtext.g:666:1: ( RULE_ID )
            // InternalAlgorithmeXtext.g:667:2: RULE_ID
            {
             before(grammarAccess.getNomAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNomAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nom__Group_1__1__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // InternalAlgorithmeXtext.g:677:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:681:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // InternalAlgorithmeXtext.g:682:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Ressource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0"


    // $ANTLR start "rule__Ressource__Group__0__Impl"
    // InternalAlgorithmeXtext.g:689:1: rule__Ressource__Group__0__Impl : ( 'Ressource :' ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:693:1: ( ( 'Ressource :' ) )
            // InternalAlgorithmeXtext.g:694:1: ( 'Ressource :' )
            {
            // InternalAlgorithmeXtext.g:694:1: ( 'Ressource :' )
            // InternalAlgorithmeXtext.g:695:2: 'Ressource :'
            {
             before(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0__Impl"


    // $ANTLR start "rule__Ressource__Group__1"
    // InternalAlgorithmeXtext.g:704:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:708:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // InternalAlgorithmeXtext.g:709:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Ressource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1"


    // $ANTLR start "rule__Ressource__Group__1__Impl"
    // InternalAlgorithmeXtext.g:716:1: rule__Ressource__Group__1__Impl : ( ( rule__Ressource__NomAssignment_1 ) ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:720:1: ( ( ( rule__Ressource__NomAssignment_1 ) ) )
            // InternalAlgorithmeXtext.g:721:1: ( ( rule__Ressource__NomAssignment_1 ) )
            {
            // InternalAlgorithmeXtext.g:721:1: ( ( rule__Ressource__NomAssignment_1 ) )
            // InternalAlgorithmeXtext.g:722:2: ( rule__Ressource__NomAssignment_1 )
            {
             before(grammarAccess.getRessourceAccess().getNomAssignment_1()); 
            // InternalAlgorithmeXtext.g:723:2: ( rule__Ressource__NomAssignment_1 )
            // InternalAlgorithmeXtext.g:723:3: rule__Ressource__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getNomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__2"
    // InternalAlgorithmeXtext.g:731:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl rule__Ressource__Group__3 ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:735:1: ( rule__Ressource__Group__2__Impl rule__Ressource__Group__3 )
            // InternalAlgorithmeXtext.g:736:2: rule__Ressource__Group__2__Impl rule__Ressource__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Ressource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2"


    // $ANTLR start "rule__Ressource__Group__2__Impl"
    // InternalAlgorithmeXtext.g:743:1: rule__Ressource__Group__2__Impl : ( 'de type' ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:747:1: ( ( 'de type' ) )
            // InternalAlgorithmeXtext.g:748:1: ( 'de type' )
            {
            // InternalAlgorithmeXtext.g:748:1: ( 'de type' )
            // InternalAlgorithmeXtext.g:749:2: 'de type'
            {
             before(grammarAccess.getRessourceAccess().getDeTypeKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getDeTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2__Impl"


    // $ANTLR start "rule__Ressource__Group__3"
    // InternalAlgorithmeXtext.g:758:1: rule__Ressource__Group__3 : rule__Ressource__Group__3__Impl ;
    public final void rule__Ressource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:762:1: ( rule__Ressource__Group__3__Impl )
            // InternalAlgorithmeXtext.g:763:2: rule__Ressource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3"


    // $ANTLR start "rule__Ressource__Group__3__Impl"
    // InternalAlgorithmeXtext.g:769:1: rule__Ressource__Group__3__Impl : ( ( rule__Ressource__TypeAssignment_3 ) ) ;
    public final void rule__Ressource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:773:1: ( ( ( rule__Ressource__TypeAssignment_3 ) ) )
            // InternalAlgorithmeXtext.g:774:1: ( ( rule__Ressource__TypeAssignment_3 ) )
            {
            // InternalAlgorithmeXtext.g:774:1: ( ( rule__Ressource__TypeAssignment_3 ) )
            // InternalAlgorithmeXtext.g:775:2: ( rule__Ressource__TypeAssignment_3 )
            {
             before(grammarAccess.getRessourceAccess().getTypeAssignment_3()); 
            // InternalAlgorithmeXtext.g:776:2: ( rule__Ressource__TypeAssignment_3 )
            // InternalAlgorithmeXtext.g:776:3: rule__Ressource__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3__Impl"


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalAlgorithmeXtext.g:785:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:789:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalAlgorithmeXtext.g:790:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Chemin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0"


    // $ANTLR start "rule__Chemin__Group__0__Impl"
    // InternalAlgorithmeXtext.g:797:1: rule__Chemin__Group__0__Impl : ( '/' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:801:1: ( ( '/' ) )
            // InternalAlgorithmeXtext.g:802:1: ( '/' )
            {
            // InternalAlgorithmeXtext.g:802:1: ( '/' )
            // InternalAlgorithmeXtext.g:803:2: '/'
            {
             before(grammarAccess.getCheminAccess().getSolidusKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSolidusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0__Impl"


    // $ANTLR start "rule__Chemin__Group__1"
    // InternalAlgorithmeXtext.g:812:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:816:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalAlgorithmeXtext.g:817:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Chemin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__1"


    // $ANTLR start "rule__Chemin__Group__1__Impl"
    // InternalAlgorithmeXtext.g:824:1: rule__Chemin__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:828:1: ( ( RULE_ID ) )
            // InternalAlgorithmeXtext.g:829:1: ( RULE_ID )
            {
            // InternalAlgorithmeXtext.g:829:1: ( RULE_ID )
            // InternalAlgorithmeXtext.g:830:2: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__1__Impl"


    // $ANTLR start "rule__Chemin__Group__2"
    // InternalAlgorithmeXtext.g:839:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:843:1: ( rule__Chemin__Group__2__Impl )
            // InternalAlgorithmeXtext.g:844:2: rule__Chemin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__2"


    // $ANTLR start "rule__Chemin__Group__2__Impl"
    // InternalAlgorithmeXtext.g:850:1: rule__Chemin__Group__2__Impl : ( ( rule__Chemin__Group_2__0 )* ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:854:1: ( ( ( rule__Chemin__Group_2__0 )* ) )
            // InternalAlgorithmeXtext.g:855:1: ( ( rule__Chemin__Group_2__0 )* )
            {
            // InternalAlgorithmeXtext.g:855:1: ( ( rule__Chemin__Group_2__0 )* )
            // InternalAlgorithmeXtext.g:856:2: ( rule__Chemin__Group_2__0 )*
            {
             before(grammarAccess.getCheminAccess().getGroup_2()); 
            // InternalAlgorithmeXtext.g:857:2: ( rule__Chemin__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAlgorithmeXtext.g:857:3: rule__Chemin__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Chemin__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__2__Impl"


    // $ANTLR start "rule__Chemin__Group_2__0"
    // InternalAlgorithmeXtext.g:866:1: rule__Chemin__Group_2__0 : rule__Chemin__Group_2__0__Impl rule__Chemin__Group_2__1 ;
    public final void rule__Chemin__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:870:1: ( rule__Chemin__Group_2__0__Impl rule__Chemin__Group_2__1 )
            // InternalAlgorithmeXtext.g:871:2: rule__Chemin__Group_2__0__Impl rule__Chemin__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Chemin__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_2__0"


    // $ANTLR start "rule__Chemin__Group_2__0__Impl"
    // InternalAlgorithmeXtext.g:878:1: rule__Chemin__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Chemin__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:882:1: ( ( '.' ) )
            // InternalAlgorithmeXtext.g:883:1: ( '.' )
            {
            // InternalAlgorithmeXtext.g:883:1: ( '.' )
            // InternalAlgorithmeXtext.g:884:2: '.'
            {
             before(grammarAccess.getCheminAccess().getFullStopKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_2__0__Impl"


    // $ANTLR start "rule__Chemin__Group_2__1"
    // InternalAlgorithmeXtext.g:893:1: rule__Chemin__Group_2__1 : rule__Chemin__Group_2__1__Impl ;
    public final void rule__Chemin__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:897:1: ( rule__Chemin__Group_2__1__Impl )
            // InternalAlgorithmeXtext.g:898:2: rule__Chemin__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_2__1"


    // $ANTLR start "rule__Chemin__Group_2__1__Impl"
    // InternalAlgorithmeXtext.g:904:1: rule__Chemin__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Chemin__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:908:1: ( ( RULE_ID ) )
            // InternalAlgorithmeXtext.g:909:1: ( RULE_ID )
            {
            // InternalAlgorithmeXtext.g:909:1: ( RULE_ID )
            // InternalAlgorithmeXtext.g:910:2: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getIDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_2__1__Impl"


    // $ANTLR start "rule__Sortie__Group__0"
    // InternalAlgorithmeXtext.g:920:1: rule__Sortie__Group__0 : rule__Sortie__Group__0__Impl rule__Sortie__Group__1 ;
    public final void rule__Sortie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:924:1: ( rule__Sortie__Group__0__Impl rule__Sortie__Group__1 )
            // InternalAlgorithmeXtext.g:925:2: rule__Sortie__Group__0__Impl rule__Sortie__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Sortie__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sortie__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group__0"


    // $ANTLR start "rule__Sortie__Group__0__Impl"
    // InternalAlgorithmeXtext.g:932:1: rule__Sortie__Group__0__Impl : ( 'Port sortie' ) ;
    public final void rule__Sortie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:936:1: ( ( 'Port sortie' ) )
            // InternalAlgorithmeXtext.g:937:1: ( 'Port sortie' )
            {
            // InternalAlgorithmeXtext.g:937:1: ( 'Port sortie' )
            // InternalAlgorithmeXtext.g:938:2: 'Port sortie'
            {
             before(grammarAccess.getSortieAccess().getPortSortieKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSortieAccess().getPortSortieKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group__0__Impl"


    // $ANTLR start "rule__Sortie__Group__1"
    // InternalAlgorithmeXtext.g:947:1: rule__Sortie__Group__1 : rule__Sortie__Group__1__Impl rule__Sortie__Group__2 ;
    public final void rule__Sortie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:951:1: ( rule__Sortie__Group__1__Impl rule__Sortie__Group__2 )
            // InternalAlgorithmeXtext.g:952:2: rule__Sortie__Group__1__Impl rule__Sortie__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Sortie__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sortie__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group__1"


    // $ANTLR start "rule__Sortie__Group__1__Impl"
    // InternalAlgorithmeXtext.g:959:1: rule__Sortie__Group__1__Impl : ( ( rule__Sortie__NomAssignment_1 ) ) ;
    public final void rule__Sortie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:963:1: ( ( ( rule__Sortie__NomAssignment_1 ) ) )
            // InternalAlgorithmeXtext.g:964:1: ( ( rule__Sortie__NomAssignment_1 ) )
            {
            // InternalAlgorithmeXtext.g:964:1: ( ( rule__Sortie__NomAssignment_1 ) )
            // InternalAlgorithmeXtext.g:965:2: ( rule__Sortie__NomAssignment_1 )
            {
             before(grammarAccess.getSortieAccess().getNomAssignment_1()); 
            // InternalAlgorithmeXtext.g:966:2: ( rule__Sortie__NomAssignment_1 )
            // InternalAlgorithmeXtext.g:966:3: rule__Sortie__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sortie__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSortieAccess().getNomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group__1__Impl"


    // $ANTLR start "rule__Sortie__Group__2"
    // InternalAlgorithmeXtext.g:974:1: rule__Sortie__Group__2 : rule__Sortie__Group__2__Impl ;
    public final void rule__Sortie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:978:1: ( rule__Sortie__Group__2__Impl )
            // InternalAlgorithmeXtext.g:979:2: rule__Sortie__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sortie__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group__2"


    // $ANTLR start "rule__Sortie__Group__2__Impl"
    // InternalAlgorithmeXtext.g:985:1: rule__Sortie__Group__2__Impl : ( ( rule__Sortie__Alternatives_2 ) ) ;
    public final void rule__Sortie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:989:1: ( ( ( rule__Sortie__Alternatives_2 ) ) )
            // InternalAlgorithmeXtext.g:990:1: ( ( rule__Sortie__Alternatives_2 ) )
            {
            // InternalAlgorithmeXtext.g:990:1: ( ( rule__Sortie__Alternatives_2 ) )
            // InternalAlgorithmeXtext.g:991:2: ( rule__Sortie__Alternatives_2 )
            {
             before(grammarAccess.getSortieAccess().getAlternatives_2()); 
            // InternalAlgorithmeXtext.g:992:2: ( rule__Sortie__Alternatives_2 )
            // InternalAlgorithmeXtext.g:992:3: rule__Sortie__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Sortie__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSortieAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group__2__Impl"


    // $ANTLR start "rule__Sortie__Group_2_0__0"
    // InternalAlgorithmeXtext.g:1001:1: rule__Sortie__Group_2_0__0 : rule__Sortie__Group_2_0__0__Impl rule__Sortie__Group_2_0__1 ;
    public final void rule__Sortie__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1005:1: ( rule__Sortie__Group_2_0__0__Impl rule__Sortie__Group_2_0__1 )
            // InternalAlgorithmeXtext.g:1006:2: rule__Sortie__Group_2_0__0__Impl rule__Sortie__Group_2_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Sortie__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sortie__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group_2_0__0"


    // $ANTLR start "rule__Sortie__Group_2_0__0__Impl"
    // InternalAlgorithmeXtext.g:1013:1: rule__Sortie__Group_2_0__0__Impl : ( 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ) ;
    public final void rule__Sortie__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1017:1: ( ( 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ) )
            // InternalAlgorithmeXtext.g:1018:1: ( 'associ\\u00E9 \\u00E0 r\\u00E9sultat' )
            {
            // InternalAlgorithmeXtext.g:1018:1: ( 'associ\\u00E9 \\u00E0 r\\u00E9sultat' )
            // InternalAlgorithmeXtext.g:1019:2: 'associ\\u00E9 \\u00E0 r\\u00E9sultat'
            {
             before(grammarAccess.getSortieAccess().getAssociRSultatKeyword_2_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSortieAccess().getAssociRSultatKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group_2_0__0__Impl"


    // $ANTLR start "rule__Sortie__Group_2_0__1"
    // InternalAlgorithmeXtext.g:1028:1: rule__Sortie__Group_2_0__1 : rule__Sortie__Group_2_0__1__Impl ;
    public final void rule__Sortie__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1032:1: ( rule__Sortie__Group_2_0__1__Impl )
            // InternalAlgorithmeXtext.g:1033:2: rule__Sortie__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sortie__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group_2_0__1"


    // $ANTLR start "rule__Sortie__Group_2_0__1__Impl"
    // InternalAlgorithmeXtext.g:1039:1: rule__Sortie__Group_2_0__1__Impl : ( ( rule__Sortie__ValeurAssignment_2_0_1 ) ) ;
    public final void rule__Sortie__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1043:1: ( ( ( rule__Sortie__ValeurAssignment_2_0_1 ) ) )
            // InternalAlgorithmeXtext.g:1044:1: ( ( rule__Sortie__ValeurAssignment_2_0_1 ) )
            {
            // InternalAlgorithmeXtext.g:1044:1: ( ( rule__Sortie__ValeurAssignment_2_0_1 ) )
            // InternalAlgorithmeXtext.g:1045:2: ( rule__Sortie__ValeurAssignment_2_0_1 )
            {
             before(grammarAccess.getSortieAccess().getValeurAssignment_2_0_1()); 
            // InternalAlgorithmeXtext.g:1046:2: ( rule__Sortie__ValeurAssignment_2_0_1 )
            // InternalAlgorithmeXtext.g:1046:3: rule__Sortie__ValeurAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Sortie__ValeurAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSortieAccess().getValeurAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__Group_2_0__1__Impl"


    // $ANTLR start "rule__Entree__Group__0"
    // InternalAlgorithmeXtext.g:1055:1: rule__Entree__Group__0 : rule__Entree__Group__0__Impl rule__Entree__Group__1 ;
    public final void rule__Entree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1059:1: ( rule__Entree__Group__0__Impl rule__Entree__Group__1 )
            // InternalAlgorithmeXtext.g:1060:2: rule__Entree__Group__0__Impl rule__Entree__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Entree__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entree__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__Group__0"


    // $ANTLR start "rule__Entree__Group__0__Impl"
    // InternalAlgorithmeXtext.g:1067:1: rule__Entree__Group__0__Impl : ( 'Port entr\\u00E9e' ) ;
    public final void rule__Entree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1071:1: ( ( 'Port entr\\u00E9e' ) )
            // InternalAlgorithmeXtext.g:1072:1: ( 'Port entr\\u00E9e' )
            {
            // InternalAlgorithmeXtext.g:1072:1: ( 'Port entr\\u00E9e' )
            // InternalAlgorithmeXtext.g:1073:2: 'Port entr\\u00E9e'
            {
             before(grammarAccess.getEntreeAccess().getPortEntrEKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntreeAccess().getPortEntrEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__Group__0__Impl"


    // $ANTLR start "rule__Entree__Group__1"
    // InternalAlgorithmeXtext.g:1082:1: rule__Entree__Group__1 : rule__Entree__Group__1__Impl rule__Entree__Group__2 ;
    public final void rule__Entree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1086:1: ( rule__Entree__Group__1__Impl rule__Entree__Group__2 )
            // InternalAlgorithmeXtext.g:1087:2: rule__Entree__Group__1__Impl rule__Entree__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Entree__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entree__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__Group__1"


    // $ANTLR start "rule__Entree__Group__1__Impl"
    // InternalAlgorithmeXtext.g:1094:1: rule__Entree__Group__1__Impl : ( ( rule__Entree__NomAssignment_1 ) ) ;
    public final void rule__Entree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1098:1: ( ( ( rule__Entree__NomAssignment_1 ) ) )
            // InternalAlgorithmeXtext.g:1099:1: ( ( rule__Entree__NomAssignment_1 ) )
            {
            // InternalAlgorithmeXtext.g:1099:1: ( ( rule__Entree__NomAssignment_1 ) )
            // InternalAlgorithmeXtext.g:1100:2: ( rule__Entree__NomAssignment_1 )
            {
             before(grammarAccess.getEntreeAccess().getNomAssignment_1()); 
            // InternalAlgorithmeXtext.g:1101:2: ( rule__Entree__NomAssignment_1 )
            // InternalAlgorithmeXtext.g:1101:3: rule__Entree__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entree__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntreeAccess().getNomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__Group__1__Impl"


    // $ANTLR start "rule__Entree__Group__2"
    // InternalAlgorithmeXtext.g:1109:1: rule__Entree__Group__2 : rule__Entree__Group__2__Impl rule__Entree__Group__3 ;
    public final void rule__Entree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1113:1: ( rule__Entree__Group__2__Impl rule__Entree__Group__3 )
            // InternalAlgorithmeXtext.g:1114:2: rule__Entree__Group__2__Impl rule__Entree__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Entree__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entree__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__Group__2"


    // $ANTLR start "rule__Entree__Group__2__Impl"
    // InternalAlgorithmeXtext.g:1121:1: rule__Entree__Group__2__Impl : ( 'associ\\u00E9 \\u00E0 argument' ) ;
    public final void rule__Entree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1125:1: ( ( 'associ\\u00E9 \\u00E0 argument' ) )
            // InternalAlgorithmeXtext.g:1126:1: ( 'associ\\u00E9 \\u00E0 argument' )
            {
            // InternalAlgorithmeXtext.g:1126:1: ( 'associ\\u00E9 \\u00E0 argument' )
            // InternalAlgorithmeXtext.g:1127:2: 'associ\\u00E9 \\u00E0 argument'
            {
             before(grammarAccess.getEntreeAccess().getAssociArgumentKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntreeAccess().getAssociArgumentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__Group__2__Impl"


    // $ANTLR start "rule__Entree__Group__3"
    // InternalAlgorithmeXtext.g:1136:1: rule__Entree__Group__3 : rule__Entree__Group__3__Impl ;
    public final void rule__Entree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1140:1: ( rule__Entree__Group__3__Impl )
            // InternalAlgorithmeXtext.g:1141:2: rule__Entree__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entree__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__Group__3"


    // $ANTLR start "rule__Entree__Group__3__Impl"
    // InternalAlgorithmeXtext.g:1147:1: rule__Entree__Group__3__Impl : ( ( rule__Entree__ArgumentAssignment_3 ) ) ;
    public final void rule__Entree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1151:1: ( ( ( rule__Entree__ArgumentAssignment_3 ) ) )
            // InternalAlgorithmeXtext.g:1152:1: ( ( rule__Entree__ArgumentAssignment_3 ) )
            {
            // InternalAlgorithmeXtext.g:1152:1: ( ( rule__Entree__ArgumentAssignment_3 ) )
            // InternalAlgorithmeXtext.g:1153:2: ( rule__Entree__ArgumentAssignment_3 )
            {
             before(grammarAccess.getEntreeAccess().getArgumentAssignment_3()); 
            // InternalAlgorithmeXtext.g:1154:2: ( rule__Entree__ArgumentAssignment_3 )
            // InternalAlgorithmeXtext.g:1154:3: rule__Entree__ArgumentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entree__ArgumentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntreeAccess().getArgumentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__Group__3__Impl"


    // $ANTLR start "rule__Script__Group__0"
    // InternalAlgorithmeXtext.g:1163:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1167:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalAlgorithmeXtext.g:1168:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // InternalAlgorithmeXtext.g:1175:1: rule__Script__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1179:1: ( ( RULE_ID ) )
            // InternalAlgorithmeXtext.g:1180:1: ( RULE_ID )
            {
            // InternalAlgorithmeXtext.g:1180:1: ( RULE_ID )
            // InternalAlgorithmeXtext.g:1181:2: RULE_ID
            {
             before(grammarAccess.getScriptAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // InternalAlgorithmeXtext.g:1190:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1194:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // InternalAlgorithmeXtext.g:1195:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // InternalAlgorithmeXtext.g:1202:1: rule__Script__Group__1__Impl : ( ', sous-programme' ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1206:1: ( ( ', sous-programme' ) )
            // InternalAlgorithmeXtext.g:1207:1: ( ', sous-programme' )
            {
            // InternalAlgorithmeXtext.g:1207:1: ( ', sous-programme' )
            // InternalAlgorithmeXtext.g:1208:2: ', sous-programme'
            {
             before(grammarAccess.getScriptAccess().getSousProgrammeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getSousProgrammeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // InternalAlgorithmeXtext.g:1217:1: rule__Script__Group__2 : rule__Script__Group__2__Impl ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1221:1: ( rule__Script__Group__2__Impl )
            // InternalAlgorithmeXtext.g:1222:2: rule__Script__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // InternalAlgorithmeXtext.g:1228:1: rule__Script__Group__2__Impl : ( ruleProgramme ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1232:1: ( ( ruleProgramme ) )
            // InternalAlgorithmeXtext.g:1233:1: ( ruleProgramme )
            {
            // InternalAlgorithmeXtext.g:1233:1: ( ruleProgramme )
            // InternalAlgorithmeXtext.g:1234:2: ruleProgramme
            {
             before(grammarAccess.getScriptAccess().getProgrammeParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleProgramme();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getProgrammeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__Algorithme__NomAssignment_1"
    // InternalAlgorithmeXtext.g:1244:1: rule__Algorithme__NomAssignment_1 : ( ruleNom ) ;
    public final void rule__Algorithme__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1248:1: ( ( ruleNom ) )
            // InternalAlgorithmeXtext.g:1249:2: ( ruleNom )
            {
            // InternalAlgorithmeXtext.g:1249:2: ( ruleNom )
            // InternalAlgorithmeXtext.g:1250:3: ruleNom
            {
             before(grammarAccess.getAlgorithmeAccess().getNomNomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNom();

            state._fsp--;

             after(grammarAccess.getAlgorithmeAccess().getNomNomParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__NomAssignment_1"


    // $ANTLR start "rule__Algorithme__AlgorithmeElementAssignment_2"
    // InternalAlgorithmeXtext.g:1259:1: rule__Algorithme__AlgorithmeElementAssignment_2 : ( ruleAlgorithmeElement ) ;
    public final void rule__Algorithme__AlgorithmeElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1263:1: ( ( ruleAlgorithmeElement ) )
            // InternalAlgorithmeXtext.g:1264:2: ( ruleAlgorithmeElement )
            {
            // InternalAlgorithmeXtext.g:1264:2: ( ruleAlgorithmeElement )
            // InternalAlgorithmeXtext.g:1265:3: ruleAlgorithmeElement
            {
             before(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAlgorithmeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithmeElement();

            state._fsp--;

             after(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAlgorithmeElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__AlgorithmeElementAssignment_2"


    // $ANTLR start "rule__Ressource__NomAssignment_1"
    // InternalAlgorithmeXtext.g:1274:1: rule__Ressource__NomAssignment_1 : ( ruleChemin ) ;
    public final void rule__Ressource__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1278:1: ( ( ruleChemin ) )
            // InternalAlgorithmeXtext.g:1279:2: ( ruleChemin )
            {
            // InternalAlgorithmeXtext.g:1279:2: ( ruleChemin )
            // InternalAlgorithmeXtext.g:1280:3: ruleChemin
            {
             before(grammarAccess.getRessourceAccess().getNomCheminParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getNomCheminParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__NomAssignment_1"


    // $ANTLR start "rule__Ressource__TypeAssignment_3"
    // InternalAlgorithmeXtext.g:1289:1: rule__Ressource__TypeAssignment_3 : ( ruleTypeAlgo ) ;
    public final void rule__Ressource__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1293:1: ( ( ruleTypeAlgo ) )
            // InternalAlgorithmeXtext.g:1294:2: ( ruleTypeAlgo )
            {
            // InternalAlgorithmeXtext.g:1294:2: ( ruleTypeAlgo )
            // InternalAlgorithmeXtext.g:1295:3: ruleTypeAlgo
            {
             before(grammarAccess.getRessourceAccess().getTypeTypeAlgoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAlgo();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getTypeTypeAlgoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__TypeAssignment_3"


    // $ANTLR start "rule__Sortie__NomAssignment_1"
    // InternalAlgorithmeXtext.g:1304:1: rule__Sortie__NomAssignment_1 : ( ruleNom ) ;
    public final void rule__Sortie__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1308:1: ( ( ruleNom ) )
            // InternalAlgorithmeXtext.g:1309:2: ( ruleNom )
            {
            // InternalAlgorithmeXtext.g:1309:2: ( ruleNom )
            // InternalAlgorithmeXtext.g:1310:3: ruleNom
            {
             before(grammarAccess.getSortieAccess().getNomNomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNom();

            state._fsp--;

             after(grammarAccess.getSortieAccess().getNomNomParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__NomAssignment_1"


    // $ANTLR start "rule__Sortie__ValeurAssignment_2_0_1"
    // InternalAlgorithmeXtext.g:1319:1: rule__Sortie__ValeurAssignment_2_0_1 : ( ruleResultat ) ;
    public final void rule__Sortie__ValeurAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1323:1: ( ( ruleResultat ) )
            // InternalAlgorithmeXtext.g:1324:2: ( ruleResultat )
            {
            // InternalAlgorithmeXtext.g:1324:2: ( ruleResultat )
            // InternalAlgorithmeXtext.g:1325:3: ruleResultat
            {
             before(grammarAccess.getSortieAccess().getValeurResultatParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResultat();

            state._fsp--;

             after(grammarAccess.getSortieAccess().getValeurResultatParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sortie__ValeurAssignment_2_0_1"


    // $ANTLR start "rule__Entree__NomAssignment_1"
    // InternalAlgorithmeXtext.g:1334:1: rule__Entree__NomAssignment_1 : ( ruleNom ) ;
    public final void rule__Entree__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1338:1: ( ( ruleNom ) )
            // InternalAlgorithmeXtext.g:1339:2: ( ruleNom )
            {
            // InternalAlgorithmeXtext.g:1339:2: ( ruleNom )
            // InternalAlgorithmeXtext.g:1340:3: ruleNom
            {
             before(grammarAccess.getEntreeAccess().getNomNomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNom();

            state._fsp--;

             after(grammarAccess.getEntreeAccess().getNomNomParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__NomAssignment_1"


    // $ANTLR start "rule__Entree__ArgumentAssignment_3"
    // InternalAlgorithmeXtext.g:1349:1: rule__Entree__ArgumentAssignment_3 : ( ruleArgument ) ;
    public final void rule__Entree__ArgumentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgorithmeXtext.g:1353:1: ( ( ruleArgument ) )
            // InternalAlgorithmeXtext.g:1354:2: ( ruleArgument )
            {
            // InternalAlgorithmeXtext.g:1354:2: ( ruleArgument )
            // InternalAlgorithmeXtext.g:1355:3: ruleArgument
            {
             before(grammarAccess.getEntreeAccess().getArgumentArgumentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getEntreeAccess().getArgumentArgumentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entree__ArgumentAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A4002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});

}