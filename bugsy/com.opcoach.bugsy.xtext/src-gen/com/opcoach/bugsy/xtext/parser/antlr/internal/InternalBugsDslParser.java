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
    // InternalBugsDsl.g:165:1: ruleFor returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= ruleIndex ) ) otherlv_6= ':' ( (lv_high_7_0= ruleIndex ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_low_5_0 = null;

        AntlrDatatypeRuleToken lv_high_7_0 = null;

        EObject lv_contents_10_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:171:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= ruleIndex ) ) otherlv_6= ':' ( (lv_high_7_0= ruleIndex ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}' ) )
            // InternalBugsDsl.g:172:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= ruleIndex ) ) otherlv_6= ':' ( (lv_high_7_0= ruleIndex ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}' )
            {
            // InternalBugsDsl.g:172:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= ruleIndex ) ) otherlv_6= ':' ( (lv_high_7_0= ruleIndex ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}' )
            // InternalBugsDsl.g:173:3: () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_low_5_0= ruleIndex ) ) otherlv_6= ':' ( (lv_high_7_0= ruleIndex ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_contents_10_0= ruleInstruction ) )* otherlv_11= '}'
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
            // InternalBugsDsl.g:210:3: ( (lv_low_5_0= ruleIndex ) )
            // InternalBugsDsl.g:211:4: (lv_low_5_0= ruleIndex )
            {
            // InternalBugsDsl.g:211:4: (lv_low_5_0= ruleIndex )
            // InternalBugsDsl.g:212:5: lv_low_5_0= ruleIndex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getLowIndexParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_low_5_0=ruleIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"low",
              						lv_low_5_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.Index");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForAccess().getColonKeyword_6());
              		
            }
            // InternalBugsDsl.g:233:3: ( (lv_high_7_0= ruleIndex ) )
            // InternalBugsDsl.g:234:4: (lv_high_7_0= ruleIndex )
            {
            // InternalBugsDsl.g:234:4: (lv_high_7_0= ruleIndex )
            // InternalBugsDsl.g:235:5: lv_high_7_0= ruleIndex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getHighIndexParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_high_7_0=ruleIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"high",
              						lv_high_7_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.Index");
              					afterParserOrEnumRuleCall();
              				
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
            // InternalBugsDsl.g:260:3: ( (lv_contents_10_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBugsDsl.g:261:4: (lv_contents_10_0= ruleInstruction )
            	    {
            	    // InternalBugsDsl.g:261:4: (lv_contents_10_0= ruleInstruction )
            	    // InternalBugsDsl.g:262:5: lv_contents_10_0= ruleInstruction
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
    // InternalBugsDsl.g:287:1: entryRuleNumeric returns [String current=null] : iv_ruleNumeric= ruleNumeric EOF ;
    public final String entryRuleNumeric() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumeric = null;


        try {
            // InternalBugsDsl.g:287:47: (iv_ruleNumeric= ruleNumeric EOF )
            // InternalBugsDsl.g:288:2: iv_ruleNumeric= ruleNumeric EOF
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
    // InternalBugsDsl.g:294:1: ruleNumeric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) ;
    public final AntlrDatatypeRuleToken ruleNumeric() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_Float_1 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:300:2: ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) )
            // InternalBugsDsl.g:301:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat )
            {
            // InternalBugsDsl.g:301:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==RULE_ID||(LA4_1>=13 && LA4_1<=14)||LA4_1==18||(LA4_1>=21 && LA4_1<=22)||LA4_1==27||(LA4_1>=30 && LA4_1<=31)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==19) ) {
                    alt4=2;
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
                    // InternalBugsDsl.g:302:3: this_INT_0= RULE_INT
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
                    // InternalBugsDsl.g:310:3: this_Float_1= ruleFloat
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


    // $ANTLR start "entryRuleIndex"
    // InternalBugsDsl.g:324:1: entryRuleIndex returns [String current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final String entryRuleIndex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndex = null;


        try {
            // InternalBugsDsl.g:324:45: (iv_ruleIndex= ruleIndex EOF )
            // InternalBugsDsl.g:325:2: iv_ruleIndex= ruleIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndex=ruleIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndex.getText(); 
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
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // InternalBugsDsl.g:331:1: ruleIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:337:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) )
            // InternalBugsDsl.g:338:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            {
            // InternalBugsDsl.g:338:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
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
                    // InternalBugsDsl.g:339:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getIndexAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:347:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getIndexAccess().getIDTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleIndex"


    // $ANTLR start "entryRuleFloat"
    // InternalBugsDsl.g:358:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalBugsDsl.g:358:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalBugsDsl.g:359:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalBugsDsl.g:365:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:371:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? ) )
            // InternalBugsDsl.g:372:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? )
            {
            // InternalBugsDsl.g:372:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? )
            // InternalBugsDsl.g:373:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2());
              		
            }
            // InternalBugsDsl.g:392:3: (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBugsDsl.g:393:4: kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloatAccess().getEKeyword_3_0());
                      			
                    }
                    // InternalBugsDsl.g:398:4: (kw= '+' | kw= '-' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==21) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==22) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalBugsDsl.g:399:5: kw= '+'
                            {
                            kw=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFloatAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalBugsDsl.g:405:5: kw= '-'
                            {
                            kw=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
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
    // InternalBugsDsl.g:423:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalBugsDsl.g:423:46: (iv_ruleValue= ruleValue EOF )
            // InternalBugsDsl.g:424:2: iv_ruleValue= ruleValue EOF
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
    // InternalBugsDsl.g:430:1: ruleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:436:2: ( ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) ) )
            // InternalBugsDsl.g:437:2: ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) )
            {
            // InternalBugsDsl.g:437:2: ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBugsDsl.g:438:3: ( () ( (lv_value_1_0= ruleNumeric ) ) )
                    {
                    // InternalBugsDsl.g:438:3: ( () ( (lv_value_1_0= ruleNumeric ) ) )
                    // InternalBugsDsl.g:439:4: () ( (lv_value_1_0= ruleNumeric ) )
                    {
                    // InternalBugsDsl.g:439:4: ()
                    // InternalBugsDsl.g:440:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getValueAccess().getValueAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBugsDsl.g:446:4: ( (lv_value_1_0= ruleNumeric ) )
                    // InternalBugsDsl.g:447:5: (lv_value_1_0= ruleNumeric )
                    {
                    // InternalBugsDsl.g:447:5: (lv_value_1_0= ruleNumeric )
                    // InternalBugsDsl.g:448:6: lv_value_1_0= ruleNumeric
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
                    // InternalBugsDsl.g:467:3: ( (lv_id_2_0= ruleArrayID ) )
                    {
                    // InternalBugsDsl.g:467:3: ( (lv_id_2_0= ruleArrayID ) )
                    // InternalBugsDsl.g:468:4: (lv_id_2_0= ruleArrayID )
                    {
                    // InternalBugsDsl.g:468:4: (lv_id_2_0= ruleArrayID )
                    // InternalBugsDsl.g:469:5: lv_id_2_0= ruleArrayID
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
    // InternalBugsDsl.g:490:1: entryRuleArrayID returns [EObject current=null] : iv_ruleArrayID= ruleArrayID EOF ;
    public final EObject entryRuleArrayID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayID = null;


        try {
            // InternalBugsDsl.g:490:48: (iv_ruleArrayID= ruleArrayID EOF )
            // InternalBugsDsl.g:491:2: iv_ruleArrayID= ruleArrayID EOF
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
    // InternalBugsDsl.g:497:1: ruleArrayID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleIndex ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleArrayID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_index_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:503:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleIndex ) ) otherlv_3= ']' )? ) )
            // InternalBugsDsl.g:504:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleIndex ) ) otherlv_3= ']' )? )
            {
            // InternalBugsDsl.g:504:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleIndex ) ) otherlv_3= ']' )? )
            // InternalBugsDsl.g:505:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleIndex ) ) otherlv_3= ']' )?
            {
            // InternalBugsDsl.g:505:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBugsDsl.g:506:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBugsDsl.g:506:4: (lv_name_0_0= RULE_ID )
            // InternalBugsDsl.g:507:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            // InternalBugsDsl.g:523:3: (otherlv_1= '[' ( (lv_index_2_0= ruleIndex ) ) otherlv_3= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBugsDsl.g:524:4: otherlv_1= '[' ( (lv_index_2_0= ruleIndex ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArrayIDAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalBugsDsl.g:528:4: ( (lv_index_2_0= ruleIndex ) )
                    // InternalBugsDsl.g:529:5: (lv_index_2_0= ruleIndex )
                    {
                    // InternalBugsDsl.g:529:5: (lv_index_2_0= ruleIndex )
                    // InternalBugsDsl.g:530:6: lv_index_2_0= ruleIndex
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayIDAccess().getIndexIndexParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_index_2_0=ruleIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayIDRule());
                      						}
                      						set(
                      							current,
                      							"index",
                      							lv_index_2_0,
                      							"com.opcoach.bugsy.xtext.BugsDsl.Index");
                      						afterParserOrEnumRuleCall();
                      					
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
    // InternalBugsDsl.g:556:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalBugsDsl.g:556:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalBugsDsl.g:557:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalBugsDsl.g:563:1: ruleRelation returns [EObject current=null] : (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_StochasticRelation_0 = null;

        EObject this_DeterministicRelation_1 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:569:2: ( (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation ) )
            // InternalBugsDsl.g:570:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )
            {
            // InternalBugsDsl.g:570:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==RULE_INT) ) {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5==24) ) {
                            int LA10_7 = input.LA(5);

                            if ( (LA10_7==25) ) {
                                alt10=1;
                            }
                            else if ( ((LA10_7>=28 && LA10_7<=29)) ) {
                                alt10=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA10_2==RULE_ID) ) {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6==24) ) {
                            int LA10_7 = input.LA(5);

                            if ( (LA10_7==25) ) {
                                alt10=1;
                            }
                            else if ( ((LA10_7>=28 && LA10_7<=29)) ) {
                                alt10=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 25:
                    {
                    alt10=1;
                    }
                    break;
                case 28:
                case 29:
                    {
                    alt10=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBugsDsl.g:571:3: this_StochasticRelation_0= ruleStochasticRelation
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
                    // InternalBugsDsl.g:580:3: this_DeterministicRelation_1= ruleDeterministicRelation
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
    // InternalBugsDsl.g:592:1: entryRuleStochasticRelation returns [EObject current=null] : iv_ruleStochasticRelation= ruleStochasticRelation EOF ;
    public final EObject entryRuleStochasticRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStochasticRelation = null;


        try {
            // InternalBugsDsl.g:592:59: (iv_ruleStochasticRelation= ruleStochasticRelation EOF )
            // InternalBugsDsl.g:593:2: iv_ruleStochasticRelation= ruleStochasticRelation EOF
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
    // InternalBugsDsl.g:599:1: ruleStochasticRelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? ) ;
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
            // InternalBugsDsl.g:605:2: ( ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? ) )
            // InternalBugsDsl.g:606:2: ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? )
            {
            // InternalBugsDsl.g:606:2: ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? )
            // InternalBugsDsl.g:607:3: () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )?
            {
            // InternalBugsDsl.g:607:3: ()
            // InternalBugsDsl.g:608:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStochasticRelationAccess().getStochasticRelationAction_0(),
              					current);
              			
            }

            }

            // InternalBugsDsl.g:614:3: ( (lv_name_1_0= ruleArrayID ) )
            // InternalBugsDsl.g:615:4: (lv_name_1_0= ruleArrayID )
            {
            // InternalBugsDsl.g:615:4: (lv_name_1_0= ruleArrayID )
            // InternalBugsDsl.g:616:5: lv_name_1_0= ruleArrayID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochasticRelationAccess().getNameArrayIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStochasticRelationAccess().getTildeKeyword_2());
              		
            }
            // InternalBugsDsl.g:637:3: ( (lv_distrib_3_0= ruleDensity ) )
            // InternalBugsDsl.g:638:4: (lv_distrib_3_0= ruleDensity )
            {
            // InternalBugsDsl.g:638:4: (lv_distrib_3_0= ruleDensity )
            // InternalBugsDsl.g:639:5: lv_distrib_3_0= ruleDensity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochasticRelationAccess().getDistribDensityEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalBugsDsl.g:656:3: (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalBugsDsl.g:657:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStochasticRelationAccess().getLeftParenthesisRightParenthesisKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:662:4: (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' )
                    {
                    // InternalBugsDsl.g:662:4: (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' )
                    // InternalBugsDsl.g:663:5: otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getStochasticRelationAccess().getLeftParenthesisKeyword_4_1_0());
                      				
                    }
                    // InternalBugsDsl.g:667:5: ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* )
                    // InternalBugsDsl.g:668:6: ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )*
                    {
                    // InternalBugsDsl.g:668:6: ( (lv_params_6_0= ruleExpression ) )
                    // InternalBugsDsl.g:669:7: (lv_params_6_0= ruleExpression )
                    {
                    // InternalBugsDsl.g:669:7: (lv_params_6_0= ruleExpression )
                    // InternalBugsDsl.g:670:8: lv_params_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsExpressionParserRuleCall_4_1_1_0_0());
                      							
                    }
                    pushFollow(FOLLOW_21);
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

                    // InternalBugsDsl.g:687:6: (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==27) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBugsDsl.g:688:7: otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getStochasticRelationAccess().getCommaKeyword_4_1_1_1_0());
                    	      						
                    	    }
                    	    // InternalBugsDsl.g:692:7: ( (lv_params_8_0= ruleExpression ) )
                    	    // InternalBugsDsl.g:693:8: (lv_params_8_0= ruleExpression )
                    	    {
                    	    // InternalBugsDsl.g:693:8: (lv_params_8_0= ruleExpression )
                    	    // InternalBugsDsl.g:694:9: lv_params_8_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      									newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsExpressionParserRuleCall_4_1_1_1_1_0());
                    	      								
                    	    }
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop11;
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
    // InternalBugsDsl.g:723:1: entryRuleDeterministicRelation returns [EObject current=null] : iv_ruleDeterministicRelation= ruleDeterministicRelation EOF ;
    public final EObject entryRuleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterministicRelation = null;


        try {
            // InternalBugsDsl.g:723:62: (iv_ruleDeterministicRelation= ruleDeterministicRelation EOF )
            // InternalBugsDsl.g:724:2: iv_ruleDeterministicRelation= ruleDeterministicRelation EOF
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
    // InternalBugsDsl.g:730:1: ruleDeterministicRelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) ) ;
    public final EObject ruleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:736:2: ( ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) ) )
            // InternalBugsDsl.g:737:2: ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) )
            {
            // InternalBugsDsl.g:737:2: ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) )
            // InternalBugsDsl.g:738:3: () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) )
            {
            // InternalBugsDsl.g:738:3: ()
            // InternalBugsDsl.g:739:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDeterministicRelationAccess().getDeterministicRelationAction_0(),
              					current);
              			
            }

            }

            // InternalBugsDsl.g:745:3: ( (lv_name_1_0= ruleArrayID ) )
            // InternalBugsDsl.g:746:4: (lv_name_1_0= ruleArrayID )
            {
            // InternalBugsDsl.g:746:4: (lv_name_1_0= ruleArrayID )
            // InternalBugsDsl.g:747:5: lv_name_1_0= ruleArrayID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeterministicRelationAccess().getNameArrayIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalBugsDsl.g:764:3: (otherlv_2= '<-' | otherlv_3= '=' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBugsDsl.g:765:4: otherlv_2= '<-'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDeterministicRelationAccess().getLessThanSignHyphenMinusKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:770:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDeterministicRelationAccess().getEqualsSignKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalBugsDsl.g:775:3: ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) )
            // InternalBugsDsl.g:776:4: ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression )
            {
            // InternalBugsDsl.g:780:4: (lv_expressions_4_0= ruleExpression )
            // InternalBugsDsl.g:781:5: lv_expressions_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeterministicRelationAccess().getExpressionsExpressionParserRuleCall_3_0());
              				
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
    // InternalBugsDsl.g:802:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalBugsDsl.g:802:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalBugsDsl.g:803:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalBugsDsl.g:809:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:815:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalBugsDsl.g:816:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalBugsDsl.g:816:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 22:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            case 31:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalBugsDsl.g:817:3: kw= '+'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:823:3: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:829:3: kw= '*'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:835:3: kw= '/'
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


    // $ANTLR start "entryRuleFunction"
    // InternalBugsDsl.g:844:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalBugsDsl.g:844:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalBugsDsl.g:845:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalBugsDsl.g:851:1: ruleFunction returns [EObject current=null] : ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_operation_0_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:857:2: ( ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) )
            // InternalBugsDsl.g:858:2: ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            {
            // InternalBugsDsl.g:858:2: ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            // InternalBugsDsl.g:859:3: ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            {
            // InternalBugsDsl.g:859:3: ( (lv_operation_0_0= ruleFunctionOperator ) )
            // InternalBugsDsl.g:860:4: (lv_operation_0_0= ruleFunctionOperator )
            {
            // InternalBugsDsl.g:860:4: (lv_operation_0_0= ruleFunctionOperator )
            // InternalBugsDsl.g:861:5: lv_operation_0_0= ruleFunctionOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getOperationFunctionOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_operation_0_0=ruleFunctionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"operation",
              						lv_operation_0_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.FunctionOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBugsDsl.g:878:3: (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            else if ( (LA17_0==15) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalBugsDsl.g:879:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:884:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalBugsDsl.g:884:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    // InternalBugsDsl.g:885:5: otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalBugsDsl.g:889:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // InternalBugsDsl.g:890:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')'
                            {
                            // InternalBugsDsl.g:890:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) )
                            // InternalBugsDsl.g:891:7: ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) )
                            {
                            // InternalBugsDsl.g:897:7: ( (lv_params_3_0= ruleExpression ) )
                            // InternalBugsDsl.g:898:8: (lv_params_3_0= ruleExpression )
                            {
                            // InternalBugsDsl.g:898:8: (lv_params_3_0= ruleExpression )
                            // InternalBugsDsl.g:899:9: lv_params_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_1_1_1_0_0_0());
                              								
                            }
                            pushFollow(FOLLOW_21);
                            lv_params_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getFunctionRule());
                              									}
                              									add(
                              										current,
                              										"params",
                              										lv_params_3_0,
                              										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }

                            // InternalBugsDsl.g:917:6: (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==27) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalBugsDsl.g:918:7: otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalBugsDsl.g:922:7: ( (lv_params_5_0= ruleExpression ) )
                            	    // InternalBugsDsl.g:923:8: (lv_params_5_0= ruleExpression )
                            	    {
                            	    // InternalBugsDsl.g:923:8: (lv_params_5_0= ruleExpression )
                            	    // InternalBugsDsl.g:924:9: lv_params_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_1_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_params_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getFunctionRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"params",
                            	      										lv_params_5_0,
                            	      										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_1_1_2());
                              					
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDistribution"
    // InternalBugsDsl.g:953:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // InternalBugsDsl.g:953:53: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalBugsDsl.g:954:2: iv_ruleDistribution= ruleDistribution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDistributionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDistribution; 
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
    // $ANTLR end "entryRuleDistribution"


    // $ANTLR start "ruleDistribution"
    // InternalBugsDsl.g:960:1: ruleDistribution returns [EObject current=null] : ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_distrib_0_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:966:2: ( ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) )
            // InternalBugsDsl.g:967:2: ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            {
            // InternalBugsDsl.g:967:2: ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            // InternalBugsDsl.g:968:3: ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            {
            // InternalBugsDsl.g:968:3: ( (lv_distrib_0_0= ruleDistributionOperator ) )
            // InternalBugsDsl.g:969:4: (lv_distrib_0_0= ruleDistributionOperator )
            {
            // InternalBugsDsl.g:969:4: (lv_distrib_0_0= ruleDistributionOperator )
            // InternalBugsDsl.g:970:5: lv_distrib_0_0= ruleDistributionOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDistributionAccess().getDistribDistributionOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_distrib_0_0=ruleDistributionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDistributionRule());
              					}
              					set(
              						current,
              						"distrib",
              						lv_distrib_0_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.DistributionOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBugsDsl.g:987:3: (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            else if ( (LA20_0==15) ) {
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
                    // InternalBugsDsl.g:988:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDistributionAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:993:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalBugsDsl.g:993:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    // InternalBugsDsl.g:994:5: otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDistributionAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalBugsDsl.g:998:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    int alt19=2;
                    alt19 = dfa19.predict(input);
                    switch (alt19) {
                        case 1 :
                            // InternalBugsDsl.g:999:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')'
                            {
                            // InternalBugsDsl.g:999:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) )
                            // InternalBugsDsl.g:1000:7: ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) )
                            {
                            // InternalBugsDsl.g:1006:7: ( (lv_params_3_0= ruleExpression ) )
                            // InternalBugsDsl.g:1007:8: (lv_params_3_0= ruleExpression )
                            {
                            // InternalBugsDsl.g:1007:8: (lv_params_3_0= ruleExpression )
                            // InternalBugsDsl.g:1008:9: lv_params_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getDistributionAccess().getParamsExpressionParserRuleCall_1_1_1_0_0_0());
                              								
                            }
                            pushFollow(FOLLOW_21);
                            lv_params_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getDistributionRule());
                              									}
                              									add(
                              										current,
                              										"params",
                              										lv_params_3_0,
                              										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }

                            // InternalBugsDsl.g:1026:6: (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==27) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalBugsDsl.g:1027:7: otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getDistributionAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalBugsDsl.g:1031:7: ( (lv_params_5_0= ruleExpression ) )
                            	    // InternalBugsDsl.g:1032:8: (lv_params_5_0= ruleExpression )
                            	    {
                            	    // InternalBugsDsl.g:1032:8: (lv_params_5_0= ruleExpression )
                            	    // InternalBugsDsl.g:1033:9: lv_params_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getDistributionAccess().getParamsExpressionParserRuleCall_1_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_params_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getDistributionRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"params",
                            	      										lv_params_5_0,
                            	      										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getDistributionAccess().getRightParenthesisKeyword_1_1_1_2());
                              					
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
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "entryRuleExpression"
    // InternalBugsDsl.g:1062:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBugsDsl.g:1062:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalBugsDsl.g:1063:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalBugsDsl.g:1069:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:1075:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalBugsDsl.g:1076:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalBugsDsl.g:1076:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalBugsDsl.g:1077:3: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
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
            // InternalBugsDsl.g:1085:3: ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=21 && LA21_0<=22)||(LA21_0>=30 && LA21_0<=31)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBugsDsl.g:1086:4: () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalBugsDsl.g:1086:4: ()
            	    // InternalBugsDsl.g:1087:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBugsDsl.g:1093:4: ( (lv_op_2_0= ruleOperator ) )
            	    // InternalBugsDsl.g:1094:5: (lv_op_2_0= ruleOperator )
            	    {
            	    // InternalBugsDsl.g:1094:5: (lv_op_2_0= ruleOperator )
            	    // InternalBugsDsl.g:1095:6: lv_op_2_0= ruleOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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

            	    // InternalBugsDsl.g:1112:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalBugsDsl.g:1113:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalBugsDsl.g:1113:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalBugsDsl.g:1114:6: lv_right_3_0= ruleTerminalExpression
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
            	    break loop21;
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
    // InternalBugsDsl.g:1136:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalBugsDsl.g:1136:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalBugsDsl.g:1137:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalBugsDsl.g:1143:1: ruleTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject lv_value_3_0 = null;

        EObject lv_function_4_0 = null;

        EObject lv_distribution_5_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:1149:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) ) )
            // InternalBugsDsl.g:1150:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) )
            {
            // InternalBugsDsl.g:1150:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
                {
                alt22=2;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt22=3;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
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
                    // InternalBugsDsl.g:1151:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalBugsDsl.g:1151:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalBugsDsl.g:1152:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
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
                    // InternalBugsDsl.g:1170:3: ( (lv_value_3_0= ruleValue ) )
                    {
                    // InternalBugsDsl.g:1170:3: ( (lv_value_3_0= ruleValue ) )
                    // InternalBugsDsl.g:1171:4: (lv_value_3_0= ruleValue )
                    {
                    // InternalBugsDsl.g:1171:4: (lv_value_3_0= ruleValue )
                    // InternalBugsDsl.g:1172:5: lv_value_3_0= ruleValue
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
                case 3 :
                    // InternalBugsDsl.g:1190:3: ( (lv_function_4_0= ruleFunction ) )
                    {
                    // InternalBugsDsl.g:1190:3: ( (lv_function_4_0= ruleFunction ) )
                    // InternalBugsDsl.g:1191:4: (lv_function_4_0= ruleFunction )
                    {
                    // InternalBugsDsl.g:1191:4: (lv_function_4_0= ruleFunction )
                    // InternalBugsDsl.g:1192:5: lv_function_4_0= ruleFunction
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_4_0=ruleFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      					}
                      					set(
                      						current,
                      						"function",
                      						lv_function_4_0,
                      						"com.opcoach.bugsy.xtext.BugsDsl.Function");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1210:3: ( (lv_distribution_5_0= ruleDistribution ) )
                    {
                    // InternalBugsDsl.g:1210:3: ( (lv_distribution_5_0= ruleDistribution ) )
                    // InternalBugsDsl.g:1211:4: (lv_distribution_5_0= ruleDistribution )
                    {
                    // InternalBugsDsl.g:1211:4: (lv_distribution_5_0= ruleDistribution )
                    // InternalBugsDsl.g:1212:5: lv_distribution_5_0= ruleDistribution
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDistributionDistributionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_distribution_5_0=ruleDistribution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      					}
                      					set(
                      						current,
                      						"distribution",
                      						lv_distribution_5_0,
                      						"com.opcoach.bugsy.xtext.BugsDsl.Distribution");
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


    // $ANTLR start "ruleDistributionOperator"
    // InternalBugsDsl.g:1233:1: ruleDistributionOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) ) ;
    public final Enumerator ruleDistributionOperator() throws RecognitionException {
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
            // InternalBugsDsl.g:1239:2: ( ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) ) )
            // InternalBugsDsl.g:1240:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) )
            {
            // InternalBugsDsl.g:1240:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) )
            int alt23=16;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt23=1;
                }
                break;
            case 33:
                {
                alt23=2;
                }
                break;
            case 34:
                {
                alt23=3;
                }
                break;
            case 35:
                {
                alt23=4;
                }
                break;
            case 36:
                {
                alt23=5;
                }
                break;
            case 37:
                {
                alt23=6;
                }
                break;
            case 38:
                {
                alt23=7;
                }
                break;
            case 39:
                {
                alt23=8;
                }
                break;
            case 40:
                {
                alt23=9;
                }
                break;
            case 41:
                {
                alt23=10;
                }
                break;
            case 42:
                {
                alt23=11;
                }
                break;
            case 43:
                {
                alt23=12;
                }
                break;
            case 44:
                {
                alt23=13;
                }
                break;
            case 45:
                {
                alt23=14;
                }
                break;
            case 46:
                {
                alt23=15;
                }
                break;
            case 47:
                {
                alt23=16;
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
                    // InternalBugsDsl.g:1241:3: (enumLiteral_0= 'dbern' )
                    {
                    // InternalBugsDsl.g:1241:3: (enumLiteral_0= 'dbern' )
                    // InternalBugsDsl.g:1242:4: enumLiteral_0= 'dbern'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDbernEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDistributionOperatorAccess().getDbernEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1249:3: (enumLiteral_1= 'dbin' )
                    {
                    // InternalBugsDsl.g:1249:3: (enumLiteral_1= 'dbin' )
                    // InternalBugsDsl.g:1250:4: enumLiteral_1= 'dbin'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDbinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDistributionOperatorAccess().getDbinEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1257:3: (enumLiteral_2= 'dchisqr' )
                    {
                    // InternalBugsDsl.g:1257:3: (enumLiteral_2= 'dchisqr' )
                    // InternalBugsDsl.g:1258:4: enumLiteral_2= 'dchisqr'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDchisqrEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDistributionOperatorAccess().getDchisqrEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1265:3: (enumLiteral_3= 'ddexp' )
                    {
                    // InternalBugsDsl.g:1265:3: (enumLiteral_3= 'ddexp' )
                    // InternalBugsDsl.g:1266:4: enumLiteral_3= 'ddexp'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDdexpEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDistributionOperatorAccess().getDdexpEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:1273:3: (enumLiteral_4= 'dexp' )
                    {
                    // InternalBugsDsl.g:1273:3: (enumLiteral_4= 'dexp' )
                    // InternalBugsDsl.g:1274:4: enumLiteral_4= 'dexp'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDexpEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDistributionOperatorAccess().getDexpEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:1281:3: (enumLiteral_5= 'df' )
                    {
                    // InternalBugsDsl.g:1281:3: (enumLiteral_5= 'df' )
                    // InternalBugsDsl.g:1282:4: enumLiteral_5= 'df'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDfEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDistributionOperatorAccess().getDfEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:1289:3: (enumLiteral_6= 'dgen.gamma' )
                    {
                    // InternalBugsDsl.g:1289:3: (enumLiteral_6= 'dgen.gamma' )
                    // InternalBugsDsl.g:1290:4: enumLiteral_6= 'dgen.gamma'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDgengammEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDistributionOperatorAccess().getDgengammEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:1297:3: (enumLiteral_7= 'dhyper' )
                    {
                    // InternalBugsDsl.g:1297:3: (enumLiteral_7= 'dhyper' )
                    // InternalBugsDsl.g:1298:4: enumLiteral_7= 'dhyper'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDhyperEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDistributionOperatorAccess().getDhyperEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalBugsDsl.g:1305:3: (enumLiteral_8= 'dlogis' )
                    {
                    // InternalBugsDsl.g:1305:3: (enumLiteral_8= 'dlogis' )
                    // InternalBugsDsl.g:1306:4: enumLiteral_8= 'dlogis'
                    {
                    enumLiteral_8=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDlogisEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDistributionOperatorAccess().getDlogisEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalBugsDsl.g:1313:3: (enumLiteral_9= 'dlnorm' )
                    {
                    // InternalBugsDsl.g:1313:3: (enumLiteral_9= 'dlnorm' )
                    // InternalBugsDsl.g:1314:4: enumLiteral_9= 'dlnorm'
                    {
                    enumLiteral_9=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDlnormEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDistributionOperatorAccess().getDlnormEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalBugsDsl.g:1321:3: (enumLiteral_10= 'dnegbin' )
                    {
                    // InternalBugsDsl.g:1321:3: (enumLiteral_10= 'dnegbin' )
                    // InternalBugsDsl.g:1322:4: enumLiteral_10= 'dnegbin'
                    {
                    enumLiteral_10=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDnegbinEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getDistributionOperatorAccess().getDnegbinEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalBugsDsl.g:1329:3: (enumLiteral_11= 'dnchisqr' )
                    {
                    // InternalBugsDsl.g:1329:3: (enumLiteral_11= 'dnchisqr' )
                    // InternalBugsDsl.g:1330:4: enumLiteral_11= 'dnchisqr'
                    {
                    enumLiteral_11=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDnchisqrEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getDistributionOperatorAccess().getDnchisqrEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalBugsDsl.g:1337:3: (enumLiteral_12= 'dpar' )
                    {
                    // InternalBugsDsl.g:1337:3: (enumLiteral_12= 'dpar' )
                    // InternalBugsDsl.g:1338:4: enumLiteral_12= 'dpar'
                    {
                    enumLiteral_12=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDparEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getDistributionOperatorAccess().getDparEnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalBugsDsl.g:1345:3: (enumLiteral_13= 'dpois' )
                    {
                    // InternalBugsDsl.g:1345:3: (enumLiteral_13= 'dpois' )
                    // InternalBugsDsl.g:1346:4: enumLiteral_13= 'dpois'
                    {
                    enumLiteral_13=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDpoisEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getDistributionOperatorAccess().getDpoisEnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalBugsDsl.g:1353:3: (enumLiteral_14= 'dt' )
                    {
                    // InternalBugsDsl.g:1353:3: (enumLiteral_14= 'dt' )
                    // InternalBugsDsl.g:1354:4: enumLiteral_14= 'dt'
                    {
                    enumLiteral_14=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDtEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getDistributionOperatorAccess().getDtEnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalBugsDsl.g:1361:3: (enumLiteral_15= 'dweib' )
                    {
                    // InternalBugsDsl.g:1361:3: (enumLiteral_15= 'dweib' )
                    // InternalBugsDsl.g:1362:4: enumLiteral_15= 'dweib'
                    {
                    enumLiteral_15=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDweibEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getDistributionOperatorAccess().getDweibEnumLiteralDeclaration_15());
                      			
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
    // $ANTLR end "ruleDistributionOperator"


    // $ANTLR start "ruleDensity"
    // InternalBugsDsl.g:1372:1: ruleDensity returns [Enumerator current=null] : ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) ) ;
    public final Enumerator ruleDensity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:1378:2: ( ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) ) )
            // InternalBugsDsl.g:1379:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) )
            {
            // InternalBugsDsl.g:1379:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt24=1;
                }
                break;
            case 49:
                {
                alt24=2;
                }
                break;
            case 50:
                {
                alt24=3;
                }
                break;
            case 51:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalBugsDsl.g:1380:3: (enumLiteral_0= 'dnorm' )
                    {
                    // InternalBugsDsl.g:1380:3: (enumLiteral_0= 'dnorm' )
                    // InternalBugsDsl.g:1381:4: enumLiteral_0= 'dnorm'
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
                    // InternalBugsDsl.g:1388:3: (enumLiteral_1= 'dunif' )
                    {
                    // InternalBugsDsl.g:1388:3: (enumLiteral_1= 'dunif' )
                    // InternalBugsDsl.g:1389:4: enumLiteral_1= 'dunif'
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
                    // InternalBugsDsl.g:1396:3: (enumLiteral_2= 'dbeta' )
                    {
                    // InternalBugsDsl.g:1396:3: (enumLiteral_2= 'dbeta' )
                    // InternalBugsDsl.g:1397:4: enumLiteral_2= 'dbeta'
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
                    // InternalBugsDsl.g:1404:3: (enumLiteral_3= 'dgamma' )
                    {
                    // InternalBugsDsl.g:1404:3: (enumLiteral_3= 'dgamma' )
                    // InternalBugsDsl.g:1405:4: enumLiteral_3= 'dgamma'
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


    // $ANTLR start "ruleFunctionOperator"
    // InternalBugsDsl.g:1415:1: ruleFunctionOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) ) ;
    public final Enumerator ruleFunctionOperator() throws RecognitionException {
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
            // InternalBugsDsl.g:1421:2: ( ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) ) )
            // InternalBugsDsl.g:1422:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) )
            {
            // InternalBugsDsl.g:1422:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) )
            int alt25=10;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt25=1;
                }
                break;
            case 53:
                {
                alt25=2;
                }
                break;
            case 54:
                {
                alt25=3;
                }
                break;
            case 55:
                {
                alt25=4;
                }
                break;
            case 56:
                {
                alt25=5;
                }
                break;
            case 57:
                {
                alt25=6;
                }
                break;
            case 58:
                {
                alt25=7;
                }
                break;
            case 59:
                {
                alt25=8;
                }
                break;
            case 60:
                {
                alt25=9;
                }
                break;
            case 61:
                {
                alt25=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalBugsDsl.g:1423:3: (enumLiteral_0= 'acos' )
                    {
                    // InternalBugsDsl.g:1423:3: (enumLiteral_0= 'acos' )
                    // InternalBugsDsl.g:1424:4: enumLiteral_0= 'acos'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAcosEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getFunctionOperatorAccess().getAcosEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1431:3: (enumLiteral_1= 'acosh' )
                    {
                    // InternalBugsDsl.g:1431:3: (enumLiteral_1= 'acosh' )
                    // InternalBugsDsl.g:1432:4: enumLiteral_1= 'acosh'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAcoshEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getFunctionOperatorAccess().getAcoshEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1439:3: (enumLiteral_2= 'asin' )
                    {
                    // InternalBugsDsl.g:1439:3: (enumLiteral_2= 'asin' )
                    // InternalBugsDsl.g:1440:4: enumLiteral_2= 'asin'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAsinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getFunctionOperatorAccess().getAsinEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1447:3: (enumLiteral_3= 'asinh' )
                    {
                    // InternalBugsDsl.g:1447:3: (enumLiteral_3= 'asinh' )
                    // InternalBugsDsl.g:1448:4: enumLiteral_3= 'asinh'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAsinhEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getFunctionOperatorAccess().getAsinhEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:1455:3: (enumLiteral_4= 'atan' )
                    {
                    // InternalBugsDsl.g:1455:3: (enumLiteral_4= 'atan' )
                    // InternalBugsDsl.g:1456:4: enumLiteral_4= 'atan'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAtanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getFunctionOperatorAccess().getAtanEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:1463:3: (enumLiteral_5= 'log' )
                    {
                    // InternalBugsDsl.g:1463:3: (enumLiteral_5= 'log' )
                    // InternalBugsDsl.g:1464:4: enumLiteral_5= 'log'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getLogEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getFunctionOperatorAccess().getLogEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:1471:3: (enumLiteral_6= 'exp' )
                    {
                    // InternalBugsDsl.g:1471:3: (enumLiteral_6= 'exp' )
                    // InternalBugsDsl.g:1472:4: enumLiteral_6= 'exp'
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getEpEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getFunctionOperatorAccess().getEpEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:1479:3: (enumLiteral_7= 'c' )
                    {
                    // InternalBugsDsl.g:1479:3: (enumLiteral_7= 'c' )
                    // InternalBugsDsl.g:1480:4: enumLiteral_7= 'c'
                    {
                    enumLiteral_7=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getCEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getFunctionOperatorAccess().getCEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalBugsDsl.g:1487:3: (enumLiteral_8= 'mean' )
                    {
                    // InternalBugsDsl.g:1487:3: (enumLiteral_8= 'mean' )
                    // InternalBugsDsl.g:1488:4: enumLiteral_8= 'mean'
                    {
                    enumLiteral_8=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getMeanEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getFunctionOperatorAccess().getMeanEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalBugsDsl.g:1495:3: (enumLiteral_9= 'sqrt' )
                    {
                    // InternalBugsDsl.g:1495:3: (enumLiteral_9= 'sqrt' )
                    // InternalBugsDsl.g:1496:4: enumLiteral_9= 'sqrt'
                    {
                    enumLiteral_9=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getSqrtEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getFunctionOperatorAccess().getSqrtEnumLiteralDeclaration_9());
                      			
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
    // $ANTLR end "ruleFunctionOperator"

    // $ANTLR start synpred2_InternalBugsDsl
    public final void synpred2_InternalBugsDsl_fragment() throws RecognitionException {   
        // InternalBugsDsl.g:891:7: ( ( ( ruleExpression ) ) )
        // InternalBugsDsl.g:891:8: ( ( ruleExpression ) )
        {
        // InternalBugsDsl.g:891:8: ( ( ruleExpression ) )
        // InternalBugsDsl.g:892:8: ( ruleExpression )
        {
        // InternalBugsDsl.g:892:8: ( ruleExpression )
        // InternalBugsDsl.g:893:9: ruleExpression
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

    // $ANTLR start synpred3_InternalBugsDsl
    public final void synpred3_InternalBugsDsl_fragment() throws RecognitionException {   
        // InternalBugsDsl.g:1000:7: ( ( ( ruleExpression ) ) )
        // InternalBugsDsl.g:1000:8: ( ( ruleExpression ) )
        {
        // InternalBugsDsl.g:1000:8: ( ( ruleExpression ) )
        // InternalBugsDsl.g:1001:8: ( ruleExpression )
        {
        // InternalBugsDsl.g:1001:8: ( ruleExpression )
        // InternalBugsDsl.g:1002:9: ruleExpression
        {
        pushFollow(FOLLOW_2);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalBugsDsl

    // Delegated rules

    public final boolean synpred3_InternalBugsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalBugsDsl_fragment(); // can never throw exception
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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\51\uffff";
    static final String dfa_2s = "\1\36\50\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\22\33\uffff\1\4\6\uffff\2\30\1\22";
    static final String dfa_4s = "\1\75\2\uffff\1\37\33\uffff\1\5\6\uffff\2\30\1\37";
    static final String dfa_5s = "\1\uffff\2\1\1\uffff\32\1\1\2\1\uffff\6\1\3\uffff";
    static final String dfa_6s = "\1\0\2\uffff\1\2\44\uffff\1\1}>";
    static final String[] dfa_7s = {
            "\1\3\1\2\7\uffff\2\36\1\1\2\uffff\1\36\2\uffff\2\36\4\uffff\1\36\2\uffff\2\36\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "",
            "",
            "\1\45\2\uffff\1\40\1\41\1\37\1\uffff\1\36\1\uffff\1\44\2\36\1\42\1\43",
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
            "\1\47\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\50",
            "\1\45\2\uffff\1\40\1\41\2\uffff\1\36\1\uffff\1\44\2\36\1\42\1\43"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "889:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0==15) && (synpred2_InternalBugsDsl())) {s = 1;}

                        else if ( (LA16_0==RULE_INT) && (synpred2_InternalBugsDsl())) {s = 2;}

                        else if ( (LA16_0==RULE_ID) ) {s = 3;}

                        else if ( (LA16_0==52) && (synpred2_InternalBugsDsl())) {s = 4;}

                        else if ( (LA16_0==53) && (synpred2_InternalBugsDsl())) {s = 5;}

                        else if ( (LA16_0==54) && (synpred2_InternalBugsDsl())) {s = 6;}

                        else if ( (LA16_0==55) && (synpred2_InternalBugsDsl())) {s = 7;}

                        else if ( (LA16_0==56) && (synpred2_InternalBugsDsl())) {s = 8;}

                        else if ( (LA16_0==57) && (synpred2_InternalBugsDsl())) {s = 9;}

                        else if ( (LA16_0==58) && (synpred2_InternalBugsDsl())) {s = 10;}

                        else if ( (LA16_0==59) && (synpred2_InternalBugsDsl())) {s = 11;}

                        else if ( (LA16_0==60) && (synpred2_InternalBugsDsl())) {s = 12;}

                        else if ( (LA16_0==61) && (synpred2_InternalBugsDsl())) {s = 13;}

                        else if ( (LA16_0==32) && (synpred2_InternalBugsDsl())) {s = 14;}

                        else if ( (LA16_0==33) && (synpred2_InternalBugsDsl())) {s = 15;}

                        else if ( (LA16_0==34) && (synpred2_InternalBugsDsl())) {s = 16;}

                        else if ( (LA16_0==35) && (synpred2_InternalBugsDsl())) {s = 17;}

                        else if ( (LA16_0==36) && (synpred2_InternalBugsDsl())) {s = 18;}

                        else if ( (LA16_0==37) && (synpred2_InternalBugsDsl())) {s = 19;}

                        else if ( (LA16_0==38) && (synpred2_InternalBugsDsl())) {s = 20;}

                        else if ( (LA16_0==39) && (synpred2_InternalBugsDsl())) {s = 21;}

                        else if ( (LA16_0==40) && (synpred2_InternalBugsDsl())) {s = 22;}

                        else if ( (LA16_0==41) && (synpred2_InternalBugsDsl())) {s = 23;}

                        else if ( (LA16_0==42) && (synpred2_InternalBugsDsl())) {s = 24;}

                        else if ( (LA16_0==43) && (synpred2_InternalBugsDsl())) {s = 25;}

                        else if ( (LA16_0==44) && (synpred2_InternalBugsDsl())) {s = 26;}

                        else if ( (LA16_0==45) && (synpred2_InternalBugsDsl())) {s = 27;}

                        else if ( (LA16_0==46) && (synpred2_InternalBugsDsl())) {s = 28;}

                        else if ( (LA16_0==47) && (synpred2_InternalBugsDsl())) {s = 29;}

                        else if ( (LA16_0==EOF||(LA16_0>=13 && LA16_0<=14)||LA16_0==18||(LA16_0>=21 && LA16_0<=22)||LA16_0==27||(LA16_0>=30 && LA16_0<=31)) ) {s = 30;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_40 = input.LA(1);

                         
                        int index16_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_40==25||(LA16_40>=28 && LA16_40<=29)) ) {s = 30;}

                        else if ( (LA16_40==21) && (synpred2_InternalBugsDsl())) {s = 32;}

                        else if ( (LA16_40==22) && (synpred2_InternalBugsDsl())) {s = 33;}

                        else if ( (LA16_40==30) && (synpred2_InternalBugsDsl())) {s = 34;}

                        else if ( (LA16_40==31) && (synpred2_InternalBugsDsl())) {s = 35;}

                        else if ( (LA16_40==27) && (synpred2_InternalBugsDsl())) {s = 36;}

                        else if ( (LA16_40==18) && (synpred2_InternalBugsDsl())) {s = 37;}

                         
                        input.seek(index16_40);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_3==23) ) {s = 31;}

                        else if ( (LA16_3==21) && (synpred2_InternalBugsDsl())) {s = 32;}

                        else if ( (LA16_3==22) && (synpred2_InternalBugsDsl())) {s = 33;}

                        else if ( (LA16_3==30) && (synpred2_InternalBugsDsl())) {s = 34;}

                        else if ( (LA16_3==31) && (synpred2_InternalBugsDsl())) {s = 35;}

                        else if ( (LA16_3==27) && (synpred2_InternalBugsDsl())) {s = 36;}

                        else if ( (LA16_3==18) && (synpred2_InternalBugsDsl())) {s = 37;}

                        else if ( (LA16_3==25||(LA16_3>=28 && LA16_3<=29)) ) {s = 30;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\1\1\2\uffff\1\0\44\uffff\1\2}>";
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "998:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_3==23) ) {s = 31;}

                        else if ( (LA19_3==25||(LA19_3>=28 && LA19_3<=29)) ) {s = 30;}

                        else if ( (LA19_3==21) && (synpred3_InternalBugsDsl())) {s = 32;}

                        else if ( (LA19_3==22) && (synpred3_InternalBugsDsl())) {s = 33;}

                        else if ( (LA19_3==30) && (synpred3_InternalBugsDsl())) {s = 34;}

                        else if ( (LA19_3==31) && (synpred3_InternalBugsDsl())) {s = 35;}

                        else if ( (LA19_3==27) && (synpred3_InternalBugsDsl())) {s = 36;}

                        else if ( (LA19_3==18) && (synpred3_InternalBugsDsl())) {s = 37;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_0==15) && (synpred3_InternalBugsDsl())) {s = 1;}

                        else if ( (LA19_0==RULE_INT) && (synpred3_InternalBugsDsl())) {s = 2;}

                        else if ( (LA19_0==RULE_ID) ) {s = 3;}

                        else if ( (LA19_0==52) && (synpred3_InternalBugsDsl())) {s = 4;}

                        else if ( (LA19_0==53) && (synpred3_InternalBugsDsl())) {s = 5;}

                        else if ( (LA19_0==54) && (synpred3_InternalBugsDsl())) {s = 6;}

                        else if ( (LA19_0==55) && (synpred3_InternalBugsDsl())) {s = 7;}

                        else if ( (LA19_0==56) && (synpred3_InternalBugsDsl())) {s = 8;}

                        else if ( (LA19_0==57) && (synpred3_InternalBugsDsl())) {s = 9;}

                        else if ( (LA19_0==58) && (synpred3_InternalBugsDsl())) {s = 10;}

                        else if ( (LA19_0==59) && (synpred3_InternalBugsDsl())) {s = 11;}

                        else if ( (LA19_0==60) && (synpred3_InternalBugsDsl())) {s = 12;}

                        else if ( (LA19_0==61) && (synpred3_InternalBugsDsl())) {s = 13;}

                        else if ( (LA19_0==32) && (synpred3_InternalBugsDsl())) {s = 14;}

                        else if ( (LA19_0==33) && (synpred3_InternalBugsDsl())) {s = 15;}

                        else if ( (LA19_0==34) && (synpred3_InternalBugsDsl())) {s = 16;}

                        else if ( (LA19_0==35) && (synpred3_InternalBugsDsl())) {s = 17;}

                        else if ( (LA19_0==36) && (synpred3_InternalBugsDsl())) {s = 18;}

                        else if ( (LA19_0==37) && (synpred3_InternalBugsDsl())) {s = 19;}

                        else if ( (LA19_0==38) && (synpred3_InternalBugsDsl())) {s = 20;}

                        else if ( (LA19_0==39) && (synpred3_InternalBugsDsl())) {s = 21;}

                        else if ( (LA19_0==40) && (synpred3_InternalBugsDsl())) {s = 22;}

                        else if ( (LA19_0==41) && (synpred3_InternalBugsDsl())) {s = 23;}

                        else if ( (LA19_0==42) && (synpred3_InternalBugsDsl())) {s = 24;}

                        else if ( (LA19_0==43) && (synpred3_InternalBugsDsl())) {s = 25;}

                        else if ( (LA19_0==44) && (synpred3_InternalBugsDsl())) {s = 26;}

                        else if ( (LA19_0==45) && (synpred3_InternalBugsDsl())) {s = 27;}

                        else if ( (LA19_0==46) && (synpred3_InternalBugsDsl())) {s = 28;}

                        else if ( (LA19_0==47) && (synpred3_InternalBugsDsl())) {s = 29;}

                        else if ( (LA19_0==EOF||(LA19_0>=13 && LA19_0<=14)||LA19_0==18||(LA19_0>=21 && LA19_0<=22)||LA19_0==27||(LA19_0>=30 && LA19_0<=31)) ) {s = 30;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_40 = input.LA(1);

                         
                        int index19_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_40==25||(LA19_40>=28 && LA19_40<=29)) ) {s = 30;}

                        else if ( (LA19_40==21) && (synpred3_InternalBugsDsl())) {s = 32;}

                        else if ( (LA19_40==22) && (synpred3_InternalBugsDsl())) {s = 33;}

                        else if ( (LA19_40==30) && (synpred3_InternalBugsDsl())) {s = 34;}

                        else if ( (LA19_40==31) && (synpred3_InternalBugsDsl())) {s = 35;}

                        else if ( (LA19_40==27) && (synpred3_InternalBugsDsl())) {s = 36;}

                        else if ( (LA19_40==18) && (synpred3_InternalBugsDsl())) {s = 37;}

                         
                        input.seek(index19_40);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004008002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x3FF0FFFF00008030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x3FF0FFFF00008032L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0600002L});

}