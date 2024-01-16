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
import fr.n7.services.AlgorithmeXtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlgorithmeXtextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Algorithme'", "'.'", "'Ressource :'", "'de type'", "'/'", "'Port sortie'", "'associ\\u00E9 \\u00E0 r\\u00E9sultat'", "'associ\\u00E9 au retour de la fonction'", "'Port entr\\u00E9e'", "'associ\\u00E9 \\u00E0 argument'", "', sous-programme'"
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

        public InternalAlgorithmeXtextParser(TokenStream input, AlgorithmeXtextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Algorithme";
       	}

       	@Override
       	protected AlgorithmeXtextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAlgorithme"
    // InternalAlgorithmeXtext.g:64:1: entryRuleAlgorithme returns [EObject current=null] : iv_ruleAlgorithme= ruleAlgorithme EOF ;
    public final EObject entryRuleAlgorithme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithme = null;


        try {
            // InternalAlgorithmeXtext.g:64:51: (iv_ruleAlgorithme= ruleAlgorithme EOF )
            // InternalAlgorithmeXtext.g:65:2: iv_ruleAlgorithme= ruleAlgorithme EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithme=ruleAlgorithme();

            state._fsp--;

             current =iv_ruleAlgorithme; 
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
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalAlgorithmeXtext.g:71:1: ruleAlgorithme returns [EObject current=null] : (otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleNom ) ) ( (lv_algorithmeElement_2_0= ruleAlgorithmeElement ) )+ ) ;
    public final EObject ruleAlgorithme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        EObject lv_algorithmeElement_2_0 = null;



        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:77:2: ( (otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleNom ) ) ( (lv_algorithmeElement_2_0= ruleAlgorithmeElement ) )+ ) )
            // InternalAlgorithmeXtext.g:78:2: (otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleNom ) ) ( (lv_algorithmeElement_2_0= ruleAlgorithmeElement ) )+ )
            {
            // InternalAlgorithmeXtext.g:78:2: (otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleNom ) ) ( (lv_algorithmeElement_2_0= ruleAlgorithmeElement ) )+ )
            // InternalAlgorithmeXtext.g:79:3: otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleNom ) ) ( (lv_algorithmeElement_2_0= ruleAlgorithmeElement ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0());
            		
            // InternalAlgorithmeXtext.g:83:3: ( (lv_nom_1_0= ruleNom ) )
            // InternalAlgorithmeXtext.g:84:4: (lv_nom_1_0= ruleNom )
            {
            // InternalAlgorithmeXtext.g:84:4: (lv_nom_1_0= ruleNom )
            // InternalAlgorithmeXtext.g:85:5: lv_nom_1_0= ruleNom
            {

            					newCompositeNode(grammarAccess.getAlgorithmeAccess().getNomNomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nom_1_0=ruleNom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"fr.n7.AlgorithmeXtext.Nom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgorithmeXtext.g:102:3: ( (lv_algorithmeElement_2_0= ruleAlgorithmeElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==16||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlgorithmeXtext.g:103:4: (lv_algorithmeElement_2_0= ruleAlgorithmeElement )
            	    {
            	    // InternalAlgorithmeXtext.g:103:4: (lv_algorithmeElement_2_0= ruleAlgorithmeElement )
            	    // InternalAlgorithmeXtext.g:104:5: lv_algorithmeElement_2_0= ruleAlgorithmeElement
            	    {

            	    					newCompositeNode(grammarAccess.getAlgorithmeAccess().getAlgorithmeElementAlgorithmeElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_algorithmeElement_2_0=ruleAlgorithmeElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"algorithmeElement",
            	    						lv_algorithmeElement_2_0,
            	    						"fr.n7.AlgorithmeXtext.AlgorithmeElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "entryRuleNom"
    // InternalAlgorithmeXtext.g:125:1: entryRuleNom returns [String current=null] : iv_ruleNom= ruleNom EOF ;
    public final String entryRuleNom() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNom = null;


        try {
            // InternalAlgorithmeXtext.g:125:43: (iv_ruleNom= ruleNom EOF )
            // InternalAlgorithmeXtext.g:126:2: iv_ruleNom= ruleNom EOF
            {
             newCompositeNode(grammarAccess.getNomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNom=ruleNom();

            state._fsp--;

             current =iv_ruleNom.getText(); 
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
    // $ANTLR end "entryRuleNom"


    // $ANTLR start "ruleNom"
    // InternalAlgorithmeXtext.g:132:1: ruleNom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNom() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:138:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAlgorithmeXtext.g:139:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAlgorithmeXtext.g:139:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAlgorithmeXtext.g:140:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getNomAccess().getIDTerminalRuleCall_0());
            		
            // InternalAlgorithmeXtext.g:147:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlgorithmeXtext.g:148:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNomAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getNomAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleNom"


    // $ANTLR start "entryRuleAlgorithmeElement"
    // InternalAlgorithmeXtext.g:165:1: entryRuleAlgorithmeElement returns [EObject current=null] : iv_ruleAlgorithmeElement= ruleAlgorithmeElement EOF ;
    public final EObject entryRuleAlgorithmeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmeElement = null;


        try {
            // InternalAlgorithmeXtext.g:165:58: (iv_ruleAlgorithmeElement= ruleAlgorithmeElement EOF )
            // InternalAlgorithmeXtext.g:166:2: iv_ruleAlgorithmeElement= ruleAlgorithmeElement EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithmeElement=ruleAlgorithmeElement();

            state._fsp--;

             current =iv_ruleAlgorithmeElement; 
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
    // $ANTLR end "entryRuleAlgorithmeElement"


    // $ANTLR start "ruleAlgorithmeElement"
    // InternalAlgorithmeXtext.g:172:1: ruleAlgorithmeElement returns [EObject current=null] : (this_Ressource_0= ruleRessource | this_Entree_1= ruleEntree | this_Sortie_2= ruleSortie ) ;
    public final EObject ruleAlgorithmeElement() throws RecognitionException {
        EObject current = null;

        EObject this_Ressource_0 = null;

        EObject this_Entree_1 = null;

        EObject this_Sortie_2 = null;



        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:178:2: ( (this_Ressource_0= ruleRessource | this_Entree_1= ruleEntree | this_Sortie_2= ruleSortie ) )
            // InternalAlgorithmeXtext.g:179:2: (this_Ressource_0= ruleRessource | this_Entree_1= ruleEntree | this_Sortie_2= ruleSortie )
            {
            // InternalAlgorithmeXtext.g:179:2: (this_Ressource_0= ruleRessource | this_Entree_1= ruleEntree | this_Sortie_2= ruleSortie )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 16:
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
                    // InternalAlgorithmeXtext.g:180:3: this_Ressource_0= ruleRessource
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmeElementAccess().getRessourceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ressource_0=ruleRessource();

                    state._fsp--;


                    			current = this_Ressource_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgorithmeXtext.g:189:3: this_Entree_1= ruleEntree
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmeElementAccess().getEntreeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entree_1=ruleEntree();

                    state._fsp--;


                    			current = this_Entree_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlgorithmeXtext.g:198:3: this_Sortie_2= ruleSortie
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmeElementAccess().getSortieParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sortie_2=ruleSortie();

                    state._fsp--;


                    			current = this_Sortie_2;
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
    // $ANTLR end "ruleAlgorithmeElement"


    // $ANTLR start "entryRuleRessource"
    // InternalAlgorithmeXtext.g:210:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalAlgorithmeXtext.g:210:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalAlgorithmeXtext.g:211:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalAlgorithmeXtext.g:217:1: ruleRessource returns [EObject current=null] : (otherlv_0= 'Ressource :' ( (lv_nom_1_0= ruleChemin ) ) otherlv_2= 'de type' ( (lv_type_3_0= ruleTypeAlgo ) ) ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:223:2: ( (otherlv_0= 'Ressource :' ( (lv_nom_1_0= ruleChemin ) ) otherlv_2= 'de type' ( (lv_type_3_0= ruleTypeAlgo ) ) ) )
            // InternalAlgorithmeXtext.g:224:2: (otherlv_0= 'Ressource :' ( (lv_nom_1_0= ruleChemin ) ) otherlv_2= 'de type' ( (lv_type_3_0= ruleTypeAlgo ) ) )
            {
            // InternalAlgorithmeXtext.g:224:2: (otherlv_0= 'Ressource :' ( (lv_nom_1_0= ruleChemin ) ) otherlv_2= 'de type' ( (lv_type_3_0= ruleTypeAlgo ) ) )
            // InternalAlgorithmeXtext.g:225:3: otherlv_0= 'Ressource :' ( (lv_nom_1_0= ruleChemin ) ) otherlv_2= 'de type' ( (lv_type_3_0= ruleTypeAlgo ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getRessourceKeyword_0());
            		
            // InternalAlgorithmeXtext.g:229:3: ( (lv_nom_1_0= ruleChemin ) )
            // InternalAlgorithmeXtext.g:230:4: (lv_nom_1_0= ruleChemin )
            {
            // InternalAlgorithmeXtext.g:230:4: (lv_nom_1_0= ruleChemin )
            // InternalAlgorithmeXtext.g:231:5: lv_nom_1_0= ruleChemin
            {

            					newCompositeNode(grammarAccess.getRessourceAccess().getNomCheminParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_nom_1_0=ruleChemin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRessourceRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"fr.n7.AlgorithmeXtext.Chemin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRessourceAccess().getDeTypeKeyword_2());
            		
            // InternalAlgorithmeXtext.g:252:3: ( (lv_type_3_0= ruleTypeAlgo ) )
            // InternalAlgorithmeXtext.g:253:4: (lv_type_3_0= ruleTypeAlgo )
            {
            // InternalAlgorithmeXtext.g:253:4: (lv_type_3_0= ruleTypeAlgo )
            // InternalAlgorithmeXtext.g:254:5: lv_type_3_0= ruleTypeAlgo
            {

            					newCompositeNode(grammarAccess.getRessourceAccess().getTypeTypeAlgoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeAlgo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRessourceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"fr.n7.AlgorithmeXtext.TypeAlgo");
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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleChemin"
    // InternalAlgorithmeXtext.g:275:1: entryRuleChemin returns [String current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final String entryRuleChemin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChemin = null;


        try {
            // InternalAlgorithmeXtext.g:275:46: (iv_ruleChemin= ruleChemin EOF )
            // InternalAlgorithmeXtext.g:276:2: iv_ruleChemin= ruleChemin EOF
            {
             newCompositeNode(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemin=ruleChemin();

            state._fsp--;

             current =iv_ruleChemin.getText(); 
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
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalAlgorithmeXtext.g:282:1: ruleChemin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )+ ;
    public final AntlrDatatypeRuleToken ruleChemin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:288:2: ( (kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )+ )
            // InternalAlgorithmeXtext.g:289:2: (kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )+
            {
            // InternalAlgorithmeXtext.g:289:2: (kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlgorithmeXtext.g:290:3: kw= '/' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )*
            	    {
            	    kw=(Token)match(input,15,FOLLOW_3); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getCheminAccess().getSolidusKeyword_0());
            	    		
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    			current.merge(this_ID_1);
            	    		

            	    			newLeafNode(this_ID_1, grammarAccess.getCheminAccess().getIDTerminalRuleCall_1());
            	    		
            	    // InternalAlgorithmeXtext.g:302:3: (kw= '.' this_ID_3= RULE_ID )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==12) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalAlgorithmeXtext.g:303:4: kw= '.' this_ID_3= RULE_ID
            	    	    {
            	    	    kw=(Token)match(input,12,FOLLOW_3); 

            	    	    				current.merge(kw);
            	    	    				newLeafNode(kw, grammarAccess.getCheminAccess().getFullStopKeyword_2_0());
            	    	    			
            	    	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    	    				current.merge(this_ID_3);
            	    	    			

            	    	    				newLeafNode(this_ID_3, grammarAccess.getCheminAccess().getIDTerminalRuleCall_2_1());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


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
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRuleSortie"
    // InternalAlgorithmeXtext.g:320:1: entryRuleSortie returns [EObject current=null] : iv_ruleSortie= ruleSortie EOF ;
    public final EObject entryRuleSortie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortie = null;


        try {
            // InternalAlgorithmeXtext.g:320:47: (iv_ruleSortie= ruleSortie EOF )
            // InternalAlgorithmeXtext.g:321:2: iv_ruleSortie= ruleSortie EOF
            {
             newCompositeNode(grammarAccess.getSortieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSortie=ruleSortie();

            state._fsp--;

             current =iv_ruleSortie; 
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
    // $ANTLR end "entryRuleSortie"


    // $ANTLR start "ruleSortie"
    // InternalAlgorithmeXtext.g:327:1: ruleSortie returns [EObject current=null] : (otherlv_0= 'Port sortie' ( (lv_nom_1_0= ruleNom ) ) ( (otherlv_2= 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ( (lv_valeur_3_0= ruleResultat ) ) ) | otherlv_4= 'associ\\u00E9 au retour de la fonction' ) ) ;
    public final EObject ruleSortie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        AntlrDatatypeRuleToken lv_valeur_3_0 = null;



        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:333:2: ( (otherlv_0= 'Port sortie' ( (lv_nom_1_0= ruleNom ) ) ( (otherlv_2= 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ( (lv_valeur_3_0= ruleResultat ) ) ) | otherlv_4= 'associ\\u00E9 au retour de la fonction' ) ) )
            // InternalAlgorithmeXtext.g:334:2: (otherlv_0= 'Port sortie' ( (lv_nom_1_0= ruleNom ) ) ( (otherlv_2= 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ( (lv_valeur_3_0= ruleResultat ) ) ) | otherlv_4= 'associ\\u00E9 au retour de la fonction' ) )
            {
            // InternalAlgorithmeXtext.g:334:2: (otherlv_0= 'Port sortie' ( (lv_nom_1_0= ruleNom ) ) ( (otherlv_2= 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ( (lv_valeur_3_0= ruleResultat ) ) ) | otherlv_4= 'associ\\u00E9 au retour de la fonction' ) )
            // InternalAlgorithmeXtext.g:335:3: otherlv_0= 'Port sortie' ( (lv_nom_1_0= ruleNom ) ) ( (otherlv_2= 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ( (lv_valeur_3_0= ruleResultat ) ) ) | otherlv_4= 'associ\\u00E9 au retour de la fonction' )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSortieAccess().getPortSortieKeyword_0());
            		
            // InternalAlgorithmeXtext.g:339:3: ( (lv_nom_1_0= ruleNom ) )
            // InternalAlgorithmeXtext.g:340:4: (lv_nom_1_0= ruleNom )
            {
            // InternalAlgorithmeXtext.g:340:4: (lv_nom_1_0= ruleNom )
            // InternalAlgorithmeXtext.g:341:5: lv_nom_1_0= ruleNom
            {

            					newCompositeNode(grammarAccess.getSortieAccess().getNomNomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_nom_1_0=ruleNom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSortieRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"fr.n7.AlgorithmeXtext.Nom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgorithmeXtext.g:358:3: ( (otherlv_2= 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ( (lv_valeur_3_0= ruleResultat ) ) ) | otherlv_4= 'associ\\u00E9 au retour de la fonction' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlgorithmeXtext.g:359:4: (otherlv_2= 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ( (lv_valeur_3_0= ruleResultat ) ) )
                    {
                    // InternalAlgorithmeXtext.g:359:4: (otherlv_2= 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ( (lv_valeur_3_0= ruleResultat ) ) )
                    // InternalAlgorithmeXtext.g:360:5: otherlv_2= 'associ\\u00E9 \\u00E0 r\\u00E9sultat' ( (lv_valeur_3_0= ruleResultat ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSortieAccess().getAssociRSultatKeyword_2_0_0());
                    				
                    // InternalAlgorithmeXtext.g:364:5: ( (lv_valeur_3_0= ruleResultat ) )
                    // InternalAlgorithmeXtext.g:365:6: (lv_valeur_3_0= ruleResultat )
                    {
                    // InternalAlgorithmeXtext.g:365:6: (lv_valeur_3_0= ruleResultat )
                    // InternalAlgorithmeXtext.g:366:7: lv_valeur_3_0= ruleResultat
                    {

                    							newCompositeNode(grammarAccess.getSortieAccess().getValeurResultatParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_valeur_3_0=ruleResultat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSortieRule());
                    							}
                    							set(
                    								current,
                    								"valeur",
                    								lv_valeur_3_0,
                    								"fr.n7.AlgorithmeXtext.Resultat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgorithmeXtext.g:385:4: otherlv_4= 'associ\\u00E9 au retour de la fonction'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSortieAccess().getAssociAuRetourDeLaFonctionKeyword_2_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleSortie"


    // $ANTLR start "entryRuleResultat"
    // InternalAlgorithmeXtext.g:394:1: entryRuleResultat returns [String current=null] : iv_ruleResultat= ruleResultat EOF ;
    public final String entryRuleResultat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResultat = null;


        try {
            // InternalAlgorithmeXtext.g:394:48: (iv_ruleResultat= ruleResultat EOF )
            // InternalAlgorithmeXtext.g:395:2: iv_ruleResultat= ruleResultat EOF
            {
             newCompositeNode(grammarAccess.getResultatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResultat=ruleResultat();

            state._fsp--;

             current =iv_ruleResultat.getText(); 
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
    // $ANTLR end "entryRuleResultat"


    // $ANTLR start "ruleResultat"
    // InternalAlgorithmeXtext.g:401:1: ruleResultat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleResultat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:407:2: (this_ID_0= RULE_ID )
            // InternalAlgorithmeXtext.g:408:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getResultatAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleResultat"


    // $ANTLR start "entryRuleEntree"
    // InternalAlgorithmeXtext.g:418:1: entryRuleEntree returns [EObject current=null] : iv_ruleEntree= ruleEntree EOF ;
    public final EObject entryRuleEntree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntree = null;


        try {
            // InternalAlgorithmeXtext.g:418:47: (iv_ruleEntree= ruleEntree EOF )
            // InternalAlgorithmeXtext.g:419:2: iv_ruleEntree= ruleEntree EOF
            {
             newCompositeNode(grammarAccess.getEntreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntree=ruleEntree();

            state._fsp--;

             current =iv_ruleEntree; 
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
    // $ANTLR end "entryRuleEntree"


    // $ANTLR start "ruleEntree"
    // InternalAlgorithmeXtext.g:425:1: ruleEntree returns [EObject current=null] : (otherlv_0= 'Port entr\\u00E9e' ( (lv_nom_1_0= ruleNom ) ) otherlv_2= 'associ\\u00E9 \\u00E0 argument' ( (lv_argument_3_0= ruleArgument ) ) ) ;
    public final EObject ruleEntree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        AntlrDatatypeRuleToken lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:431:2: ( (otherlv_0= 'Port entr\\u00E9e' ( (lv_nom_1_0= ruleNom ) ) otherlv_2= 'associ\\u00E9 \\u00E0 argument' ( (lv_argument_3_0= ruleArgument ) ) ) )
            // InternalAlgorithmeXtext.g:432:2: (otherlv_0= 'Port entr\\u00E9e' ( (lv_nom_1_0= ruleNom ) ) otherlv_2= 'associ\\u00E9 \\u00E0 argument' ( (lv_argument_3_0= ruleArgument ) ) )
            {
            // InternalAlgorithmeXtext.g:432:2: (otherlv_0= 'Port entr\\u00E9e' ( (lv_nom_1_0= ruleNom ) ) otherlv_2= 'associ\\u00E9 \\u00E0 argument' ( (lv_argument_3_0= ruleArgument ) ) )
            // InternalAlgorithmeXtext.g:433:3: otherlv_0= 'Port entr\\u00E9e' ( (lv_nom_1_0= ruleNom ) ) otherlv_2= 'associ\\u00E9 \\u00E0 argument' ( (lv_argument_3_0= ruleArgument ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntreeAccess().getPortEntrEKeyword_0());
            		
            // InternalAlgorithmeXtext.g:437:3: ( (lv_nom_1_0= ruleNom ) )
            // InternalAlgorithmeXtext.g:438:4: (lv_nom_1_0= ruleNom )
            {
            // InternalAlgorithmeXtext.g:438:4: (lv_nom_1_0= ruleNom )
            // InternalAlgorithmeXtext.g:439:5: lv_nom_1_0= ruleNom
            {

            					newCompositeNode(grammarAccess.getEntreeAccess().getNomNomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_nom_1_0=ruleNom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntreeRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"fr.n7.AlgorithmeXtext.Nom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEntreeAccess().getAssociArgumentKeyword_2());
            		
            // InternalAlgorithmeXtext.g:460:3: ( (lv_argument_3_0= ruleArgument ) )
            // InternalAlgorithmeXtext.g:461:4: (lv_argument_3_0= ruleArgument )
            {
            // InternalAlgorithmeXtext.g:461:4: (lv_argument_3_0= ruleArgument )
            // InternalAlgorithmeXtext.g:462:5: lv_argument_3_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getEntreeAccess().getArgumentArgumentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_argument_3_0=ruleArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntreeRule());
            					}
            					set(
            						current,
            						"argument",
            						lv_argument_3_0,
            						"fr.n7.AlgorithmeXtext.Argument");
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
    // $ANTLR end "ruleEntree"


    // $ANTLR start "entryRuleArgument"
    // InternalAlgorithmeXtext.g:483:1: entryRuleArgument returns [String current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final String entryRuleArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgument = null;


        try {
            // InternalAlgorithmeXtext.g:483:48: (iv_ruleArgument= ruleArgument EOF )
            // InternalAlgorithmeXtext.g:484:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument.getText(); 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalAlgorithmeXtext.g:490:1: ruleArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:496:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // InternalAlgorithmeXtext.g:497:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // InternalAlgorithmeXtext.g:497:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlgorithmeXtext.g:498:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getArgumentAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgorithmeXtext.g:506:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getArgumentAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleTypeAlgo"
    // InternalAlgorithmeXtext.g:517:1: entryRuleTypeAlgo returns [String current=null] : iv_ruleTypeAlgo= ruleTypeAlgo EOF ;
    public final String entryRuleTypeAlgo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeAlgo = null;


        try {
            // InternalAlgorithmeXtext.g:517:48: (iv_ruleTypeAlgo= ruleTypeAlgo EOF )
            // InternalAlgorithmeXtext.g:518:2: iv_ruleTypeAlgo= ruleTypeAlgo EOF
            {
             newCompositeNode(grammarAccess.getTypeAlgoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeAlgo=ruleTypeAlgo();

            state._fsp--;

             current =iv_ruleTypeAlgo.getText(); 
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
    // $ANTLR end "entryRuleTypeAlgo"


    // $ANTLR start "ruleTypeAlgo"
    // InternalAlgorithmeXtext.g:524:1: ruleTypeAlgo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Calcul_0= ruleCalcul | this_Script_1= ruleScript ) ;
    public final AntlrDatatypeRuleToken ruleTypeAlgo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Calcul_0 = null;

        AntlrDatatypeRuleToken this_Script_1 = null;



        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:530:2: ( (this_Calcul_0= ruleCalcul | this_Script_1= ruleScript ) )
            // InternalAlgorithmeXtext.g:531:2: (this_Calcul_0= ruleCalcul | this_Script_1= ruleScript )
            {
            // InternalAlgorithmeXtext.g:531:2: (this_Calcul_0= ruleCalcul | this_Script_1= ruleScript )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==13||LA8_1==16||LA8_1==19) ) {
                    alt8=1;
                }
                else if ( (LA8_1==21) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlgorithmeXtext.g:532:3: this_Calcul_0= ruleCalcul
                    {

                    			newCompositeNode(grammarAccess.getTypeAlgoAccess().getCalculParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Calcul_0=ruleCalcul();

                    state._fsp--;


                    			current.merge(this_Calcul_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgorithmeXtext.g:543:3: this_Script_1= ruleScript
                    {

                    			newCompositeNode(grammarAccess.getTypeAlgoAccess().getScriptParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Script_1=ruleScript();

                    state._fsp--;


                    			current.merge(this_Script_1);
                    		

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
    // $ANTLR end "ruleTypeAlgo"


    // $ANTLR start "entryRuleScript"
    // InternalAlgorithmeXtext.g:557:1: entryRuleScript returns [String current=null] : iv_ruleScript= ruleScript EOF ;
    public final String entryRuleScript() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScript = null;


        try {
            // InternalAlgorithmeXtext.g:557:46: (iv_ruleScript= ruleScript EOF )
            // InternalAlgorithmeXtext.g:558:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript.getText(); 
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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalAlgorithmeXtext.g:564:1: ruleScript returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= ', sous-programme' this_Programme_2= ruleProgramme ) ;
    public final AntlrDatatypeRuleToken ruleScript() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Programme_2 = null;



        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:570:2: ( (this_ID_0= RULE_ID kw= ', sous-programme' this_Programme_2= ruleProgramme ) )
            // InternalAlgorithmeXtext.g:571:2: (this_ID_0= RULE_ID kw= ', sous-programme' this_Programme_2= ruleProgramme )
            {
            // InternalAlgorithmeXtext.g:571:2: (this_ID_0= RULE_ID kw= ', sous-programme' this_Programme_2= ruleProgramme )
            // InternalAlgorithmeXtext.g:572:3: this_ID_0= RULE_ID kw= ', sous-programme' this_Programme_2= ruleProgramme
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getScriptAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,21,FOLLOW_3); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getScriptAccess().getSousProgrammeKeyword_1());
            		

            			newCompositeNode(grammarAccess.getScriptAccess().getProgrammeParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_Programme_2=ruleProgramme();

            state._fsp--;


            			current.merge(this_Programme_2);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleProgramme"
    // InternalAlgorithmeXtext.g:598:1: entryRuleProgramme returns [String current=null] : iv_ruleProgramme= ruleProgramme EOF ;
    public final String entryRuleProgramme() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProgramme = null;


        try {
            // InternalAlgorithmeXtext.g:598:49: (iv_ruleProgramme= ruleProgramme EOF )
            // InternalAlgorithmeXtext.g:599:2: iv_ruleProgramme= ruleProgramme EOF
            {
             newCompositeNode(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramme=ruleProgramme();

            state._fsp--;

             current =iv_ruleProgramme.getText(); 
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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalAlgorithmeXtext.g:605:1: ruleProgramme returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleProgramme() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:611:2: (this_ID_0= RULE_ID )
            // InternalAlgorithmeXtext.g:612:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getProgrammeAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleCalcul"
    // InternalAlgorithmeXtext.g:622:1: entryRuleCalcul returns [String current=null] : iv_ruleCalcul= ruleCalcul EOF ;
    public final String entryRuleCalcul() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCalcul = null;


        try {
            // InternalAlgorithmeXtext.g:622:46: (iv_ruleCalcul= ruleCalcul EOF )
            // InternalAlgorithmeXtext.g:623:2: iv_ruleCalcul= ruleCalcul EOF
            {
             newCompositeNode(grammarAccess.getCalculRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalcul=ruleCalcul();

            state._fsp--;

             current =iv_ruleCalcul.getText(); 
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
    // $ANTLR end "entryRuleCalcul"


    // $ANTLR start "ruleCalcul"
    // InternalAlgorithmeXtext.g:629:1: ruleCalcul returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleCalcul() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAlgorithmeXtext.g:635:2: ( (this_ID_0= RULE_ID )+ )
            // InternalAlgorithmeXtext.g:636:2: (this_ID_0= RULE_ID )+
            {
            // InternalAlgorithmeXtext.g:636:2: (this_ID_0= RULE_ID )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAlgorithmeXtext.g:637:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getCalculAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


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
    // $ANTLR end "ruleCalcul"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000092000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000092002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});

}