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
import fr.n7.services.CSVToTableGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSVToTableParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'-'", "'/'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalCSVToTableParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCSVToTableParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCSVToTableParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCSVToTable.g"; }


    	private CSVToTableGrammarAccess grammarAccess;

    	public void setGrammarAccess(CSVToTableGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTableau"
    // InternalCSVToTable.g:53:1: entryRuleTableau : ruleTableau EOF ;
    public final void entryRuleTableau() throws RecognitionException {
        try {
            // InternalCSVToTable.g:54:1: ( ruleTableau EOF )
            // InternalCSVToTable.g:55:1: ruleTableau EOF
            {
             before(grammarAccess.getTableauRule()); 
            pushFollow(FOLLOW_1);
            ruleTableau();

            state._fsp--;

             after(grammarAccess.getTableauRule()); 
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
    // $ANTLR end "entryRuleTableau"


    // $ANTLR start "ruleTableau"
    // InternalCSVToTable.g:62:1: ruleTableau : ( ( rule__Tableau__Group__0 ) ) ;
    public final void ruleTableau() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:66:2: ( ( ( rule__Tableau__Group__0 ) ) )
            // InternalCSVToTable.g:67:2: ( ( rule__Tableau__Group__0 ) )
            {
            // InternalCSVToTable.g:67:2: ( ( rule__Tableau__Group__0 ) )
            // InternalCSVToTable.g:68:3: ( rule__Tableau__Group__0 )
            {
             before(grammarAccess.getTableauAccess().getGroup()); 
            // InternalCSVToTable.g:69:3: ( rule__Tableau__Group__0 )
            // InternalCSVToTable.g:69:4: rule__Tableau__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tableau__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableauAccess().getGroup()); 

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
    // $ANTLR end "ruleTableau"


    // $ANTLR start "entryRuleLigneNom"
    // InternalCSVToTable.g:78:1: entryRuleLigneNom : ruleLigneNom EOF ;
    public final void entryRuleLigneNom() throws RecognitionException {
        try {
            // InternalCSVToTable.g:79:1: ( ruleLigneNom EOF )
            // InternalCSVToTable.g:80:1: ruleLigneNom EOF
            {
             before(grammarAccess.getLigneNomRule()); 
            pushFollow(FOLLOW_1);
            ruleLigneNom();

            state._fsp--;

             after(grammarAccess.getLigneNomRule()); 
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
    // $ANTLR end "entryRuleLigneNom"


    // $ANTLR start "ruleLigneNom"
    // InternalCSVToTable.g:87:1: ruleLigneNom : ( ( rule__LigneNom__Group__0 ) ) ;
    public final void ruleLigneNom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:91:2: ( ( ( rule__LigneNom__Group__0 ) ) )
            // InternalCSVToTable.g:92:2: ( ( rule__LigneNom__Group__0 ) )
            {
            // InternalCSVToTable.g:92:2: ( ( rule__LigneNom__Group__0 ) )
            // InternalCSVToTable.g:93:3: ( rule__LigneNom__Group__0 )
            {
             before(grammarAccess.getLigneNomAccess().getGroup()); 
            // InternalCSVToTable.g:94:3: ( rule__LigneNom__Group__0 )
            // InternalCSVToTable.g:94:4: rule__LigneNom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LigneNom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLigneNomAccess().getGroup()); 

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
    // $ANTLR end "ruleLigneNom"


    // $ANTLR start "entryRuleColonneID"
    // InternalCSVToTable.g:103:1: entryRuleColonneID : ruleColonneID EOF ;
    public final void entryRuleColonneID() throws RecognitionException {
        try {
            // InternalCSVToTable.g:104:1: ( ruleColonneID EOF )
            // InternalCSVToTable.g:105:1: ruleColonneID EOF
            {
             before(grammarAccess.getColonneIDRule()); 
            pushFollow(FOLLOW_1);
            ruleColonneID();

            state._fsp--;

             after(grammarAccess.getColonneIDRule()); 
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
    // $ANTLR end "entryRuleColonneID"


    // $ANTLR start "ruleColonneID"
    // InternalCSVToTable.g:112:1: ruleColonneID : ( ( rule__ColonneID__NomAssignment ) ) ;
    public final void ruleColonneID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:116:2: ( ( ( rule__ColonneID__NomAssignment ) ) )
            // InternalCSVToTable.g:117:2: ( ( rule__ColonneID__NomAssignment ) )
            {
            // InternalCSVToTable.g:117:2: ( ( rule__ColonneID__NomAssignment ) )
            // InternalCSVToTable.g:118:3: ( rule__ColonneID__NomAssignment )
            {
             before(grammarAccess.getColonneIDAccess().getNomAssignment()); 
            // InternalCSVToTable.g:119:3: ( rule__ColonneID__NomAssignment )
            // InternalCSVToTable.g:119:4: rule__ColonneID__NomAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColonneID__NomAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColonneIDAccess().getNomAssignment()); 

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
    // $ANTLR end "ruleColonneID"


    // $ANTLR start "entryRuleLigneValeur"
    // InternalCSVToTable.g:128:1: entryRuleLigneValeur : ruleLigneValeur EOF ;
    public final void entryRuleLigneValeur() throws RecognitionException {
        try {
            // InternalCSVToTable.g:129:1: ( ruleLigneValeur EOF )
            // InternalCSVToTable.g:130:1: ruleLigneValeur EOF
            {
             before(grammarAccess.getLigneValeurRule()); 
            pushFollow(FOLLOW_1);
            ruleLigneValeur();

            state._fsp--;

             after(grammarAccess.getLigneValeurRule()); 
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
    // $ANTLR end "entryRuleLigneValeur"


    // $ANTLR start "ruleLigneValeur"
    // InternalCSVToTable.g:137:1: ruleLigneValeur : ( ( rule__LigneValeur__Group__0 ) ) ;
    public final void ruleLigneValeur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:141:2: ( ( ( rule__LigneValeur__Group__0 ) ) )
            // InternalCSVToTable.g:142:2: ( ( rule__LigneValeur__Group__0 ) )
            {
            // InternalCSVToTable.g:142:2: ( ( rule__LigneValeur__Group__0 ) )
            // InternalCSVToTable.g:143:3: ( rule__LigneValeur__Group__0 )
            {
             before(grammarAccess.getLigneValeurAccess().getGroup()); 
            // InternalCSVToTable.g:144:3: ( rule__LigneValeur__Group__0 )
            // InternalCSVToTable.g:144:4: rule__LigneValeur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LigneValeur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLigneValeurAccess().getGroup()); 

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
    // $ANTLR end "ruleLigneValeur"


    // $ANTLR start "entryRuleDonnee"
    // InternalCSVToTable.g:153:1: entryRuleDonnee : ruleDonnee EOF ;
    public final void entryRuleDonnee() throws RecognitionException {
        try {
            // InternalCSVToTable.g:154:1: ( ruleDonnee EOF )
            // InternalCSVToTable.g:155:1: ruleDonnee EOF
            {
             before(grammarAccess.getDonneeRule()); 
            pushFollow(FOLLOW_1);
            ruleDonnee();

            state._fsp--;

             after(grammarAccess.getDonneeRule()); 
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
    // $ANTLR end "entryRuleDonnee"


    // $ANTLR start "ruleDonnee"
    // InternalCSVToTable.g:162:1: ruleDonnee : ( ( rule__Donnee__Alternatives ) ) ;
    public final void ruleDonnee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:166:2: ( ( ( rule__Donnee__Alternatives ) ) )
            // InternalCSVToTable.g:167:2: ( ( rule__Donnee__Alternatives ) )
            {
            // InternalCSVToTable.g:167:2: ( ( rule__Donnee__Alternatives ) )
            // InternalCSVToTable.g:168:3: ( rule__Donnee__Alternatives )
            {
             before(grammarAccess.getDonneeAccess().getAlternatives()); 
            // InternalCSVToTable.g:169:3: ( rule__Donnee__Alternatives )
            // InternalCSVToTable.g:169:4: rule__Donnee__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Donnee__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDonneeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDonnee"


    // $ANTLR start "entryRuleDate"
    // InternalCSVToTable.g:178:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalCSVToTable.g:179:1: ( ruleDate EOF )
            // InternalCSVToTable.g:180:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalCSVToTable.g:187:1: ruleDate : ( ( rule__Date__Alternatives ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:191:2: ( ( ( rule__Date__Alternatives ) ) )
            // InternalCSVToTable.g:192:2: ( ( rule__Date__Alternatives ) )
            {
            // InternalCSVToTable.g:192:2: ( ( rule__Date__Alternatives ) )
            // InternalCSVToTable.g:193:3: ( rule__Date__Alternatives )
            {
             before(grammarAccess.getDateAccess().getAlternatives()); 
            // InternalCSVToTable.g:194:3: ( rule__Date__Alternatives )
            // InternalCSVToTable.g:194:4: rule__Date__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Date__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleValeur"
    // InternalCSVToTable.g:203:1: entryRuleValeur : ruleValeur EOF ;
    public final void entryRuleValeur() throws RecognitionException {
        try {
            // InternalCSVToTable.g:204:1: ( ruleValeur EOF )
            // InternalCSVToTable.g:205:1: ruleValeur EOF
            {
             before(grammarAccess.getValeurRule()); 
            pushFollow(FOLLOW_1);
            ruleValeur();

            state._fsp--;

             after(grammarAccess.getValeurRule()); 
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
    // $ANTLR end "entryRuleValeur"


    // $ANTLR start "ruleValeur"
    // InternalCSVToTable.g:212:1: ruleValeur : ( ( rule__Valeur__Alternatives ) ) ;
    public final void ruleValeur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:216:2: ( ( ( rule__Valeur__Alternatives ) ) )
            // InternalCSVToTable.g:217:2: ( ( rule__Valeur__Alternatives ) )
            {
            // InternalCSVToTable.g:217:2: ( ( rule__Valeur__Alternatives ) )
            // InternalCSVToTable.g:218:3: ( rule__Valeur__Alternatives )
            {
             before(grammarAccess.getValeurAccess().getAlternatives()); 
            // InternalCSVToTable.g:219:3: ( rule__Valeur__Alternatives )
            // InternalCSVToTable.g:219:4: rule__Valeur__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Valeur__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValeurAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValeur"


    // $ANTLR start "entryRuleFlottant"
    // InternalCSVToTable.g:228:1: entryRuleFlottant : ruleFlottant EOF ;
    public final void entryRuleFlottant() throws RecognitionException {
        try {
            // InternalCSVToTable.g:229:1: ( ruleFlottant EOF )
            // InternalCSVToTable.g:230:1: ruleFlottant EOF
            {
             before(grammarAccess.getFlottantRule()); 
            pushFollow(FOLLOW_1);
            ruleFlottant();

            state._fsp--;

             after(grammarAccess.getFlottantRule()); 
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
    // $ANTLR end "entryRuleFlottant"


    // $ANTLR start "ruleFlottant"
    // InternalCSVToTable.g:237:1: ruleFlottant : ( ( rule__Flottant__Group__0 ) ) ;
    public final void ruleFlottant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:241:2: ( ( ( rule__Flottant__Group__0 ) ) )
            // InternalCSVToTable.g:242:2: ( ( rule__Flottant__Group__0 ) )
            {
            // InternalCSVToTable.g:242:2: ( ( rule__Flottant__Group__0 ) )
            // InternalCSVToTable.g:243:3: ( rule__Flottant__Group__0 )
            {
             before(grammarAccess.getFlottantAccess().getGroup()); 
            // InternalCSVToTable.g:244:3: ( rule__Flottant__Group__0 )
            // InternalCSVToTable.g:244:4: rule__Flottant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Flottant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlottantAccess().getGroup()); 

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
    // $ANTLR end "ruleFlottant"


    // $ANTLR start "rule__Donnee__Alternatives"
    // InternalCSVToTable.g:252:1: rule__Donnee__Alternatives : ( ( ruleValeur ) | ( ruleDate ) );
    public final void rule__Donnee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:256:1: ( ( ruleValeur ) | ( ruleDate ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==11||LA1_1==14) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=12 && LA1_1<=13)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCSVToTable.g:257:2: ( ruleValeur )
                    {
                    // InternalCSVToTable.g:257:2: ( ruleValeur )
                    // InternalCSVToTable.g:258:3: ruleValeur
                    {
                     before(grammarAccess.getDonneeAccess().getValeurParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValeur();

                    state._fsp--;

                     after(grammarAccess.getDonneeAccess().getValeurParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVToTable.g:263:2: ( ruleDate )
                    {
                    // InternalCSVToTable.g:263:2: ( ruleDate )
                    // InternalCSVToTable.g:264:3: ruleDate
                    {
                     before(grammarAccess.getDonneeAccess().getDateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDate();

                    state._fsp--;

                     after(grammarAccess.getDonneeAccess().getDateParserRuleCall_1()); 

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
    // $ANTLR end "rule__Donnee__Alternatives"


    // $ANTLR start "rule__Date__Alternatives"
    // InternalCSVToTable.g:273:1: rule__Date__Alternatives : ( ( ( rule__Date__Group_0__0 ) ) | ( ( rule__Date__Group_1__0 ) ) );
    public final void rule__Date__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:277:1: ( ( ( rule__Date__Group_0__0 ) ) | ( ( rule__Date__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==12) ) {
                    alt2=1;
                }
                else if ( (LA2_1==13) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCSVToTable.g:278:2: ( ( rule__Date__Group_0__0 ) )
                    {
                    // InternalCSVToTable.g:278:2: ( ( rule__Date__Group_0__0 ) )
                    // InternalCSVToTable.g:279:3: ( rule__Date__Group_0__0 )
                    {
                     before(grammarAccess.getDateAccess().getGroup_0()); 
                    // InternalCSVToTable.g:280:3: ( rule__Date__Group_0__0 )
                    // InternalCSVToTable.g:280:4: rule__Date__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Date__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDateAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVToTable.g:284:2: ( ( rule__Date__Group_1__0 ) )
                    {
                    // InternalCSVToTable.g:284:2: ( ( rule__Date__Group_1__0 ) )
                    // InternalCSVToTable.g:285:3: ( rule__Date__Group_1__0 )
                    {
                     before(grammarAccess.getDateAccess().getGroup_1()); 
                    // InternalCSVToTable.g:286:3: ( rule__Date__Group_1__0 )
                    // InternalCSVToTable.g:286:4: rule__Date__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Date__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDateAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Date__Alternatives"


    // $ANTLR start "rule__Valeur__Alternatives"
    // InternalCSVToTable.g:294:1: rule__Valeur__Alternatives : ( ( RULE_ID ) | ( ruleFlottant ) );
    public final void rule__Valeur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:298:1: ( ( RULE_ID ) | ( ruleFlottant ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==14) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==11) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCSVToTable.g:299:2: ( RULE_ID )
                    {
                    // InternalCSVToTable.g:299:2: ( RULE_ID )
                    // InternalCSVToTable.g:300:3: RULE_ID
                    {
                     before(grammarAccess.getValeurAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValeurAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVToTable.g:305:2: ( ruleFlottant )
                    {
                    // InternalCSVToTable.g:305:2: ( ruleFlottant )
                    // InternalCSVToTable.g:306:3: ruleFlottant
                    {
                     before(grammarAccess.getValeurAccess().getFlottantParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFlottant();

                    state._fsp--;

                     after(grammarAccess.getValeurAccess().getFlottantParserRuleCall_1()); 

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
    // $ANTLR end "rule__Valeur__Alternatives"


    // $ANTLR start "rule__Tableau__Group__0"
    // InternalCSVToTable.g:315:1: rule__Tableau__Group__0 : rule__Tableau__Group__0__Impl rule__Tableau__Group__1 ;
    public final void rule__Tableau__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:319:1: ( rule__Tableau__Group__0__Impl rule__Tableau__Group__1 )
            // InternalCSVToTable.g:320:2: rule__Tableau__Group__0__Impl rule__Tableau__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Tableau__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tableau__Group__1();

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
    // $ANTLR end "rule__Tableau__Group__0"


    // $ANTLR start "rule__Tableau__Group__0__Impl"
    // InternalCSVToTable.g:327:1: rule__Tableau__Group__0__Impl : ( ruleLigneNom ) ;
    public final void rule__Tableau__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:331:1: ( ( ruleLigneNom ) )
            // InternalCSVToTable.g:332:1: ( ruleLigneNom )
            {
            // InternalCSVToTable.g:332:1: ( ruleLigneNom )
            // InternalCSVToTable.g:333:2: ruleLigneNom
            {
             before(grammarAccess.getTableauAccess().getLigneNomParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLigneNom();

            state._fsp--;

             after(grammarAccess.getTableauAccess().getLigneNomParserRuleCall_0()); 

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
    // $ANTLR end "rule__Tableau__Group__0__Impl"


    // $ANTLR start "rule__Tableau__Group__1"
    // InternalCSVToTable.g:342:1: rule__Tableau__Group__1 : rule__Tableau__Group__1__Impl ;
    public final void rule__Tableau__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:346:1: ( rule__Tableau__Group__1__Impl )
            // InternalCSVToTable.g:347:2: rule__Tableau__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tableau__Group__1__Impl();

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
    // $ANTLR end "rule__Tableau__Group__1"


    // $ANTLR start "rule__Tableau__Group__1__Impl"
    // InternalCSVToTable.g:353:1: rule__Tableau__Group__1__Impl : ( ( rule__Tableau__LinesAssignment_1 ) ) ;
    public final void rule__Tableau__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:357:1: ( ( ( rule__Tableau__LinesAssignment_1 ) ) )
            // InternalCSVToTable.g:358:1: ( ( rule__Tableau__LinesAssignment_1 ) )
            {
            // InternalCSVToTable.g:358:1: ( ( rule__Tableau__LinesAssignment_1 ) )
            // InternalCSVToTable.g:359:2: ( rule__Tableau__LinesAssignment_1 )
            {
             before(grammarAccess.getTableauAccess().getLinesAssignment_1()); 
            // InternalCSVToTable.g:360:2: ( rule__Tableau__LinesAssignment_1 )
            // InternalCSVToTable.g:360:3: rule__Tableau__LinesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tableau__LinesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableauAccess().getLinesAssignment_1()); 

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
    // $ANTLR end "rule__Tableau__Group__1__Impl"


    // $ANTLR start "rule__LigneNom__Group__0"
    // InternalCSVToTable.g:369:1: rule__LigneNom__Group__0 : rule__LigneNom__Group__0__Impl rule__LigneNom__Group__1 ;
    public final void rule__LigneNom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:373:1: ( rule__LigneNom__Group__0__Impl rule__LigneNom__Group__1 )
            // InternalCSVToTable.g:374:2: rule__LigneNom__Group__0__Impl rule__LigneNom__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LigneNom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneNom__Group__1();

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
    // $ANTLR end "rule__LigneNom__Group__0"


    // $ANTLR start "rule__LigneNom__Group__0__Impl"
    // InternalCSVToTable.g:381:1: rule__LigneNom__Group__0__Impl : ( ruleColonneID ) ;
    public final void rule__LigneNom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:385:1: ( ( ruleColonneID ) )
            // InternalCSVToTable.g:386:1: ( ruleColonneID )
            {
            // InternalCSVToTable.g:386:1: ( ruleColonneID )
            // InternalCSVToTable.g:387:2: ruleColonneID
            {
             before(grammarAccess.getLigneNomAccess().getColonneIDParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleColonneID();

            state._fsp--;

             after(grammarAccess.getLigneNomAccess().getColonneIDParserRuleCall_0()); 

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
    // $ANTLR end "rule__LigneNom__Group__0__Impl"


    // $ANTLR start "rule__LigneNom__Group__1"
    // InternalCSVToTable.g:396:1: rule__LigneNom__Group__1 : rule__LigneNom__Group__1__Impl ;
    public final void rule__LigneNom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:400:1: ( rule__LigneNom__Group__1__Impl )
            // InternalCSVToTable.g:401:2: rule__LigneNom__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LigneNom__Group__1__Impl();

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
    // $ANTLR end "rule__LigneNom__Group__1"


    // $ANTLR start "rule__LigneNom__Group__1__Impl"
    // InternalCSVToTable.g:407:1: rule__LigneNom__Group__1__Impl : ( ( rule__LigneNom__Group_1__0 )* ) ;
    public final void rule__LigneNom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:411:1: ( ( ( rule__LigneNom__Group_1__0 )* ) )
            // InternalCSVToTable.g:412:1: ( ( rule__LigneNom__Group_1__0 )* )
            {
            // InternalCSVToTable.g:412:1: ( ( rule__LigneNom__Group_1__0 )* )
            // InternalCSVToTable.g:413:2: ( rule__LigneNom__Group_1__0 )*
            {
             before(grammarAccess.getLigneNomAccess().getGroup_1()); 
            // InternalCSVToTable.g:414:2: ( rule__LigneNom__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCSVToTable.g:414:3: rule__LigneNom__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__LigneNom__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getLigneNomAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LigneNom__Group__1__Impl"


    // $ANTLR start "rule__LigneNom__Group_1__0"
    // InternalCSVToTable.g:423:1: rule__LigneNom__Group_1__0 : rule__LigneNom__Group_1__0__Impl rule__LigneNom__Group_1__1 ;
    public final void rule__LigneNom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:427:1: ( rule__LigneNom__Group_1__0__Impl rule__LigneNom__Group_1__1 )
            // InternalCSVToTable.g:428:2: rule__LigneNom__Group_1__0__Impl rule__LigneNom__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__LigneNom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneNom__Group_1__1();

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
    // $ANTLR end "rule__LigneNom__Group_1__0"


    // $ANTLR start "rule__LigneNom__Group_1__0__Impl"
    // InternalCSVToTable.g:435:1: rule__LigneNom__Group_1__0__Impl : ( ',' ) ;
    public final void rule__LigneNom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:439:1: ( ( ',' ) )
            // InternalCSVToTable.g:440:1: ( ',' )
            {
            // InternalCSVToTable.g:440:1: ( ',' )
            // InternalCSVToTable.g:441:2: ','
            {
             before(grammarAccess.getLigneNomAccess().getCommaKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLigneNomAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__LigneNom__Group_1__0__Impl"


    // $ANTLR start "rule__LigneNom__Group_1__1"
    // InternalCSVToTable.g:450:1: rule__LigneNom__Group_1__1 : rule__LigneNom__Group_1__1__Impl ;
    public final void rule__LigneNom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:454:1: ( rule__LigneNom__Group_1__1__Impl )
            // InternalCSVToTable.g:455:2: rule__LigneNom__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LigneNom__Group_1__1__Impl();

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
    // $ANTLR end "rule__LigneNom__Group_1__1"


    // $ANTLR start "rule__LigneNom__Group_1__1__Impl"
    // InternalCSVToTable.g:461:1: rule__LigneNom__Group_1__1__Impl : ( ( rule__LigneNom__ColonnesAssignment_1_1 ) ) ;
    public final void rule__LigneNom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:465:1: ( ( ( rule__LigneNom__ColonnesAssignment_1_1 ) ) )
            // InternalCSVToTable.g:466:1: ( ( rule__LigneNom__ColonnesAssignment_1_1 ) )
            {
            // InternalCSVToTable.g:466:1: ( ( rule__LigneNom__ColonnesAssignment_1_1 ) )
            // InternalCSVToTable.g:467:2: ( rule__LigneNom__ColonnesAssignment_1_1 )
            {
             before(grammarAccess.getLigneNomAccess().getColonnesAssignment_1_1()); 
            // InternalCSVToTable.g:468:2: ( rule__LigneNom__ColonnesAssignment_1_1 )
            // InternalCSVToTable.g:468:3: rule__LigneNom__ColonnesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LigneNom__ColonnesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLigneNomAccess().getColonnesAssignment_1_1()); 

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
    // $ANTLR end "rule__LigneNom__Group_1__1__Impl"


    // $ANTLR start "rule__LigneValeur__Group__0"
    // InternalCSVToTable.g:477:1: rule__LigneValeur__Group__0 : rule__LigneValeur__Group__0__Impl rule__LigneValeur__Group__1 ;
    public final void rule__LigneValeur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:481:1: ( rule__LigneValeur__Group__0__Impl rule__LigneValeur__Group__1 )
            // InternalCSVToTable.g:482:2: rule__LigneValeur__Group__0__Impl rule__LigneValeur__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LigneValeur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneValeur__Group__1();

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
    // $ANTLR end "rule__LigneValeur__Group__0"


    // $ANTLR start "rule__LigneValeur__Group__0__Impl"
    // InternalCSVToTable.g:489:1: rule__LigneValeur__Group__0__Impl : ( ( rule__LigneValeur__ValeursAssignment_0 ) ) ;
    public final void rule__LigneValeur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:493:1: ( ( ( rule__LigneValeur__ValeursAssignment_0 ) ) )
            // InternalCSVToTable.g:494:1: ( ( rule__LigneValeur__ValeursAssignment_0 ) )
            {
            // InternalCSVToTable.g:494:1: ( ( rule__LigneValeur__ValeursAssignment_0 ) )
            // InternalCSVToTable.g:495:2: ( rule__LigneValeur__ValeursAssignment_0 )
            {
             before(grammarAccess.getLigneValeurAccess().getValeursAssignment_0()); 
            // InternalCSVToTable.g:496:2: ( rule__LigneValeur__ValeursAssignment_0 )
            // InternalCSVToTable.g:496:3: rule__LigneValeur__ValeursAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LigneValeur__ValeursAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLigneValeurAccess().getValeursAssignment_0()); 

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
    // $ANTLR end "rule__LigneValeur__Group__0__Impl"


    // $ANTLR start "rule__LigneValeur__Group__1"
    // InternalCSVToTable.g:504:1: rule__LigneValeur__Group__1 : rule__LigneValeur__Group__1__Impl ;
    public final void rule__LigneValeur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:508:1: ( rule__LigneValeur__Group__1__Impl )
            // InternalCSVToTable.g:509:2: rule__LigneValeur__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LigneValeur__Group__1__Impl();

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
    // $ANTLR end "rule__LigneValeur__Group__1"


    // $ANTLR start "rule__LigneValeur__Group__1__Impl"
    // InternalCSVToTable.g:515:1: rule__LigneValeur__Group__1__Impl : ( ( rule__LigneValeur__Group_1__0 )* ) ;
    public final void rule__LigneValeur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:519:1: ( ( ( rule__LigneValeur__Group_1__0 )* ) )
            // InternalCSVToTable.g:520:1: ( ( rule__LigneValeur__Group_1__0 )* )
            {
            // InternalCSVToTable.g:520:1: ( ( rule__LigneValeur__Group_1__0 )* )
            // InternalCSVToTable.g:521:2: ( rule__LigneValeur__Group_1__0 )*
            {
             before(grammarAccess.getLigneValeurAccess().getGroup_1()); 
            // InternalCSVToTable.g:522:2: ( rule__LigneValeur__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCSVToTable.g:522:3: rule__LigneValeur__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__LigneValeur__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getLigneValeurAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LigneValeur__Group__1__Impl"


    // $ANTLR start "rule__LigneValeur__Group_1__0"
    // InternalCSVToTable.g:531:1: rule__LigneValeur__Group_1__0 : rule__LigneValeur__Group_1__0__Impl rule__LigneValeur__Group_1__1 ;
    public final void rule__LigneValeur__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:535:1: ( rule__LigneValeur__Group_1__0__Impl rule__LigneValeur__Group_1__1 )
            // InternalCSVToTable.g:536:2: rule__LigneValeur__Group_1__0__Impl rule__LigneValeur__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__LigneValeur__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneValeur__Group_1__1();

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
    // $ANTLR end "rule__LigneValeur__Group_1__0"


    // $ANTLR start "rule__LigneValeur__Group_1__0__Impl"
    // InternalCSVToTable.g:543:1: rule__LigneValeur__Group_1__0__Impl : ( ',' ) ;
    public final void rule__LigneValeur__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:547:1: ( ( ',' ) )
            // InternalCSVToTable.g:548:1: ( ',' )
            {
            // InternalCSVToTable.g:548:1: ( ',' )
            // InternalCSVToTable.g:549:2: ','
            {
             before(grammarAccess.getLigneValeurAccess().getCommaKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLigneValeurAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__LigneValeur__Group_1__0__Impl"


    // $ANTLR start "rule__LigneValeur__Group_1__1"
    // InternalCSVToTable.g:558:1: rule__LigneValeur__Group_1__1 : rule__LigneValeur__Group_1__1__Impl ;
    public final void rule__LigneValeur__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:562:1: ( rule__LigneValeur__Group_1__1__Impl )
            // InternalCSVToTable.g:563:2: rule__LigneValeur__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LigneValeur__Group_1__1__Impl();

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
    // $ANTLR end "rule__LigneValeur__Group_1__1"


    // $ANTLR start "rule__LigneValeur__Group_1__1__Impl"
    // InternalCSVToTable.g:569:1: rule__LigneValeur__Group_1__1__Impl : ( ( rule__LigneValeur__ValeursAssignment_1_1 ) ) ;
    public final void rule__LigneValeur__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:573:1: ( ( ( rule__LigneValeur__ValeursAssignment_1_1 ) ) )
            // InternalCSVToTable.g:574:1: ( ( rule__LigneValeur__ValeursAssignment_1_1 ) )
            {
            // InternalCSVToTable.g:574:1: ( ( rule__LigneValeur__ValeursAssignment_1_1 ) )
            // InternalCSVToTable.g:575:2: ( rule__LigneValeur__ValeursAssignment_1_1 )
            {
             before(grammarAccess.getLigneValeurAccess().getValeursAssignment_1_1()); 
            // InternalCSVToTable.g:576:2: ( rule__LigneValeur__ValeursAssignment_1_1 )
            // InternalCSVToTable.g:576:3: rule__LigneValeur__ValeursAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LigneValeur__ValeursAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLigneValeurAccess().getValeursAssignment_1_1()); 

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
    // $ANTLR end "rule__LigneValeur__Group_1__1__Impl"


    // $ANTLR start "rule__Date__Group_0__0"
    // InternalCSVToTable.g:585:1: rule__Date__Group_0__0 : rule__Date__Group_0__0__Impl rule__Date__Group_0__1 ;
    public final void rule__Date__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:589:1: ( rule__Date__Group_0__0__Impl rule__Date__Group_0__1 )
            // InternalCSVToTable.g:590:2: rule__Date__Group_0__0__Impl rule__Date__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Date__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group_0__1();

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
    // $ANTLR end "rule__Date__Group_0__0"


    // $ANTLR start "rule__Date__Group_0__0__Impl"
    // InternalCSVToTable.g:597:1: rule__Date__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__Date__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:601:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:602:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:602:1: ( RULE_ID )
            // InternalCSVToTable.g:603:2: RULE_ID
            {
             before(grammarAccess.getDateAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Date__Group_0__0__Impl"


    // $ANTLR start "rule__Date__Group_0__1"
    // InternalCSVToTable.g:612:1: rule__Date__Group_0__1 : rule__Date__Group_0__1__Impl rule__Date__Group_0__2 ;
    public final void rule__Date__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:616:1: ( rule__Date__Group_0__1__Impl rule__Date__Group_0__2 )
            // InternalCSVToTable.g:617:2: rule__Date__Group_0__1__Impl rule__Date__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Date__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group_0__2();

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
    // $ANTLR end "rule__Date__Group_0__1"


    // $ANTLR start "rule__Date__Group_0__1__Impl"
    // InternalCSVToTable.g:624:1: rule__Date__Group_0__1__Impl : ( '-' ) ;
    public final void rule__Date__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:628:1: ( ( '-' ) )
            // InternalCSVToTable.g:629:1: ( '-' )
            {
            // InternalCSVToTable.g:629:1: ( '-' )
            // InternalCSVToTable.g:630:2: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__Date__Group_0__1__Impl"


    // $ANTLR start "rule__Date__Group_0__2"
    // InternalCSVToTable.g:639:1: rule__Date__Group_0__2 : rule__Date__Group_0__2__Impl ;
    public final void rule__Date__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:643:1: ( rule__Date__Group_0__2__Impl )
            // InternalCSVToTable.g:644:2: rule__Date__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group_0__2__Impl();

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
    // $ANTLR end "rule__Date__Group_0__2"


    // $ANTLR start "rule__Date__Group_0__2__Impl"
    // InternalCSVToTable.g:650:1: rule__Date__Group_0__2__Impl : ( RULE_ID ) ;
    public final void rule__Date__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:654:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:655:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:655:1: ( RULE_ID )
            // InternalCSVToTable.g:656:2: RULE_ID
            {
             before(grammarAccess.getDateAccess().getIDTerminalRuleCall_0_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getIDTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__Date__Group_0__2__Impl"


    // $ANTLR start "rule__Date__Group_1__0"
    // InternalCSVToTable.g:666:1: rule__Date__Group_1__0 : rule__Date__Group_1__0__Impl rule__Date__Group_1__1 ;
    public final void rule__Date__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:670:1: ( rule__Date__Group_1__0__Impl rule__Date__Group_1__1 )
            // InternalCSVToTable.g:671:2: rule__Date__Group_1__0__Impl rule__Date__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Date__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group_1__1();

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
    // $ANTLR end "rule__Date__Group_1__0"


    // $ANTLR start "rule__Date__Group_1__0__Impl"
    // InternalCSVToTable.g:678:1: rule__Date__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Date__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:682:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:683:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:683:1: ( RULE_ID )
            // InternalCSVToTable.g:684:2: RULE_ID
            {
             before(grammarAccess.getDateAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Date__Group_1__0__Impl"


    // $ANTLR start "rule__Date__Group_1__1"
    // InternalCSVToTable.g:693:1: rule__Date__Group_1__1 : rule__Date__Group_1__1__Impl rule__Date__Group_1__2 ;
    public final void rule__Date__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:697:1: ( rule__Date__Group_1__1__Impl rule__Date__Group_1__2 )
            // InternalCSVToTable.g:698:2: rule__Date__Group_1__1__Impl rule__Date__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Date__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group_1__2();

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
    // $ANTLR end "rule__Date__Group_1__1"


    // $ANTLR start "rule__Date__Group_1__1__Impl"
    // InternalCSVToTable.g:705:1: rule__Date__Group_1__1__Impl : ( '/' ) ;
    public final void rule__Date__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:709:1: ( ( '/' ) )
            // InternalCSVToTable.g:710:1: ( '/' )
            {
            // InternalCSVToTable.g:710:1: ( '/' )
            // InternalCSVToTable.g:711:2: '/'
            {
             before(grammarAccess.getDateAccess().getSolidusKeyword_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getSolidusKeyword_1_1()); 

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
    // $ANTLR end "rule__Date__Group_1__1__Impl"


    // $ANTLR start "rule__Date__Group_1__2"
    // InternalCSVToTable.g:720:1: rule__Date__Group_1__2 : rule__Date__Group_1__2__Impl ;
    public final void rule__Date__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:724:1: ( rule__Date__Group_1__2__Impl )
            // InternalCSVToTable.g:725:2: rule__Date__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group_1__2__Impl();

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
    // $ANTLR end "rule__Date__Group_1__2"


    // $ANTLR start "rule__Date__Group_1__2__Impl"
    // InternalCSVToTable.g:731:1: rule__Date__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__Date__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:735:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:736:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:736:1: ( RULE_ID )
            // InternalCSVToTable.g:737:2: RULE_ID
            {
             before(grammarAccess.getDateAccess().getIDTerminalRuleCall_1_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getIDTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__Date__Group_1__2__Impl"


    // $ANTLR start "rule__Flottant__Group__0"
    // InternalCSVToTable.g:747:1: rule__Flottant__Group__0 : rule__Flottant__Group__0__Impl rule__Flottant__Group__1 ;
    public final void rule__Flottant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:751:1: ( rule__Flottant__Group__0__Impl rule__Flottant__Group__1 )
            // InternalCSVToTable.g:752:2: rule__Flottant__Group__0__Impl rule__Flottant__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Flottant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flottant__Group__1();

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
    // $ANTLR end "rule__Flottant__Group__0"


    // $ANTLR start "rule__Flottant__Group__0__Impl"
    // InternalCSVToTable.g:759:1: rule__Flottant__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Flottant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:763:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:764:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:764:1: ( RULE_ID )
            // InternalCSVToTable.g:765:2: RULE_ID
            {
             before(grammarAccess.getFlottantAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFlottantAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Flottant__Group__0__Impl"


    // $ANTLR start "rule__Flottant__Group__1"
    // InternalCSVToTable.g:774:1: rule__Flottant__Group__1 : rule__Flottant__Group__1__Impl ;
    public final void rule__Flottant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:778:1: ( rule__Flottant__Group__1__Impl )
            // InternalCSVToTable.g:779:2: rule__Flottant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Flottant__Group__1__Impl();

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
    // $ANTLR end "rule__Flottant__Group__1"


    // $ANTLR start "rule__Flottant__Group__1__Impl"
    // InternalCSVToTable.g:785:1: rule__Flottant__Group__1__Impl : ( ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* ) ) ;
    public final void rule__Flottant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:789:1: ( ( ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* ) ) )
            // InternalCSVToTable.g:790:1: ( ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* ) )
            {
            // InternalCSVToTable.g:790:1: ( ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* ) )
            // InternalCSVToTable.g:791:2: ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* )
            {
            // InternalCSVToTable.g:791:2: ( ( rule__Flottant__Group_1__0 ) )
            // InternalCSVToTable.g:792:3: ( rule__Flottant__Group_1__0 )
            {
             before(grammarAccess.getFlottantAccess().getGroup_1()); 
            // InternalCSVToTable.g:793:3: ( rule__Flottant__Group_1__0 )
            // InternalCSVToTable.g:793:4: rule__Flottant__Group_1__0
            {
            pushFollow(FOLLOW_9);
            rule__Flottant__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getFlottantAccess().getGroup_1()); 

            }

            // InternalCSVToTable.g:796:2: ( ( rule__Flottant__Group_1__0 )* )
            // InternalCSVToTable.g:797:3: ( rule__Flottant__Group_1__0 )*
            {
             before(grammarAccess.getFlottantAccess().getGroup_1()); 
            // InternalCSVToTable.g:798:3: ( rule__Flottant__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCSVToTable.g:798:4: rule__Flottant__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Flottant__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFlottantAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Flottant__Group__1__Impl"


    // $ANTLR start "rule__Flottant__Group_1__0"
    // InternalCSVToTable.g:808:1: rule__Flottant__Group_1__0 : rule__Flottant__Group_1__0__Impl rule__Flottant__Group_1__1 ;
    public final void rule__Flottant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:812:1: ( rule__Flottant__Group_1__0__Impl rule__Flottant__Group_1__1 )
            // InternalCSVToTable.g:813:2: rule__Flottant__Group_1__0__Impl rule__Flottant__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Flottant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flottant__Group_1__1();

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
    // $ANTLR end "rule__Flottant__Group_1__0"


    // $ANTLR start "rule__Flottant__Group_1__0__Impl"
    // InternalCSVToTable.g:820:1: rule__Flottant__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Flottant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:824:1: ( ( '.' ) )
            // InternalCSVToTable.g:825:1: ( '.' )
            {
            // InternalCSVToTable.g:825:1: ( '.' )
            // InternalCSVToTable.g:826:2: '.'
            {
             before(grammarAccess.getFlottantAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFlottantAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Flottant__Group_1__0__Impl"


    // $ANTLR start "rule__Flottant__Group_1__1"
    // InternalCSVToTable.g:835:1: rule__Flottant__Group_1__1 : rule__Flottant__Group_1__1__Impl ;
    public final void rule__Flottant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:839:1: ( rule__Flottant__Group_1__1__Impl )
            // InternalCSVToTable.g:840:2: rule__Flottant__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Flottant__Group_1__1__Impl();

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
    // $ANTLR end "rule__Flottant__Group_1__1"


    // $ANTLR start "rule__Flottant__Group_1__1__Impl"
    // InternalCSVToTable.g:846:1: rule__Flottant__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Flottant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:850:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:851:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:851:1: ( RULE_ID )
            // InternalCSVToTable.g:852:2: RULE_ID
            {
             before(grammarAccess.getFlottantAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFlottantAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Flottant__Group_1__1__Impl"


    // $ANTLR start "rule__Tableau__LinesAssignment_1"
    // InternalCSVToTable.g:862:1: rule__Tableau__LinesAssignment_1 : ( ruleLigneValeur ) ;
    public final void rule__Tableau__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:866:1: ( ( ruleLigneValeur ) )
            // InternalCSVToTable.g:867:2: ( ruleLigneValeur )
            {
            // InternalCSVToTable.g:867:2: ( ruleLigneValeur )
            // InternalCSVToTable.g:868:3: ruleLigneValeur
            {
             before(grammarAccess.getTableauAccess().getLinesLigneValeurParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLigneValeur();

            state._fsp--;

             after(grammarAccess.getTableauAccess().getLinesLigneValeurParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Tableau__LinesAssignment_1"


    // $ANTLR start "rule__LigneNom__ColonnesAssignment_1_1"
    // InternalCSVToTable.g:877:1: rule__LigneNom__ColonnesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__LigneNom__ColonnesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:881:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:882:2: ( RULE_ID )
            {
            // InternalCSVToTable.g:882:2: ( RULE_ID )
            // InternalCSVToTable.g:883:3: RULE_ID
            {
             before(grammarAccess.getLigneNomAccess().getColonnesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLigneNomAccess().getColonnesIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LigneNom__ColonnesAssignment_1_1"


    // $ANTLR start "rule__ColonneID__NomAssignment"
    // InternalCSVToTable.g:892:1: rule__ColonneID__NomAssignment : ( RULE_ID ) ;
    public final void rule__ColonneID__NomAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:896:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:897:2: ( RULE_ID )
            {
            // InternalCSVToTable.g:897:2: ( RULE_ID )
            // InternalCSVToTable.g:898:3: RULE_ID
            {
             before(grammarAccess.getColonneIDAccess().getNomIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColonneIDAccess().getNomIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ColonneID__NomAssignment"


    // $ANTLR start "rule__LigneValeur__ValeursAssignment_0"
    // InternalCSVToTable.g:907:1: rule__LigneValeur__ValeursAssignment_0 : ( ruleDonnee ) ;
    public final void rule__LigneValeur__ValeursAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:911:1: ( ( ruleDonnee ) )
            // InternalCSVToTable.g:912:2: ( ruleDonnee )
            {
            // InternalCSVToTable.g:912:2: ( ruleDonnee )
            // InternalCSVToTable.g:913:3: ruleDonnee
            {
             before(grammarAccess.getLigneValeurAccess().getValeursDonneeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDonnee();

            state._fsp--;

             after(grammarAccess.getLigneValeurAccess().getValeursDonneeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LigneValeur__ValeursAssignment_0"


    // $ANTLR start "rule__LigneValeur__ValeursAssignment_1_1"
    // InternalCSVToTable.g:922:1: rule__LigneValeur__ValeursAssignment_1_1 : ( ruleDonnee ) ;
    public final void rule__LigneValeur__ValeursAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:926:1: ( ( ruleDonnee ) )
            // InternalCSVToTable.g:927:2: ( ruleDonnee )
            {
            // InternalCSVToTable.g:927:2: ( ruleDonnee )
            // InternalCSVToTable.g:928:3: ruleDonnee
            {
             before(grammarAccess.getLigneValeurAccess().getValeursDonneeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDonnee();

            state._fsp--;

             after(grammarAccess.getLigneValeurAccess().getValeursDonneeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LigneValeur__ValeursAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});

}