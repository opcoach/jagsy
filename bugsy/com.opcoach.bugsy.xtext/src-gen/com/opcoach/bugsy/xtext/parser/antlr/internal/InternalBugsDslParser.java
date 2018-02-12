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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBugsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'for'", "'('", "'in'", "':'", "')'", "'.'", "'E'", "'+'", "'-'", "'['", "']'", "'~'", "'()'", "','", "'<-'", "'='", "'*'", "'/'", "'dbern'", "'dbin'", "'dchisqr'", "'ddexp'", "'dexp'", "'df'", "'dgen.gamma'", "'dhyper'", "'dlogis'", "'dlnorm'", "'dnegbin'", "'dnchisqr'", "'dpar'", "'dpois'", "'dt'", "'dweib'", "'dnorm'", "'dunif'", "'dbeta'", "'dgamma'", "'acos'", "'acosh'", "'asin'", "'asinh'", "'atan'", "'log'", "'exp'", "'c'", "'mean'", "'sqrt'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBugsModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBugsModel=ruleBugsModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBugsModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBugsModelAccess().getBugsModelAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBugsModelAccess().getModelKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBugsModelAccess().getLeftCurlyBracketKeyword_2());
              		
            }
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
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBugsModelAccess().getInstructionsInstructionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBugsModelAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBugsDsl.g:137:3: this_For_0= ruleFor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInstructionAccess().getForParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_For_0=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_For_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:146:3: this_Relation_1= ruleRelation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInstructionAccess().getRelationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Relation_1=ruleRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Relation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForAccess().getForAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBugsDsl.g:188:3: ( (lv_variable_3_0= RULE_ID ) )
            // InternalBugsDsl.g:189:4: (lv_variable_3_0= RULE_ID )
            {
            // InternalBugsDsl.g:189:4: (lv_variable_3_0= RULE_ID )
            // InternalBugsDsl.g:190:5: lv_variable_3_0= RULE_ID
            {
            lv_variable_3_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variable_3_0, grammarAccess.getForAccess().getVariableIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForAccess().getInKeyword_4());
              		
            }
            // InternalBugsDsl.g:210:3: ( (lv_low_5_0= RULE_INT ) )
            // InternalBugsDsl.g:211:4: (lv_low_5_0= RULE_INT )
            {
            // InternalBugsDsl.g:211:4: (lv_low_5_0= RULE_INT )
            // InternalBugsDsl.g:212:5: lv_low_5_0= RULE_INT
            {
            lv_low_5_0=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_low_5_0, grammarAccess.getForAccess().getLowINTTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_6=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForAccess().getColonKeyword_6());
              		
            }
            // InternalBugsDsl.g:232:3: ( (lv_high_7_0= RULE_ID ) )
            // InternalBugsDsl.g:233:4: (lv_high_7_0= RULE_ID )
            {
            // InternalBugsDsl.g:233:4: (lv_high_7_0= RULE_ID )
            // InternalBugsDsl.g:234:5: lv_high_7_0= RULE_ID
            {
            lv_high_7_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_high_7_0, grammarAccess.getForAccess().getHighIDTerminalRuleCall_7_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_8=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForAccess().getRightParenthesisKeyword_8());
              		
            }
            otherlv_9=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_9());
              		
            }
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
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForAccess().getContentsInstructionParserRuleCall_10_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_contents_10_0=ruleInstruction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getForAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumeric=ruleNumeric();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumeric.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBugsDsl.g:292:1: ruleNumeric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) ;
    public final AntlrDatatypeRuleToken ruleNumeric() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_Float_1 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:298:2: ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) )
            // InternalBugsDsl.g:299:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat )
            {
            // InternalBugsDsl.g:299:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==19) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==RULE_ID||(LA4_1>=13 && LA4_1<=14)||LA4_1==18||(LA4_1>=21 && LA4_1<=22)||LA4_1==27||(LA4_1>=30 && LA4_1<=31)) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBugsDsl.g:300:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getNumericAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:308:3: this_Float_1= ruleFloat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericAccess().getFloatParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Float_1=ruleFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Float_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumeric"


    // $ANTLR start "entryRuleFloat"
    // InternalBugsDsl.g:322:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalBugsDsl.g:322:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalBugsDsl.g:323:2: iv_ruleFloat= ruleFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalBugsDsl.g:329:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:335:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? ) )
            // InternalBugsDsl.g:336:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? )
            {
            // InternalBugsDsl.g:336:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? )
            // InternalBugsDsl.g:337:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2());
              		
            }
            // InternalBugsDsl.g:356:3: (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBugsDsl.g:357:4: kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloatAccess().getEKeyword_3_0());
                      			
                    }
                    // InternalBugsDsl.g:362:4: (kw= '+' | kw= '-' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==21) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==22) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalBugsDsl.g:363:5: kw= '+'
                            {
                            kw=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFloatAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalBugsDsl.g:369:5: kw= '-'
                            {
                            kw=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFloatAccess().getHyphenMinusKeyword_3_1_1());
                              				
                            }

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_6, grammarAccess.getFloatAccess().getINTTerminalRuleCall_3_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleValue"
    // InternalBugsDsl.g:387:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalBugsDsl.g:387:46: (iv_ruleValue= ruleValue EOF )
            // InternalBugsDsl.g:388:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBugsDsl.g:394:1: ruleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:400:2: ( ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) ) )
            // InternalBugsDsl.g:401:2: ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) )
            {
            // InternalBugsDsl.g:401:2: ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBugsDsl.g:402:3: ( () ( (lv_value_1_0= ruleNumeric ) ) )
                    {
                    // InternalBugsDsl.g:402:3: ( () ( (lv_value_1_0= ruleNumeric ) ) )
                    // InternalBugsDsl.g:403:4: () ( (lv_value_1_0= ruleNumeric ) )
                    {
                    // InternalBugsDsl.g:403:4: ()
                    // InternalBugsDsl.g:404:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getValueAccess().getValueAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBugsDsl.g:410:4: ( (lv_value_1_0= ruleNumeric ) )
                    // InternalBugsDsl.g:411:5: (lv_value_1_0= ruleNumeric )
                    {
                    // InternalBugsDsl.g:411:5: (lv_value_1_0= ruleNumeric )
                    // InternalBugsDsl.g:412:6: lv_value_1_0= ruleNumeric
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValueAccess().getValueNumericParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleNumeric();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getValueRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"com.opcoach.bugsy.xtext.BugsDsl.Numeric");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:431:3: ( (lv_id_2_0= ruleArrayID ) )
                    {
                    // InternalBugsDsl.g:431:3: ( (lv_id_2_0= ruleArrayID ) )
                    // InternalBugsDsl.g:432:4: (lv_id_2_0= ruleArrayID )
                    {
                    // InternalBugsDsl.g:432:4: (lv_id_2_0= ruleArrayID )
                    // InternalBugsDsl.g:433:5: lv_id_2_0= ruleArrayID
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getValueAccess().getIdArrayIDParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_id_2_0=ruleArrayID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getValueRule());
                      					}
                      					set(
                      						current,
                      						"id",
                      						lv_id_2_0,
                      						"com.opcoach.bugsy.xtext.BugsDsl.ArrayID");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArrayID"
    // InternalBugsDsl.g:454:1: entryRuleArrayID returns [EObject current=null] : iv_ruleArrayID= ruleArrayID EOF ;
    public final EObject entryRuleArrayID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayID = null;


        try {
            // InternalBugsDsl.g:454:48: (iv_ruleArrayID= ruleArrayID EOF )
            // InternalBugsDsl.g:455:2: iv_ruleArrayID= ruleArrayID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayID=ruleArrayID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayID; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayID"


    // $ANTLR start "ruleArrayID"
    // InternalBugsDsl.g:461:1: ruleArrayID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_ID ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleArrayID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:467:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_ID ) ) otherlv_3= ']' )? ) )
            // InternalBugsDsl.g:468:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_ID ) ) otherlv_3= ']' )? )
            {
            // InternalBugsDsl.g:468:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_ID ) ) otherlv_3= ']' )? )
            // InternalBugsDsl.g:469:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_ID ) ) otherlv_3= ']' )?
            {
            // InternalBugsDsl.g:469:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBugsDsl.g:470:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBugsDsl.g:470:4: (lv_name_0_0= RULE_ID )
            // InternalBugsDsl.g:471:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getArrayIDAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArrayIDRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.ID");
              				
            }

            }


            }

            // InternalBugsDsl.g:487:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_ID ) ) otherlv_3= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBugsDsl.g:488:4: otherlv_1= '[' ( (lv_index_2_0= RULE_ID ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArrayIDAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalBugsDsl.g:492:4: ( (lv_index_2_0= RULE_ID ) )
                    // InternalBugsDsl.g:493:5: (lv_index_2_0= RULE_ID )
                    {
                    // InternalBugsDsl.g:493:5: (lv_index_2_0= RULE_ID )
                    // InternalBugsDsl.g:494:6: lv_index_2_0= RULE_ID
                    {
                    lv_index_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_index_2_0, grammarAccess.getArrayIDAccess().getIndexIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArrayIDRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"index",
                      							lv_index_2_0,
                      							"com.opcoach.bugsy.xtext.BugsDsl.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayIDAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayID"


    // $ANTLR start "entryRuleRelation"
    // InternalBugsDsl.g:519:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalBugsDsl.g:519:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalBugsDsl.g:520:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBugsDsl.g:526:1: ruleRelation returns [EObject current=null] : (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_StochasticRelation_0 = null;

        EObject this_DeterministicRelation_1 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:532:2: ( (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation ) )
            // InternalBugsDsl.g:533:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )
            {
            // InternalBugsDsl.g:533:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==RULE_ID) ) {
                        int LA9_5 = input.LA(4);

                        if ( (LA9_5==24) ) {
                            int LA9_6 = input.LA(5);

                            if ( (LA9_6==25) ) {
                                alt9=1;
                            }
                            else if ( ((LA9_6>=28 && LA9_6<=29)) ) {
                                alt9=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 25:
                    {
                    alt9=1;
                    }
                    break;
                case 28:
                case 29:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBugsDsl.g:534:3: this_StochasticRelation_0= ruleStochasticRelation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRelationAccess().getStochasticRelationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StochasticRelation_0=ruleStochasticRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StochasticRelation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:543:3: this_DeterministicRelation_1= ruleDeterministicRelation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRelationAccess().getDeterministicRelationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DeterministicRelation_1=ruleDeterministicRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DeterministicRelation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleStochasticRelation"
    // InternalBugsDsl.g:555:1: entryRuleStochasticRelation returns [EObject current=null] : iv_ruleStochasticRelation= ruleStochasticRelation EOF ;
    public final EObject entryRuleStochasticRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStochasticRelation = null;


        try {
            // InternalBugsDsl.g:555:59: (iv_ruleStochasticRelation= ruleStochasticRelation EOF )
            // InternalBugsDsl.g:556:2: iv_ruleStochasticRelation= ruleStochasticRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStochasticRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStochasticRelation=ruleStochasticRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStochasticRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBugsDsl.g:562:1: ruleStochasticRelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? ) ;
    public final EObject ruleStochasticRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_name_1_0 = null;

        Enumerator lv_distrib_3_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:568:2: ( ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? ) )
            // InternalBugsDsl.g:569:2: ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? )
            {
            // InternalBugsDsl.g:569:2: ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? )
            // InternalBugsDsl.g:570:3: () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )?
            {
            // InternalBugsDsl.g:570:3: ()
            // InternalBugsDsl.g:571:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStochasticRelationAccess().getStochasticRelationAction_0(),
              					current);
              			
            }

            }

            // InternalBugsDsl.g:577:3: ( (lv_name_1_0= ruleArrayID ) )
            // InternalBugsDsl.g:578:4: (lv_name_1_0= ruleArrayID )
            {
            // InternalBugsDsl.g:578:4: (lv_name_1_0= ruleArrayID )
            // InternalBugsDsl.g:579:5: lv_name_1_0= ruleArrayID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochasticRelationAccess().getNameArrayIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleArrayID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.ArrayID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStochasticRelationAccess().getTildeKeyword_2());
              		
            }
            // InternalBugsDsl.g:600:3: ( (lv_distrib_3_0= ruleDensity ) )
            // InternalBugsDsl.g:601:4: (lv_distrib_3_0= ruleDensity )
            {
            // InternalBugsDsl.g:601:4: (lv_distrib_3_0= ruleDensity )
            // InternalBugsDsl.g:602:5: lv_distrib_3_0= ruleDensity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochasticRelationAccess().getDistribDensityEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_distrib_3_0=ruleDensity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
              					}
              					set(
              						current,
              						"distrib",
              						lv_distrib_3_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.Density");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBugsDsl.g:619:3: (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalBugsDsl.g:620:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStochasticRelationAccess().getLeftParenthesisRightParenthesisKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:625:4: (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' )
                    {
                    // InternalBugsDsl.g:625:4: (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' )
                    // InternalBugsDsl.g:626:5: otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getStochasticRelationAccess().getLeftParenthesisKeyword_4_1_0());
                      				
                    }
                    // InternalBugsDsl.g:630:5: ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* )
                    // InternalBugsDsl.g:631:6: ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )*
                    {
                    // InternalBugsDsl.g:631:6: ( (lv_params_6_0= ruleExpression ) )
                    // InternalBugsDsl.g:632:7: (lv_params_6_0= ruleExpression )
                    {
                    // InternalBugsDsl.g:632:7: (lv_params_6_0= ruleExpression )
                    // InternalBugsDsl.g:633:8: lv_params_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsExpressionParserRuleCall_4_1_1_0_0());
                      							
                    }
                    pushFollow(FOLLOW_20);
                    lv_params_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
                      								}
                      								add(
                      									current,
                      									"params",
                      									lv_params_6_0,
                      									"com.opcoach.bugsy.xtext.BugsDsl.Expression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalBugsDsl.g:650:6: (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBugsDsl.g:651:7: otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getStochasticRelationAccess().getCommaKeyword_4_1_1_1_0());
                    	      						
                    	    }
                    	    // InternalBugsDsl.g:655:7: ( (lv_params_8_0= ruleExpression ) )
                    	    // InternalBugsDsl.g:656:8: (lv_params_8_0= ruleExpression )
                    	    {
                    	    // InternalBugsDsl.g:656:8: (lv_params_8_0= ruleExpression )
                    	    // InternalBugsDsl.g:657:9: lv_params_8_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      									newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsExpressionParserRuleCall_4_1_1_1_1_0());
                    	      								
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_params_8_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      									if (current==null) {
                    	      										current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
                    	      									}
                    	      									add(
                    	      										current,
                    	      										"params",
                    	      										lv_params_8_0,
                    	      										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
                    	      									afterParserOrEnumRuleCall();
                    	      								
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getStochasticRelationAccess().getRightParenthesisKeyword_4_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStochasticRelation"


    // $ANTLR start "entryRuleDeterministicRelation"
    // InternalBugsDsl.g:686:1: entryRuleDeterministicRelation returns [EObject current=null] : iv_ruleDeterministicRelation= ruleDeterministicRelation EOF ;
    public final EObject entryRuleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterministicRelation = null;


        try {
            // InternalBugsDsl.g:686:62: (iv_ruleDeterministicRelation= ruleDeterministicRelation EOF )
            // InternalBugsDsl.g:687:2: iv_ruleDeterministicRelation= ruleDeterministicRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeterministicRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeterministicRelation=ruleDeterministicRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeterministicRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBugsDsl.g:693:1: ruleDeterministicRelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) | ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ) ) ) ) ;
    public final EObject ruleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_name_1_0 = null;

        EObject lv_expressions_4_0 = null;

        Enumerator lv_distrib_6_0 = null;

        Enumerator lv_function_7_0 = null;

        EObject lv_params_10_0 = null;

        EObject lv_params_12_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:699:2: ( ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) | ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ) ) ) ) )
            // InternalBugsDsl.g:700:2: ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) | ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ) ) ) )
            {
            // InternalBugsDsl.g:700:2: ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) | ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ) ) ) )
            // InternalBugsDsl.g:701:3: () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) | ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ) ) )
            {
            // InternalBugsDsl.g:701:3: ()
            // InternalBugsDsl.g:702:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDeterministicRelationAccess().getDeterministicRelationAction_0(),
              					current);
              			
            }

            }

            // InternalBugsDsl.g:708:3: ( (lv_name_1_0= ruleArrayID ) )
            // InternalBugsDsl.g:709:4: (lv_name_1_0= ruleArrayID )
            {
            // InternalBugsDsl.g:709:4: (lv_name_1_0= ruleArrayID )
            // InternalBugsDsl.g:710:5: lv_name_1_0= ruleArrayID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeterministicRelationAccess().getNameArrayIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_name_1_0=ruleArrayID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.ArrayID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBugsDsl.g:727:3: (otherlv_2= '<-' | otherlv_3= '=' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBugsDsl.g:728:4: otherlv_2= '<-'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDeterministicRelationAccess().getLessThanSignHyphenMinusKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:733:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDeterministicRelationAccess().getEqualsSignKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalBugsDsl.g:738:3: ( ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) | ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ) ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalBugsDsl.g:739:4: ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) )
                    {
                    // InternalBugsDsl.g:739:4: ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) )
                    // InternalBugsDsl.g:740:5: ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression )
                    {
                    // InternalBugsDsl.g:744:5: (lv_expressions_4_0= ruleExpression )
                    // InternalBugsDsl.g:745:6: lv_expressions_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeterministicRelationAccess().getExpressionsExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expressions_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
                      						}
                      						add(
                      							current,
                      							"expressions",
                      							lv_expressions_4_0,
                      							"com.opcoach.bugsy.xtext.BugsDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:763:4: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ) )
                    {
                    // InternalBugsDsl.g:763:4: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ) )
                    // InternalBugsDsl.g:764:5: ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) )
                    {
                    // InternalBugsDsl.g:764:5: ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) )
                    // InternalBugsDsl.g:765:6: ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) )
                    {
                    // InternalBugsDsl.g:765:6: ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) )
                    // InternalBugsDsl.g:766:7: ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* )
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0());
                    // InternalBugsDsl.g:769:7: ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* )
                    // InternalBugsDsl.g:770:8: ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )*
                    {
                    // InternalBugsDsl.g:770:8: ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( LA13_0 >= 32 && LA13_0 <= 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0(), 0) ) {
                            alt13=1;
                        }
                        else if ( LA13_0 >= 52 && LA13_0 <= 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0(), 1) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBugsDsl.g:771:6: ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) )
                    	    {
                    	    // InternalBugsDsl.g:771:6: ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) )
                    	    // InternalBugsDsl.g:772:7: {...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleDeterministicRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0(), 0)");
                    	    }
                    	    // InternalBugsDsl.g:772:124: ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) )
                    	    // InternalBugsDsl.g:773:8: ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0(), 0);
                    	    // InternalBugsDsl.g:776:11: ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) )
                    	    // InternalBugsDsl.g:776:12: {...}? => ( (lv_distrib_6_0= ruleDistribution ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleDeterministicRelation", "true");
                    	    }
                    	    // InternalBugsDsl.g:776:21: ( (lv_distrib_6_0= ruleDistribution ) )
                    	    // InternalBugsDsl.g:776:22: (lv_distrib_6_0= ruleDistribution )
                    	    {
                    	    // InternalBugsDsl.g:776:22: (lv_distrib_6_0= ruleDistribution )
                    	    // InternalBugsDsl.g:777:12: lv_distrib_6_0= ruleDistribution
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      												newCompositeNode(grammarAccess.getDeterministicRelationAccess().getDistribDistributionEnumRuleCall_3_1_0_0_0());
                    	      											
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_distrib_6_0=ruleDistribution();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
                    	      												}
                    	      												set(
                    	      													current,
                    	      													"distrib",
                    	      													lv_distrib_6_0,
                    	      													"com.opcoach.bugsy.xtext.BugsDsl.Distribution");
                    	      												afterParserOrEnumRuleCall();
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBugsDsl.g:799:6: ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) )
                    	    {
                    	    // InternalBugsDsl.g:799:6: ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) )
                    	    // InternalBugsDsl.g:800:7: {...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleDeterministicRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0(), 1)");
                    	    }
                    	    // InternalBugsDsl.g:800:124: ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) )
                    	    // InternalBugsDsl.g:801:8: ({...}? => ( (lv_function_7_0= ruleFunction ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0(), 1);
                    	    // InternalBugsDsl.g:804:11: ({...}? => ( (lv_function_7_0= ruleFunction ) ) )
                    	    // InternalBugsDsl.g:804:12: {...}? => ( (lv_function_7_0= ruleFunction ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleDeterministicRelation", "true");
                    	    }
                    	    // InternalBugsDsl.g:804:21: ( (lv_function_7_0= ruleFunction ) )
                    	    // InternalBugsDsl.g:804:22: (lv_function_7_0= ruleFunction )
                    	    {
                    	    // InternalBugsDsl.g:804:22: (lv_function_7_0= ruleFunction )
                    	    // InternalBugsDsl.g:805:12: lv_function_7_0= ruleFunction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      												newCompositeNode(grammarAccess.getDeterministicRelationAccess().getFunctionFunctionEnumRuleCall_3_1_0_1_0());
                    	      											
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_function_7_0=ruleFunction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
                    	      												}
                    	      												set(
                    	      													current,
                    	      													"function",
                    	      													lv_function_7_0,
                    	      													"com.opcoach.bugsy.xtext.BugsDsl.Function");
                    	      												afterParserOrEnumRuleCall();
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getDeterministicRelationAccess().getUnorderedGroup_3_1_0());

                    }

                    // InternalBugsDsl.g:834:5: (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==26) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==15) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalBugsDsl.g:835:6: otherlv_8= '()'
                            {
                            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getDeterministicRelationAccess().getLeftParenthesisRightParenthesisKeyword_3_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalBugsDsl.g:840:6: (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? )
                            {
                            // InternalBugsDsl.g:840:6: (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? )
                            // InternalBugsDsl.g:841:7: otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )?
                            {
                            otherlv_9=(Token)match(input,15,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getDeterministicRelationAccess().getLeftParenthesisKeyword_3_1_1_1_0());
                              						
                            }
                            // InternalBugsDsl.g:845:7: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )?
                            int alt15=2;
                            alt15 = dfa15.predict(input);
                            switch (alt15) {
                                case 1 :
                                    // InternalBugsDsl.g:846:8: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')'
                                    {
                                    // InternalBugsDsl.g:846:8: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) )
                                    // InternalBugsDsl.g:847:9: ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) )
                                    {
                                    // InternalBugsDsl.g:853:9: ( (lv_params_10_0= ruleExpression ) )
                                    // InternalBugsDsl.g:854:10: (lv_params_10_0= ruleExpression )
                                    {
                                    // InternalBugsDsl.g:854:10: (lv_params_10_0= ruleExpression )
                                    // InternalBugsDsl.g:855:11: lv_params_10_0= ruleExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      											newCompositeNode(grammarAccess.getDeterministicRelationAccess().getParamsExpressionParserRuleCall_3_1_1_1_1_0_0_0());
                                      										
                                    }
                                    pushFollow(FOLLOW_20);
                                    lv_params_10_0=ruleExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      											if (current==null) {
                                      												current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
                                      											}
                                      											add(
                                      												current,
                                      												"params",
                                      												lv_params_10_0,
                                      												"com.opcoach.bugsy.xtext.BugsDsl.Expression");
                                      											afterParserOrEnumRuleCall();
                                      										
                                    }

                                    }


                                    }


                                    }

                                    // InternalBugsDsl.g:873:8: (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )*
                                    loop14:
                                    do {
                                        int alt14=2;
                                        int LA14_0 = input.LA(1);

                                        if ( (LA14_0==27) ) {
                                            alt14=1;
                                        }


                                        switch (alt14) {
                                    	case 1 :
                                    	    // InternalBugsDsl.g:874:9: otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) )
                                    	    {
                                    	    otherlv_11=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      									newLeafNode(otherlv_11, grammarAccess.getDeterministicRelationAccess().getCommaKeyword_3_1_1_1_1_1_0());
                                    	      								
                                    	    }
                                    	    // InternalBugsDsl.g:878:9: ( (lv_params_12_0= ruleExpression ) )
                                    	    // InternalBugsDsl.g:879:10: (lv_params_12_0= ruleExpression )
                                    	    {
                                    	    // InternalBugsDsl.g:879:10: (lv_params_12_0= ruleExpression )
                                    	    // InternalBugsDsl.g:880:11: lv_params_12_0= ruleExpression
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      											newCompositeNode(grammarAccess.getDeterministicRelationAccess().getParamsExpressionParserRuleCall_3_1_1_1_1_1_1_0());
                                    	      										
                                    	    }
                                    	    pushFollow(FOLLOW_20);
                                    	    lv_params_12_0=ruleExpression();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      											if (current==null) {
                                    	      												current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
                                    	      											}
                                    	      											add(
                                    	      												current,
                                    	      												"params",
                                    	      												lv_params_12_0,
                                    	      												"com.opcoach.bugsy.xtext.BugsDsl.Expression");
                                    	      											afterParserOrEnumRuleCall();
                                    	      										
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop14;
                                        }
                                    } while (true);

                                    otherlv_13=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_13, grammarAccess.getDeterministicRelationAccess().getRightParenthesisKeyword_3_1_1_1_1_2());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDeterministicRelation"


    // $ANTLR start "entryRuleOperator"
    // InternalBugsDsl.g:911:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalBugsDsl.g:911:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalBugsDsl.g:912:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalBugsDsl.g:918:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:924:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalBugsDsl.g:925:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalBugsDsl.g:925:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt18=1;
                }
                break;
            case 22:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            case 31:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalBugsDsl.g:926:3: kw= '+'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:932:3: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:938:3: kw= '*'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:944:3: kw= '/'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleExpression"
    // InternalBugsDsl.g:953:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBugsDsl.g:953:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalBugsDsl.g:954:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalBugsDsl.g:960:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:966:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalBugsDsl.g:967:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalBugsDsl.g:967:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalBugsDsl.g:968:3: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBugsDsl.g:976:3: ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=21 && LA19_0<=22)||(LA19_0>=30 && LA19_0<=31)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBugsDsl.g:977:4: () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalBugsDsl.g:977:4: ()
            	    // InternalBugsDsl.g:978:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBugsDsl.g:984:4: ( (lv_op_2_0= ruleOperator ) )
            	    // InternalBugsDsl.g:985:5: (lv_op_2_0= ruleOperator )
            	    {
            	    // InternalBugsDsl.g:985:5: (lv_op_2_0= ruleOperator )
            	    // InternalBugsDsl.g:986:6: lv_op_2_0= ruleOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_op_2_0=ruleOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"com.opcoach.bugsy.xtext.BugsDsl.Operator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalBugsDsl.g:1003:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalBugsDsl.g:1004:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalBugsDsl.g:1004:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalBugsDsl.g:1005:6: lv_right_3_0= ruleTerminalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleTerminalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.opcoach.bugsy.xtext.BugsDsl.TerminalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalBugsDsl.g:1027:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalBugsDsl.g:1027:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalBugsDsl.g:1028:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalBugsDsl.g:1034:1: ruleTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:1040:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalBugsDsl.g:1041:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalBugsDsl.g:1041:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalBugsDsl.g:1042:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalBugsDsl.g:1042:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalBugsDsl.g:1043:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1061:3: ( (lv_value_3_0= ruleValue ) )
                    {
                    // InternalBugsDsl.g:1061:3: ( (lv_value_3_0= ruleValue ) )
                    // InternalBugsDsl.g:1062:4: (lv_value_3_0= ruleValue )
                    {
                    // InternalBugsDsl.g:1062:4: (lv_value_3_0= ruleValue )
                    // InternalBugsDsl.g:1063:5: lv_value_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueValueParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_3_0,
                      						"com.opcoach.bugsy.xtext.BugsDsl.Value");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleDistribution"
    // InternalBugsDsl.g:1084:1: ruleDistribution returns [Enumerator current=null] : ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) ) ;
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


        	enterRule();

        try {
            // InternalBugsDsl.g:1090:2: ( ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) ) )
            // InternalBugsDsl.g:1091:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) )
            {
            // InternalBugsDsl.g:1091:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) )
            int alt21=16;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt21=1;
                }
                break;
            case 33:
                {
                alt21=2;
                }
                break;
            case 34:
                {
                alt21=3;
                }
                break;
            case 35:
                {
                alt21=4;
                }
                break;
            case 36:
                {
                alt21=5;
                }
                break;
            case 37:
                {
                alt21=6;
                }
                break;
            case 38:
                {
                alt21=7;
                }
                break;
            case 39:
                {
                alt21=8;
                }
                break;
            case 40:
                {
                alt21=9;
                }
                break;
            case 41:
                {
                alt21=10;
                }
                break;
            case 42:
                {
                alt21=11;
                }
                break;
            case 43:
                {
                alt21=12;
                }
                break;
            case 44:
                {
                alt21=13;
                }
                break;
            case 45:
                {
                alt21=14;
                }
                break;
            case 46:
                {
                alt21=15;
                }
                break;
            case 47:
                {
                alt21=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalBugsDsl.g:1092:3: (enumLiteral_0= 'dbern' )
                    {
                    // InternalBugsDsl.g:1092:3: (enumLiteral_0= 'dbern' )
                    // InternalBugsDsl.g:1093:4: enumLiteral_0= 'dbern'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDbernEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDistributionAccess().getDbernEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1100:3: (enumLiteral_1= 'dbin' )
                    {
                    // InternalBugsDsl.g:1100:3: (enumLiteral_1= 'dbin' )
                    // InternalBugsDsl.g:1101:4: enumLiteral_1= 'dbin'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDbinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDistributionAccess().getDbinEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1108:3: (enumLiteral_2= 'dchisqr' )
                    {
                    // InternalBugsDsl.g:1108:3: (enumLiteral_2= 'dchisqr' )
                    // InternalBugsDsl.g:1109:4: enumLiteral_2= 'dchisqr'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDchisqrEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDistributionAccess().getDchisqrEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1116:3: (enumLiteral_3= 'ddexp' )
                    {
                    // InternalBugsDsl.g:1116:3: (enumLiteral_3= 'ddexp' )
                    // InternalBugsDsl.g:1117:4: enumLiteral_3= 'ddexp'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDdexpEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDistributionAccess().getDdexpEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:1124:3: (enumLiteral_4= 'dexp' )
                    {
                    // InternalBugsDsl.g:1124:3: (enumLiteral_4= 'dexp' )
                    // InternalBugsDsl.g:1125:4: enumLiteral_4= 'dexp'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDexpEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDistributionAccess().getDexpEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:1132:3: (enumLiteral_5= 'df' )
                    {
                    // InternalBugsDsl.g:1132:3: (enumLiteral_5= 'df' )
                    // InternalBugsDsl.g:1133:4: enumLiteral_5= 'df'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDfEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDistributionAccess().getDfEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:1140:3: (enumLiteral_6= 'dgen.gamma' )
                    {
                    // InternalBugsDsl.g:1140:3: (enumLiteral_6= 'dgen.gamma' )
                    // InternalBugsDsl.g:1141:4: enumLiteral_6= 'dgen.gamma'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDgengammEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDistributionAccess().getDgengammEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:1148:3: (enumLiteral_7= 'dhyper' )
                    {
                    // InternalBugsDsl.g:1148:3: (enumLiteral_7= 'dhyper' )
                    // InternalBugsDsl.g:1149:4: enumLiteral_7= 'dhyper'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDhyperEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDistributionAccess().getDhyperEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalBugsDsl.g:1156:3: (enumLiteral_8= 'dlogis' )
                    {
                    // InternalBugsDsl.g:1156:3: (enumLiteral_8= 'dlogis' )
                    // InternalBugsDsl.g:1157:4: enumLiteral_8= 'dlogis'
                    {
                    enumLiteral_8=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDlogisEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDistributionAccess().getDlogisEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalBugsDsl.g:1164:3: (enumLiteral_9= 'dlnorm' )
                    {
                    // InternalBugsDsl.g:1164:3: (enumLiteral_9= 'dlnorm' )
                    // InternalBugsDsl.g:1165:4: enumLiteral_9= 'dlnorm'
                    {
                    enumLiteral_9=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDlnormEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDistributionAccess().getDlnormEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalBugsDsl.g:1172:3: (enumLiteral_10= 'dnegbin' )
                    {
                    // InternalBugsDsl.g:1172:3: (enumLiteral_10= 'dnegbin' )
                    // InternalBugsDsl.g:1173:4: enumLiteral_10= 'dnegbin'
                    {
                    enumLiteral_10=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDnegbinEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getDistributionAccess().getDnegbinEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalBugsDsl.g:1180:3: (enumLiteral_11= 'dnchisqr' )
                    {
                    // InternalBugsDsl.g:1180:3: (enumLiteral_11= 'dnchisqr' )
                    // InternalBugsDsl.g:1181:4: enumLiteral_11= 'dnchisqr'
                    {
                    enumLiteral_11=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDnchisqrEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getDistributionAccess().getDnchisqrEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalBugsDsl.g:1188:3: (enumLiteral_12= 'dpar' )
                    {
                    // InternalBugsDsl.g:1188:3: (enumLiteral_12= 'dpar' )
                    // InternalBugsDsl.g:1189:4: enumLiteral_12= 'dpar'
                    {
                    enumLiteral_12=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDparEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getDistributionAccess().getDparEnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalBugsDsl.g:1196:3: (enumLiteral_13= 'dpois' )
                    {
                    // InternalBugsDsl.g:1196:3: (enumLiteral_13= 'dpois' )
                    // InternalBugsDsl.g:1197:4: enumLiteral_13= 'dpois'
                    {
                    enumLiteral_13=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDpoisEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getDistributionAccess().getDpoisEnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalBugsDsl.g:1204:3: (enumLiteral_14= 'dt' )
                    {
                    // InternalBugsDsl.g:1204:3: (enumLiteral_14= 'dt' )
                    // InternalBugsDsl.g:1205:4: enumLiteral_14= 'dt'
                    {
                    enumLiteral_14=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDtEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getDistributionAccess().getDtEnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalBugsDsl.g:1212:3: (enumLiteral_15= 'dweib' )
                    {
                    // InternalBugsDsl.g:1212:3: (enumLiteral_15= 'dweib' )
                    // InternalBugsDsl.g:1213:4: enumLiteral_15= 'dweib'
                    {
                    enumLiteral_15=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionAccess().getDweibEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getDistributionAccess().getDweibEnumLiteralDeclaration_15());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "ruleDensity"
    // InternalBugsDsl.g:1223:1: ruleDensity returns [Enumerator current=null] : ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) ) ;
    public final Enumerator ruleDensity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:1229:2: ( ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) ) )
            // InternalBugsDsl.g:1230:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) )
            {
            // InternalBugsDsl.g:1230:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt22=1;
                }
                break;
            case 49:
                {
                alt22=2;
                }
                break;
            case 50:
                {
                alt22=3;
                }
                break;
            case 51:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalBugsDsl.g:1231:3: (enumLiteral_0= 'dnorm' )
                    {
                    // InternalBugsDsl.g:1231:3: (enumLiteral_0= 'dnorm' )
                    // InternalBugsDsl.g:1232:4: enumLiteral_0= 'dnorm'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityAccess().getDnormEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDensityAccess().getDnormEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1239:3: (enumLiteral_1= 'dunif' )
                    {
                    // InternalBugsDsl.g:1239:3: (enumLiteral_1= 'dunif' )
                    // InternalBugsDsl.g:1240:4: enumLiteral_1= 'dunif'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityAccess().getDunifEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDensityAccess().getDunifEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1247:3: (enumLiteral_2= 'dbeta' )
                    {
                    // InternalBugsDsl.g:1247:3: (enumLiteral_2= 'dbeta' )
                    // InternalBugsDsl.g:1248:4: enumLiteral_2= 'dbeta'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityAccess().getDbetaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDensityAccess().getDbetaEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1255:3: (enumLiteral_3= 'dgamma' )
                    {
                    // InternalBugsDsl.g:1255:3: (enumLiteral_3= 'dgamma' )
                    // InternalBugsDsl.g:1256:4: enumLiteral_3= 'dgamma'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityAccess().getDgammaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDensityAccess().getDgammaEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDensity"


    // $ANTLR start "ruleFunction"
    // InternalBugsDsl.g:1266:1: ruleFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) ) ;
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
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:1272:2: ( ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) ) )
            // InternalBugsDsl.g:1273:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) )
            {
            // InternalBugsDsl.g:1273:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) )
            int alt23=10;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt23=1;
                }
                break;
            case 53:
                {
                alt23=2;
                }
                break;
            case 54:
                {
                alt23=3;
                }
                break;
            case 55:
                {
                alt23=4;
                }
                break;
            case 56:
                {
                alt23=5;
                }
                break;
            case 57:
                {
                alt23=6;
                }
                break;
            case 58:
                {
                alt23=7;
                }
                break;
            case 59:
                {
                alt23=8;
                }
                break;
            case 60:
                {
                alt23=9;
                }
                break;
            case 61:
                {
                alt23=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalBugsDsl.g:1274:3: (enumLiteral_0= 'acos' )
                    {
                    // InternalBugsDsl.g:1274:3: (enumLiteral_0= 'acos' )
                    // InternalBugsDsl.g:1275:4: enumLiteral_0= 'acos'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getAcosEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getFunctionAccess().getAcosEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1282:3: (enumLiteral_1= 'acosh' )
                    {
                    // InternalBugsDsl.g:1282:3: (enumLiteral_1= 'acosh' )
                    // InternalBugsDsl.g:1283:4: enumLiteral_1= 'acosh'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getAcoshEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getFunctionAccess().getAcoshEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1290:3: (enumLiteral_2= 'asin' )
                    {
                    // InternalBugsDsl.g:1290:3: (enumLiteral_2= 'asin' )
                    // InternalBugsDsl.g:1291:4: enumLiteral_2= 'asin'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getAsinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getFunctionAccess().getAsinEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1298:3: (enumLiteral_3= 'asinh' )
                    {
                    // InternalBugsDsl.g:1298:3: (enumLiteral_3= 'asinh' )
                    // InternalBugsDsl.g:1299:4: enumLiteral_3= 'asinh'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getAsinhEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getFunctionAccess().getAsinhEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:1306:3: (enumLiteral_4= 'atan' )
                    {
                    // InternalBugsDsl.g:1306:3: (enumLiteral_4= 'atan' )
                    // InternalBugsDsl.g:1307:4: enumLiteral_4= 'atan'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getAtanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getFunctionAccess().getAtanEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:1314:3: (enumLiteral_5= 'log' )
                    {
                    // InternalBugsDsl.g:1314:3: (enumLiteral_5= 'log' )
                    // InternalBugsDsl.g:1315:4: enumLiteral_5= 'log'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getLogEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getFunctionAccess().getLogEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:1322:3: (enumLiteral_6= 'exp' )
                    {
                    // InternalBugsDsl.g:1322:3: (enumLiteral_6= 'exp' )
                    // InternalBugsDsl.g:1323:4: enumLiteral_6= 'exp'
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getEpEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getFunctionAccess().getEpEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:1330:3: (enumLiteral_7= 'c' )
                    {
                    // InternalBugsDsl.g:1330:3: (enumLiteral_7= 'c' )
                    // InternalBugsDsl.g:1331:4: enumLiteral_7= 'c'
                    {
                    enumLiteral_7=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getCEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getFunctionAccess().getCEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalBugsDsl.g:1338:3: (enumLiteral_8= 'mean' )
                    {
                    // InternalBugsDsl.g:1338:3: (enumLiteral_8= 'mean' )
                    // InternalBugsDsl.g:1339:4: enumLiteral_8= 'mean'
                    {
                    enumLiteral_8=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getMeanEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getFunctionAccess().getMeanEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalBugsDsl.g:1346:3: (enumLiteral_9= 'sqrt' )
                    {
                    // InternalBugsDsl.g:1346:3: (enumLiteral_9= 'sqrt' )
                    // InternalBugsDsl.g:1347:4: enumLiteral_9= 'sqrt'
                    {
                    enumLiteral_9=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionAccess().getSqrtEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getFunctionAccess().getSqrtEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunction"

    // $ANTLR start synpred1_InternalBugsDsl
    public final void synpred1_InternalBugsDsl_fragment() throws RecognitionException {   
        // InternalBugsDsl.g:740:5: ( ( ruleExpression ) )
        // InternalBugsDsl.g:740:6: ( ruleExpression )
        {
        // InternalBugsDsl.g:740:6: ( ruleExpression )
        // InternalBugsDsl.g:741:6: ruleExpression
        {
        pushFollow(FOLLOW_2);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalBugsDsl

    // $ANTLR start synpred2_InternalBugsDsl
    public final void synpred2_InternalBugsDsl_fragment() throws RecognitionException {   
        // InternalBugsDsl.g:847:9: ( ( ( ruleExpression ) ) )
        // InternalBugsDsl.g:847:10: ( ( ruleExpression ) )
        {
        // InternalBugsDsl.g:847:10: ( ( ruleExpression ) )
        // InternalBugsDsl.g:848:10: ( ruleExpression )
        {
        // InternalBugsDsl.g:848:10: ( ruleExpression )
        // InternalBugsDsl.g:849:11: ruleExpression
        {
        pushFollow(FOLLOW_2);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalBugsDsl

    // Delegated rules

    public final boolean synpred1_InternalBugsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBugsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalBugsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalBugsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\1\4\1\0\35\uffff";
    static final String dfa_3s = "\1\75\1\0\35\uffff";
    static final String dfa_4s = "\2\uffff\2\1\1\2\32\uffff";
    static final String dfa_5s = "\1\0\1\1\35\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\11\uffff\1\1\12\uffff\1\4\5\uffff\20\4\4\uffff\12\4",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "738:3: ( ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) | ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_distrib_6_0= ruleDistribution ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_function_7_0= ruleFunction ) ) ) ) ) )* ) ) ) (otherlv_8= '()' | (otherlv_9= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )? ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_0==15) ) {s = 1;}

                        else if ( (LA17_0==RULE_INT) && (synpred1_InternalBugsDsl())) {s = 2;}

                        else if ( (LA17_0==RULE_ID) && (synpred1_InternalBugsDsl())) {s = 3;}

                        else if ( (LA17_0==26||(LA17_0>=32 && LA17_0<=47)||(LA17_0>=52 && LA17_0<=61)) ) {s = 4;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalBugsDsl()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\4\15\uffff";
    static final String dfa_9s = "\1\4\2\uffff\1\22\1\uffff\1\4\6\uffff\1\30\1\22";
    static final String dfa_10s = "\1\17\2\uffff\1\37\1\uffff\1\4\6\uffff\1\30\1\37";
    static final String dfa_11s = "\1\uffff\2\1\1\uffff\1\2\1\uffff\6\1\2\uffff";
    static final String dfa_12s = "\1\0\2\uffff\1\1\11\uffff\1\2}>";
    static final String[] dfa_13s = {
            "\1\3\1\2\7\uffff\2\4\1\1",
            "",
            "",
            "\1\13\2\uffff\1\6\1\7\1\5\1\uffff\1\4\1\uffff\1\12\2\4\1\10\1\11",
            "",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\13\2\uffff\1\6\1\7\2\uffff\1\4\1\uffff\1\12\2\4\1\10\1\11"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "845:7: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_10_0= ruleExpression ) ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleExpression ) ) )* otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_0==15) && (synpred2_InternalBugsDsl())) {s = 1;}

                        else if ( (LA15_0==RULE_INT) && (synpred2_InternalBugsDsl())) {s = 2;}

                        else if ( (LA15_0==RULE_ID) ) {s = 3;}

                        else if ( (LA15_0==EOF||(LA15_0>=13 && LA15_0<=14)) ) {s = 4;}

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_3==23) ) {s = 5;}

                        else if ( (LA15_3==25||(LA15_3>=28 && LA15_3<=29)) ) {s = 4;}

                        else if ( (LA15_3==21) && (synpred2_InternalBugsDsl())) {s = 6;}

                        else if ( (LA15_3==22) && (synpred2_InternalBugsDsl())) {s = 7;}

                        else if ( (LA15_3==30) && (synpred2_InternalBugsDsl())) {s = 8;}

                        else if ( (LA15_3==31) && (synpred2_InternalBugsDsl())) {s = 9;}

                        else if ( (LA15_3==27) && (synpred2_InternalBugsDsl())) {s = 10;}

                        else if ( (LA15_3==18) && (synpred2_InternalBugsDsl())) {s = 11;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_13==25||(LA15_13>=28 && LA15_13<=29)) ) {s = 4;}

                        else if ( (LA15_13==21) && (synpred2_InternalBugsDsl())) {s = 6;}

                        else if ( (LA15_13==22) && (synpred2_InternalBugsDsl())) {s = 7;}

                        else if ( (LA15_13==30) && (synpred2_InternalBugsDsl())) {s = 8;}

                        else if ( (LA15_13==31) && (synpred2_InternalBugsDsl())) {s = 9;}

                        else if ( (LA15_13==27) && (synpred2_InternalBugsDsl())) {s = 10;}

                        else if ( (LA15_13==18) && (synpred2_InternalBugsDsl())) {s = 11;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004008002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x3FF0FFFF04008030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x3FF0FFFF04008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0600002L});

}
