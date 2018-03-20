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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'data'", "'{'", "'}'", "'model'", "'for'", "'('", "'in'", "')'", "':'", "'.'", "'E'", "'+'", "'-'", "'['", "','", "']'", "'~'", "'()'", "'<-'", "'='", "'*'", "'/'", "'dbern'", "'dbin'", "'dchisqr'", "'ddexp'", "'dexp'", "'df'", "'dgen.gamma'", "'dhyper'", "'dlogis'", "'dlnorm'", "'dnegbin'", "'dnchisqr'", "'dpar'", "'dpois'", "'dt'", "'dweib'", "'dnorm'", "'dunif'", "'dbeta'", "'dgamma'", "'acos'", "'acosh'", "'asin'", "'asinh'", "'atan'", "'log'", "'exp'", "'c'", "'mean'", "'sqrt'", "'length'", "'dim'"
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    // InternalBugsDsl.g:72:1: ruleBugsModel returns [EObject current=null] : ( () (otherlv_1= 'data' otherlv_2= '{' ( (lv_data_3_0= ruleInstruction ) )* otherlv_4= '}' )? otherlv_5= 'model' otherlv_6= '{' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= '}' ) ;
    public final EObject ruleBugsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_data_3_0 = null;

        EObject lv_instructions_7_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:78:2: ( ( () (otherlv_1= 'data' otherlv_2= '{' ( (lv_data_3_0= ruleInstruction ) )* otherlv_4= '}' )? otherlv_5= 'model' otherlv_6= '{' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= '}' ) )
            // InternalBugsDsl.g:79:2: ( () (otherlv_1= 'data' otherlv_2= '{' ( (lv_data_3_0= ruleInstruction ) )* otherlv_4= '}' )? otherlv_5= 'model' otherlv_6= '{' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= '}' )
            {
            // InternalBugsDsl.g:79:2: ( () (otherlv_1= 'data' otherlv_2= '{' ( (lv_data_3_0= ruleInstruction ) )* otherlv_4= '}' )? otherlv_5= 'model' otherlv_6= '{' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= '}' )
            // InternalBugsDsl.g:80:3: () (otherlv_1= 'data' otherlv_2= '{' ( (lv_data_3_0= ruleInstruction ) )* otherlv_4= '}' )? otherlv_5= 'model' otherlv_6= '{' ( (lv_instructions_7_0= ruleInstruction ) )* otherlv_8= '}'
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

            // InternalBugsDsl.g:87:3: (otherlv_1= 'data' otherlv_2= '{' ( (lv_data_3_0= ruleInstruction ) )* otherlv_4= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBugsDsl.g:88:4: otherlv_1= 'data' otherlv_2= '{' ( (lv_data_3_0= ruleInstruction ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBugsModelAccess().getDataKeyword_1_0());
                      			
                    }
                    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBugsModelAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    // InternalBugsDsl.g:96:4: ( (lv_data_3_0= ruleInstruction ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID||LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBugsDsl.g:97:5: (lv_data_3_0= ruleInstruction )
                    	    {
                    	    // InternalBugsDsl.g:97:5: (lv_data_3_0= ruleInstruction )
                    	    // InternalBugsDsl.g:98:6: lv_data_3_0= ruleInstruction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBugsModelAccess().getDataInstructionParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_data_3_0=ruleInstruction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getBugsModelRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"data",
                    	      							lv_data_3_0,
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

                    otherlv_4=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getBugsModelAccess().getRightCurlyBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBugsModelAccess().getModelKeyword_2());
              		
            }
            otherlv_6=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBugsModelAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalBugsDsl.g:128:3: ( (lv_instructions_7_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBugsDsl.g:129:4: (lv_instructions_7_0= ruleInstruction )
            	    {
            	    // InternalBugsDsl.g:129:4: (lv_instructions_7_0= ruleInstruction )
            	    // InternalBugsDsl.g:130:5: lv_instructions_7_0= ruleInstruction
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBugsModelAccess().getInstructionsInstructionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_instructions_7_0=ruleInstruction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBugsModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"instructions",
            	      						lv_instructions_7_0,
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

            otherlv_8=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBugsModelAccess().getRightCurlyBracketKeyword_5());
              		
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
    // InternalBugsDsl.g:155:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalBugsDsl.g:155:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalBugsDsl.g:156:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalBugsDsl.g:162:1: ruleInstruction returns [EObject current=null] : (this_For_0= ruleFor | this_Relation_1= ruleRelation ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_For_0 = null;

        EObject this_Relation_1 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:168:2: ( (this_For_0= ruleFor | this_Relation_1= ruleRelation ) )
            // InternalBugsDsl.g:169:2: (this_For_0= ruleFor | this_Relation_1= ruleRelation )
            {
            // InternalBugsDsl.g:169:2: (this_For_0= ruleFor | this_Relation_1= ruleRelation )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBugsDsl.g:170:3: this_For_0= ruleFor
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
                    // InternalBugsDsl.g:179:3: this_Relation_1= ruleRelation
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
    // InternalBugsDsl.g:191:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalBugsDsl.g:191:44: (iv_ruleFor= ruleFor EOF )
            // InternalBugsDsl.g:192:2: iv_ruleFor= ruleFor EOF
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
    // InternalBugsDsl.g:198:1: ruleFor returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_range_5_0= ruleForRange ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_range_5_0 = null;

        EObject lv_instructions_8_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:204:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_range_5_0= ruleForRange ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' ) )
            // InternalBugsDsl.g:205:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_range_5_0= ruleForRange ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' )
            {
            // InternalBugsDsl.g:205:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_range_5_0= ruleForRange ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' )
            // InternalBugsDsl.g:206:3: () otherlv_1= 'for' otherlv_2= '(' ( (lv_variable_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_range_5_0= ruleForRange ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}'
            {
            // InternalBugsDsl.g:206:3: ()
            // InternalBugsDsl.g:207:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForAccess().getForAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBugsDsl.g:221:3: ( (lv_variable_3_0= RULE_ID ) )
            // InternalBugsDsl.g:222:4: (lv_variable_3_0= RULE_ID )
            {
            // InternalBugsDsl.g:222:4: (lv_variable_3_0= RULE_ID )
            // InternalBugsDsl.g:223:5: lv_variable_3_0= RULE_ID
            {
            lv_variable_3_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForAccess().getInKeyword_4());
              		
            }
            // InternalBugsDsl.g:243:3: ( (lv_range_5_0= ruleForRange ) )
            // InternalBugsDsl.g:244:4: (lv_range_5_0= ruleForRange )
            {
            // InternalBugsDsl.g:244:4: (lv_range_5_0= ruleForRange )
            // InternalBugsDsl.g:245:5: lv_range_5_0= ruleForRange
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getRangeForRangeParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_range_5_0=ruleForRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"range",
              						lv_range_5_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.ForRange");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            // InternalBugsDsl.g:270:3: ( (lv_instructions_8_0= ruleInstruction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBugsDsl.g:271:4: (lv_instructions_8_0= ruleInstruction )
            	    {
            	    // InternalBugsDsl.g:271:4: (lv_instructions_8_0= ruleInstruction )
            	    // InternalBugsDsl.g:272:5: lv_instructions_8_0= ruleInstruction
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForAccess().getInstructionsInstructionParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_instructions_8_0=ruleInstruction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForRule());
            	      					}
            	      					add(
            	      						current,
            	      						"instructions",
            	      						lv_instructions_8_0,
            	      						"com.opcoach.bugsy.xtext.BugsDsl.Instruction");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getForAccess().getRightCurlyBracketKeyword_9());
              		
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
    // InternalBugsDsl.g:297:1: entryRuleNumeric returns [String current=null] : iv_ruleNumeric= ruleNumeric EOF ;
    public final String entryRuleNumeric() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumeric = null;


        try {
            // InternalBugsDsl.g:297:47: (iv_ruleNumeric= ruleNumeric EOF )
            // InternalBugsDsl.g:298:2: iv_ruleNumeric= ruleNumeric EOF
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
    // InternalBugsDsl.g:304:1: ruleNumeric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) ;
    public final AntlrDatatypeRuleToken ruleNumeric() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_Float_1 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:310:2: ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) )
            // InternalBugsDsl.g:311:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat )
            {
            // InternalBugsDsl.g:311:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==13||LA6_1==15||LA6_1==18||(LA6_1>=22 && LA6_1<=23)||LA6_1==25||(LA6_1>=31 && LA6_1<=32)) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBugsDsl.g:312:3: this_INT_0= RULE_INT
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
                    // InternalBugsDsl.g:320:3: this_Float_1= ruleFloat
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
    // InternalBugsDsl.g:334:1: entryRuleIndex returns [String current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final String entryRuleIndex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndex = null;


        try {
            // InternalBugsDsl.g:334:45: (iv_ruleIndex= ruleIndex EOF )
            // InternalBugsDsl.g:335:2: iv_ruleIndex= ruleIndex EOF
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
    // InternalBugsDsl.g:341:1: ruleIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:347:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) )
            // InternalBugsDsl.g:348:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            {
            // InternalBugsDsl.g:348:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
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
                    // InternalBugsDsl.g:349:3: this_INT_0= RULE_INT
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
                    // InternalBugsDsl.g:357:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleForIndex"
    // InternalBugsDsl.g:368:1: entryRuleForIndex returns [EObject current=null] : iv_ruleForIndex= ruleForIndex EOF ;
    public final EObject entryRuleForIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIndex = null;


        try {
            // InternalBugsDsl.g:368:49: (iv_ruleForIndex= ruleForIndex EOF )
            // InternalBugsDsl.g:369:2: iv_ruleForIndex= ruleForIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForIndex=ruleForIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForIndex; 
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
    // $ANTLR end "entryRuleForIndex"


    // $ANTLR start "ruleForIndex"
    // InternalBugsDsl.g:375:1: ruleForIndex returns [EObject current=null] : ( ( ( (lv_function_0_0= ruleIntOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleIndex ) ) otherlv_3= ')' ) | ( (lv_value_4_0= ruleIndex ) ) ) ;
    public final EObject ruleForIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_function_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:381:2: ( ( ( ( (lv_function_0_0= ruleIntOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleIndex ) ) otherlv_3= ')' ) | ( (lv_value_4_0= ruleIndex ) ) ) )
            // InternalBugsDsl.g:382:2: ( ( ( (lv_function_0_0= ruleIntOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleIndex ) ) otherlv_3= ')' ) | ( (lv_value_4_0= ruleIndex ) ) )
            {
            // InternalBugsDsl.g:382:2: ( ( ( (lv_function_0_0= ruleIntOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleIndex ) ) otherlv_3= ')' ) | ( (lv_value_4_0= ruleIndex ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==63) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)) ) {
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
                    // InternalBugsDsl.g:383:3: ( ( (lv_function_0_0= ruleIntOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleIndex ) ) otherlv_3= ')' )
                    {
                    // InternalBugsDsl.g:383:3: ( ( (lv_function_0_0= ruleIntOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleIndex ) ) otherlv_3= ')' )
                    // InternalBugsDsl.g:384:4: ( (lv_function_0_0= ruleIntOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleIndex ) ) otherlv_3= ')'
                    {
                    // InternalBugsDsl.g:384:4: ( (lv_function_0_0= ruleIntOperator ) )
                    // InternalBugsDsl.g:385:5: (lv_function_0_0= ruleIntOperator )
                    {
                    // InternalBugsDsl.g:385:5: (lv_function_0_0= ruleIntOperator )
                    // InternalBugsDsl.g:386:6: lv_function_0_0= ruleIntOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getForIndexAccess().getFunctionIntOperatorEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_function_0_0=ruleIntOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getForIndexRule());
                      						}
                      						set(
                      							current,
                      							"function",
                      							lv_function_0_0,
                      							"com.opcoach.bugsy.xtext.BugsDsl.IntOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getForIndexAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalBugsDsl.g:407:4: ( (lv_value_2_0= ruleIndex ) )
                    // InternalBugsDsl.g:408:5: (lv_value_2_0= ruleIndex )
                    {
                    // InternalBugsDsl.g:408:5: (lv_value_2_0= ruleIndex )
                    // InternalBugsDsl.g:409:6: lv_value_2_0= ruleIndex
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getForIndexAccess().getValueIndexParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_value_2_0=ruleIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getForIndexRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"com.opcoach.bugsy.xtext.BugsDsl.Index");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getForIndexAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:432:3: ( (lv_value_4_0= ruleIndex ) )
                    {
                    // InternalBugsDsl.g:432:3: ( (lv_value_4_0= ruleIndex ) )
                    // InternalBugsDsl.g:433:4: (lv_value_4_0= ruleIndex )
                    {
                    // InternalBugsDsl.g:433:4: (lv_value_4_0= ruleIndex )
                    // InternalBugsDsl.g:434:5: lv_value_4_0= ruleIndex
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForIndexAccess().getValueIndexParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForIndexRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_4_0,
                      						"com.opcoach.bugsy.xtext.BugsDsl.Index");
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
    // $ANTLR end "ruleForIndex"


    // $ANTLR start "entryRuleForRange"
    // InternalBugsDsl.g:455:1: entryRuleForRange returns [EObject current=null] : iv_ruleForRange= ruleForRange EOF ;
    public final EObject entryRuleForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForRange = null;


        try {
            // InternalBugsDsl.g:455:49: (iv_ruleForRange= ruleForRange EOF )
            // InternalBugsDsl.g:456:2: iv_ruleForRange= ruleForRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForRange=ruleForRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForRange; 
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
    // $ANTLR end "entryRuleForRange"


    // $ANTLR start "ruleForRange"
    // InternalBugsDsl.g:462:1: ruleForRange returns [EObject current=null] : ( ( (lv_low_0_0= ruleForIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleForIndex ) ) ) ;
    public final EObject ruleForRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_low_0_0 = null;

        EObject lv_high_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:468:2: ( ( ( (lv_low_0_0= ruleForIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleForIndex ) ) ) )
            // InternalBugsDsl.g:469:2: ( ( (lv_low_0_0= ruleForIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleForIndex ) ) )
            {
            // InternalBugsDsl.g:469:2: ( ( (lv_low_0_0= ruleForIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleForIndex ) ) )
            // InternalBugsDsl.g:470:3: ( (lv_low_0_0= ruleForIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleForIndex ) )
            {
            // InternalBugsDsl.g:470:3: ( (lv_low_0_0= ruleForIndex ) )
            // InternalBugsDsl.g:471:4: (lv_low_0_0= ruleForIndex )
            {
            // InternalBugsDsl.g:471:4: (lv_low_0_0= ruleForIndex )
            // InternalBugsDsl.g:472:5: lv_low_0_0= ruleForIndex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForRangeAccess().getLowForIndexParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_low_0_0=ruleForIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRangeRule());
              					}
              					set(
              						current,
              						"low",
              						lv_low_0_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.ForIndex");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForRangeAccess().getColonKeyword_1());
              		
            }
            // InternalBugsDsl.g:493:3: ( (lv_high_2_0= ruleForIndex ) )
            // InternalBugsDsl.g:494:4: (lv_high_2_0= ruleForIndex )
            {
            // InternalBugsDsl.g:494:4: (lv_high_2_0= ruleForIndex )
            // InternalBugsDsl.g:495:5: lv_high_2_0= ruleForIndex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForRangeAccess().getHighForIndexParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_high_2_0=ruleForIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRangeRule());
              					}
              					set(
              						current,
              						"high",
              						lv_high_2_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.ForIndex");
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
    // $ANTLR end "ruleForRange"


    // $ANTLR start "entryRuleArrayRange"
    // InternalBugsDsl.g:516:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalBugsDsl.g:516:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalBugsDsl.g:517:2: iv_ruleArrayRange= ruleArrayRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayRange=ruleArrayRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayRange; 
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
    // $ANTLR end "entryRuleArrayRange"


    // $ANTLR start "ruleArrayRange"
    // InternalBugsDsl.g:523:1: ruleArrayRange returns [EObject current=null] : ( ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )? ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_low_0_0 = null;

        AntlrDatatypeRuleToken lv_high_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:529:2: ( ( ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )? ) )
            // InternalBugsDsl.g:530:2: ( ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )? )
            {
            // InternalBugsDsl.g:530:2: ( ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )? )
            // InternalBugsDsl.g:531:3: ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )?
            {
            // InternalBugsDsl.g:531:3: ( (lv_low_0_0= ruleIndex ) )
            // InternalBugsDsl.g:532:4: (lv_low_0_0= ruleIndex )
            {
            // InternalBugsDsl.g:532:4: (lv_low_0_0= ruleIndex )
            // InternalBugsDsl.g:533:5: lv_low_0_0= ruleIndex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowIndexParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_low_0_0=ruleIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayRangeRule());
              					}
              					set(
              						current,
              						"low",
              						lv_low_0_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.Index");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBugsDsl.g:550:3: (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBugsDsl.g:551:4: otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalBugsDsl.g:555:4: ( (lv_high_2_0= ruleIndex ) )
                    // InternalBugsDsl.g:556:5: (lv_high_2_0= ruleIndex )
                    {
                    // InternalBugsDsl.g:556:5: (lv_high_2_0= ruleIndex )
                    // InternalBugsDsl.g:557:6: lv_high_2_0= ruleIndex
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayRangeAccess().getHighIndexParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_high_2_0=ruleIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayRangeRule());
                      						}
                      						set(
                      							current,
                      							"high",
                      							lv_high_2_0,
                      							"com.opcoach.bugsy.xtext.BugsDsl.Index");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleArrayRange"


    // $ANTLR start "entryRuleFloat"
    // InternalBugsDsl.g:579:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalBugsDsl.g:579:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalBugsDsl.g:580:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalBugsDsl.g:586:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:592:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? ) )
            // InternalBugsDsl.g:593:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? )
            {
            // InternalBugsDsl.g:593:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? )
            // InternalBugsDsl.g:594:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2());
              		
            }
            // InternalBugsDsl.g:613:3: (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBugsDsl.g:614:4: kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloatAccess().getEKeyword_3_0());
                      			
                    }
                    // InternalBugsDsl.g:619:4: (kw= '+' | kw= '-' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==23) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBugsDsl.g:620:5: kw= '+'
                            {
                            kw=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFloatAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalBugsDsl.g:626:5: kw= '-'
                            {
                            kw=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
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
    // InternalBugsDsl.g:644:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalBugsDsl.g:644:46: (iv_ruleValue= ruleValue EOF )
            // InternalBugsDsl.g:645:2: iv_ruleValue= ruleValue EOF
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
    // InternalBugsDsl.g:651:1: ruleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:657:2: ( ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) ) )
            // InternalBugsDsl.g:658:2: ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) )
            {
            // InternalBugsDsl.g:658:2: ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
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
                    // InternalBugsDsl.g:659:3: ( () ( (lv_value_1_0= ruleNumeric ) ) )
                    {
                    // InternalBugsDsl.g:659:3: ( () ( (lv_value_1_0= ruleNumeric ) ) )
                    // InternalBugsDsl.g:660:4: () ( (lv_value_1_0= ruleNumeric ) )
                    {
                    // InternalBugsDsl.g:660:4: ()
                    // InternalBugsDsl.g:661:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getValueAccess().getValueAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBugsDsl.g:667:4: ( (lv_value_1_0= ruleNumeric ) )
                    // InternalBugsDsl.g:668:5: (lv_value_1_0= ruleNumeric )
                    {
                    // InternalBugsDsl.g:668:5: (lv_value_1_0= ruleNumeric )
                    // InternalBugsDsl.g:669:6: lv_value_1_0= ruleNumeric
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
                    // InternalBugsDsl.g:688:3: ( (lv_id_2_0= ruleArrayID ) )
                    {
                    // InternalBugsDsl.g:688:3: ( (lv_id_2_0= ruleArrayID ) )
                    // InternalBugsDsl.g:689:4: (lv_id_2_0= ruleArrayID )
                    {
                    // InternalBugsDsl.g:689:4: (lv_id_2_0= ruleArrayID )
                    // InternalBugsDsl.g:690:5: lv_id_2_0= ruleArrayID
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
    // InternalBugsDsl.g:711:1: entryRuleArrayID returns [EObject current=null] : iv_ruleArrayID= ruleArrayID EOF ;
    public final EObject entryRuleArrayID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayID = null;


        try {
            // InternalBugsDsl.g:711:48: (iv_ruleArrayID= ruleArrayID EOF )
            // InternalBugsDsl.g:712:2: iv_ruleArrayID= ruleArrayID EOF
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
    // InternalBugsDsl.g:718:1: ruleArrayID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )? ) ;
    public final EObject ruleArrayID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_indexes_2_0 = null;

        EObject lv_indexes_4_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:724:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )? ) )
            // InternalBugsDsl.g:725:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )? )
            {
            // InternalBugsDsl.g:725:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )? )
            // InternalBugsDsl.g:726:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )?
            {
            // InternalBugsDsl.g:726:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBugsDsl.g:727:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBugsDsl.g:727:4: (lv_name_0_0= RULE_ID )
            // InternalBugsDsl.g:728:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            // InternalBugsDsl.g:744:3: (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBugsDsl.g:745:4: otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArrayIDAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalBugsDsl.g:749:4: ( (lv_indexes_2_0= ruleArrayRange ) )
                    // InternalBugsDsl.g:750:5: (lv_indexes_2_0= ruleArrayRange )
                    {
                    // InternalBugsDsl.g:750:5: (lv_indexes_2_0= ruleArrayRange )
                    // InternalBugsDsl.g:751:6: lv_indexes_2_0= ruleArrayRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayIDAccess().getIndexesArrayRangeParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_indexes_2_0=ruleArrayRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayIDRule());
                      						}
                      						add(
                      							current,
                      							"indexes",
                      							lv_indexes_2_0,
                      							"com.opcoach.bugsy.xtext.BugsDsl.ArrayRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBugsDsl.g:768:4: (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBugsDsl.g:769:5: otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayIDAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalBugsDsl.g:773:5: ( (lv_indexes_4_0= ruleArrayRange ) )
                    	    // InternalBugsDsl.g:774:6: (lv_indexes_4_0= ruleArrayRange )
                    	    {
                    	    // InternalBugsDsl.g:774:6: (lv_indexes_4_0= ruleArrayRange )
                    	    // InternalBugsDsl.g:775:7: lv_indexes_4_0= ruleArrayRange
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayIDAccess().getIndexesArrayRangeParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_indexes_4_0=ruleArrayRange();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getArrayIDRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"indexes",
                    	      								lv_indexes_4_0,
                    	      								"com.opcoach.bugsy.xtext.BugsDsl.ArrayRange");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getArrayIDAccess().getRightSquareBracketKeyword_1_3());
                      			
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
    // InternalBugsDsl.g:802:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalBugsDsl.g:802:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalBugsDsl.g:803:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalBugsDsl.g:809:1: ruleRelation returns [EObject current=null] : (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_StochasticRelation_0 = null;

        EObject this_DeterministicRelation_1 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:815:2: ( (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation ) )
            // InternalBugsDsl.g:816:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )
            {
            // InternalBugsDsl.g:816:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalBugsDsl.g:817:3: this_StochasticRelation_0= ruleStochasticRelation
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
                    // InternalBugsDsl.g:826:3: this_DeterministicRelation_1= ruleDeterministicRelation
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
    // InternalBugsDsl.g:838:1: entryRuleStochasticRelation returns [EObject current=null] : iv_ruleStochasticRelation= ruleStochasticRelation EOF ;
    public final EObject entryRuleStochasticRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStochasticRelation = null;


        try {
            // InternalBugsDsl.g:838:59: (iv_ruleStochasticRelation= ruleStochasticRelation EOF )
            // InternalBugsDsl.g:839:2: iv_ruleStochasticRelation= ruleStochasticRelation EOF
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
    // InternalBugsDsl.g:845:1: ruleStochasticRelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensityOperator ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? ) ;
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
            // InternalBugsDsl.g:851:2: ( ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensityOperator ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? ) )
            // InternalBugsDsl.g:852:2: ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensityOperator ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? )
            {
            // InternalBugsDsl.g:852:2: ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensityOperator ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? )
            // InternalBugsDsl.g:853:3: () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensityOperator ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )?
            {
            // InternalBugsDsl.g:853:3: ()
            // InternalBugsDsl.g:854:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStochasticRelationAccess().getStochasticRelationAction_0(),
              					current);
              			
            }

            }

            // InternalBugsDsl.g:860:3: ( (lv_name_1_0= ruleArrayID ) )
            // InternalBugsDsl.g:861:4: (lv_name_1_0= ruleArrayID )
            {
            // InternalBugsDsl.g:861:4: (lv_name_1_0= ruleArrayID )
            // InternalBugsDsl.g:862:5: lv_name_1_0= ruleArrayID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochasticRelationAccess().getNameArrayIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStochasticRelationAccess().getTildeKeyword_2());
              		
            }
            // InternalBugsDsl.g:883:3: ( (lv_distrib_3_0= ruleDensityOperator ) )
            // InternalBugsDsl.g:884:4: (lv_distrib_3_0= ruleDensityOperator )
            {
            // InternalBugsDsl.g:884:4: (lv_distrib_3_0= ruleDensityOperator )
            // InternalBugsDsl.g:885:5: lv_distrib_3_0= ruleDensityOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochasticRelationAccess().getDistribDensityOperatorEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_distrib_3_0=ruleDensityOperator();

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
              						"com.opcoach.bugsy.xtext.BugsDsl.DensityOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBugsDsl.g:902:3: (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==16) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalBugsDsl.g:903:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStochasticRelationAccess().getLeftParenthesisRightParenthesisKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:908:4: (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' )
                    {
                    // InternalBugsDsl.g:908:4: (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' )
                    // InternalBugsDsl.g:909:5: otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getStochasticRelationAccess().getLeftParenthesisKeyword_4_1_0());
                      				
                    }
                    // InternalBugsDsl.g:913:5: ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* )
                    // InternalBugsDsl.g:914:6: ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )*
                    {
                    // InternalBugsDsl.g:914:6: ( (lv_params_6_0= ruleExpression ) )
                    // InternalBugsDsl.g:915:7: (lv_params_6_0= ruleExpression )
                    {
                    // InternalBugsDsl.g:915:7: (lv_params_6_0= ruleExpression )
                    // InternalBugsDsl.g:916:8: lv_params_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsExpressionParserRuleCall_4_1_1_0_0());
                      							
                    }
                    pushFollow(FOLLOW_23);
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

                    // InternalBugsDsl.g:933:6: (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==25) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBugsDsl.g:934:7: otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getStochasticRelationAccess().getCommaKeyword_4_1_1_1_0());
                    	      						
                    	    }
                    	    // InternalBugsDsl.g:938:7: ( (lv_params_8_0= ruleExpression ) )
                    	    // InternalBugsDsl.g:939:8: (lv_params_8_0= ruleExpression )
                    	    {
                    	    // InternalBugsDsl.g:939:8: (lv_params_8_0= ruleExpression )
                    	    // InternalBugsDsl.g:940:9: lv_params_8_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      									newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsExpressionParserRuleCall_4_1_1_1_1_0());
                    	      								
                    	    }
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop16;
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
    // InternalBugsDsl.g:969:1: entryRuleDeterministicRelation returns [EObject current=null] : iv_ruleDeterministicRelation= ruleDeterministicRelation EOF ;
    public final EObject entryRuleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterministicRelation = null;


        try {
            // InternalBugsDsl.g:969:62: (iv_ruleDeterministicRelation= ruleDeterministicRelation EOF )
            // InternalBugsDsl.g:970:2: iv_ruleDeterministicRelation= ruleDeterministicRelation EOF
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
    // InternalBugsDsl.g:976:1: ruleDeterministicRelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) ) ;
    public final EObject ruleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:982:2: ( ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) ) )
            // InternalBugsDsl.g:983:2: ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) )
            {
            // InternalBugsDsl.g:983:2: ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) )
            // InternalBugsDsl.g:984:3: () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) )
            {
            // InternalBugsDsl.g:984:3: ()
            // InternalBugsDsl.g:985:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDeterministicRelationAccess().getDeterministicRelationAction_0(),
              					current);
              			
            }

            }

            // InternalBugsDsl.g:991:3: ( (lv_name_1_0= ruleArrayID ) )
            // InternalBugsDsl.g:992:4: (lv_name_1_0= ruleArrayID )
            {
            // InternalBugsDsl.g:992:4: (lv_name_1_0= ruleArrayID )
            // InternalBugsDsl.g:993:5: lv_name_1_0= ruleArrayID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeterministicRelationAccess().getNameArrayIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            // InternalBugsDsl.g:1010:3: (otherlv_2= '<-' | otherlv_3= '=' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            else if ( (LA18_0==30) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBugsDsl.g:1011:4: otherlv_2= '<-'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDeterministicRelationAccess().getLessThanSignHyphenMinusKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1016:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDeterministicRelationAccess().getEqualsSignKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalBugsDsl.g:1021:3: ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) )
            // InternalBugsDsl.g:1022:4: ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression )
            {
            // InternalBugsDsl.g:1026:4: (lv_expressions_4_0= ruleExpression )
            // InternalBugsDsl.g:1027:5: lv_expressions_4_0= ruleExpression
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
    // InternalBugsDsl.g:1048:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalBugsDsl.g:1048:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalBugsDsl.g:1049:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalBugsDsl.g:1055:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:1061:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalBugsDsl.g:1062:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalBugsDsl.g:1062:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt19=1;
                }
                break;
            case 23:
                {
                alt19=2;
                }
                break;
            case 31:
                {
                alt19=3;
                }
                break;
            case 32:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalBugsDsl.g:1063:3: kw= '+'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1069:3: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1075:3: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1081:3: kw= '/'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
    // InternalBugsDsl.g:1090:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalBugsDsl.g:1090:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalBugsDsl.g:1091:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalBugsDsl.g:1097:1: ruleFunction returns [EObject current=null] : ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) ;
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
            // InternalBugsDsl.g:1103:2: ( ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) )
            // InternalBugsDsl.g:1104:2: ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            {
            // InternalBugsDsl.g:1104:2: ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            // InternalBugsDsl.g:1105:3: ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            {
            // InternalBugsDsl.g:1105:3: ( (lv_operation_0_0= ruleFunctionOperator ) )
            // InternalBugsDsl.g:1106:4: (lv_operation_0_0= ruleFunctionOperator )
            {
            // InternalBugsDsl.g:1106:4: (lv_operation_0_0= ruleFunctionOperator )
            // InternalBugsDsl.g:1107:5: lv_operation_0_0= ruleFunctionOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getOperationFunctionOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            // InternalBugsDsl.g:1124:3: (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            else if ( (LA22_0==16) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalBugsDsl.g:1125:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1130:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalBugsDsl.g:1130:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    // InternalBugsDsl.g:1131:5: otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalBugsDsl.g:1135:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    int alt21=2;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // InternalBugsDsl.g:1136:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')'
                            {
                            // InternalBugsDsl.g:1136:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) )
                            // InternalBugsDsl.g:1137:7: ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) )
                            {
                            // InternalBugsDsl.g:1143:7: ( (lv_params_3_0= ruleExpression ) )
                            // InternalBugsDsl.g:1144:8: (lv_params_3_0= ruleExpression )
                            {
                            // InternalBugsDsl.g:1144:8: (lv_params_3_0= ruleExpression )
                            // InternalBugsDsl.g:1145:9: lv_params_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_1_1_1_0_0_0());
                              								
                            }
                            pushFollow(FOLLOW_23);
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

                            // InternalBugsDsl.g:1163:6: (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==25) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalBugsDsl.g:1164:7: otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalBugsDsl.g:1168:7: ( (lv_params_5_0= ruleExpression ) )
                            	    // InternalBugsDsl.g:1169:8: (lv_params_5_0= ruleExpression )
                            	    {
                            	    // InternalBugsDsl.g:1169:8: (lv_params_5_0= ruleExpression )
                            	    // InternalBugsDsl.g:1170:9: lv_params_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_1_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_23);
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
                            	    break loop20;
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


    // $ANTLR start "entryRuleArrayFunction"
    // InternalBugsDsl.g:1199:1: entryRuleArrayFunction returns [EObject current=null] : iv_ruleArrayFunction= ruleArrayFunction EOF ;
    public final EObject entryRuleArrayFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayFunction = null;


        try {
            // InternalBugsDsl.g:1199:54: (iv_ruleArrayFunction= ruleArrayFunction EOF )
            // InternalBugsDsl.g:1200:2: iv_ruleArrayFunction= ruleArrayFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayFunction=ruleArrayFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayFunction; 
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
    // $ANTLR end "entryRuleArrayFunction"


    // $ANTLR start "ruleArrayFunction"
    // InternalBugsDsl.g:1206:1: ruleArrayFunction returns [EObject current=null] : ( ( (lv_operation_0_0= ruleArrayOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) ;
    public final EObject ruleArrayFunction() throws RecognitionException {
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
            // InternalBugsDsl.g:1212:2: ( ( ( (lv_operation_0_0= ruleArrayOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) )
            // InternalBugsDsl.g:1213:2: ( ( (lv_operation_0_0= ruleArrayOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            {
            // InternalBugsDsl.g:1213:2: ( ( (lv_operation_0_0= ruleArrayOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            // InternalBugsDsl.g:1214:3: ( (lv_operation_0_0= ruleArrayOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            {
            // InternalBugsDsl.g:1214:3: ( (lv_operation_0_0= ruleArrayOperator ) )
            // InternalBugsDsl.g:1215:4: (lv_operation_0_0= ruleArrayOperator )
            {
            // InternalBugsDsl.g:1215:4: (lv_operation_0_0= ruleArrayOperator )
            // InternalBugsDsl.g:1216:5: lv_operation_0_0= ruleArrayOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayFunctionAccess().getOperationArrayOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_operation_0_0=ruleArrayOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayFunctionRule());
              					}
              					set(
              						current,
              						"operation",
              						lv_operation_0_0,
              						"com.opcoach.bugsy.xtext.BugsDsl.ArrayOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBugsDsl.g:1233:3: (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            else if ( (LA25_0==16) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalBugsDsl.g:1234:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArrayFunctionAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1239:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalBugsDsl.g:1239:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    // InternalBugsDsl.g:1240:5: otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getArrayFunctionAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalBugsDsl.g:1244:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    int alt24=2;
                    alt24 = dfa24.predict(input);
                    switch (alt24) {
                        case 1 :
                            // InternalBugsDsl.g:1245:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')'
                            {
                            // InternalBugsDsl.g:1245:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) )
                            // InternalBugsDsl.g:1246:7: ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) )
                            {
                            // InternalBugsDsl.g:1252:7: ( (lv_params_3_0= ruleExpression ) )
                            // InternalBugsDsl.g:1253:8: (lv_params_3_0= ruleExpression )
                            {
                            // InternalBugsDsl.g:1253:8: (lv_params_3_0= ruleExpression )
                            // InternalBugsDsl.g:1254:9: lv_params_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getArrayFunctionAccess().getParamsExpressionParserRuleCall_1_1_1_0_0_0());
                              								
                            }
                            pushFollow(FOLLOW_23);
                            lv_params_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getArrayFunctionRule());
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

                            // InternalBugsDsl.g:1272:6: (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==25) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalBugsDsl.g:1273:7: otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getArrayFunctionAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalBugsDsl.g:1277:7: ( (lv_params_5_0= ruleExpression ) )
                            	    // InternalBugsDsl.g:1278:8: (lv_params_5_0= ruleExpression )
                            	    {
                            	    // InternalBugsDsl.g:1278:8: (lv_params_5_0= ruleExpression )
                            	    // InternalBugsDsl.g:1279:9: lv_params_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getArrayFunctionAccess().getParamsExpressionParserRuleCall_1_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_23);
                            	    lv_params_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getArrayFunctionRule());
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
                            	    break loop23;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getArrayFunctionAccess().getRightParenthesisKeyword_1_1_1_2());
                              					
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
    // $ANTLR end "ruleArrayFunction"


    // $ANTLR start "entryRuleDistribution"
    // InternalBugsDsl.g:1308:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // InternalBugsDsl.g:1308:53: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalBugsDsl.g:1309:2: iv_ruleDistribution= ruleDistribution EOF
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
    // InternalBugsDsl.g:1315:1: ruleDistribution returns [EObject current=null] : ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) ;
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
            // InternalBugsDsl.g:1321:2: ( ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) )
            // InternalBugsDsl.g:1322:2: ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            {
            // InternalBugsDsl.g:1322:2: ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            // InternalBugsDsl.g:1323:3: ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            {
            // InternalBugsDsl.g:1323:3: ( (lv_distrib_0_0= ruleDistributionOperator ) )
            // InternalBugsDsl.g:1324:4: (lv_distrib_0_0= ruleDistributionOperator )
            {
            // InternalBugsDsl.g:1324:4: (lv_distrib_0_0= ruleDistributionOperator )
            // InternalBugsDsl.g:1325:5: lv_distrib_0_0= ruleDistributionOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDistributionAccess().getDistribDistributionOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            // InternalBugsDsl.g:1342:3: (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            else if ( (LA28_0==16) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalBugsDsl.g:1343:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDistributionAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1348:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalBugsDsl.g:1348:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    // InternalBugsDsl.g:1349:5: otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDistributionAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalBugsDsl.g:1353:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    int alt27=2;
                    alt27 = dfa27.predict(input);
                    switch (alt27) {
                        case 1 :
                            // InternalBugsDsl.g:1354:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')'
                            {
                            // InternalBugsDsl.g:1354:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) )
                            // InternalBugsDsl.g:1355:7: ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) )
                            {
                            // InternalBugsDsl.g:1361:7: ( (lv_params_3_0= ruleExpression ) )
                            // InternalBugsDsl.g:1362:8: (lv_params_3_0= ruleExpression )
                            {
                            // InternalBugsDsl.g:1362:8: (lv_params_3_0= ruleExpression )
                            // InternalBugsDsl.g:1363:9: lv_params_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getDistributionAccess().getParamsExpressionParserRuleCall_1_1_1_0_0_0());
                              								
                            }
                            pushFollow(FOLLOW_23);
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

                            // InternalBugsDsl.g:1381:6: (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==25) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalBugsDsl.g:1382:7: otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getDistributionAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalBugsDsl.g:1386:7: ( (lv_params_5_0= ruleExpression ) )
                            	    // InternalBugsDsl.g:1387:8: (lv_params_5_0= ruleExpression )
                            	    {
                            	    // InternalBugsDsl.g:1387:8: (lv_params_5_0= ruleExpression )
                            	    // InternalBugsDsl.g:1388:9: lv_params_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getDistributionAccess().getParamsExpressionParserRuleCall_1_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_23);
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
                            	    break loop26;
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
    // InternalBugsDsl.g:1417:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBugsDsl.g:1417:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalBugsDsl.g:1418:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalBugsDsl.g:1424:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:1430:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalBugsDsl.g:1431:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalBugsDsl.g:1431:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalBugsDsl.g:1432:3: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBugsDsl.g:1440:3: ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=22 && LA29_0<=23)||(LA29_0>=31 && LA29_0<=32)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBugsDsl.g:1441:4: () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalBugsDsl.g:1441:4: ()
            	    // InternalBugsDsl.g:1442:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBugsDsl.g:1448:4: ( (lv_op_2_0= ruleOperator ) )
            	    // InternalBugsDsl.g:1449:5: (lv_op_2_0= ruleOperator )
            	    {
            	    // InternalBugsDsl.g:1449:5: (lv_op_2_0= ruleOperator )
            	    // InternalBugsDsl.g:1450:6: lv_op_2_0= ruleOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
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

            	    // InternalBugsDsl.g:1467:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalBugsDsl.g:1468:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalBugsDsl.g:1468:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalBugsDsl.g:1469:6: lv_right_3_0= ruleTerminalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop29;
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
    // InternalBugsDsl.g:1491:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalBugsDsl.g:1491:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalBugsDsl.g:1492:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalBugsDsl.g:1498:1: ruleTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) | ( (lv_arrayFunction_6_0= ruleArrayFunction ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject lv_value_3_0 = null;

        EObject lv_function_4_0 = null;

        EObject lv_distribution_5_0 = null;

        EObject lv_arrayFunction_6_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:1504:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) | ( (lv_arrayFunction_6_0= ruleArrayFunction ) ) ) )
            // InternalBugsDsl.g:1505:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) | ( (lv_arrayFunction_6_0= ruleArrayFunction ) ) )
            {
            // InternalBugsDsl.g:1505:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) | ( (lv_arrayFunction_6_0= ruleArrayFunction ) ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
                {
                alt30=2;
                }
                break;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt30=3;
                }
                break;
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
            case 48:
                {
                alt30=4;
                }
                break;
            case 64:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalBugsDsl.g:1506:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalBugsDsl.g:1506:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalBugsDsl.g:1507:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
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
                    // InternalBugsDsl.g:1525:3: ( (lv_value_3_0= ruleValue ) )
                    {
                    // InternalBugsDsl.g:1525:3: ( (lv_value_3_0= ruleValue ) )
                    // InternalBugsDsl.g:1526:4: (lv_value_3_0= ruleValue )
                    {
                    // InternalBugsDsl.g:1526:4: (lv_value_3_0= ruleValue )
                    // InternalBugsDsl.g:1527:5: lv_value_3_0= ruleValue
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
                    // InternalBugsDsl.g:1545:3: ( (lv_function_4_0= ruleFunction ) )
                    {
                    // InternalBugsDsl.g:1545:3: ( (lv_function_4_0= ruleFunction ) )
                    // InternalBugsDsl.g:1546:4: (lv_function_4_0= ruleFunction )
                    {
                    // InternalBugsDsl.g:1546:4: (lv_function_4_0= ruleFunction )
                    // InternalBugsDsl.g:1547:5: lv_function_4_0= ruleFunction
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
                    // InternalBugsDsl.g:1565:3: ( (lv_distribution_5_0= ruleDistribution ) )
                    {
                    // InternalBugsDsl.g:1565:3: ( (lv_distribution_5_0= ruleDistribution ) )
                    // InternalBugsDsl.g:1566:4: (lv_distribution_5_0= ruleDistribution )
                    {
                    // InternalBugsDsl.g:1566:4: (lv_distribution_5_0= ruleDistribution )
                    // InternalBugsDsl.g:1567:5: lv_distribution_5_0= ruleDistribution
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
                case 5 :
                    // InternalBugsDsl.g:1585:3: ( (lv_arrayFunction_6_0= ruleArrayFunction ) )
                    {
                    // InternalBugsDsl.g:1585:3: ( (lv_arrayFunction_6_0= ruleArrayFunction ) )
                    // InternalBugsDsl.g:1586:4: (lv_arrayFunction_6_0= ruleArrayFunction )
                    {
                    // InternalBugsDsl.g:1586:4: (lv_arrayFunction_6_0= ruleArrayFunction )
                    // InternalBugsDsl.g:1587:5: lv_arrayFunction_6_0= ruleArrayFunction
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerminalExpressionAccess().getArrayFunctionArrayFunctionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_arrayFunction_6_0=ruleArrayFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      					}
                      					set(
                      						current,
                      						"arrayFunction",
                      						lv_arrayFunction_6_0,
                      						"com.opcoach.bugsy.xtext.BugsDsl.ArrayFunction");
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
    // InternalBugsDsl.g:1608:1: ruleDistributionOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) ) ;
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
            // InternalBugsDsl.g:1614:2: ( ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) ) )
            // InternalBugsDsl.g:1615:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) )
            {
            // InternalBugsDsl.g:1615:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) )
            int alt31=16;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt31=1;
                }
                break;
            case 34:
                {
                alt31=2;
                }
                break;
            case 35:
                {
                alt31=3;
                }
                break;
            case 36:
                {
                alt31=4;
                }
                break;
            case 37:
                {
                alt31=5;
                }
                break;
            case 38:
                {
                alt31=6;
                }
                break;
            case 39:
                {
                alt31=7;
                }
                break;
            case 40:
                {
                alt31=8;
                }
                break;
            case 41:
                {
                alt31=9;
                }
                break;
            case 42:
                {
                alt31=10;
                }
                break;
            case 43:
                {
                alt31=11;
                }
                break;
            case 44:
                {
                alt31=12;
                }
                break;
            case 45:
                {
                alt31=13;
                }
                break;
            case 46:
                {
                alt31=14;
                }
                break;
            case 47:
                {
                alt31=15;
                }
                break;
            case 48:
                {
                alt31=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalBugsDsl.g:1616:3: (enumLiteral_0= 'dbern' )
                    {
                    // InternalBugsDsl.g:1616:3: (enumLiteral_0= 'dbern' )
                    // InternalBugsDsl.g:1617:4: enumLiteral_0= 'dbern'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDbernEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDistributionOperatorAccess().getDbernEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1624:3: (enumLiteral_1= 'dbin' )
                    {
                    // InternalBugsDsl.g:1624:3: (enumLiteral_1= 'dbin' )
                    // InternalBugsDsl.g:1625:4: enumLiteral_1= 'dbin'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDbinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDistributionOperatorAccess().getDbinEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1632:3: (enumLiteral_2= 'dchisqr' )
                    {
                    // InternalBugsDsl.g:1632:3: (enumLiteral_2= 'dchisqr' )
                    // InternalBugsDsl.g:1633:4: enumLiteral_2= 'dchisqr'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDchisqrEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDistributionOperatorAccess().getDchisqrEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1640:3: (enumLiteral_3= 'ddexp' )
                    {
                    // InternalBugsDsl.g:1640:3: (enumLiteral_3= 'ddexp' )
                    // InternalBugsDsl.g:1641:4: enumLiteral_3= 'ddexp'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDdexpEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDistributionOperatorAccess().getDdexpEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:1648:3: (enumLiteral_4= 'dexp' )
                    {
                    // InternalBugsDsl.g:1648:3: (enumLiteral_4= 'dexp' )
                    // InternalBugsDsl.g:1649:4: enumLiteral_4= 'dexp'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDexpEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDistributionOperatorAccess().getDexpEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:1656:3: (enumLiteral_5= 'df' )
                    {
                    // InternalBugsDsl.g:1656:3: (enumLiteral_5= 'df' )
                    // InternalBugsDsl.g:1657:4: enumLiteral_5= 'df'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDfEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDistributionOperatorAccess().getDfEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:1664:3: (enumLiteral_6= 'dgen.gamma' )
                    {
                    // InternalBugsDsl.g:1664:3: (enumLiteral_6= 'dgen.gamma' )
                    // InternalBugsDsl.g:1665:4: enumLiteral_6= 'dgen.gamma'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDgengammEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDistributionOperatorAccess().getDgengammEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:1672:3: (enumLiteral_7= 'dhyper' )
                    {
                    // InternalBugsDsl.g:1672:3: (enumLiteral_7= 'dhyper' )
                    // InternalBugsDsl.g:1673:4: enumLiteral_7= 'dhyper'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDhyperEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDistributionOperatorAccess().getDhyperEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalBugsDsl.g:1680:3: (enumLiteral_8= 'dlogis' )
                    {
                    // InternalBugsDsl.g:1680:3: (enumLiteral_8= 'dlogis' )
                    // InternalBugsDsl.g:1681:4: enumLiteral_8= 'dlogis'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDlogisEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDistributionOperatorAccess().getDlogisEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalBugsDsl.g:1688:3: (enumLiteral_9= 'dlnorm' )
                    {
                    // InternalBugsDsl.g:1688:3: (enumLiteral_9= 'dlnorm' )
                    // InternalBugsDsl.g:1689:4: enumLiteral_9= 'dlnorm'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDlnormEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDistributionOperatorAccess().getDlnormEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalBugsDsl.g:1696:3: (enumLiteral_10= 'dnegbin' )
                    {
                    // InternalBugsDsl.g:1696:3: (enumLiteral_10= 'dnegbin' )
                    // InternalBugsDsl.g:1697:4: enumLiteral_10= 'dnegbin'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDnegbinEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getDistributionOperatorAccess().getDnegbinEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalBugsDsl.g:1704:3: (enumLiteral_11= 'dnchisqr' )
                    {
                    // InternalBugsDsl.g:1704:3: (enumLiteral_11= 'dnchisqr' )
                    // InternalBugsDsl.g:1705:4: enumLiteral_11= 'dnchisqr'
                    {
                    enumLiteral_11=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDnchisqrEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getDistributionOperatorAccess().getDnchisqrEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalBugsDsl.g:1712:3: (enumLiteral_12= 'dpar' )
                    {
                    // InternalBugsDsl.g:1712:3: (enumLiteral_12= 'dpar' )
                    // InternalBugsDsl.g:1713:4: enumLiteral_12= 'dpar'
                    {
                    enumLiteral_12=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDparEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getDistributionOperatorAccess().getDparEnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalBugsDsl.g:1720:3: (enumLiteral_13= 'dpois' )
                    {
                    // InternalBugsDsl.g:1720:3: (enumLiteral_13= 'dpois' )
                    // InternalBugsDsl.g:1721:4: enumLiteral_13= 'dpois'
                    {
                    enumLiteral_13=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDpoisEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getDistributionOperatorAccess().getDpoisEnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalBugsDsl.g:1728:3: (enumLiteral_14= 'dt' )
                    {
                    // InternalBugsDsl.g:1728:3: (enumLiteral_14= 'dt' )
                    // InternalBugsDsl.g:1729:4: enumLiteral_14= 'dt'
                    {
                    enumLiteral_14=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDistributionOperatorAccess().getDtEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getDistributionOperatorAccess().getDtEnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalBugsDsl.g:1736:3: (enumLiteral_15= 'dweib' )
                    {
                    // InternalBugsDsl.g:1736:3: (enumLiteral_15= 'dweib' )
                    // InternalBugsDsl.g:1737:4: enumLiteral_15= 'dweib'
                    {
                    enumLiteral_15=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleDensityOperator"
    // InternalBugsDsl.g:1747:1: ruleDensityOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) ) ;
    public final Enumerator ruleDensityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:1753:2: ( ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) ) )
            // InternalBugsDsl.g:1754:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) )
            {
            // InternalBugsDsl.g:1754:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt32=1;
                }
                break;
            case 50:
                {
                alt32=2;
                }
                break;
            case 51:
                {
                alt32=3;
                }
                break;
            case 52:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalBugsDsl.g:1755:3: (enumLiteral_0= 'dnorm' )
                    {
                    // InternalBugsDsl.g:1755:3: (enumLiteral_0= 'dnorm' )
                    // InternalBugsDsl.g:1756:4: enumLiteral_0= 'dnorm'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityOperatorAccess().getDnormEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDensityOperatorAccess().getDnormEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1763:3: (enumLiteral_1= 'dunif' )
                    {
                    // InternalBugsDsl.g:1763:3: (enumLiteral_1= 'dunif' )
                    // InternalBugsDsl.g:1764:4: enumLiteral_1= 'dunif'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityOperatorAccess().getDunifEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDensityOperatorAccess().getDunifEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1771:3: (enumLiteral_2= 'dbeta' )
                    {
                    // InternalBugsDsl.g:1771:3: (enumLiteral_2= 'dbeta' )
                    // InternalBugsDsl.g:1772:4: enumLiteral_2= 'dbeta'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityOperatorAccess().getDbetaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDensityOperatorAccess().getDbetaEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1779:3: (enumLiteral_3= 'dgamma' )
                    {
                    // InternalBugsDsl.g:1779:3: (enumLiteral_3= 'dgamma' )
                    // InternalBugsDsl.g:1780:4: enumLiteral_3= 'dgamma'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityOperatorAccess().getDgammaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDensityOperatorAccess().getDgammaEnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleDensityOperator"


    // $ANTLR start "ruleFunctionOperator"
    // InternalBugsDsl.g:1790:1: ruleFunctionOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) | (enumLiteral_10= 'length' ) ) ;
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
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:1796:2: ( ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) | (enumLiteral_10= 'length' ) ) )
            // InternalBugsDsl.g:1797:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) | (enumLiteral_10= 'length' ) )
            {
            // InternalBugsDsl.g:1797:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) | (enumLiteral_10= 'length' ) )
            int alt33=11;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt33=1;
                }
                break;
            case 54:
                {
                alt33=2;
                }
                break;
            case 55:
                {
                alt33=3;
                }
                break;
            case 56:
                {
                alt33=4;
                }
                break;
            case 57:
                {
                alt33=5;
                }
                break;
            case 58:
                {
                alt33=6;
                }
                break;
            case 59:
                {
                alt33=7;
                }
                break;
            case 60:
                {
                alt33=8;
                }
                break;
            case 61:
                {
                alt33=9;
                }
                break;
            case 62:
                {
                alt33=10;
                }
                break;
            case 63:
                {
                alt33=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalBugsDsl.g:1798:3: (enumLiteral_0= 'acos' )
                    {
                    // InternalBugsDsl.g:1798:3: (enumLiteral_0= 'acos' )
                    // InternalBugsDsl.g:1799:4: enumLiteral_0= 'acos'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAcosEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getFunctionOperatorAccess().getAcosEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1806:3: (enumLiteral_1= 'acosh' )
                    {
                    // InternalBugsDsl.g:1806:3: (enumLiteral_1= 'acosh' )
                    // InternalBugsDsl.g:1807:4: enumLiteral_1= 'acosh'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAcoshEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getFunctionOperatorAccess().getAcoshEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1814:3: (enumLiteral_2= 'asin' )
                    {
                    // InternalBugsDsl.g:1814:3: (enumLiteral_2= 'asin' )
                    // InternalBugsDsl.g:1815:4: enumLiteral_2= 'asin'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAsinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getFunctionOperatorAccess().getAsinEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1822:3: (enumLiteral_3= 'asinh' )
                    {
                    // InternalBugsDsl.g:1822:3: (enumLiteral_3= 'asinh' )
                    // InternalBugsDsl.g:1823:4: enumLiteral_3= 'asinh'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAsinhEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getFunctionOperatorAccess().getAsinhEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBugsDsl.g:1830:3: (enumLiteral_4= 'atan' )
                    {
                    // InternalBugsDsl.g:1830:3: (enumLiteral_4= 'atan' )
                    // InternalBugsDsl.g:1831:4: enumLiteral_4= 'atan'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getAtanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getFunctionOperatorAccess().getAtanEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBugsDsl.g:1838:3: (enumLiteral_5= 'log' )
                    {
                    // InternalBugsDsl.g:1838:3: (enumLiteral_5= 'log' )
                    // InternalBugsDsl.g:1839:4: enumLiteral_5= 'log'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getLogEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getFunctionOperatorAccess().getLogEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalBugsDsl.g:1846:3: (enumLiteral_6= 'exp' )
                    {
                    // InternalBugsDsl.g:1846:3: (enumLiteral_6= 'exp' )
                    // InternalBugsDsl.g:1847:4: enumLiteral_6= 'exp'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getEpEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getFunctionOperatorAccess().getEpEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalBugsDsl.g:1854:3: (enumLiteral_7= 'c' )
                    {
                    // InternalBugsDsl.g:1854:3: (enumLiteral_7= 'c' )
                    // InternalBugsDsl.g:1855:4: enumLiteral_7= 'c'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getCEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getFunctionOperatorAccess().getCEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalBugsDsl.g:1862:3: (enumLiteral_8= 'mean' )
                    {
                    // InternalBugsDsl.g:1862:3: (enumLiteral_8= 'mean' )
                    // InternalBugsDsl.g:1863:4: enumLiteral_8= 'mean'
                    {
                    enumLiteral_8=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getMeanEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getFunctionOperatorAccess().getMeanEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalBugsDsl.g:1870:3: (enumLiteral_9= 'sqrt' )
                    {
                    // InternalBugsDsl.g:1870:3: (enumLiteral_9= 'sqrt' )
                    // InternalBugsDsl.g:1871:4: enumLiteral_9= 'sqrt'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getSqrtEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getFunctionOperatorAccess().getSqrtEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalBugsDsl.g:1878:3: (enumLiteral_10= 'length' )
                    {
                    // InternalBugsDsl.g:1878:3: (enumLiteral_10= 'length' )
                    // InternalBugsDsl.g:1879:4: enumLiteral_10= 'length'
                    {
                    enumLiteral_10=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionOperatorAccess().getLengthEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getFunctionOperatorAccess().getLengthEnumLiteralDeclaration_10());
                      			
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


    // $ANTLR start "ruleIntOperator"
    // InternalBugsDsl.g:1889:1: ruleIntOperator returns [Enumerator current=null] : (enumLiteral_0= 'length' ) ;
    public final Enumerator ruleIntOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:1895:2: ( (enumLiteral_0= 'length' ) )
            // InternalBugsDsl.g:1896:2: (enumLiteral_0= 'length' )
            {
            // InternalBugsDsl.g:1896:2: (enumLiteral_0= 'length' )
            // InternalBugsDsl.g:1897:3: enumLiteral_0= 'length'
            {
            enumLiteral_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getIntOperatorAccess().getLengthEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getIntOperatorAccess().getLengthEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleIntOperator"


    // $ANTLR start "ruleArrayOperator"
    // InternalBugsDsl.g:1906:1: ruleArrayOperator returns [Enumerator current=null] : (enumLiteral_0= 'dim' ) ;
    public final Enumerator ruleArrayOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:1912:2: ( (enumLiteral_0= 'dim' ) )
            // InternalBugsDsl.g:1913:2: (enumLiteral_0= 'dim' )
            {
            // InternalBugsDsl.g:1913:2: (enumLiteral_0= 'dim' )
            // InternalBugsDsl.g:1914:3: enumLiteral_0= 'dim'
            {
            enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getArrayOperatorAccess().getDimEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getArrayOperatorAccess().getDimEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleArrayOperator"

    // $ANTLR start synpred2_InternalBugsDsl
    public final void synpred2_InternalBugsDsl_fragment() throws RecognitionException {   
        // InternalBugsDsl.g:1137:7: ( ( ( ruleExpression ) ) )
        // InternalBugsDsl.g:1137:8: ( ( ruleExpression ) )
        {
        // InternalBugsDsl.g:1137:8: ( ( ruleExpression ) )
        // InternalBugsDsl.g:1138:8: ( ruleExpression )
        {
        // InternalBugsDsl.g:1138:8: ( ruleExpression )
        // InternalBugsDsl.g:1139:9: ruleExpression
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
        // InternalBugsDsl.g:1246:7: ( ( ( ruleExpression ) ) )
        // InternalBugsDsl.g:1246:8: ( ( ruleExpression ) )
        {
        // InternalBugsDsl.g:1246:8: ( ( ruleExpression ) )
        // InternalBugsDsl.g:1247:8: ( ruleExpression )
        {
        // InternalBugsDsl.g:1247:8: ( ruleExpression )
        // InternalBugsDsl.g:1248:9: ruleExpression
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

    // $ANTLR start synpred4_InternalBugsDsl
    public final void synpred4_InternalBugsDsl_fragment() throws RecognitionException {   
        // InternalBugsDsl.g:1355:7: ( ( ( ruleExpression ) ) )
        // InternalBugsDsl.g:1355:8: ( ( ruleExpression ) )
        {
        // InternalBugsDsl.g:1355:8: ( ( ruleExpression ) )
        // InternalBugsDsl.g:1356:8: ( ruleExpression )
        {
        // InternalBugsDsl.g:1356:8: ( ruleExpression )
        // InternalBugsDsl.g:1357:9: ruleExpression
        {
        pushFollow(FOLLOW_2);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalBugsDsl

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
    public final boolean synpred4_InternalBugsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalBugsDsl_fragment(); // can never throw exception
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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\4\1\30\1\4\2\uffff\2\23\2\4\1\33\2\31\2\23\1\4\2\31";
    static final String dfa_3s = "\1\4\1\36\1\5\2\uffff\2\32\2\5\1\36\4\32\1\5\2\32";
    static final String dfa_4s = "\3\uffff\1\2\1\1\14\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\2\uffff\1\4\1\uffff\2\3",
            "\1\6\1\5",
            "",
            "",
            "\1\7\5\uffff\1\10\1\11",
            "\1\7\5\uffff\1\10\1\11",
            "\1\13\1\12",
            "\1\15\1\14",
            "\1\4\1\uffff\2\3",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\16\5\uffff\1\10\1\11",
            "\1\16\5\uffff\1\10\1\11",
            "\1\20\1\17",
            "\1\10\1\11",
            "\1\10\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "816:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )";
        }
    }
    static final String dfa_7s = "\64\uffff";
    static final String dfa_8s = "\1\40\63\uffff";
    static final String dfa_9s = "\1\4\2\uffff\1\22\35\uffff\1\4\6\uffff\2\23\2\4\1\22\2\31\2\23\1\4\2\31";
    static final String dfa_10s = "\1\100\2\uffff\1\40\35\uffff\1\5\6\uffff\2\32\2\5\1\40\4\32\1\5\2\32";
    static final String dfa_11s = "\1\uffff\2\1\1\uffff\34\1\1\2\1\uffff\6\1\14\uffff";
    static final String dfa_12s = "\1\0\2\uffff\1\2\50\uffff\1\1\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\2\7\uffff\1\40\1\uffff\1\40\1\1\1\uffff\1\40\3\uffff\2\40\1\uffff\1\40\5\uffff\2\40\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\37",
            "",
            "",
            "\1\47\3\uffff\1\42\1\43\1\41\1\46\1\uffff\1\40\1\uffff\2\40\1\44\1\45",
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
            "",
            "\1\51\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52\5\uffff\1\53\1\54",
            "\1\52\5\uffff\1\53\1\54",
            "\1\56\1\55",
            "\1\60\1\57",
            "\1\47\3\uffff\1\42\1\43\1\uffff\1\46\1\uffff\1\40\1\uffff\2\40\1\44\1\45",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\61\5\uffff\1\53\1\54",
            "\1\61\5\uffff\1\53\1\54",
            "\1\63\1\62",
            "\1\53\1\54",
            "\1\53\1\54"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1135:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_0==16) && (synpred2_InternalBugsDsl())) {s = 1;}

                        else if ( (LA21_0==RULE_INT) && (synpred2_InternalBugsDsl())) {s = 2;}

                        else if ( (LA21_0==RULE_ID) ) {s = 3;}

                        else if ( (LA21_0==53) && (synpred2_InternalBugsDsl())) {s = 4;}

                        else if ( (LA21_0==54) && (synpred2_InternalBugsDsl())) {s = 5;}

                        else if ( (LA21_0==55) && (synpred2_InternalBugsDsl())) {s = 6;}

                        else if ( (LA21_0==56) && (synpred2_InternalBugsDsl())) {s = 7;}

                        else if ( (LA21_0==57) && (synpred2_InternalBugsDsl())) {s = 8;}

                        else if ( (LA21_0==58) && (synpred2_InternalBugsDsl())) {s = 9;}

                        else if ( (LA21_0==59) && (synpred2_InternalBugsDsl())) {s = 10;}

                        else if ( (LA21_0==60) && (synpred2_InternalBugsDsl())) {s = 11;}

                        else if ( (LA21_0==61) && (synpred2_InternalBugsDsl())) {s = 12;}

                        else if ( (LA21_0==62) && (synpred2_InternalBugsDsl())) {s = 13;}

                        else if ( (LA21_0==63) && (synpred2_InternalBugsDsl())) {s = 14;}

                        else if ( (LA21_0==33) && (synpred2_InternalBugsDsl())) {s = 15;}

                        else if ( (LA21_0==34) && (synpred2_InternalBugsDsl())) {s = 16;}

                        else if ( (LA21_0==35) && (synpred2_InternalBugsDsl())) {s = 17;}

                        else if ( (LA21_0==36) && (synpred2_InternalBugsDsl())) {s = 18;}

                        else if ( (LA21_0==37) && (synpred2_InternalBugsDsl())) {s = 19;}

                        else if ( (LA21_0==38) && (synpred2_InternalBugsDsl())) {s = 20;}

                        else if ( (LA21_0==39) && (synpred2_InternalBugsDsl())) {s = 21;}

                        else if ( (LA21_0==40) && (synpred2_InternalBugsDsl())) {s = 22;}

                        else if ( (LA21_0==41) && (synpred2_InternalBugsDsl())) {s = 23;}

                        else if ( (LA21_0==42) && (synpred2_InternalBugsDsl())) {s = 24;}

                        else if ( (LA21_0==43) && (synpred2_InternalBugsDsl())) {s = 25;}

                        else if ( (LA21_0==44) && (synpred2_InternalBugsDsl())) {s = 26;}

                        else if ( (LA21_0==45) && (synpred2_InternalBugsDsl())) {s = 27;}

                        else if ( (LA21_0==46) && (synpred2_InternalBugsDsl())) {s = 28;}

                        else if ( (LA21_0==47) && (synpred2_InternalBugsDsl())) {s = 29;}

                        else if ( (LA21_0==48) && (synpred2_InternalBugsDsl())) {s = 30;}

                        else if ( (LA21_0==64) && (synpred2_InternalBugsDsl())) {s = 31;}

                        else if ( (LA21_0==EOF||LA21_0==13||LA21_0==15||LA21_0==18||(LA21_0>=22 && LA21_0<=23)||LA21_0==25||(LA21_0>=31 && LA21_0<=32)) ) {s = 32;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_44 = input.LA(1);

                         
                        int index21_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_44==27||(LA21_44>=29 && LA21_44<=30)) ) {s = 32;}

                        else if ( (LA21_44==22) && (synpred2_InternalBugsDsl())) {s = 34;}

                        else if ( (LA21_44==23) && (synpred2_InternalBugsDsl())) {s = 35;}

                        else if ( (LA21_44==31) && (synpred2_InternalBugsDsl())) {s = 36;}

                        else if ( (LA21_44==32) && (synpred2_InternalBugsDsl())) {s = 37;}

                        else if ( (LA21_44==25) && (synpred2_InternalBugsDsl())) {s = 38;}

                        else if ( (LA21_44==18) && (synpred2_InternalBugsDsl())) {s = 39;}

                         
                        input.seek(index21_44);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_3==24) ) {s = 33;}

                        else if ( (LA21_3==27||(LA21_3>=29 && LA21_3<=30)) ) {s = 32;}

                        else if ( (LA21_3==22) && (synpred2_InternalBugsDsl())) {s = 34;}

                        else if ( (LA21_3==23) && (synpred2_InternalBugsDsl())) {s = 35;}

                        else if ( (LA21_3==31) && (synpred2_InternalBugsDsl())) {s = 36;}

                        else if ( (LA21_3==32) && (synpred2_InternalBugsDsl())) {s = 37;}

                        else if ( (LA21_3==25) && (synpred2_InternalBugsDsl())) {s = 38;}

                        else if ( (LA21_3==18) && (synpred2_InternalBugsDsl())) {s = 39;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\1\0\2\uffff\1\1\50\uffff\1\2\7\uffff}>";
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_14;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1244:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_0==16) && (synpred3_InternalBugsDsl())) {s = 1;}

                        else if ( (LA24_0==RULE_INT) && (synpred3_InternalBugsDsl())) {s = 2;}

                        else if ( (LA24_0==RULE_ID) ) {s = 3;}

                        else if ( (LA24_0==53) && (synpred3_InternalBugsDsl())) {s = 4;}

                        else if ( (LA24_0==54) && (synpred3_InternalBugsDsl())) {s = 5;}

                        else if ( (LA24_0==55) && (synpred3_InternalBugsDsl())) {s = 6;}

                        else if ( (LA24_0==56) && (synpred3_InternalBugsDsl())) {s = 7;}

                        else if ( (LA24_0==57) && (synpred3_InternalBugsDsl())) {s = 8;}

                        else if ( (LA24_0==58) && (synpred3_InternalBugsDsl())) {s = 9;}

                        else if ( (LA24_0==59) && (synpred3_InternalBugsDsl())) {s = 10;}

                        else if ( (LA24_0==60) && (synpred3_InternalBugsDsl())) {s = 11;}

                        else if ( (LA24_0==61) && (synpred3_InternalBugsDsl())) {s = 12;}

                        else if ( (LA24_0==62) && (synpred3_InternalBugsDsl())) {s = 13;}

                        else if ( (LA24_0==63) && (synpred3_InternalBugsDsl())) {s = 14;}

                        else if ( (LA24_0==33) && (synpred3_InternalBugsDsl())) {s = 15;}

                        else if ( (LA24_0==34) && (synpred3_InternalBugsDsl())) {s = 16;}

                        else if ( (LA24_0==35) && (synpred3_InternalBugsDsl())) {s = 17;}

                        else if ( (LA24_0==36) && (synpred3_InternalBugsDsl())) {s = 18;}

                        else if ( (LA24_0==37) && (synpred3_InternalBugsDsl())) {s = 19;}

                        else if ( (LA24_0==38) && (synpred3_InternalBugsDsl())) {s = 20;}

                        else if ( (LA24_0==39) && (synpred3_InternalBugsDsl())) {s = 21;}

                        else if ( (LA24_0==40) && (synpred3_InternalBugsDsl())) {s = 22;}

                        else if ( (LA24_0==41) && (synpred3_InternalBugsDsl())) {s = 23;}

                        else if ( (LA24_0==42) && (synpred3_InternalBugsDsl())) {s = 24;}

                        else if ( (LA24_0==43) && (synpred3_InternalBugsDsl())) {s = 25;}

                        else if ( (LA24_0==44) && (synpred3_InternalBugsDsl())) {s = 26;}

                        else if ( (LA24_0==45) && (synpred3_InternalBugsDsl())) {s = 27;}

                        else if ( (LA24_0==46) && (synpred3_InternalBugsDsl())) {s = 28;}

                        else if ( (LA24_0==47) && (synpred3_InternalBugsDsl())) {s = 29;}

                        else if ( (LA24_0==48) && (synpred3_InternalBugsDsl())) {s = 30;}

                        else if ( (LA24_0==64) && (synpred3_InternalBugsDsl())) {s = 31;}

                        else if ( (LA24_0==EOF||LA24_0==13||LA24_0==15||LA24_0==18||(LA24_0>=22 && LA24_0<=23)||LA24_0==25||(LA24_0>=31 && LA24_0<=32)) ) {s = 32;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_3==24) ) {s = 33;}

                        else if ( (LA24_3==27||(LA24_3>=29 && LA24_3<=30)) ) {s = 32;}

                        else if ( (LA24_3==22) && (synpred3_InternalBugsDsl())) {s = 34;}

                        else if ( (LA24_3==23) && (synpred3_InternalBugsDsl())) {s = 35;}

                        else if ( (LA24_3==31) && (synpred3_InternalBugsDsl())) {s = 36;}

                        else if ( (LA24_3==32) && (synpred3_InternalBugsDsl())) {s = 37;}

                        else if ( (LA24_3==25) && (synpred3_InternalBugsDsl())) {s = 38;}

                        else if ( (LA24_3==18) && (synpred3_InternalBugsDsl())) {s = 39;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_44 = input.LA(1);

                         
                        int index24_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_44==22) && (synpred3_InternalBugsDsl())) {s = 34;}

                        else if ( (LA24_44==23) && (synpred3_InternalBugsDsl())) {s = 35;}

                        else if ( (LA24_44==31) && (synpred3_InternalBugsDsl())) {s = 36;}

                        else if ( (LA24_44==32) && (synpred3_InternalBugsDsl())) {s = 37;}

                        else if ( (LA24_44==25) && (synpred3_InternalBugsDsl())) {s = 38;}

                        else if ( (LA24_44==18) && (synpred3_InternalBugsDsl())) {s = 39;}

                        else if ( (LA24_44==27||(LA24_44>=29 && LA24_44<=30)) ) {s = 32;}

                         
                        input.seek(index24_44);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\1\2\2\uffff\1\0\50\uffff\1\1\7\uffff}>";
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_15;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1353:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_3==24) ) {s = 33;}

                        else if ( (LA27_3==27||(LA27_3>=29 && LA27_3<=30)) ) {s = 32;}

                        else if ( (LA27_3==22) && (synpred4_InternalBugsDsl())) {s = 34;}

                        else if ( (LA27_3==23) && (synpred4_InternalBugsDsl())) {s = 35;}

                        else if ( (LA27_3==31) && (synpred4_InternalBugsDsl())) {s = 36;}

                        else if ( (LA27_3==32) && (synpred4_InternalBugsDsl())) {s = 37;}

                        else if ( (LA27_3==25) && (synpred4_InternalBugsDsl())) {s = 38;}

                        else if ( (LA27_3==18) && (synpred4_InternalBugsDsl())) {s = 39;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_44 = input.LA(1);

                         
                        int index27_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_44==22) && (synpred4_InternalBugsDsl())) {s = 34;}

                        else if ( (LA27_44==23) && (synpred4_InternalBugsDsl())) {s = 35;}

                        else if ( (LA27_44==31) && (synpred4_InternalBugsDsl())) {s = 36;}

                        else if ( (LA27_44==32) && (synpred4_InternalBugsDsl())) {s = 37;}

                        else if ( (LA27_44==25) && (synpred4_InternalBugsDsl())) {s = 38;}

                        else if ( (LA27_44==18) && (synpred4_InternalBugsDsl())) {s = 39;}

                        else if ( (LA27_44==27||(LA27_44>=29 && LA27_44<=30)) ) {s = 32;}

                         
                        input.seek(index27_44);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==16) && (synpred4_InternalBugsDsl())) {s = 1;}

                        else if ( (LA27_0==RULE_INT) && (synpred4_InternalBugsDsl())) {s = 2;}

                        else if ( (LA27_0==RULE_ID) ) {s = 3;}

                        else if ( (LA27_0==53) && (synpred4_InternalBugsDsl())) {s = 4;}

                        else if ( (LA27_0==54) && (synpred4_InternalBugsDsl())) {s = 5;}

                        else if ( (LA27_0==55) && (synpred4_InternalBugsDsl())) {s = 6;}

                        else if ( (LA27_0==56) && (synpred4_InternalBugsDsl())) {s = 7;}

                        else if ( (LA27_0==57) && (synpred4_InternalBugsDsl())) {s = 8;}

                        else if ( (LA27_0==58) && (synpred4_InternalBugsDsl())) {s = 9;}

                        else if ( (LA27_0==59) && (synpred4_InternalBugsDsl())) {s = 10;}

                        else if ( (LA27_0==60) && (synpred4_InternalBugsDsl())) {s = 11;}

                        else if ( (LA27_0==61) && (synpred4_InternalBugsDsl())) {s = 12;}

                        else if ( (LA27_0==62) && (synpred4_InternalBugsDsl())) {s = 13;}

                        else if ( (LA27_0==63) && (synpred4_InternalBugsDsl())) {s = 14;}

                        else if ( (LA27_0==33) && (synpred4_InternalBugsDsl())) {s = 15;}

                        else if ( (LA27_0==34) && (synpred4_InternalBugsDsl())) {s = 16;}

                        else if ( (LA27_0==35) && (synpred4_InternalBugsDsl())) {s = 17;}

                        else if ( (LA27_0==36) && (synpred4_InternalBugsDsl())) {s = 18;}

                        else if ( (LA27_0==37) && (synpred4_InternalBugsDsl())) {s = 19;}

                        else if ( (LA27_0==38) && (synpred4_InternalBugsDsl())) {s = 20;}

                        else if ( (LA27_0==39) && (synpred4_InternalBugsDsl())) {s = 21;}

                        else if ( (LA27_0==40) && (synpred4_InternalBugsDsl())) {s = 22;}

                        else if ( (LA27_0==41) && (synpred4_InternalBugsDsl())) {s = 23;}

                        else if ( (LA27_0==42) && (synpred4_InternalBugsDsl())) {s = 24;}

                        else if ( (LA27_0==43) && (synpred4_InternalBugsDsl())) {s = 25;}

                        else if ( (LA27_0==44) && (synpred4_InternalBugsDsl())) {s = 26;}

                        else if ( (LA27_0==45) && (synpred4_InternalBugsDsl())) {s = 27;}

                        else if ( (LA27_0==46) && (synpred4_InternalBugsDsl())) {s = 28;}

                        else if ( (LA27_0==47) && (synpred4_InternalBugsDsl())) {s = 29;}

                        else if ( (LA27_0==48) && (synpred4_InternalBugsDsl())) {s = 30;}

                        else if ( (LA27_0==64) && (synpred4_InternalBugsDsl())) {s = 31;}

                        else if ( (LA27_0==EOF||LA27_0==13||LA27_0==15||LA27_0==18||(LA27_0>=22 && LA27_0<=23)||LA27_0==25||(LA27_0>=31 && LA27_0<=32)) ) {s = 32;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x8000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010010002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xFFE1FFFE00010030L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFFE1FFFE00010032L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180C00002L});

}