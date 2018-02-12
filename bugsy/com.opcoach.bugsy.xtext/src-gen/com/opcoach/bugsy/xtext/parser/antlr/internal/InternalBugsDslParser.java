package com.opcoach.bugsy.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.opcoach.bugsy.xtext.services.BugsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBugsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'for'", "'('", "'in'", "':'", "')'", "'~'", "'()'", "','", "'<-'", "'='", "'dbern'", "'dbin'", "'dchisqr'", "'ddexp'", "'dexp'", "'df'", "'dgamma'", "'dgen.gamma'", "'dhyper'", "'dlogis'", "'dlnorm'", "'dnegbin'", "'dnchisqr'", "'dpar'", "'dpois'", "'dt'", "'dweib'", "'dnorm'", "'dunif'", "'dbeta'", "'acos'", "'acosh'", "'asin'", "'asinh'", "'atan'", "'log'", "'exp'", "'c'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBugsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBugsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBugsDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBugsDsl.g"; }



     	private BugsDslGrammarAccess grammarAccess;

        public InternalBugsDslParser(TokenStream input, BugsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BugsModel";
       	}

       	@Override
       	protected BugsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBugsModel"
    // InternalBugsDsl.g:65:1: entryRuleBugsModel returns [EObject current=null] : iv_ruleBugsModel= ruleBugsModel EOF ;
    public final EObject entryRuleBugsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBugsModel = null;


        try {
            // InternalBugsDsl.g:65:50: (iv_ruleBugsModel= ruleBugsModel EOF )
            // InternalBugsDsl.g:66:2: iv_ruleBugsModel= ruleBugsModel EOF
            {
             newCompositeNode(grammarAccess.getBugsModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBugsModel=ruleBugsModel();

            state._fsp--;

             current =iv_ruleBugsModel; 
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
    // $ANTLR end "entryRuleBugsModel"


    // $ANTLR start "ruleBugsModel"
    // InternalBugsDsl.g:72:1: ruleBugsModel returns [EObject current=null] : ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' ) ;
    public final EObject ruleBugsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_instructions_3_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:78:2: ( ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' ) )
            // InternalBugsDsl.g:79:2: ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' )
            {
            // InternalBugsDsl.g:79:2: ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' )
            // InternalBugsDsl.g:80:3: () otherlv_1= 'model' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}'
            {
            // InternalBugsDsl.g:80:3: ()
            // InternalBugsDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBugsModelAccess().getBugsModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBugsModelAccess().getModelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBugsModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBugsDsl.g:95:3: ( (lv_instructions_3_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBugsDsl.g:96:4: (lv_instructions_3_0= ruleInstruction )
            	    {
            	    // InternalBugsDsl.g:96:4: (lv_instructions_3_0= ruleInstruction )
            	    // InternalBugsDsl.g:97:5: lv_instructions_3_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getBugsModelAccess().getInstructionsInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBugsModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_3_0,
            	    						"com.opcoach.bugsy.xtext.BugsDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBugsModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBugsModel"


    // $ANTLR start "entryRuleInstruction"
    // InternalBugsDsl.g:122:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalBugsDsl.g:122:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalBugsDsl.g:123:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalBugsDsl.g:129:1: ruleInstruction returns [EObject current=null] : (this_For_0= ruleFor | this_Relation_1= ruleRelation ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_For_0 = null;

        EObject this_Relation_1 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:135:2: ( (this_For_0= ruleFor | this_Relation_1= ruleRelation ) )
            // InternalBugsDsl.g:136:2: (this_For_0= ruleFor | this_Relation_1= ruleRelation )
            {
            // InternalBugsDsl.g:136:2: (this_For_0= ruleFor | this_Relation_1= ruleRelation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBugsDsl.g:137:3: this_For_0= ruleFor
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getForParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_For_0=ruleFor();

                    state._fsp--;


                    			current = this_For_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:146:3: this_Relation_1= ruleRelation
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getRelationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relation_1=ruleRelation();

                    state._fsp--;


                    			current = this_Relation_1;
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleFor"
    // InternalBugsDsl.g:158:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalBugsDsl.g:158:44: (iv_ruleFor= ruleFor EOF )
            // InternalBugsDsl.g:159:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalBugsDsl.g:165:1: ruleFor returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_high_7_0= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;
        Token otherlv_4=null;
        Token lv_low_5_0=null;
        Token otherlv_6=null;
        Token lv_high_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_contents_10_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:171:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_high_7_0= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}' ) )
            // InternalBugsDsl.g:172:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_high_7_0= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}' )
            {
            // InternalBugsDsl.g:172:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_high_7_0= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}' )
            // InternalBugsDsl.g:173:3: () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= RULE_INT ) ) otherlv_6= ':' ( (lv_high_7_0= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}'
            {
            // InternalBugsDsl.g:173:3: ()
            // InternalBugsDsl.g:174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForAccess().getForAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getForAccess().getForKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getForAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBugsDsl.g:188:3: ( (lv_variable_3_0= RULE_ID ) )
            // InternalBugsDsl.g:189:4: (lv_variable_3_0= RULE_ID )
            {
            // InternalBugsDsl.g:189:4: (lv_variable_3_0= RULE_ID )
            // InternalBugsDsl.g:190:5: lv_variable_3_0= RULE_ID
            {
            lv_variable_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_variable_3_0, grammarAccess.getForAccess().getVariableIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getForAccess().getInKeyword_4());
            		
            // InternalBugsDsl.g:210:3: ( (lv_low_5_0= RULE_INT ) )
            // InternalBugsDsl.g:211:4: (lv_low_5_0= RULE_INT )
            {
            // InternalBugsDsl.g:211:4: (lv_low_5_0= RULE_INT )
            // InternalBugsDsl.g:212:5: lv_low_5_0= RULE_INT
            {
            lv_low_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_low_5_0, grammarAccess.getForAccess().getLowINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForRule());
            					}
            					setWithLastConsumed(
            						current,
            						"low",
            						lv_low_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getForAccess().getColonKeyword_6());
            		
            // InternalBugsDsl.g:232:3: ( (lv_high_7_0= RULE_ID ) )
            // InternalBugsDsl.g:233:4: (lv_high_7_0= RULE_ID )
            {
            // InternalBugsDsl.g:233:4: (lv_high_7_0= RULE_ID )
            // InternalBugsDsl.g:234:5: lv_high_7_0= RULE_ID
            {
            lv_high_7_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_high_7_0, grammarAccess.getForAccess().getHighIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForRule());
            					}
            					setWithLastConsumed(
            						current,
            						"high",
            						lv_high_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getForAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalBugsDsl.g:258:3: ( (lv_contents_10_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBugsDsl.g:259:4: (lv_contents_10_0= ruleInstruction )
            	    {
            	    // InternalBugsDsl.g:259:4: (lv_contents_10_0= ruleInstruction )
            	    // InternalBugsDsl.g:260:5: lv_contents_10_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getForAccess().getContentsInstructionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_contents_10_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contents",
            	    						lv_contents_10_0,
            	    						"com.opcoach.bugsy.xtext.BugsDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getForAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleNumeric"
    // InternalBugsDsl.g:285:1: entryRuleNumeric returns [String current=null] : iv_ruleNumeric= ruleNumeric EOF ;
    public final String entryRuleNumeric() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumeric = null;


        try {
            // InternalBugsDsl.g:285:47: (iv_ruleNumeric= ruleNumeric EOF )
            // InternalBugsDsl.g:286:2: iv_ruleNumeric= ruleNumeric EOF
            {
             newCompositeNode(grammarAccess.getNumericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumeric=ruleNumeric();

            state._fsp--;

             current =iv_ruleNumeric.getText(); 
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
    // $ANTLR end "entryRuleNumeric"


    // $ANTLR start "ruleNumeric"
    // InternalBugsDsl.g:292:1: ruleNumeric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumeric() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:298:2: (this_INT_0= RULE_INT )
            // InternalBugsDsl.g:299:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getNumericAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleNumeric"


    // $ANTLR start "entryRuleValue"
    // InternalBugsDsl.g:309:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalBugsDsl.g:309:45: (iv_ruleValue= ruleValue EOF )
            // InternalBugsDsl.g:310:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalBugsDsl.g:316:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Numeric_0= ruleNumeric | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Numeric_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:322:2: ( (this_Numeric_0= ruleNumeric | this_ID_1= RULE_ID ) )
            // InternalBugsDsl.g:323:2: (this_Numeric_0= ruleNumeric | this_ID_1= RULE_ID )
            {
            // InternalBugsDsl.g:323:2: (this_Numeric_0= ruleNumeric | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBugsDsl.g:324:3: this_Numeric_0= ruleNumeric
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumericParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Numeric_0=ruleNumeric();

                    state._fsp--;


                    			current.merge(this_Numeric_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:335:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getValueAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleParameter"
    // InternalBugsDsl.g:346:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalBugsDsl.g:346:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalBugsDsl.g:347:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalBugsDsl.g:353:1: ruleParameter returns [EObject current=null] : ( () ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:359:2: ( ( () ( (lv_value_1_0= ruleValue ) ) ) )
            // InternalBugsDsl.g:360:2: ( () ( (lv_value_1_0= ruleValue ) ) )
            {
            // InternalBugsDsl.g:360:2: ( () ( (lv_value_1_0= ruleValue ) ) )
            // InternalBugsDsl.g:361:3: () ( (lv_value_1_0= ruleValue ) )
            {
            // InternalBugsDsl.g:361:3: ()
            // InternalBugsDsl.g:362:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalBugsDsl.g:368:3: ( (lv_value_1_0= ruleValue ) )
            // InternalBugsDsl.g:369:4: (lv_value_1_0= ruleValue )
            {
            // InternalBugsDsl.g:369:4: (lv_value_1_0= ruleValue )
            // InternalBugsDsl.g:370:5: lv_value_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getValueValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"com.opcoach.bugsy.xtext.BugsDsl.Value");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRelation"
    // InternalBugsDsl.g:391:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalBugsDsl.g:391:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalBugsDsl.g:392:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalBugsDsl.g:398:1: ruleRelation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation ) ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_relation_1_1 = null;

        EObject lv_relation_1_2 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:404:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation ) ) ) ) )
            // InternalBugsDsl.g:405:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation ) ) ) )
            {
            // InternalBugsDsl.g:405:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation ) ) ) )
            // InternalBugsDsl.g:406:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation ) ) )
            {
            // InternalBugsDsl.g:406:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBugsDsl.g:407:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBugsDsl.g:407:4: (lv_name_0_0= RULE_ID )
            // InternalBugsDsl.g:408:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBugsDsl.g:424:3: ( ( (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation ) ) )
            // InternalBugsDsl.g:425:4: ( (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation ) )
            {
            // InternalBugsDsl.g:425:4: ( (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation ) )
            // InternalBugsDsl.g:426:5: (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation )
            {
            // InternalBugsDsl.g:426:5: (lv_relation_1_1= ruleStochasticRelation | lv_relation_1_2= ruleDeterministicRelation )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=22 && LA5_0<=23)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBugsDsl.g:427:6: lv_relation_1_1= ruleStochasticRelation
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getRelationStochasticRelationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_relation_1_1=ruleStochasticRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"relation",
                    							lv_relation_1_1,
                    							"com.opcoach.bugsy.xtext.BugsDsl.StochasticRelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:443:6: lv_relation_1_2= ruleDeterministicRelation
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getRelationDeterministicRelationParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_relation_1_2=ruleDeterministicRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"relation",
                    							lv_relation_1_2,
                    							"com.opcoach.bugsy.xtext.BugsDsl.DeterministicRelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleStochasticRelation"
    // InternalBugsDsl.g:465:1: entryRuleStochasticRelation returns [EObject current=null] : iv_ruleStochasticRelation= ruleStochasticRelation EOF ;
    public final EObject entryRuleStochasticRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStochasticRelation = null;


        try {
            // InternalBugsDsl.g:465:59: (iv_ruleStochasticRelation= ruleStochasticRelation EOF )
            // InternalBugsDsl.g:466:2: iv_ruleStochasticRelation= ruleStochasticRelation EOF
            {
             newCompositeNode(grammarAccess.getStochasticRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStochasticRelation=ruleStochasticRelation();

            state._fsp--;

             current =iv_ruleStochasticRelation; 
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
    // $ANTLR end "entryRuleStochasticRelation"


    // $ANTLR start "ruleStochasticRelation"
    // InternalBugsDsl.g:472:1: ruleStochasticRelation returns [EObject current=null] : ( () otherlv_1= '~' ( (lv_distrib_2_0= ruleDensity ) ) (otherlv_3= '()' | (otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* ) otherlv_8= ')' ) )? ) ;
    public final EObject ruleStochasticRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_distrib_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:478:2: ( ( () otherlv_1= '~' ( (lv_distrib_2_0= ruleDensity ) ) (otherlv_3= '()' | (otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* ) otherlv_8= ')' ) )? ) )
            // InternalBugsDsl.g:479:2: ( () otherlv_1= '~' ( (lv_distrib_2_0= ruleDensity ) ) (otherlv_3= '()' | (otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* ) otherlv_8= ')' ) )? )
            {
            // InternalBugsDsl.g:479:2: ( () otherlv_1= '~' ( (lv_distrib_2_0= ruleDensity ) ) (otherlv_3= '()' | (otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* ) otherlv_8= ')' ) )? )
            // InternalBugsDsl.g:480:3: () otherlv_1= '~' ( (lv_distrib_2_0= ruleDensity ) ) (otherlv_3= '()' | (otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* ) otherlv_8= ')' ) )?
            {
            // InternalBugsDsl.g:480:3: ()
            // InternalBugsDsl.g:481:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStochasticRelationAccess().getStochasticRelationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStochasticRelationAccess().getTildeKeyword_1());
            		
            // InternalBugsDsl.g:491:3: ( (lv_distrib_2_0= ruleDensity ) )
            // InternalBugsDsl.g:492:4: (lv_distrib_2_0= ruleDensity )
            {
            // InternalBugsDsl.g:492:4: (lv_distrib_2_0= ruleDensity )
            // InternalBugsDsl.g:493:5: lv_distrib_2_0= ruleDensity
            {

            					newCompositeNode(grammarAccess.getStochasticRelationAccess().getDistribDensityEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_distrib_2_0=ruleDensity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
            					}
            					set(
            						current,
            						"distrib",
            						lv_distrib_2_0,
            						"com.opcoach.bugsy.xtext.BugsDsl.Density");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBugsDsl.g:510:3: (otherlv_3= '()' | (otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* ) otherlv_8= ')' ) )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalBugsDsl.g:511:4: otherlv_3= '()'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStochasticRelationAccess().getLeftParenthesisRightParenthesisKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:516:4: (otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* ) otherlv_8= ')' )
                    {
                    // InternalBugsDsl.g:516:4: (otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* ) otherlv_8= ')' )
                    // InternalBugsDsl.g:517:5: otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* ) otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_14); 

                    					newLeafNode(otherlv_4, grammarAccess.getStochasticRelationAccess().getLeftParenthesisKeyword_3_1_0());
                    				
                    // InternalBugsDsl.g:521:5: ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )
                    // InternalBugsDsl.g:522:6: ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    {
                    // InternalBugsDsl.g:522:6: ( (lv_params_5_0= ruleParameter ) )
                    // InternalBugsDsl.g:523:7: (lv_params_5_0= ruleParameter )
                    {
                    // InternalBugsDsl.g:523:7: (lv_params_5_0= ruleParameter )
                    // InternalBugsDsl.g:524:8: lv_params_5_0= ruleParameter
                    {

                    								newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsParameterParserRuleCall_3_1_1_0_0());
                    							
                    pushFollow(FOLLOW_15);
                    lv_params_5_0=ruleParameter();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
                    								}
                    								add(
                    									current,
                    									"params",
                    									lv_params_5_0,
                    									"com.opcoach.bugsy.xtext.BugsDsl.Parameter");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    // InternalBugsDsl.g:541:6: (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBugsDsl.g:542:7: otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_14); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getStochasticRelationAccess().getCommaKeyword_3_1_1_1_0());
                    	    						
                    	    // InternalBugsDsl.g:546:7: ( (lv_params_7_0= ruleParameter ) )
                    	    // InternalBugsDsl.g:547:8: (lv_params_7_0= ruleParameter )
                    	    {
                    	    // InternalBugsDsl.g:547:8: (lv_params_7_0= ruleParameter )
                    	    // InternalBugsDsl.g:548:9: lv_params_7_0= ruleParameter
                    	    {

                    	    									newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsParameterParserRuleCall_3_1_1_1_1_0());
                    	    								
                    	    pushFollow(FOLLOW_15);
                    	    lv_params_7_0=ruleParameter();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"params",
                    	    										lv_params_7_0,
                    	    										"com.opcoach.bugsy.xtext.BugsDsl.Parameter");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getStochasticRelationAccess().getRightParenthesisKeyword_3_1_2());
                    				

                    }


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
    // $ANTLR end "ruleStochasticRelation"


    // $ANTLR start "entryRuleDeterministicRelation"
    // InternalBugsDsl.g:577:1: entryRuleDeterministicRelation returns [EObject current=null] : iv_ruleDeterministicRelation= ruleDeterministicRelation EOF ;
    public final EObject entryRuleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterministicRelation = null;


        try {
            // InternalBugsDsl.g:577:62: (iv_ruleDeterministicRelation= ruleDeterministicRelation EOF )
            // InternalBugsDsl.g:578:2: iv_ruleDeterministicRelation= ruleDeterministicRelation EOF
            {
             newCompositeNode(grammarAccess.getDeterministicRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeterministicRelation=ruleDeterministicRelation();

            state._fsp--;

             current =iv_ruleDeterministicRelation; 
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
    // $ANTLR end "entryRuleDeterministicRelation"


    // $ANTLR start "ruleDeterministicRelation"
    // InternalBugsDsl.g:584:1: ruleDeterministicRelation returns [EObject current=null] : ( () (otherlv_1= '<-' | otherlv_2= '=' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_6= '()' | (otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )? ) ) ) ;
    public final EObject ruleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_distrib_4_0 = null;

        Enumerator lv_function_5_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_params_10_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:590:2: ( ( () (otherlv_1= '<-' | otherlv_2= '=' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_6= '()' | (otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )? ) ) ) )
            // InternalBugsDsl.g:591:2: ( () (otherlv_1= '<-' | otherlv_2= '=' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_6= '()' | (otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )? ) ) )
            {
            // InternalBugsDsl.g:591:2: ( () (otherlv_1= '<-' | otherlv_2= '=' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_6= '()' | (otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )? ) ) )
            // InternalBugsDsl.g:592:3: () (otherlv_1= '<-' | otherlv_2= '=' ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_6= '()' | (otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )? ) )
            {
            // InternalBugsDsl.g:592:3: ()
            // InternalBugsDsl.g:593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeterministicRelationAccess().getDeterministicRelationAction_0(),
            					current);
            			

            }

            // InternalBugsDsl.g:599:3: (otherlv_1= '<-' | otherlv_2= '=' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBugsDsl.g:600:4: otherlv_1= '<-'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeterministicRelationAccess().getLessThanSignHyphenMinusKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:605:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeterministicRelationAccess().getEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalBugsDsl.g:610:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* ) ) )
            // InternalBugsDsl.g:611:4: ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* ) )
            {
            // InternalBugsDsl.g:611:4: ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* ) )
            // InternalBugsDsl.g:612:5: ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2());
            				
            // InternalBugsDsl.g:615:5: ( ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )* )
            // InternalBugsDsl.g:616:6: ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )*
            {
            // InternalBugsDsl.g:616:6: ( ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( LA9_0 >= 24 && LA9_0 <= 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 >= 44 && LA9_0 <= 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2(), 1) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBugsDsl.g:617:4: ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) )
            	    {
            	    // InternalBugsDsl.g:617:4: ({...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) ) )
            	    // InternalBugsDsl.g:618:5: {...}? => ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDeterministicRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalBugsDsl.g:618:118: ( ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) ) )
            	    // InternalBugsDsl.g:619:6: ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalBugsDsl.g:622:9: ({...}? => ( (lv_distrib_4_0= ruleDistribution ) ) )
            	    // InternalBugsDsl.g:622:10: {...}? => ( (lv_distrib_4_0= ruleDistribution ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeterministicRelation", "true");
            	    }
            	    // InternalBugsDsl.g:622:19: ( (lv_distrib_4_0= ruleDistribution ) )
            	    // InternalBugsDsl.g:622:20: (lv_distrib_4_0= ruleDistribution )
            	    {
            	    // InternalBugsDsl.g:622:20: (lv_distrib_4_0= ruleDistribution )
            	    // InternalBugsDsl.g:623:10: lv_distrib_4_0= ruleDistribution
            	    {

            	    										newCompositeNode(grammarAccess.getDeterministicRelationAccess().getDistribDistributionEnumRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_16);
            	    lv_distrib_4_0=ruleDistribution();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"distrib",
            	    											lv_distrib_4_0,
            	    											"com.opcoach.bugsy.xtext.BugsDsl.Distribution");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBugsDsl.g:645:4: ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) )
            	    {
            	    // InternalBugsDsl.g:645:4: ({...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) ) )
            	    // InternalBugsDsl.g:646:5: {...}? => ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDeterministicRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalBugsDsl.g:646:118: ( ({...}? => ( (lv_function_5_0= ruleFunction ) ) ) )
            	    // InternalBugsDsl.g:647:6: ({...}? => ( (lv_function_5_0= ruleFunction ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalBugsDsl.g:650:9: ({...}? => ( (lv_function_5_0= ruleFunction ) ) )
            	    // InternalBugsDsl.g:650:10: {...}? => ( (lv_function_5_0= ruleFunction ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeterministicRelation", "true");
            	    }
            	    // InternalBugsDsl.g:650:19: ( (lv_function_5_0= ruleFunction ) )
            	    // InternalBugsDsl.g:650:20: (lv_function_5_0= ruleFunction )
            	    {
            	    // InternalBugsDsl.g:650:20: (lv_function_5_0= ruleFunction )
            	    // InternalBugsDsl.g:651:10: lv_function_5_0= ruleFunction
            	    {

            	    										newCompositeNode(grammarAccess.getDeterministicRelationAccess().getFunctionFunctionEnumRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_16);
            	    lv_function_5_0=ruleFunction();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"function",
            	    											lv_function_5_0,
            	    											"com.opcoach.bugsy.xtext.BugsDsl.Function");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_2());
            				

            }

            // InternalBugsDsl.g:680:3: (otherlv_6= '()' | (otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBugsDsl.g:681:4: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeterministicRelationAccess().getLeftParenthesisRightParenthesisKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:686:4: (otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )? )
                    {
                    // InternalBugsDsl.g:686:4: (otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )? )
                    // InternalBugsDsl.g:687:5: otherlv_7= '(' ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )?
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_17); 

                    					newLeafNode(otherlv_7, grammarAccess.getDeterministicRelationAccess().getLeftParenthesisKeyword_3_1_0());
                    				
                    // InternalBugsDsl.g:691:5: ( ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_INT) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==RULE_ID) ) {
                        int LA11_2 = input.LA(2);

                        if ( (LA11_2==18||LA11_2==21) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalBugsDsl.g:692:6: ( (lv_params_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )* otherlv_11= ')'
                            {
                            // InternalBugsDsl.g:692:6: ( (lv_params_8_0= ruleParameter ) )
                            // InternalBugsDsl.g:693:7: (lv_params_8_0= ruleParameter )
                            {
                            // InternalBugsDsl.g:693:7: (lv_params_8_0= ruleParameter )
                            // InternalBugsDsl.g:694:8: lv_params_8_0= ruleParameter
                            {

                            								newCompositeNode(grammarAccess.getDeterministicRelationAccess().getParamsParameterParserRuleCall_3_1_1_0_0());
                            							
                            pushFollow(FOLLOW_15);
                            lv_params_8_0=ruleParameter();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
                            								}
                            								add(
                            									current,
                            									"params",
                            									lv_params_8_0,
                            									"com.opcoach.bugsy.xtext.BugsDsl.Parameter");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalBugsDsl.g:711:6: (otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==21) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalBugsDsl.g:712:7: otherlv_9= ',' ( (lv_params_10_0= ruleParameter ) )
                            	    {
                            	    otherlv_9=(Token)match(input,21,FOLLOW_14); 

                            	    							newLeafNode(otherlv_9, grammarAccess.getDeterministicRelationAccess().getCommaKeyword_3_1_1_1_0());
                            	    						
                            	    // InternalBugsDsl.g:716:7: ( (lv_params_10_0= ruleParameter ) )
                            	    // InternalBugsDsl.g:717:8: (lv_params_10_0= ruleParameter )
                            	    {
                            	    // InternalBugsDsl.g:717:8: (lv_params_10_0= ruleParameter )
                            	    // InternalBugsDsl.g:718:9: lv_params_10_0= ruleParameter
                            	    {

                            	    									newCompositeNode(grammarAccess.getDeterministicRelationAccess().getParamsParameterParserRuleCall_3_1_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_15);
                            	    lv_params_10_0=ruleParameter();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"params",
                            	    										lv_params_10_0,
                            	    										"com.opcoach.bugsy.xtext.BugsDsl.Parameter");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,18,FOLLOW_2); 

                            						newLeafNode(otherlv_11, grammarAccess.getDeterministicRelationAccess().getRightParenthesisKeyword_3_1_1_2());
                            					

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleDeterministicRelation"


    // $ANTLR start "ruleDistribution"
    // InternalBugsDsl.g:747:1: ruleDistribution returns [Enumerator current=null] : ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgamma' ) | (enumLiteral_7= 'dgen.gamma' ) | (enumLiteral_8= 'dhyper' ) | (enumLiteral_9= 'dlogis' ) | (enumLiteral_10= 'dlnorm' ) | (enumLiteral_11= 'dnegbin' ) | (enumLiteral_12= 'dnchisqr' ) | (enumLiteral_13= 'dpar' ) | (enumLiteral_14= 'dpois' ) | (enumLiteral_15= 'dt' ) | (enumLiteral_16= 'dweib' ) ) ;
    public final Enumerator ruleDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:753:2: ( ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgamma' ) | (enumLiteral_7= 'dgen.gamma' ) | (enumLiteral_8= 'dhyper' ) | (enumLiteral_9= 'dlogis' ) | (enumLiteral_10= 'dlnorm' ) | (enumLiteral_11= 'dnegbin' ) | (enumLiteral_12= 'dnchisqr' ) | (enumLiteral_13= 'dpar' ) | (enumLiteral_14= 'dpois' ) | (enumLiteral_15= 'dt' ) | (enumLiteral_16= 'dweib' ) ) )
            // InternalBugsDsl.g:754:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgamma' ) | (enumLiteral_7= 'dgen.gamma' ) | (enumLiteral_8= 'dhyper' ) | (enumLiteral_9= 'dlogis' ) | (enumLiteral_10= 'dlnorm' ) | (enumLiteral_11= 'dnegbin' ) | (enumLiteral_12= 'dnchisqr' ) | (enumLiteral_13= 'dpar' ) | (enumLiteral_14= 'dpois' ) | (enumLiteral_15= 'dt' ) | (enumLiteral_16= 'dweib' ) )
            {
            // InternalBugsDsl.g:754:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgamma' ) | (enumLiteral_7= 'dgen.gamma' ) | (enumLiteral_8= 'dhyper' ) | (enumLiteral_9= 'dlogis' ) | (enumLiteral_10= 'dlnorm' ) | (enumLiteral_11= 'dnegbin' ) | (enumLiteral_12= 'dnchisqr' ) | (enumLiteral_13= 'dpar' ) | (enumLiteral_14= 'dpois' ) | (enumLiteral_15= 'dt' ) | (enumLiteral_16= 'dweib' ) )
            int alt13=17;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            case 29:
                {
                alt13=6;
                }
                break;
            case 30:
                {
                alt13=7;
                }
                break;
            case 31:
                {
                alt13=8;
                }
                break;
            case 32:
                {
                alt13=9;
                }
                break;
            case 33:
                {
                alt13=10;
                }
                break;
            case 34:
                {
                alt13=11;
                }
                break;
            case 35:
                {
                alt13=12;
                }
                break;
            case 36:
                {
                alt13=13;
                }
                break;
            case 37:
                {
                alt13=14;
                }
                break;
            case 38:
                {
                alt13=15;
                }
                break;
            case 39:
                {
                alt13=16;
                }
                break;
            case 40:
                {
                alt13=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalBugsDsl.g:755:3: (enumLiteral_0= 'dbern' )
                    {
                    // InternalBugsDsl.g:755:3: (enumLiteral_0= 'dbern' )
                    // InternalBugsDsl.g:756:4: enumLiteral_0= 'dbern'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDbernEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDistributionAccess().getDbernEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:763:3: (enumLiteral_1= 'dbin' )
                    {
                    // InternalBugsDsl.g:763:3: (enumLiteral_1= 'dbin' )
                    // InternalBugsDsl.g:764:4: enumLiteral_1= 'dbin'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDbinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDistributionAccess().getDbinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:771:3: (enumLiteral_2= 'dchisqr' )
                    {
                    // InternalBugsDsl.g:771:3: (enumLiteral_2= 'dchisqr' )
                    // InternalBugsDsl.g:772:4: enumLiteral_2= 'dchisqr'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDchisqrEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDistributionAccess().getDchisqrEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:779:3: (enumLiteral_3= 'ddexp' )
                    {
                    // InternalBugsDsl.g:779:3: (enumLiteral_3= 'ddexp' )
                    // InternalBugsDsl.g:780:4: enumLiteral_3= 'ddexp'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDdexpEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDistributionAccess().getDdexpEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:787:3: (enumLiteral_4= 'dexp' )
                    {
                    // InternalBugsDsl.g:787:3: (enumLiteral_4= 'dexp' )
                    // InternalBugsDsl.g:788:4: enumLiteral_4= 'dexp'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDexpEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDistributionAccess().getDexpEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:795:3: (enumLiteral_5= 'df' )
                    {
                    // InternalBugsDsl.g:795:3: (enumLiteral_5= 'df' )
                    // InternalBugsDsl.g:796:4: enumLiteral_5= 'df'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDfEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDistributionAccess().getDfEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:803:3: (enumLiteral_6= 'dgamma' )
                    {
                    // InternalBugsDsl.g:803:3: (enumLiteral_6= 'dgamma' )
                    // InternalBugsDsl.g:804:4: enumLiteral_6= 'dgamma'
                    {
                    enumLiteral_6=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDgammaEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDistributionAccess().getDgammaEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:811:3: (enumLiteral_7= 'dgen.gamma' )
                    {
                    // InternalBugsDsl.g:811:3: (enumLiteral_7= 'dgen.gamma' )
                    // InternalBugsDsl.g:812:4: enumLiteral_7= 'dgen.gamma'
                    {
                    enumLiteral_7=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDgengammEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDistributionAccess().getDgengammEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalBugsDsl.g:819:3: (enumLiteral_8= 'dhyper' )
                    {
                    // InternalBugsDsl.g:819:3: (enumLiteral_8= 'dhyper' )
                    // InternalBugsDsl.g:820:4: enumLiteral_8= 'dhyper'
                    {
                    enumLiteral_8=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDhyperEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDistributionAccess().getDhyperEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalBugsDsl.g:827:3: (enumLiteral_9= 'dlogis' )
                    {
                    // InternalBugsDsl.g:827:3: (enumLiteral_9= 'dlogis' )
                    // InternalBugsDsl.g:828:4: enumLiteral_9= 'dlogis'
                    {
                    enumLiteral_9=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDlogisEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDistributionAccess().getDlogisEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalBugsDsl.g:835:3: (enumLiteral_10= 'dlnorm' )
                    {
                    // InternalBugsDsl.g:835:3: (enumLiteral_10= 'dlnorm' )
                    // InternalBugsDsl.g:836:4: enumLiteral_10= 'dlnorm'
                    {
                    enumLiteral_10=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDlnormEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDistributionAccess().getDlnormEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalBugsDsl.g:843:3: (enumLiteral_11= 'dnegbin' )
                    {
                    // InternalBugsDsl.g:843:3: (enumLiteral_11= 'dnegbin' )
                    // InternalBugsDsl.g:844:4: enumLiteral_11= 'dnegbin'
                    {
                    enumLiteral_11=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDnegbinEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDistributionAccess().getDnegbinEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalBugsDsl.g:851:3: (enumLiteral_12= 'dnchisqr' )
                    {
                    // InternalBugsDsl.g:851:3: (enumLiteral_12= 'dnchisqr' )
                    // InternalBugsDsl.g:852:4: enumLiteral_12= 'dnchisqr'
                    {
                    enumLiteral_12=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDnchisqrEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDistributionAccess().getDnchisqrEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalBugsDsl.g:859:3: (enumLiteral_13= 'dpar' )
                    {
                    // InternalBugsDsl.g:859:3: (enumLiteral_13= 'dpar' )
                    // InternalBugsDsl.g:860:4: enumLiteral_13= 'dpar'
                    {
                    enumLiteral_13=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDparEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDistributionAccess().getDparEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalBugsDsl.g:867:3: (enumLiteral_14= 'dpois' )
                    {
                    // InternalBugsDsl.g:867:3: (enumLiteral_14= 'dpois' )
                    // InternalBugsDsl.g:868:4: enumLiteral_14= 'dpois'
                    {
                    enumLiteral_14=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDpoisEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDistributionAccess().getDpoisEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalBugsDsl.g:875:3: (enumLiteral_15= 'dt' )
                    {
                    // InternalBugsDsl.g:875:3: (enumLiteral_15= 'dt' )
                    // InternalBugsDsl.g:876:4: enumLiteral_15= 'dt'
                    {
                    enumLiteral_15=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDtEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getDistributionAccess().getDtEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalBugsDsl.g:883:3: (enumLiteral_16= 'dweib' )
                    {
                    // InternalBugsDsl.g:883:3: (enumLiteral_16= 'dweib' )
                    // InternalBugsDsl.g:884:4: enumLiteral_16= 'dweib'
                    {
                    enumLiteral_16=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDweibEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getDistributionAccess().getDweibEnumLiteralDeclaration_16());
                    			

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
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "ruleDensity"
    // InternalBugsDsl.g:894:1: ruleDensity returns [Enumerator current=null] : ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) ) ;
    public final Enumerator ruleDensity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:900:2: ( ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) ) )
            // InternalBugsDsl.g:901:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) )
            {
            // InternalBugsDsl.g:901:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt14=1;
                }
                break;
            case 42:
                {
                alt14=2;
                }
                break;
            case 43:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalBugsDsl.g:902:3: (enumLiteral_0= 'dnorm' )
                    {
                    // InternalBugsDsl.g:902:3: (enumLiteral_0= 'dnorm' )
                    // InternalBugsDsl.g:903:4: enumLiteral_0= 'dnorm'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDensityAccess().getDnormEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDensityAccess().getDnormEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:910:3: (enumLiteral_1= 'dunif' )
                    {
                    // InternalBugsDsl.g:910:3: (enumLiteral_1= 'dunif' )
                    // InternalBugsDsl.g:911:4: enumLiteral_1= 'dunif'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDensityAccess().getDunifEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDensityAccess().getDunifEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:918:3: (enumLiteral_2= 'dbeta' )
                    {
                    // InternalBugsDsl.g:918:3: (enumLiteral_2= 'dbeta' )
                    // InternalBugsDsl.g:919:4: enumLiteral_2= 'dbeta'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDensityAccess().getDbetaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDensityAccess().getDbetaEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDensity"


    // $ANTLR start "ruleFunction"
    // InternalBugsDsl.g:929:1: ruleFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) ) ;
    public final Enumerator ruleFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:935:2: ( ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) ) )
            // InternalBugsDsl.g:936:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) )
            {
            // InternalBugsDsl.g:936:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt15=1;
                }
                break;
            case 45:
                {
                alt15=2;
                }
                break;
            case 46:
                {
                alt15=3;
                }
                break;
            case 47:
                {
                alt15=4;
                }
                break;
            case 48:
                {
                alt15=5;
                }
                break;
            case 49:
                {
                alt15=6;
                }
                break;
            case 50:
                {
                alt15=7;
                }
                break;
            case 51:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalBugsDsl.g:937:3: (enumLiteral_0= 'acos' )
                    {
                    // InternalBugsDsl.g:937:3: (enumLiteral_0= 'acos' )
                    // InternalBugsDsl.g:938:4: enumLiteral_0= 'acos'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAcosEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFunctionAccess().getAcosEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:945:3: (enumLiteral_1= 'acosh' )
                    {
                    // InternalBugsDsl.g:945:3: (enumLiteral_1= 'acosh' )
                    // InternalBugsDsl.g:946:4: enumLiteral_1= 'acosh'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAcoshEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFunctionAccess().getAcoshEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:953:3: (enumLiteral_2= 'asin' )
                    {
                    // InternalBugsDsl.g:953:3: (enumLiteral_2= 'asin' )
                    // InternalBugsDsl.g:954:4: enumLiteral_2= 'asin'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAsinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFunctionAccess().getAsinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:961:3: (enumLiteral_3= 'asinh' )
                    {
                    // InternalBugsDsl.g:961:3: (enumLiteral_3= 'asinh' )
                    // InternalBugsDsl.g:962:4: enumLiteral_3= 'asinh'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAsinhEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFunctionAccess().getAsinhEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:969:3: (enumLiteral_4= 'atan' )
                    {
                    // InternalBugsDsl.g:969:3: (enumLiteral_4= 'atan' )
                    // InternalBugsDsl.g:970:4: enumLiteral_4= 'atan'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAtanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFunctionAccess().getAtanEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:977:3: (enumLiteral_5= 'log' )
                    {
                    // InternalBugsDsl.g:977:3: (enumLiteral_5= 'log' )
                    // InternalBugsDsl.g:978:4: enumLiteral_5= 'log'
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getLogEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFunctionAccess().getLogEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:985:3: (enumLiteral_6= 'exp' )
                    {
                    // InternalBugsDsl.g:985:3: (enumLiteral_6= 'exp' )
                    // InternalBugsDsl.g:986:4: enumLiteral_6= 'exp'
                    {
                    enumLiteral_6=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getEpEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFunctionAccess().getEpEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:993:3: (enumLiteral_7= 'c' )
                    {
                    // InternalBugsDsl.g:993:3: (enumLiteral_7= 'c' )
                    // InternalBugsDsl.g:994:4: enumLiteral_7= 'c'
                    {
                    enumLiteral_7=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getCEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFunctionAccess().getCEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleFunction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C80000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000FF1FFFF108000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000032L});

}
