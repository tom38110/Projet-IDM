package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.CSVToTableGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSVToTableParser extends AbstractInternalAntlrParser {
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

        public InternalCSVToTableParser(TokenStream input, CSVToTableGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Tableau";
       	}

       	@Override
       	protected CSVToTableGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTableau"
    // InternalCSVToTable.g:64:1: entryRuleTableau returns [EObject current=null] : iv_ruleTableau= ruleTableau EOF ;
    public final EObject entryRuleTableau() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableau = null;


        try {
            // InternalCSVToTable.g:64:48: (iv_ruleTableau= ruleTableau EOF )
            // InternalCSVToTable.g:65:2: iv_ruleTableau= ruleTableau EOF
            {
             newCompositeNode(grammarAccess.getTableauRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableau=ruleTableau();

            state._fsp--;

             current =iv_ruleTableau; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableau"


    // $ANTLR start "ruleTableau"
    // InternalCSVToTable.g:71:1: ruleTableau returns [EObject current=null] : (this_LigneNom_0= ruleLigneNom ( (lv_lines_1_0= ruleLigneValeur ) ) ) ;
    public final EObject ruleTableau() throws RecognitionException {
        EObject current = null;

        EObject this_LigneNom_0 = null;

        EObject lv_lines_1_0 = null;



        	enterRule();

        try {
            // InternalCSVToTable.g:77:2: ( (this_LigneNom_0= ruleLigneNom ( (lv_lines_1_0= ruleLigneValeur ) ) ) )
            // InternalCSVToTable.g:78:2: (this_LigneNom_0= ruleLigneNom ( (lv_lines_1_0= ruleLigneValeur ) ) )
            {
            // InternalCSVToTable.g:78:2: (this_LigneNom_0= ruleLigneNom ( (lv_lines_1_0= ruleLigneValeur ) ) )
            // InternalCSVToTable.g:79:3: this_LigneNom_0= ruleLigneNom ( (lv_lines_1_0= ruleLigneValeur ) )
            {

            			newCompositeNode(grammarAccess.getTableauAccess().getLigneNomParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_LigneNom_0=ruleLigneNom();

            state._fsp--;


            			current = this_LigneNom_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVToTable.g:87:3: ( (lv_lines_1_0= ruleLigneValeur ) )
            // InternalCSVToTable.g:88:4: (lv_lines_1_0= ruleLigneValeur )
            {
            // InternalCSVToTable.g:88:4: (lv_lines_1_0= ruleLigneValeur )
            // InternalCSVToTable.g:89:5: lv_lines_1_0= ruleLigneValeur
            {

            					newCompositeNode(grammarAccess.getTableauAccess().getLinesLigneValeurParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_lines_1_0=ruleLigneValeur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableauRule());
            					}
            					add(
            						current,
            						"lines",
            						lv_lines_1_0,
            						"fr.n7.CSVToTable.LigneValeur");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableau"


    // $ANTLR start "entryRuleLigneNom"
    // InternalCSVToTable.g:110:1: entryRuleLigneNom returns [EObject current=null] : iv_ruleLigneNom= ruleLigneNom EOF ;
    public final EObject entryRuleLigneNom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigneNom = null;


        try {
            // InternalCSVToTable.g:110:49: (iv_ruleLigneNom= ruleLigneNom EOF )
            // InternalCSVToTable.g:111:2: iv_ruleLigneNom= ruleLigneNom EOF
            {
             newCompositeNode(grammarAccess.getLigneNomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLigneNom=ruleLigneNom();

            state._fsp--;

             current =iv_ruleLigneNom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLigneNom"


    // $ANTLR start "ruleLigneNom"
    // InternalCSVToTable.g:117:1: ruleLigneNom returns [EObject current=null] : (this_ColonneID_0= ruleColonneID (otherlv_1= ',' ( (lv_colonnes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleLigneNom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_colonnes_2_0=null;
        EObject this_ColonneID_0 = null;



        	enterRule();

        try {
            // InternalCSVToTable.g:123:2: ( (this_ColonneID_0= ruleColonneID (otherlv_1= ',' ( (lv_colonnes_2_0= RULE_ID ) ) )* ) )
            // InternalCSVToTable.g:124:2: (this_ColonneID_0= ruleColonneID (otherlv_1= ',' ( (lv_colonnes_2_0= RULE_ID ) ) )* )
            {
            // InternalCSVToTable.g:124:2: (this_ColonneID_0= ruleColonneID (otherlv_1= ',' ( (lv_colonnes_2_0= RULE_ID ) ) )* )
            // InternalCSVToTable.g:125:3: this_ColonneID_0= ruleColonneID (otherlv_1= ',' ( (lv_colonnes_2_0= RULE_ID ) ) )*
            {

            			newCompositeNode(grammarAccess.getLigneNomAccess().getColonneIDParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ColonneID_0=ruleColonneID();

            state._fsp--;


            			current = this_ColonneID_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVToTable.g:133:3: (otherlv_1= ',' ( (lv_colonnes_2_0= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCSVToTable.g:134:4: otherlv_1= ',' ( (lv_colonnes_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLigneNomAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalCSVToTable.g:138:4: ( (lv_colonnes_2_0= RULE_ID ) )
            	    // InternalCSVToTable.g:139:5: (lv_colonnes_2_0= RULE_ID )
            	    {
            	    // InternalCSVToTable.g:139:5: (lv_colonnes_2_0= RULE_ID )
            	    // InternalCSVToTable.g:140:6: lv_colonnes_2_0= RULE_ID
            	    {
            	    lv_colonnes_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    						newLeafNode(lv_colonnes_2_0, grammarAccess.getLigneNomAccess().getColonnesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLigneNomRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"colonnes",
            	    							lv_colonnes_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLigneNom"


    // $ANTLR start "entryRuleColonneID"
    // InternalCSVToTable.g:161:1: entryRuleColonneID returns [EObject current=null] : iv_ruleColonneID= ruleColonneID EOF ;
    public final EObject entryRuleColonneID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonneID = null;


        try {
            // InternalCSVToTable.g:161:50: (iv_ruleColonneID= ruleColonneID EOF )
            // InternalCSVToTable.g:162:2: iv_ruleColonneID= ruleColonneID EOF
            {
             newCompositeNode(grammarAccess.getColonneIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonneID=ruleColonneID();

            state._fsp--;

             current =iv_ruleColonneID; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonneID"


    // $ANTLR start "ruleColonneID"
    // InternalCSVToTable.g:168:1: ruleColonneID returns [EObject current=null] : ( (lv_nom_0_0= RULE_ID ) ) ;
    public final EObject ruleColonneID() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;


        	enterRule();

        try {
            // InternalCSVToTable.g:174:2: ( ( (lv_nom_0_0= RULE_ID ) ) )
            // InternalCSVToTable.g:175:2: ( (lv_nom_0_0= RULE_ID ) )
            {
            // InternalCSVToTable.g:175:2: ( (lv_nom_0_0= RULE_ID ) )
            // InternalCSVToTable.g:176:3: (lv_nom_0_0= RULE_ID )
            {
            // InternalCSVToTable.g:176:3: (lv_nom_0_0= RULE_ID )
            // InternalCSVToTable.g:177:4: lv_nom_0_0= RULE_ID
            {
            lv_nom_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_nom_0_0, grammarAccess.getColonneIDAccess().getNomIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColonneIDRule());
            				}
            				setWithLastConsumed(
            					current,
            					"nom",
            					lv_nom_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonneID"


    // $ANTLR start "entryRuleLigneValeur"
    // InternalCSVToTable.g:196:1: entryRuleLigneValeur returns [EObject current=null] : iv_ruleLigneValeur= ruleLigneValeur EOF ;
    public final EObject entryRuleLigneValeur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigneValeur = null;


        try {
            // InternalCSVToTable.g:196:52: (iv_ruleLigneValeur= ruleLigneValeur EOF )
            // InternalCSVToTable.g:197:2: iv_ruleLigneValeur= ruleLigneValeur EOF
            {
             newCompositeNode(grammarAccess.getLigneValeurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLigneValeur=ruleLigneValeur();

            state._fsp--;

             current =iv_ruleLigneValeur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLigneValeur"


    // $ANTLR start "ruleLigneValeur"
    // InternalCSVToTable.g:203:1: ruleLigneValeur returns [EObject current=null] : ( ( (lv_valeurs_0_0= ruleDonnee ) ) (otherlv_1= ',' ( (lv_valeurs_2_0= ruleDonnee ) ) )* ) ;
    public final EObject ruleLigneValeur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valeurs_0_0 = null;

        AntlrDatatypeRuleToken lv_valeurs_2_0 = null;



        	enterRule();

        try {
            // InternalCSVToTable.g:209:2: ( ( ( (lv_valeurs_0_0= ruleDonnee ) ) (otherlv_1= ',' ( (lv_valeurs_2_0= ruleDonnee ) ) )* ) )
            // InternalCSVToTable.g:210:2: ( ( (lv_valeurs_0_0= ruleDonnee ) ) (otherlv_1= ',' ( (lv_valeurs_2_0= ruleDonnee ) ) )* )
            {
            // InternalCSVToTable.g:210:2: ( ( (lv_valeurs_0_0= ruleDonnee ) ) (otherlv_1= ',' ( (lv_valeurs_2_0= ruleDonnee ) ) )* )
            // InternalCSVToTable.g:211:3: ( (lv_valeurs_0_0= ruleDonnee ) ) (otherlv_1= ',' ( (lv_valeurs_2_0= ruleDonnee ) ) )*
            {
            // InternalCSVToTable.g:211:3: ( (lv_valeurs_0_0= ruleDonnee ) )
            // InternalCSVToTable.g:212:4: (lv_valeurs_0_0= ruleDonnee )
            {
            // InternalCSVToTable.g:212:4: (lv_valeurs_0_0= ruleDonnee )
            // InternalCSVToTable.g:213:5: lv_valeurs_0_0= ruleDonnee
            {

            					newCompositeNode(grammarAccess.getLigneValeurAccess().getValeursDonneeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_valeurs_0_0=ruleDonnee();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLigneValeurRule());
            					}
            					add(
            						current,
            						"valeurs",
            						lv_valeurs_0_0,
            						"fr.n7.CSVToTable.Donnee");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCSVToTable.g:230:3: (otherlv_1= ',' ( (lv_valeurs_2_0= ruleDonnee ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCSVToTable.g:231:4: otherlv_1= ',' ( (lv_valeurs_2_0= ruleDonnee ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLigneValeurAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalCSVToTable.g:235:4: ( (lv_valeurs_2_0= ruleDonnee ) )
            	    // InternalCSVToTable.g:236:5: (lv_valeurs_2_0= ruleDonnee )
            	    {
            	    // InternalCSVToTable.g:236:5: (lv_valeurs_2_0= ruleDonnee )
            	    // InternalCSVToTable.g:237:6: lv_valeurs_2_0= ruleDonnee
            	    {

            	    						newCompositeNode(grammarAccess.getLigneValeurAccess().getValeursDonneeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_valeurs_2_0=ruleDonnee();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLigneValeurRule());
            	    						}
            	    						add(
            	    							current,
            	    							"valeurs",
            	    							lv_valeurs_2_0,
            	    							"fr.n7.CSVToTable.Donnee");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLigneValeur"


    // $ANTLR start "entryRuleDonnee"
    // InternalCSVToTable.g:259:1: entryRuleDonnee returns [String current=null] : iv_ruleDonnee= ruleDonnee EOF ;
    public final String entryRuleDonnee() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDonnee = null;


        try {
            // InternalCSVToTable.g:259:46: (iv_ruleDonnee= ruleDonnee EOF )
            // InternalCSVToTable.g:260:2: iv_ruleDonnee= ruleDonnee EOF
            {
             newCompositeNode(grammarAccess.getDonneeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDonnee=ruleDonnee();

            state._fsp--;

             current =iv_ruleDonnee.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDonnee"


    // $ANTLR start "ruleDonnee"
    // InternalCSVToTable.g:266:1: ruleDonnee returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Valeur_0= ruleValeur | this_Date_1= ruleDate ) ;
    public final AntlrDatatypeRuleToken ruleDonnee() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Valeur_0 = null;

        AntlrDatatypeRuleToken this_Date_1 = null;



        	enterRule();

        try {
            // InternalCSVToTable.g:272:2: ( (this_Valeur_0= ruleValeur | this_Date_1= ruleDate ) )
            // InternalCSVToTable.g:273:2: (this_Valeur_0= ruleValeur | this_Date_1= ruleDate )
            {
            // InternalCSVToTable.g:273:2: (this_Valeur_0= ruleValeur | this_Date_1= ruleDate )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=12 && LA3_1<=13)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==11||LA3_1==14) ) {
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
                    // InternalCSVToTable.g:274:3: this_Valeur_0= ruleValeur
                    {

                    			newCompositeNode(grammarAccess.getDonneeAccess().getValeurParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Valeur_0=ruleValeur();

                    state._fsp--;


                    			current.merge(this_Valeur_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVToTable.g:285:3: this_Date_1= ruleDate
                    {

                    			newCompositeNode(grammarAccess.getDonneeAccess().getDateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Date_1=ruleDate();

                    state._fsp--;


                    			current.merge(this_Date_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDonnee"


    // $ANTLR start "entryRuleDate"
    // InternalCSVToTable.g:299:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalCSVToTable.g:299:44: (iv_ruleDate= ruleDate EOF )
            // InternalCSVToTable.g:300:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalCSVToTable.g:306:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID ) | (this_ID_3= RULE_ID kw= '/' this_ID_5= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_3=null;
        Token this_ID_5=null;


        	enterRule();

        try {
            // InternalCSVToTable.g:312:2: ( ( (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID ) | (this_ID_3= RULE_ID kw= '/' this_ID_5= RULE_ID ) ) )
            // InternalCSVToTable.g:313:2: ( (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID ) | (this_ID_3= RULE_ID kw= '/' this_ID_5= RULE_ID ) )
            {
            // InternalCSVToTable.g:313:2: ( (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID ) | (this_ID_3= RULE_ID kw= '/' this_ID_5= RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==12) ) {
                    alt4=1;
                }
                else if ( (LA4_1==13) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCSVToTable.g:314:3: (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID )
                    {
                    // InternalCSVToTable.g:314:3: (this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID )
                    // InternalCSVToTable.g:315:4: this_ID_0= RULE_ID kw= '-' this_ID_2= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getDateAccess().getIDTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,12,FOLLOW_3); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDateAccess().getHyphenMinusKeyword_0_1());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getDateAccess().getIDTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVToTable.g:336:3: (this_ID_3= RULE_ID kw= '/' this_ID_5= RULE_ID )
                    {
                    // InternalCSVToTable.g:336:3: (this_ID_3= RULE_ID kw= '/' this_ID_5= RULE_ID )
                    // InternalCSVToTable.g:337:4: this_ID_3= RULE_ID kw= '/' this_ID_5= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    				current.merge(this_ID_3);
                    			

                    				newLeafNode(this_ID_3, grammarAccess.getDateAccess().getIDTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,13,FOLLOW_3); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDateAccess().getSolidusKeyword_1_1());
                    			
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_5);
                    			

                    				newLeafNode(this_ID_5, grammarAccess.getDateAccess().getIDTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleValeur"
    // InternalCSVToTable.g:361:1: entryRuleValeur returns [String current=null] : iv_ruleValeur= ruleValeur EOF ;
    public final String entryRuleValeur() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValeur = null;


        try {
            // InternalCSVToTable.g:361:46: (iv_ruleValeur= ruleValeur EOF )
            // InternalCSVToTable.g:362:2: iv_ruleValeur= ruleValeur EOF
            {
             newCompositeNode(grammarAccess.getValeurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValeur=ruleValeur();

            state._fsp--;

             current =iv_ruleValeur.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValeur"


    // $ANTLR start "ruleValeur"
    // InternalCSVToTable.g:368:1: ruleValeur returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Flottant_1= ruleFlottant ) ;
    public final AntlrDatatypeRuleToken ruleValeur() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Flottant_1 = null;



        	enterRule();

        try {
            // InternalCSVToTable.g:374:2: ( (this_ID_0= RULE_ID | this_Flottant_1= ruleFlottant ) )
            // InternalCSVToTable.g:375:2: (this_ID_0= RULE_ID | this_Flottant_1= ruleFlottant )
            {
            // InternalCSVToTable.g:375:2: (this_ID_0= RULE_ID | this_Flottant_1= ruleFlottant )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==14) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==11) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCSVToTable.g:376:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValeurAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVToTable.g:384:3: this_Flottant_1= ruleFlottant
                    {

                    			newCompositeNode(grammarAccess.getValeurAccess().getFlottantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Flottant_1=ruleFlottant();

                    state._fsp--;


                    			current.merge(this_Flottant_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValeur"


    // $ANTLR start "entryRuleFlottant"
    // InternalCSVToTable.g:398:1: entryRuleFlottant returns [String current=null] : iv_ruleFlottant= ruleFlottant EOF ;
    public final String entryRuleFlottant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlottant = null;


        try {
            // InternalCSVToTable.g:398:48: (iv_ruleFlottant= ruleFlottant EOF )
            // InternalCSVToTable.g:399:2: iv_ruleFlottant= ruleFlottant EOF
            {
             newCompositeNode(grammarAccess.getFlottantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlottant=ruleFlottant();

            state._fsp--;

             current =iv_ruleFlottant.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlottant"


    // $ANTLR start "ruleFlottant"
    // InternalCSVToTable.g:405:1: ruleFlottant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleFlottant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCSVToTable.g:411:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalCSVToTable.g:412:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalCSVToTable.g:412:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalCSVToTable.g:413:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFlottantAccess().getIDTerminalRuleCall_0());
            		
            // InternalCSVToTable.g:420:3: (kw= '.' this_ID_2= RULE_ID )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCSVToTable.g:421:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFlottantAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFlottantAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlottant"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});

}