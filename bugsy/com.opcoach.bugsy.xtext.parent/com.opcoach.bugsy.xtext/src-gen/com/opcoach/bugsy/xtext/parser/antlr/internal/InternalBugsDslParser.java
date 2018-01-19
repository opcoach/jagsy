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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_ARRAYDIM", "'model'", "'{'", "'}'", "'for'", "'('", "'in'", "':'", "')'", "','", "'dbern'", "'dbeta'", "'dbin'", "'dchisqr'", "'ddexp'", "'dexp'", "'df'", "'dgamma'", "'dgen.gamma'", "'dhyper'", "'dlogis'", "'dlnorm'", "'dnegbin'", "'dnchisqr'", "'dnorm'", "'dpar'", "'dpois'", "'dt'", "'dweib'", "'acos'", "'acosh'", "'asin'", "'asinh'", "'atan'", "'log'", "'exp'", "'c'", "'~'", "'<-'", "'='"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_ARRAYDIM=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
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

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBugsModelAccess().getModelKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBugsModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBugsDsl.g:95:3: ( (lv_instructions_3_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==16) ) {
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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

            if ( (LA2_0==16) ) {
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

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getForAccess().getForKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_6); 

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
            						"com.opcoach.bugsy.xtext.BugsDsl.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_8); 

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
            						"com.opcoach.bugsy.xtext.BugsDsl.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_6); 

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
            						"com.opcoach.bugsy.xtext.BugsDsl.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getForAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalBugsDsl.g:258:3: ( (lv_contents_10_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==16) ) {
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

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRelation"
    // InternalBugsDsl.g:285:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalBugsDsl.g:285:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalBugsDsl.g:286:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalBugsDsl.g:292:1: ruleRelation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relationType_1_0= ruleRelationType ) ) ( (lv_leftExpr_2_0= ruleOperation ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_relationType_1_0 = null;

        EObject lv_leftExpr_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:298:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relationType_1_0= ruleRelationType ) ) ( (lv_leftExpr_2_0= ruleOperation ) ) ) )
            // InternalBugsDsl.g:299:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relationType_1_0= ruleRelationType ) ) ( (lv_leftExpr_2_0= ruleOperation ) ) )
            {
            // InternalBugsDsl.g:299:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_relationType_1_0= ruleRelationType ) ) ( (lv_leftExpr_2_0= ruleOperation ) ) )
            // InternalBugsDsl.g:300:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_relationType_1_0= ruleRelationType ) ) ( (lv_leftExpr_2_0= ruleOperation ) )
            {
            // InternalBugsDsl.g:300:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBugsDsl.g:301:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBugsDsl.g:301:4: (lv_name_0_0= RULE_ID )
            // InternalBugsDsl.g:302:5: lv_name_0_0= RULE_ID
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
            						"com.opcoach.bugsy.xtext.BugsDsl.ID");
            				

            }


            }

            // InternalBugsDsl.g:318:3: ( (lv_relationType_1_0= ruleRelationType ) )
            // InternalBugsDsl.g:319:4: (lv_relationType_1_0= ruleRelationType )
            {
            // InternalBugsDsl.g:319:4: (lv_relationType_1_0= ruleRelationType )
            // InternalBugsDsl.g:320:5: lv_relationType_1_0= ruleRelationType
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getRelationTypeRelationTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_relationType_1_0=ruleRelationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"relationType",
            						lv_relationType_1_0,
            						"com.opcoach.bugsy.xtext.BugsDsl.RelationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBugsDsl.g:337:3: ( (lv_leftExpr_2_0= ruleOperation ) )
            // InternalBugsDsl.g:338:4: (lv_leftExpr_2_0= ruleOperation )
            {
            // InternalBugsDsl.g:338:4: (lv_leftExpr_2_0= ruleOperation )
            // InternalBugsDsl.g:339:5: lv_leftExpr_2_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getLeftExprOperationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_leftExpr_2_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"leftExpr",
            						lv_leftExpr_2_0,
            						"com.opcoach.bugsy.xtext.BugsDsl.Operation");
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleOperation"
    // InternalBugsDsl.g:360:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalBugsDsl.g:360:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalBugsDsl.g:361:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalBugsDsl.g:367:1: ruleOperation returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* ) ) ) otherlv_4= '(' ( ( (lv_elements_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleParameter ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_distrib_2_0 = null;

        Enumerator lv_function_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:373:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* ) ) ) otherlv_4= '(' ( ( (lv_elements_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleParameter ) ) )* )? otherlv_8= ')' ) )
            // InternalBugsDsl.g:374:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* ) ) ) otherlv_4= '(' ( ( (lv_elements_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )
            {
            // InternalBugsDsl.g:374:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* ) ) ) otherlv_4= '(' ( ( (lv_elements_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )
            // InternalBugsDsl.g:375:3: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* ) ) ) otherlv_4= '(' ( ( (lv_elements_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleParameter ) ) )* )? otherlv_8= ')'
            {
            // InternalBugsDsl.g:375:3: ()
            // InternalBugsDsl.g:376:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            // InternalBugsDsl.g:382:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* ) ) )
            // InternalBugsDsl.g:383:4: ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* ) )
            {
            // InternalBugsDsl.g:383:4: ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* ) )
            // InternalBugsDsl.g:384:5: ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_1());
            				
            // InternalBugsDsl.g:387:5: ( ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )* )
            // InternalBugsDsl.g:388:6: ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )*
            {
            // InternalBugsDsl.g:388:6: ( ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 >= 22 && LA4_0 <= 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_1(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 >= 41 && LA4_0 <= 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_1(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBugsDsl.g:389:4: ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) )
            	    {
            	    // InternalBugsDsl.g:389:4: ({...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) ) )
            	    // InternalBugsDsl.g:390:5: {...}? => ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalBugsDsl.g:390:106: ( ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) ) )
            	    // InternalBugsDsl.g:391:6: ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalBugsDsl.g:394:9: ({...}? => ( (lv_distrib_2_0= ruleDistribution ) ) )
            	    // InternalBugsDsl.g:394:10: {...}? => ( (lv_distrib_2_0= ruleDistribution ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalBugsDsl.g:394:19: ( (lv_distrib_2_0= ruleDistribution ) )
            	    // InternalBugsDsl.g:394:20: (lv_distrib_2_0= ruleDistribution )
            	    {
            	    // InternalBugsDsl.g:394:20: (lv_distrib_2_0= ruleDistribution )
            	    // InternalBugsDsl.g:395:10: lv_distrib_2_0= ruleDistribution
            	    {

            	    										newCompositeNode(grammarAccess.getOperationAccess().getDistribDistributionEnumRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_distrib_2_0=ruleDistribution();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getOperationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"distrib",
            	    											lv_distrib_2_0,
            	    											"com.opcoach.bugsy.xtext.BugsDsl.Distribution");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBugsDsl.g:417:4: ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) )
            	    {
            	    // InternalBugsDsl.g:417:4: ({...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) ) )
            	    // InternalBugsDsl.g:418:5: {...}? => ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalBugsDsl.g:418:106: ( ({...}? => ( (lv_function_3_0= ruleFunction ) ) ) )
            	    // InternalBugsDsl.g:419:6: ({...}? => ( (lv_function_3_0= ruleFunction ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalBugsDsl.g:422:9: ({...}? => ( (lv_function_3_0= ruleFunction ) ) )
            	    // InternalBugsDsl.g:422:10: {...}? => ( (lv_function_3_0= ruleFunction ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalBugsDsl.g:422:19: ( (lv_function_3_0= ruleFunction ) )
            	    // InternalBugsDsl.g:422:20: (lv_function_3_0= ruleFunction )
            	    {
            	    // InternalBugsDsl.g:422:20: (lv_function_3_0= ruleFunction )
            	    // InternalBugsDsl.g:423:10: lv_function_3_0= ruleFunction
            	    {

            	    										newCompositeNode(grammarAccess.getOperationAccess().getFunctionFunctionEnumRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_function_3_0=ruleFunction();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getOperationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"function",
            	    											lv_function_3_0,
            	    											"com.opcoach.bugsy.xtext.BugsDsl.Function");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_1());
            				

            }

            otherlv_4=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBugsDsl.g:456:3: ( ( (lv_elements_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_FLOAT)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBugsDsl.g:457:4: ( (lv_elements_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleParameter ) ) )*
                    {
                    // InternalBugsDsl.g:457:4: ( (lv_elements_5_0= ruleParameter ) )
                    // InternalBugsDsl.g:458:5: (lv_elements_5_0= ruleParameter )
                    {
                    // InternalBugsDsl.g:458:5: (lv_elements_5_0= ruleParameter )
                    // InternalBugsDsl.g:459:6: lv_elements_5_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getElementsParameterParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_elements_5_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_5_0,
                    							"com.opcoach.bugsy.xtext.BugsDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBugsDsl.g:476:4: (otherlv_6= ',' ( (lv_elements_7_0= ruleParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBugsDsl.g:477:5: otherlv_6= ',' ( (lv_elements_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_15); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalBugsDsl.g:481:5: ( (lv_elements_7_0= ruleParameter ) )
                    	    // InternalBugsDsl.g:482:6: (lv_elements_7_0= ruleParameter )
                    	    {
                    	    // InternalBugsDsl.g:482:6: (lv_elements_7_0= ruleParameter )
                    	    // InternalBugsDsl.g:483:7: lv_elements_7_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationAccess().getElementsParameterParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_elements_7_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_7_0,
                    	    								"com.opcoach.bugsy.xtext.BugsDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleNumeric"
    // InternalBugsDsl.g:510:1: entryRuleNumeric returns [String current=null] : iv_ruleNumeric= ruleNumeric EOF ;
    public final String entryRuleNumeric() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumeric = null;


        try {
            // InternalBugsDsl.g:510:47: (iv_ruleNumeric= ruleNumeric EOF )
            // InternalBugsDsl.g:511:2: iv_ruleNumeric= ruleNumeric EOF
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
    // InternalBugsDsl.g:517:1: ruleNumeric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleNumeric() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_FLOAT_1=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:523:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT ) )
            // InternalBugsDsl.g:524:2: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT )
            {
            // InternalBugsDsl.g:524:2: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_FLOAT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBugsDsl.g:525:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNumericAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:533:3: this_FLOAT_1= RULE_FLOAT
                    {
                    this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    			current.merge(this_FLOAT_1);
                    		

                    			newLeafNode(this_FLOAT_1, grammarAccess.getNumericAccess().getFLOATTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleNumeric"


    // $ANTLR start "entryRuleValue"
    // InternalBugsDsl.g:544:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalBugsDsl.g:544:45: (iv_ruleValue= ruleValue EOF )
            // InternalBugsDsl.g:545:2: iv_ruleValue= ruleValue EOF
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
    // InternalBugsDsl.g:551:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Numeric_0= ruleNumeric | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Numeric_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:557:2: ( (this_Numeric_0= ruleNumeric | this_ID_1= RULE_ID ) )
            // InternalBugsDsl.g:558:2: (this_Numeric_0= ruleNumeric | this_ID_1= RULE_ID )
            {
            // InternalBugsDsl.g:558:2: (this_Numeric_0= ruleNumeric | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_FLOAT)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBugsDsl.g:559:3: this_Numeric_0= ruleNumeric
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
                    // InternalBugsDsl.g:570:3: this_ID_1= RULE_ID
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
    // InternalBugsDsl.g:581:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalBugsDsl.g:581:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalBugsDsl.g:582:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalBugsDsl.g:588:1: ruleParameter returns [EObject current=null] : ( () ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:594:2: ( ( () ( (lv_value_1_0= ruleValue ) ) ) )
            // InternalBugsDsl.g:595:2: ( () ( (lv_value_1_0= ruleValue ) ) )
            {
            // InternalBugsDsl.g:595:2: ( () ( (lv_value_1_0= ruleValue ) ) )
            // InternalBugsDsl.g:596:3: () ( (lv_value_1_0= ruleValue ) )
            {
            // InternalBugsDsl.g:596:3: ()
            // InternalBugsDsl.g:597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalBugsDsl.g:603:3: ( (lv_value_1_0= ruleValue ) )
            // InternalBugsDsl.g:604:4: (lv_value_1_0= ruleValue )
            {
            // InternalBugsDsl.g:604:4: (lv_value_1_0= ruleValue )
            // InternalBugsDsl.g:605:5: lv_value_1_0= ruleValue
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


    // $ANTLR start "ruleDistribution"
    // InternalBugsDsl.g:626:1: ruleDistribution returns [Enumerator current=null] : ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbeta' ) | (enumLiteral_2= 'dbin' ) | (enumLiteral_3= 'dchisqr' ) | (enumLiteral_4= 'ddexp' ) | (enumLiteral_5= 'dexp' ) | (enumLiteral_6= 'df' ) | (enumLiteral_7= 'dgamma' ) | (enumLiteral_8= 'dgen.gamma' ) | (enumLiteral_9= 'dhyper' ) | (enumLiteral_10= 'dlogis' ) | (enumLiteral_11= 'dlnorm' ) | (enumLiteral_12= 'dnegbin' ) | (enumLiteral_13= 'dnchisqr' ) | (enumLiteral_14= 'dnorm' ) | (enumLiteral_15= 'dpar' ) | (enumLiteral_16= 'dpois' ) | (enumLiteral_17= 'dt' ) | (enumLiteral_18= 'dweib' ) ) ;
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
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:632:2: ( ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbeta' ) | (enumLiteral_2= 'dbin' ) | (enumLiteral_3= 'dchisqr' ) | (enumLiteral_4= 'ddexp' ) | (enumLiteral_5= 'dexp' ) | (enumLiteral_6= 'df' ) | (enumLiteral_7= 'dgamma' ) | (enumLiteral_8= 'dgen.gamma' ) | (enumLiteral_9= 'dhyper' ) | (enumLiteral_10= 'dlogis' ) | (enumLiteral_11= 'dlnorm' ) | (enumLiteral_12= 'dnegbin' ) | (enumLiteral_13= 'dnchisqr' ) | (enumLiteral_14= 'dnorm' ) | (enumLiteral_15= 'dpar' ) | (enumLiteral_16= 'dpois' ) | (enumLiteral_17= 'dt' ) | (enumLiteral_18= 'dweib' ) ) )
            // InternalBugsDsl.g:633:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbeta' ) | (enumLiteral_2= 'dbin' ) | (enumLiteral_3= 'dchisqr' ) | (enumLiteral_4= 'ddexp' ) | (enumLiteral_5= 'dexp' ) | (enumLiteral_6= 'df' ) | (enumLiteral_7= 'dgamma' ) | (enumLiteral_8= 'dgen.gamma' ) | (enumLiteral_9= 'dhyper' ) | (enumLiteral_10= 'dlogis' ) | (enumLiteral_11= 'dlnorm' ) | (enumLiteral_12= 'dnegbin' ) | (enumLiteral_13= 'dnchisqr' ) | (enumLiteral_14= 'dnorm' ) | (enumLiteral_15= 'dpar' ) | (enumLiteral_16= 'dpois' ) | (enumLiteral_17= 'dt' ) | (enumLiteral_18= 'dweib' ) )
            {
            // InternalBugsDsl.g:633:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbeta' ) | (enumLiteral_2= 'dbin' ) | (enumLiteral_3= 'dchisqr' ) | (enumLiteral_4= 'ddexp' ) | (enumLiteral_5= 'dexp' ) | (enumLiteral_6= 'df' ) | (enumLiteral_7= 'dgamma' ) | (enumLiteral_8= 'dgen.gamma' ) | (enumLiteral_9= 'dhyper' ) | (enumLiteral_10= 'dlogis' ) | (enumLiteral_11= 'dlnorm' ) | (enumLiteral_12= 'dnegbin' ) | (enumLiteral_13= 'dnchisqr' ) | (enumLiteral_14= 'dnorm' ) | (enumLiteral_15= 'dpar' ) | (enumLiteral_16= 'dpois' ) | (enumLiteral_17= 'dt' ) | (enumLiteral_18= 'dweib' ) )
            int alt9=19;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            case 27:
                {
                alt9=6;
                }
                break;
            case 28:
                {
                alt9=7;
                }
                break;
            case 29:
                {
                alt9=8;
                }
                break;
            case 30:
                {
                alt9=9;
                }
                break;
            case 31:
                {
                alt9=10;
                }
                break;
            case 32:
                {
                alt9=11;
                }
                break;
            case 33:
                {
                alt9=12;
                }
                break;
            case 34:
                {
                alt9=13;
                }
                break;
            case 35:
                {
                alt9=14;
                }
                break;
            case 36:
                {
                alt9=15;
                }
                break;
            case 37:
                {
                alt9=16;
                }
                break;
            case 38:
                {
                alt9=17;
                }
                break;
            case 39:
                {
                alt9=18;
                }
                break;
            case 40:
                {
                alt9=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBugsDsl.g:634:3: (enumLiteral_0= 'dbern' )
                    {
                    // InternalBugsDsl.g:634:3: (enumLiteral_0= 'dbern' )
                    // InternalBugsDsl.g:635:4: enumLiteral_0= 'dbern'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDbernEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDistributionAccess().getDbernEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:642:3: (enumLiteral_1= 'dbeta' )
                    {
                    // InternalBugsDsl.g:642:3: (enumLiteral_1= 'dbeta' )
                    // InternalBugsDsl.g:643:4: enumLiteral_1= 'dbeta'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDbetaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDistributionAccess().getDbetaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:650:3: (enumLiteral_2= 'dbin' )
                    {
                    // InternalBugsDsl.g:650:3: (enumLiteral_2= 'dbin' )
                    // InternalBugsDsl.g:651:4: enumLiteral_2= 'dbin'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDbinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDistributionAccess().getDbinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:658:3: (enumLiteral_3= 'dchisqr' )
                    {
                    // InternalBugsDsl.g:658:3: (enumLiteral_3= 'dchisqr' )
                    // InternalBugsDsl.g:659:4: enumLiteral_3= 'dchisqr'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDchisqrEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDistributionAccess().getDchisqrEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:666:3: (enumLiteral_4= 'ddexp' )
                    {
                    // InternalBugsDsl.g:666:3: (enumLiteral_4= 'ddexp' )
                    // InternalBugsDsl.g:667:4: enumLiteral_4= 'ddexp'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDdexpEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDistributionAccess().getDdexpEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:674:3: (enumLiteral_5= 'dexp' )
                    {
                    // InternalBugsDsl.g:674:3: (enumLiteral_5= 'dexp' )
                    // InternalBugsDsl.g:675:4: enumLiteral_5= 'dexp'
                    {
                    enumLiteral_5=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDexpEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDistributionAccess().getDexpEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:682:3: (enumLiteral_6= 'df' )
                    {
                    // InternalBugsDsl.g:682:3: (enumLiteral_6= 'df' )
                    // InternalBugsDsl.g:683:4: enumLiteral_6= 'df'
                    {
                    enumLiteral_6=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDfEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDistributionAccess().getDfEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:690:3: (enumLiteral_7= 'dgamma' )
                    {
                    // InternalBugsDsl.g:690:3: (enumLiteral_7= 'dgamma' )
                    // InternalBugsDsl.g:691:4: enumLiteral_7= 'dgamma'
                    {
                    enumLiteral_7=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDgammaEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDistributionAccess().getDgammaEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalBugsDsl.g:698:3: (enumLiteral_8= 'dgen.gamma' )
                    {
                    // InternalBugsDsl.g:698:3: (enumLiteral_8= 'dgen.gamma' )
                    // InternalBugsDsl.g:699:4: enumLiteral_8= 'dgen.gamma'
                    {
                    enumLiteral_8=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDgengammEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDistributionAccess().getDgengammEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalBugsDsl.g:706:3: (enumLiteral_9= 'dhyper' )
                    {
                    // InternalBugsDsl.g:706:3: (enumLiteral_9= 'dhyper' )
                    // InternalBugsDsl.g:707:4: enumLiteral_9= 'dhyper'
                    {
                    enumLiteral_9=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDhyperEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDistributionAccess().getDhyperEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalBugsDsl.g:714:3: (enumLiteral_10= 'dlogis' )
                    {
                    // InternalBugsDsl.g:714:3: (enumLiteral_10= 'dlogis' )
                    // InternalBugsDsl.g:715:4: enumLiteral_10= 'dlogis'
                    {
                    enumLiteral_10=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDlogisEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDistributionAccess().getDlogisEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalBugsDsl.g:722:3: (enumLiteral_11= 'dlnorm' )
                    {
                    // InternalBugsDsl.g:722:3: (enumLiteral_11= 'dlnorm' )
                    // InternalBugsDsl.g:723:4: enumLiteral_11= 'dlnorm'
                    {
                    enumLiteral_11=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDlnormEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDistributionAccess().getDlnormEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalBugsDsl.g:730:3: (enumLiteral_12= 'dnegbin' )
                    {
                    // InternalBugsDsl.g:730:3: (enumLiteral_12= 'dnegbin' )
                    // InternalBugsDsl.g:731:4: enumLiteral_12= 'dnegbin'
                    {
                    enumLiteral_12=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDnegbinEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDistributionAccess().getDnegbinEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalBugsDsl.g:738:3: (enumLiteral_13= 'dnchisqr' )
                    {
                    // InternalBugsDsl.g:738:3: (enumLiteral_13= 'dnchisqr' )
                    // InternalBugsDsl.g:739:4: enumLiteral_13= 'dnchisqr'
                    {
                    enumLiteral_13=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDnchisqrEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDistributionAccess().getDnchisqrEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalBugsDsl.g:746:3: (enumLiteral_14= 'dnorm' )
                    {
                    // InternalBugsDsl.g:746:3: (enumLiteral_14= 'dnorm' )
                    // InternalBugsDsl.g:747:4: enumLiteral_14= 'dnorm'
                    {
                    enumLiteral_14=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDnormEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDistributionAccess().getDnormEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalBugsDsl.g:754:3: (enumLiteral_15= 'dpar' )
                    {
                    // InternalBugsDsl.g:754:3: (enumLiteral_15= 'dpar' )
                    // InternalBugsDsl.g:755:4: enumLiteral_15= 'dpar'
                    {
                    enumLiteral_15=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDparEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getDistributionAccess().getDparEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalBugsDsl.g:762:3: (enumLiteral_16= 'dpois' )
                    {
                    // InternalBugsDsl.g:762:3: (enumLiteral_16= 'dpois' )
                    // InternalBugsDsl.g:763:4: enumLiteral_16= 'dpois'
                    {
                    enumLiteral_16=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDpoisEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getDistributionAccess().getDpoisEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalBugsDsl.g:770:3: (enumLiteral_17= 'dt' )
                    {
                    // InternalBugsDsl.g:770:3: (enumLiteral_17= 'dt' )
                    // InternalBugsDsl.g:771:4: enumLiteral_17= 'dt'
                    {
                    enumLiteral_17=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDtEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getDistributionAccess().getDtEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalBugsDsl.g:778:3: (enumLiteral_18= 'dweib' )
                    {
                    // InternalBugsDsl.g:778:3: (enumLiteral_18= 'dweib' )
                    // InternalBugsDsl.g:779:4: enumLiteral_18= 'dweib'
                    {
                    enumLiteral_18=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDistributionAccess().getDweibEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getDistributionAccess().getDweibEnumLiteralDeclaration_18());
                    			

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


    // $ANTLR start "ruleFunction"
    // InternalBugsDsl.g:789:1: ruleFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) ) ;
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
            // InternalBugsDsl.g:795:2: ( ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) ) )
            // InternalBugsDsl.g:796:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) )
            {
            // InternalBugsDsl.g:796:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt10=1;
                }
                break;
            case 42:
                {
                alt10=2;
                }
                break;
            case 43:
                {
                alt10=3;
                }
                break;
            case 44:
                {
                alt10=4;
                }
                break;
            case 45:
                {
                alt10=5;
                }
                break;
            case 46:
                {
                alt10=6;
                }
                break;
            case 47:
                {
                alt10=7;
                }
                break;
            case 48:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBugsDsl.g:797:3: (enumLiteral_0= 'acos' )
                    {
                    // InternalBugsDsl.g:797:3: (enumLiteral_0= 'acos' )
                    // InternalBugsDsl.g:798:4: enumLiteral_0= 'acos'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAcosEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFunctionAccess().getAcosEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:805:3: (enumLiteral_1= 'acosh' )
                    {
                    // InternalBugsDsl.g:805:3: (enumLiteral_1= 'acosh' )
                    // InternalBugsDsl.g:806:4: enumLiteral_1= 'acosh'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAcoshEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFunctionAccess().getAcoshEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:813:3: (enumLiteral_2= 'asin' )
                    {
                    // InternalBugsDsl.g:813:3: (enumLiteral_2= 'asin' )
                    // InternalBugsDsl.g:814:4: enumLiteral_2= 'asin'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAsinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFunctionAccess().getAsinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:821:3: (enumLiteral_3= 'asinh' )
                    {
                    // InternalBugsDsl.g:821:3: (enumLiteral_3= 'asinh' )
                    // InternalBugsDsl.g:822:4: enumLiteral_3= 'asinh'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAsinhEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFunctionAccess().getAsinhEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:829:3: (enumLiteral_4= 'atan' )
                    {
                    // InternalBugsDsl.g:829:3: (enumLiteral_4= 'atan' )
                    // InternalBugsDsl.g:830:4: enumLiteral_4= 'atan'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getAtanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFunctionAccess().getAtanEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:837:3: (enumLiteral_5= 'log' )
                    {
                    // InternalBugsDsl.g:837:3: (enumLiteral_5= 'log' )
                    // InternalBugsDsl.g:838:4: enumLiteral_5= 'log'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getLogEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFunctionAccess().getLogEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:845:3: (enumLiteral_6= 'exp' )
                    {
                    // InternalBugsDsl.g:845:3: (enumLiteral_6= 'exp' )
                    // InternalBugsDsl.g:846:4: enumLiteral_6= 'exp'
                    {
                    enumLiteral_6=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getEpEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFunctionAccess().getEpEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:853:3: (enumLiteral_7= 'c' )
                    {
                    // InternalBugsDsl.g:853:3: (enumLiteral_7= 'c' )
                    // InternalBugsDsl.g:854:4: enumLiteral_7= 'c'
                    {
                    enumLiteral_7=(Token)match(input,48,FOLLOW_2); 

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


    // $ANTLR start "ruleRelationType"
    // InternalBugsDsl.g:864:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= '~' ) | (enumLiteral_1= '<-' ) | (enumLiteral_2= '=' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:870:2: ( ( (enumLiteral_0= '~' ) | (enumLiteral_1= '<-' ) | (enumLiteral_2= '=' ) ) )
            // InternalBugsDsl.g:871:2: ( (enumLiteral_0= '~' ) | (enumLiteral_1= '<-' ) | (enumLiteral_2= '=' ) )
            {
            // InternalBugsDsl.g:871:2: ( (enumLiteral_0= '~' ) | (enumLiteral_1= '<-' ) | (enumLiteral_2= '=' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt11=1;
                }
                break;
            case 50:
                {
                alt11=2;
                }
                break;
            case 51:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBugsDsl.g:872:3: (enumLiteral_0= '~' )
                    {
                    // InternalBugsDsl.g:872:3: (enumLiteral_0= '~' )
                    // InternalBugsDsl.g:873:4: enumLiteral_0= '~'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getRelationTypeAccess().getSTOCHASTICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getSTOCHASTICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:880:3: (enumLiteral_1= '<-' )
                    {
                    // InternalBugsDsl.g:880:3: (enumLiteral_1= '<-' )
                    // InternalBugsDsl.g:881:4: enumLiteral_1= '<-'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRelationTypeAccess().getDETERMIN1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getDETERMIN1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:888:3: (enumLiteral_2= '=' )
                    {
                    // InternalBugsDsl.g:888:3: (enumLiteral_2= '=' )
                    // InternalBugsDsl.g:889:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRelationTypeAccess().getDETERMIN2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getDETERMIN2EnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleRelationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001FFFFFFC20000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000070L});

}
