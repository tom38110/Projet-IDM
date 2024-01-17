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


    // $ANTLR start "entryRuleLigneValeur"
    // InternalCSVToTable.g:103:1: entryRuleLigneValeur : ruleLigneValeur EOF ;
    public final void entryRuleLigneValeur() throws RecognitionException {
        try {
            // InternalCSVToTable.g:104:1: ( ruleLigneValeur EOF )
            // InternalCSVToTable.g:105:1: ruleLigneValeur EOF
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
    // InternalCSVToTable.g:112:1: ruleLigneValeur : ( ( rule__LigneValeur__Group__0 ) ) ;
    public final void ruleLigneValeur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:116:2: ( ( ( rule__LigneValeur__Group__0 ) ) )
            // InternalCSVToTable.g:117:2: ( ( rule__LigneValeur__Group__0 ) )
            {
            // InternalCSVToTable.g:117:2: ( ( rule__LigneValeur__Group__0 ) )
            // InternalCSVToTable.g:118:3: ( rule__LigneValeur__Group__0 )
            {
             before(grammarAccess.getLigneValeurAccess().getGroup()); 
            // InternalCSVToTable.g:119:3: ( rule__LigneValeur__Group__0 )
            // InternalCSVToTable.g:119:4: rule__LigneValeur__Group__0
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
    // InternalCSVToTable.g:128:1: entryRuleDonnee : ruleDonnee EOF ;
    public final void entryRuleDonnee() throws RecognitionException {
        try {
            // InternalCSVToTable.g:129:1: ( ruleDonnee EOF )
            // InternalCSVToTable.g:130:1: ruleDonnee EOF
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
    // InternalCSVToTable.g:137:1: ruleDonnee : ( ( rule__Donnee__Alternatives ) ) ;
    public final void ruleDonnee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:141:2: ( ( ( rule__Donnee__Alternatives ) ) )
            // InternalCSVToTable.g:142:2: ( ( rule__Donnee__Alternatives ) )
            {
            // InternalCSVToTable.g:142:2: ( ( rule__Donnee__Alternatives ) )
            // InternalCSVToTable.g:143:3: ( rule__Donnee__Alternatives )
            {
             before(grammarAccess.getDonneeAccess().getAlternatives()); 
            // InternalCSVToTable.g:144:3: ( rule__Donnee__Alternatives )
            // InternalCSVToTable.g:144:4: rule__Donnee__Alternatives
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
    // InternalCSVToTable.g:153:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalCSVToTable.g:154:1: ( ruleDate EOF )
            // InternalCSVToTable.g:155:1: ruleDate EOF
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
    // InternalCSVToTable.g:162:1: ruleDate : ( ( rule__Date__Alternatives ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:166:2: ( ( ( rule__Date__Alternatives ) ) )
            // InternalCSVToTable.g:167:2: ( ( rule__Date__Alternatives ) )
            {
            // InternalCSVToTable.g:167:2: ( ( rule__Date__Alternatives ) )
            // InternalCSVToTable.g:168:3: ( rule__Date__Alternatives )
            {
             before(grammarAccess.getDateAccess().getAlternatives()); 
            // InternalCSVToTable.g:169:3: ( rule__Date__Alternatives )
            // InternalCSVToTable.g:169:4: rule__Date__Alternatives
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
    // InternalCSVToTable.g:178:1: entryRuleValeur : ruleValeur EOF ;
    public final void entryRuleValeur() throws RecognitionException {
        try {
            // InternalCSVToTable.g:179:1: ( ruleValeur EOF )
            // InternalCSVToTable.g:180:1: ruleValeur EOF
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
    // InternalCSVToTable.g:187:1: ruleValeur : ( ( rule__Valeur__Alternatives ) ) ;
    public final void ruleValeur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:191:2: ( ( ( rule__Valeur__Alternatives ) ) )
            // InternalCSVToTable.g:192:2: ( ( rule__Valeur__Alternatives ) )
            {
            // InternalCSVToTable.g:192:2: ( ( rule__Valeur__Alternatives ) )
            // InternalCSVToTable.g:193:3: ( rule__Valeur__Alternatives )
            {
             before(grammarAccess.getValeurAccess().getAlternatives()); 
            // InternalCSVToTable.g:194:3: ( rule__Valeur__Alternatives )
            // InternalCSVToTable.g:194:4: rule__Valeur__Alternatives
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
    // InternalCSVToTable.g:203:1: entryRuleFlottant : ruleFlottant EOF ;
    public final void entryRuleFlottant() throws RecognitionException {
        try {
            // InternalCSVToTable.g:204:1: ( ruleFlottant EOF )
            // InternalCSVToTable.g:205:1: ruleFlottant EOF
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
    // InternalCSVToTable.g:212:1: ruleFlottant : ( ( rule__Flottant__Group__0 ) ) ;
    public final void ruleFlottant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:216:2: ( ( ( rule__Flottant__Group__0 ) ) )
            // InternalCSVToTable.g:217:2: ( ( rule__Flottant__Group__0 ) )
            {
            // InternalCSVToTable.g:217:2: ( ( rule__Flottant__Group__0 ) )
            // InternalCSVToTable.g:218:3: ( rule__Flottant__Group__0 )
            {
             before(grammarAccess.getFlottantAccess().getGroup()); 
            // InternalCSVToTable.g:219:3: ( rule__Flottant__Group__0 )
            // InternalCSVToTable.g:219:4: rule__Flottant__Group__0
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
    // InternalCSVToTable.g:227:1: rule__Donnee__Alternatives : ( ( ruleValeur ) | ( ruleDate ) );
    public final void rule__Donnee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:231:1: ( ( ruleValeur ) | ( ruleDate ) )
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
                    // InternalCSVToTable.g:232:2: ( ruleValeur )
                    {
                    // InternalCSVToTable.g:232:2: ( ruleValeur )
                    // InternalCSVToTable.g:233:3: ruleValeur
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
                    // InternalCSVToTable.g:238:2: ( ruleDate )
                    {
                    // InternalCSVToTable.g:238:2: ( ruleDate )
                    // InternalCSVToTable.g:239:3: ruleDate
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
    // InternalCSVToTable.g:248:1: rule__Date__Alternatives : ( ( ( rule__Date__Group_0__0 ) ) | ( ( rule__Date__Group_1__0 ) ) );
    public final void rule__Date__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:252:1: ( ( ( rule__Date__Group_0__0 ) ) | ( ( rule__Date__Group_1__0 ) ) )
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
                    // InternalCSVToTable.g:253:2: ( ( rule__Date__Group_0__0 ) )
                    {
                    // InternalCSVToTable.g:253:2: ( ( rule__Date__Group_0__0 ) )
                    // InternalCSVToTable.g:254:3: ( rule__Date__Group_0__0 )
                    {
                     before(grammarAccess.getDateAccess().getGroup_0()); 
                    // InternalCSVToTable.g:255:3: ( rule__Date__Group_0__0 )
                    // InternalCSVToTable.g:255:4: rule__Date__Group_0__0
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
                    // InternalCSVToTable.g:259:2: ( ( rule__Date__Group_1__0 ) )
                    {
                    // InternalCSVToTable.g:259:2: ( ( rule__Date__Group_1__0 ) )
                    // InternalCSVToTable.g:260:3: ( rule__Date__Group_1__0 )
                    {
                     before(grammarAccess.getDateAccess().getGroup_1()); 
                    // InternalCSVToTable.g:261:3: ( rule__Date__Group_1__0 )
                    // InternalCSVToTable.g:261:4: rule__Date__Group_1__0
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
    // InternalCSVToTable.g:269:1: rule__Valeur__Alternatives : ( ( RULE_ID ) | ( ruleFlottant ) );
    public final void rule__Valeur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:273:1: ( ( RULE_ID ) | ( ruleFlottant ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==11) ) {
                    alt3=1;
                }
                else if ( (LA3_1==14) ) {
                    alt3=2;
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
                    // InternalCSVToTable.g:274:2: ( RULE_ID )
                    {
                    // InternalCSVToTable.g:274:2: ( RULE_ID )
                    // InternalCSVToTable.g:275:3: RULE_ID
                    {
                     before(grammarAccess.getValeurAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValeurAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVToTable.g:280:2: ( ruleFlottant )
                    {
                    // InternalCSVToTable.g:280:2: ( ruleFlottant )
                    // InternalCSVToTable.g:281:3: ruleFlottant
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
    // InternalCSVToTable.g:290:1: rule__Tableau__Group__0 : rule__Tableau__Group__0__Impl rule__Tableau__Group__1 ;
    public final void rule__Tableau__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:294:1: ( rule__Tableau__Group__0__Impl rule__Tableau__Group__1 )
            // InternalCSVToTable.g:295:2: rule__Tableau__Group__0__Impl rule__Tableau__Group__1
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
    // InternalCSVToTable.g:302:1: rule__Tableau__Group__0__Impl : ( ruleLigneNom ) ;
    public final void rule__Tableau__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:306:1: ( ( ruleLigneNom ) )
            // InternalCSVToTable.g:307:1: ( ruleLigneNom )
            {
            // InternalCSVToTable.g:307:1: ( ruleLigneNom )
            // InternalCSVToTable.g:308:2: ruleLigneNom
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
    // InternalCSVToTable.g:317:1: rule__Tableau__Group__1 : rule__Tableau__Group__1__Impl ;
    public final void rule__Tableau__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:321:1: ( rule__Tableau__Group__1__Impl )
            // InternalCSVToTable.g:322:2: rule__Tableau__Group__1__Impl
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
    // InternalCSVToTable.g:328:1: rule__Tableau__Group__1__Impl : ( ( rule__Tableau__LinesAssignment_1 ) ) ;
    public final void rule__Tableau__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:332:1: ( ( ( rule__Tableau__LinesAssignment_1 ) ) )
            // InternalCSVToTable.g:333:1: ( ( rule__Tableau__LinesAssignment_1 ) )
            {
            // InternalCSVToTable.g:333:1: ( ( rule__Tableau__LinesAssignment_1 ) )
            // InternalCSVToTable.g:334:2: ( rule__Tableau__LinesAssignment_1 )
            {
             before(grammarAccess.getTableauAccess().getLinesAssignment_1()); 
            // InternalCSVToTable.g:335:2: ( rule__Tableau__LinesAssignment_1 )
            // InternalCSVToTable.g:335:3: rule__Tableau__LinesAssignment_1
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
    // InternalCSVToTable.g:344:1: rule__LigneNom__Group__0 : rule__LigneNom__Group__0__Impl rule__LigneNom__Group__1 ;
    public final void rule__LigneNom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:348:1: ( rule__LigneNom__Group__0__Impl rule__LigneNom__Group__1 )
            // InternalCSVToTable.g:349:2: rule__LigneNom__Group__0__Impl rule__LigneNom__Group__1
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
    // InternalCSVToTable.g:356:1: rule__LigneNom__Group__0__Impl : ( ( rule__LigneNom__ColonnesAssignment_0 ) ) ;
    public final void rule__LigneNom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:360:1: ( ( ( rule__LigneNom__ColonnesAssignment_0 ) ) )
            // InternalCSVToTable.g:361:1: ( ( rule__LigneNom__ColonnesAssignment_0 ) )
            {
            // InternalCSVToTable.g:361:1: ( ( rule__LigneNom__ColonnesAssignment_0 ) )
            // InternalCSVToTable.g:362:2: ( rule__LigneNom__ColonnesAssignment_0 )
            {
             before(grammarAccess.getLigneNomAccess().getColonnesAssignment_0()); 
            // InternalCSVToTable.g:363:2: ( rule__LigneNom__ColonnesAssignment_0 )
            // InternalCSVToTable.g:363:3: rule__LigneNom__ColonnesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LigneNom__ColonnesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLigneNomAccess().getColonnesAssignment_0()); 

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
    // InternalCSVToTable.g:371:1: rule__LigneNom__Group__1 : rule__LigneNom__Group__1__Impl ;
    public final void rule__LigneNom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:375:1: ( rule__LigneNom__Group__1__Impl )
            // InternalCSVToTable.g:376:2: rule__LigneNom__Group__1__Impl
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
    // InternalCSVToTable.g:382:1: rule__LigneNom__Group__1__Impl : ( ( rule__LigneNom__Group_1__0 )* ) ;
    public final void rule__LigneNom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:386:1: ( ( ( rule__LigneNom__Group_1__0 )* ) )
            // InternalCSVToTable.g:387:1: ( ( rule__LigneNom__Group_1__0 )* )
            {
            // InternalCSVToTable.g:387:1: ( ( rule__LigneNom__Group_1__0 )* )
            // InternalCSVToTable.g:388:2: ( rule__LigneNom__Group_1__0 )*
            {
             before(grammarAccess.getLigneNomAccess().getGroup_1()); 
            // InternalCSVToTable.g:389:2: ( rule__LigneNom__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCSVToTable.g:389:3: rule__LigneNom__Group_1__0
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
    // InternalCSVToTable.g:398:1: rule__LigneNom__Group_1__0 : rule__LigneNom__Group_1__0__Impl rule__LigneNom__Group_1__1 ;
    public final void rule__LigneNom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:402:1: ( rule__LigneNom__Group_1__0__Impl rule__LigneNom__Group_1__1 )
            // InternalCSVToTable.g:403:2: rule__LigneNom__Group_1__0__Impl rule__LigneNom__Group_1__1
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
    // InternalCSVToTable.g:410:1: rule__LigneNom__Group_1__0__Impl : ( ',' ) ;
    public final void rule__LigneNom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:414:1: ( ( ',' ) )
            // InternalCSVToTable.g:415:1: ( ',' )
            {
            // InternalCSVToTable.g:415:1: ( ',' )
            // InternalCSVToTable.g:416:2: ','
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
    // InternalCSVToTable.g:425:1: rule__LigneNom__Group_1__1 : rule__LigneNom__Group_1__1__Impl ;
    public final void rule__LigneNom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:429:1: ( rule__LigneNom__Group_1__1__Impl )
            // InternalCSVToTable.g:430:2: rule__LigneNom__Group_1__1__Impl
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
    // InternalCSVToTable.g:436:1: rule__LigneNom__Group_1__1__Impl : ( ( rule__LigneNom__ColonnesAssignment_1_1 ) ) ;
    public final void rule__LigneNom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:440:1: ( ( ( rule__LigneNom__ColonnesAssignment_1_1 ) ) )
            // InternalCSVToTable.g:441:1: ( ( rule__LigneNom__ColonnesAssignment_1_1 ) )
            {
            // InternalCSVToTable.g:441:1: ( ( rule__LigneNom__ColonnesAssignment_1_1 ) )
            // InternalCSVToTable.g:442:2: ( rule__LigneNom__ColonnesAssignment_1_1 )
            {
             before(grammarAccess.getLigneNomAccess().getColonnesAssignment_1_1()); 
            // InternalCSVToTable.g:443:2: ( rule__LigneNom__ColonnesAssignment_1_1 )
            // InternalCSVToTable.g:443:3: rule__LigneNom__ColonnesAssignment_1_1
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
    // InternalCSVToTable.g:452:1: rule__LigneValeur__Group__0 : rule__LigneValeur__Group__0__Impl rule__LigneValeur__Group__1 ;
    public final void rule__LigneValeur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:456:1: ( rule__LigneValeur__Group__0__Impl rule__LigneValeur__Group__1 )
            // InternalCSVToTable.g:457:2: rule__LigneValeur__Group__0__Impl rule__LigneValeur__Group__1
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
    // InternalCSVToTable.g:464:1: rule__LigneValeur__Group__0__Impl : ( ( rule__LigneValeur__ValeursAssignment_0 ) ) ;
    public final void rule__LigneValeur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:468:1: ( ( ( rule__LigneValeur__ValeursAssignment_0 ) ) )
            // InternalCSVToTable.g:469:1: ( ( rule__LigneValeur__ValeursAssignment_0 ) )
            {
            // InternalCSVToTable.g:469:1: ( ( rule__LigneValeur__ValeursAssignment_0 ) )
            // InternalCSVToTable.g:470:2: ( rule__LigneValeur__ValeursAssignment_0 )
            {
             before(grammarAccess.getLigneValeurAccess().getValeursAssignment_0()); 
            // InternalCSVToTable.g:471:2: ( rule__LigneValeur__ValeursAssignment_0 )
            // InternalCSVToTable.g:471:3: rule__LigneValeur__ValeursAssignment_0
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
    // InternalCSVToTable.g:479:1: rule__LigneValeur__Group__1 : rule__LigneValeur__Group__1__Impl ;
    public final void rule__LigneValeur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:483:1: ( rule__LigneValeur__Group__1__Impl )
            // InternalCSVToTable.g:484:2: rule__LigneValeur__Group__1__Impl
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
    // InternalCSVToTable.g:490:1: rule__LigneValeur__Group__1__Impl : ( ( rule__LigneValeur__Group_1__0 )* ) ;
    public final void rule__LigneValeur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:494:1: ( ( ( rule__LigneValeur__Group_1__0 )* ) )
            // InternalCSVToTable.g:495:1: ( ( rule__LigneValeur__Group_1__0 )* )
            {
            // InternalCSVToTable.g:495:1: ( ( rule__LigneValeur__Group_1__0 )* )
            // InternalCSVToTable.g:496:2: ( rule__LigneValeur__Group_1__0 )*
            {
             before(grammarAccess.getLigneValeurAccess().getGroup_1()); 
            // InternalCSVToTable.g:497:2: ( rule__LigneValeur__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCSVToTable.g:497:3: rule__LigneValeur__Group_1__0
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
    // InternalCSVToTable.g:506:1: rule__LigneValeur__Group_1__0 : rule__LigneValeur__Group_1__0__Impl rule__LigneValeur__Group_1__1 ;
    public final void rule__LigneValeur__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:510:1: ( rule__LigneValeur__Group_1__0__Impl rule__LigneValeur__Group_1__1 )
            // InternalCSVToTable.g:511:2: rule__LigneValeur__Group_1__0__Impl rule__LigneValeur__Group_1__1
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
    // InternalCSVToTable.g:518:1: rule__LigneValeur__Group_1__0__Impl : ( ',' ) ;
    public final void rule__LigneValeur__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:522:1: ( ( ',' ) )
            // InternalCSVToTable.g:523:1: ( ',' )
            {
            // InternalCSVToTable.g:523:1: ( ',' )
            // InternalCSVToTable.g:524:2: ','
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
    // InternalCSVToTable.g:533:1: rule__LigneValeur__Group_1__1 : rule__LigneValeur__Group_1__1__Impl ;
    public final void rule__LigneValeur__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:537:1: ( rule__LigneValeur__Group_1__1__Impl )
            // InternalCSVToTable.g:538:2: rule__LigneValeur__Group_1__1__Impl
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
    // InternalCSVToTable.g:544:1: rule__LigneValeur__Group_1__1__Impl : ( ( rule__LigneValeur__ValeursAssignment_1_1 ) ) ;
    public final void rule__LigneValeur__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:548:1: ( ( ( rule__LigneValeur__ValeursAssignment_1_1 ) ) )
            // InternalCSVToTable.g:549:1: ( ( rule__LigneValeur__ValeursAssignment_1_1 ) )
            {
            // InternalCSVToTable.g:549:1: ( ( rule__LigneValeur__ValeursAssignment_1_1 ) )
            // InternalCSVToTable.g:550:2: ( rule__LigneValeur__ValeursAssignment_1_1 )
            {
             before(grammarAccess.getLigneValeurAccess().getValeursAssignment_1_1()); 
            // InternalCSVToTable.g:551:2: ( rule__LigneValeur__ValeursAssignment_1_1 )
            // InternalCSVToTable.g:551:3: rule__LigneValeur__ValeursAssignment_1_1
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
    // InternalCSVToTable.g:560:1: rule__Date__Group_0__0 : rule__Date__Group_0__0__Impl rule__Date__Group_0__1 ;
    public final void rule__Date__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:564:1: ( rule__Date__Group_0__0__Impl rule__Date__Group_0__1 )
            // InternalCSVToTable.g:565:2: rule__Date__Group_0__0__Impl rule__Date__Group_0__1
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
    // InternalCSVToTable.g:572:1: rule__Date__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__Date__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:576:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:577:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:577:1: ( RULE_ID )
            // InternalCSVToTable.g:578:2: RULE_ID
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
    // InternalCSVToTable.g:587:1: rule__Date__Group_0__1 : rule__Date__Group_0__1__Impl rule__Date__Group_0__2 ;
    public final void rule__Date__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:591:1: ( rule__Date__Group_0__1__Impl rule__Date__Group_0__2 )
            // InternalCSVToTable.g:592:2: rule__Date__Group_0__1__Impl rule__Date__Group_0__2
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
    // InternalCSVToTable.g:599:1: rule__Date__Group_0__1__Impl : ( '-' ) ;
    public final void rule__Date__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:603:1: ( ( '-' ) )
            // InternalCSVToTable.g:604:1: ( '-' )
            {
            // InternalCSVToTable.g:604:1: ( '-' )
            // InternalCSVToTable.g:605:2: '-'
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
    // InternalCSVToTable.g:614:1: rule__Date__Group_0__2 : rule__Date__Group_0__2__Impl ;
    public final void rule__Date__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:618:1: ( rule__Date__Group_0__2__Impl )
            // InternalCSVToTable.g:619:2: rule__Date__Group_0__2__Impl
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
    // InternalCSVToTable.g:625:1: rule__Date__Group_0__2__Impl : ( RULE_ID ) ;
    public final void rule__Date__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:629:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:630:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:630:1: ( RULE_ID )
            // InternalCSVToTable.g:631:2: RULE_ID
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
    // InternalCSVToTable.g:641:1: rule__Date__Group_1__0 : rule__Date__Group_1__0__Impl rule__Date__Group_1__1 ;
    public final void rule__Date__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:645:1: ( rule__Date__Group_1__0__Impl rule__Date__Group_1__1 )
            // InternalCSVToTable.g:646:2: rule__Date__Group_1__0__Impl rule__Date__Group_1__1
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
    // InternalCSVToTable.g:653:1: rule__Date__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Date__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:657:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:658:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:658:1: ( RULE_ID )
            // InternalCSVToTable.g:659:2: RULE_ID
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
    // InternalCSVToTable.g:668:1: rule__Date__Group_1__1 : rule__Date__Group_1__1__Impl rule__Date__Group_1__2 ;
    public final void rule__Date__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:672:1: ( rule__Date__Group_1__1__Impl rule__Date__Group_1__2 )
            // InternalCSVToTable.g:673:2: rule__Date__Group_1__1__Impl rule__Date__Group_1__2
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
    // InternalCSVToTable.g:680:1: rule__Date__Group_1__1__Impl : ( '/' ) ;
    public final void rule__Date__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:684:1: ( ( '/' ) )
            // InternalCSVToTable.g:685:1: ( '/' )
            {
            // InternalCSVToTable.g:685:1: ( '/' )
            // InternalCSVToTable.g:686:2: '/'
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
    // InternalCSVToTable.g:695:1: rule__Date__Group_1__2 : rule__Date__Group_1__2__Impl ;
    public final void rule__Date__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:699:1: ( rule__Date__Group_1__2__Impl )
            // InternalCSVToTable.g:700:2: rule__Date__Group_1__2__Impl
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
    // InternalCSVToTable.g:706:1: rule__Date__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__Date__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:710:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:711:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:711:1: ( RULE_ID )
            // InternalCSVToTable.g:712:2: RULE_ID
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
    // InternalCSVToTable.g:722:1: rule__Flottant__Group__0 : rule__Flottant__Group__0__Impl rule__Flottant__Group__1 ;
    public final void rule__Flottant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:726:1: ( rule__Flottant__Group__0__Impl rule__Flottant__Group__1 )
            // InternalCSVToTable.g:727:2: rule__Flottant__Group__0__Impl rule__Flottant__Group__1
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
    // InternalCSVToTable.g:734:1: rule__Flottant__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Flottant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:738:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:739:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:739:1: ( RULE_ID )
            // InternalCSVToTable.g:740:2: RULE_ID
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
    // InternalCSVToTable.g:749:1: rule__Flottant__Group__1 : rule__Flottant__Group__1__Impl ;
    public final void rule__Flottant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:753:1: ( rule__Flottant__Group__1__Impl )
            // InternalCSVToTable.g:754:2: rule__Flottant__Group__1__Impl
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
    // InternalCSVToTable.g:760:1: rule__Flottant__Group__1__Impl : ( ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* ) ) ;
    public final void rule__Flottant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:764:1: ( ( ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* ) ) )
            // InternalCSVToTable.g:765:1: ( ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* ) )
            {
            // InternalCSVToTable.g:765:1: ( ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* ) )
            // InternalCSVToTable.g:766:2: ( ( rule__Flottant__Group_1__0 ) ) ( ( rule__Flottant__Group_1__0 )* )
            {
            // InternalCSVToTable.g:766:2: ( ( rule__Flottant__Group_1__0 ) )
            // InternalCSVToTable.g:767:3: ( rule__Flottant__Group_1__0 )
            {
             before(grammarAccess.getFlottantAccess().getGroup_1()); 
            // InternalCSVToTable.g:768:3: ( rule__Flottant__Group_1__0 )
            // InternalCSVToTable.g:768:4: rule__Flottant__Group_1__0
            {
            pushFollow(FOLLOW_9);
            rule__Flottant__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getFlottantAccess().getGroup_1()); 

            }

            // InternalCSVToTable.g:771:2: ( ( rule__Flottant__Group_1__0 )* )
            // InternalCSVToTable.g:772:3: ( rule__Flottant__Group_1__0 )*
            {
             before(grammarAccess.getFlottantAccess().getGroup_1()); 
            // InternalCSVToTable.g:773:3: ( rule__Flottant__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCSVToTable.g:773:4: rule__Flottant__Group_1__0
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
    // InternalCSVToTable.g:783:1: rule__Flottant__Group_1__0 : rule__Flottant__Group_1__0__Impl rule__Flottant__Group_1__1 ;
    public final void rule__Flottant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:787:1: ( rule__Flottant__Group_1__0__Impl rule__Flottant__Group_1__1 )
            // InternalCSVToTable.g:788:2: rule__Flottant__Group_1__0__Impl rule__Flottant__Group_1__1
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
    // InternalCSVToTable.g:795:1: rule__Flottant__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Flottant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:799:1: ( ( '.' ) )
            // InternalCSVToTable.g:800:1: ( '.' )
            {
            // InternalCSVToTable.g:800:1: ( '.' )
            // InternalCSVToTable.g:801:2: '.'
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
    // InternalCSVToTable.g:810:1: rule__Flottant__Group_1__1 : rule__Flottant__Group_1__1__Impl ;
    public final void rule__Flottant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:814:1: ( rule__Flottant__Group_1__1__Impl )
            // InternalCSVToTable.g:815:2: rule__Flottant__Group_1__1__Impl
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
    // InternalCSVToTable.g:821:1: rule__Flottant__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Flottant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:825:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:826:1: ( RULE_ID )
            {
            // InternalCSVToTable.g:826:1: ( RULE_ID )
            // InternalCSVToTable.g:827:2: RULE_ID
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
    // InternalCSVToTable.g:837:1: rule__Tableau__LinesAssignment_1 : ( ruleLigneValeur ) ;
    public final void rule__Tableau__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:841:1: ( ( ruleLigneValeur ) )
            // InternalCSVToTable.g:842:2: ( ruleLigneValeur )
            {
            // InternalCSVToTable.g:842:2: ( ruleLigneValeur )
            // InternalCSVToTable.g:843:3: ruleLigneValeur
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


    // $ANTLR start "rule__LigneNom__ColonnesAssignment_0"
    // InternalCSVToTable.g:852:1: rule__LigneNom__ColonnesAssignment_0 : ( RULE_ID ) ;
    public final void rule__LigneNom__ColonnesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:856:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:857:2: ( RULE_ID )
            {
            // InternalCSVToTable.g:857:2: ( RULE_ID )
            // InternalCSVToTable.g:858:3: RULE_ID
            {
             before(grammarAccess.getLigneNomAccess().getColonnesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLigneNomAccess().getColonnesIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__LigneNom__ColonnesAssignment_0"


    // $ANTLR start "rule__LigneNom__ColonnesAssignment_1_1"
    // InternalCSVToTable.g:867:1: rule__LigneNom__ColonnesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__LigneNom__ColonnesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:871:1: ( ( RULE_ID ) )
            // InternalCSVToTable.g:872:2: ( RULE_ID )
            {
            // InternalCSVToTable.g:872:2: ( RULE_ID )
            // InternalCSVToTable.g:873:3: RULE_ID
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


    // $ANTLR start "rule__LigneValeur__ValeursAssignment_0"
    // InternalCSVToTable.g:882:1: rule__LigneValeur__ValeursAssignment_0 : ( ruleDonnee ) ;
    public final void rule__LigneValeur__ValeursAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:886:1: ( ( ruleDonnee ) )
            // InternalCSVToTable.g:887:2: ( ruleDonnee )
            {
            // InternalCSVToTable.g:887:2: ( ruleDonnee )
            // InternalCSVToTable.g:888:3: ruleDonnee
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
    // InternalCSVToTable.g:897:1: rule__LigneValeur__ValeursAssignment_1_1 : ( ruleDonnee ) ;
    public final void rule__LigneValeur__ValeursAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVToTable.g:901:1: ( ( ruleDonnee ) )
            // InternalCSVToTable.g:902:2: ( ruleDonnee )
            {
            // InternalCSVToTable.g:902:2: ( ruleDonnee )
            // InternalCSVToTable.g:903:3: ruleDonnee
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