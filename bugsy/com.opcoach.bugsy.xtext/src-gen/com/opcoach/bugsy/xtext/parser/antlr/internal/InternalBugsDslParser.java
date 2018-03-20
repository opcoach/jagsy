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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'data'", "'{'", "'}'", "'model'", "'for'", "'('", "'in'", "')'", "':'", "'.'", "'E'", "'+'", "'-'", "'['", "','", "']'", "'~'", "'()'", "'<-'", "'='", "'*'", "'/'", "'dbern'", "'dbin'", "'dchisqr'", "'ddexp'", "'dexp'", "'df'", "'dgen.gamma'", "'dhyper'", "'dlogis'", "'dlnorm'", "'dnegbin'", "'dnchisqr'", "'dpar'", "'dpois'", "'dt'", "'dweib'", "'dnorm'", "'dunif'", "'dbeta'", "'dgamma'", "'acos'", "'acosh'", "'asin'", "'asinh'", "'atan'", "'log'", "'exp'", "'c'", "'mean'", "'sqrt'"
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


    // $ANTLR start "entryRuleForRange"
    // InternalBugsDsl.g:368:1: entryRuleForRange returns [EObject current=null] : iv_ruleForRange= ruleForRange EOF ;
    public final EObject entryRuleForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForRange = null;


        try {
            // InternalBugsDsl.g:368:49: (iv_ruleForRange= ruleForRange EOF )
            // InternalBugsDsl.g:369:2: iv_ruleForRange= ruleForRange EOF
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
    // InternalBugsDsl.g:375:1: ruleForRange returns [EObject current=null] : ( ( (lv_low_0_0= ruleIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) ) ;
    public final EObject ruleForRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_low_0_0 = null;

        AntlrDatatypeRuleToken lv_high_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:381:2: ( ( ( (lv_low_0_0= ruleIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) ) )
            // InternalBugsDsl.g:382:2: ( ( (lv_low_0_0= ruleIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )
            {
            // InternalBugsDsl.g:382:2: ( ( (lv_low_0_0= ruleIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )
            // InternalBugsDsl.g:383:3: ( (lv_low_0_0= ruleIndex ) ) otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) )
            {
            // InternalBugsDsl.g:383:3: ( (lv_low_0_0= ruleIndex ) )
            // InternalBugsDsl.g:384:4: (lv_low_0_0= ruleIndex )
            {
            // InternalBugsDsl.g:384:4: (lv_low_0_0= ruleIndex )
            // InternalBugsDsl.g:385:5: lv_low_0_0= ruleIndex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForRangeAccess().getLowIndexParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_low_0_0=ruleIndex();

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
              						"com.opcoach.bugsy.xtext.BugsDsl.Index");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForRangeAccess().getColonKeyword_1());
              		
            }
            // InternalBugsDsl.g:406:3: ( (lv_high_2_0= ruleIndex ) )
            // InternalBugsDsl.g:407:4: (lv_high_2_0= ruleIndex )
            {
            // InternalBugsDsl.g:407:4: (lv_high_2_0= ruleIndex )
            // InternalBugsDsl.g:408:5: lv_high_2_0= ruleIndex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForRangeAccess().getHighIndexParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_high_2_0=ruleIndex();

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
              						"com.opcoach.bugsy.xtext.BugsDsl.Index");
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
    // InternalBugsDsl.g:429:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalBugsDsl.g:429:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalBugsDsl.g:430:2: iv_ruleArrayRange= ruleArrayRange EOF
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
    // InternalBugsDsl.g:436:1: ruleArrayRange returns [EObject current=null] : ( ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )? ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_low_0_0 = null;

        AntlrDatatypeRuleToken lv_high_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:442:2: ( ( ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )? ) )
            // InternalBugsDsl.g:443:2: ( ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )? )
            {
            // InternalBugsDsl.g:443:2: ( ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )? )
            // InternalBugsDsl.g:444:3: ( (lv_low_0_0= ruleIndex ) ) (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )?
            {
            // InternalBugsDsl.g:444:3: ( (lv_low_0_0= ruleIndex ) )
            // InternalBugsDsl.g:445:4: (lv_low_0_0= ruleIndex )
            {
            // InternalBugsDsl.g:445:4: (lv_low_0_0= ruleIndex )
            // InternalBugsDsl.g:446:5: lv_low_0_0= ruleIndex
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

            // InternalBugsDsl.g:463:3: (otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBugsDsl.g:464:4: otherlv_1= ':' ( (lv_high_2_0= ruleIndex ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalBugsDsl.g:468:4: ( (lv_high_2_0= ruleIndex ) )
                    // InternalBugsDsl.g:469:5: (lv_high_2_0= ruleIndex )
                    {
                    // InternalBugsDsl.g:469:5: (lv_high_2_0= ruleIndex )
                    // InternalBugsDsl.g:470:6: lv_high_2_0= ruleIndex
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
    // InternalBugsDsl.g:492:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalBugsDsl.g:492:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalBugsDsl.g:493:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalBugsDsl.g:499:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:505:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? ) )
            // InternalBugsDsl.g:506:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? )
            {
            // InternalBugsDsl.g:506:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )? )
            // InternalBugsDsl.g:507:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )?
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
            // InternalBugsDsl.g:526:3: (kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBugsDsl.g:527:4: kw= 'E' (kw= '+' | kw= '-' ) this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloatAccess().getEKeyword_3_0());
                      			
                    }
                    // InternalBugsDsl.g:532:4: (kw= '+' | kw= '-' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==23) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalBugsDsl.g:533:5: kw= '+'
                            {
                            kw=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFloatAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalBugsDsl.g:539:5: kw= '-'
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
    // InternalBugsDsl.g:557:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalBugsDsl.g:557:46: (iv_ruleValue= ruleValue EOF )
            // InternalBugsDsl.g:558:2: iv_ruleValue= ruleValue EOF
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
    // InternalBugsDsl.g:564:1: ruleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:570:2: ( ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) ) )
            // InternalBugsDsl.g:571:2: ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) )
            {
            // InternalBugsDsl.g:571:2: ( ( () ( (lv_value_1_0= ruleNumeric ) ) ) | ( (lv_id_2_0= ruleArrayID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBugsDsl.g:572:3: ( () ( (lv_value_1_0= ruleNumeric ) ) )
                    {
                    // InternalBugsDsl.g:572:3: ( () ( (lv_value_1_0= ruleNumeric ) ) )
                    // InternalBugsDsl.g:573:4: () ( (lv_value_1_0= ruleNumeric ) )
                    {
                    // InternalBugsDsl.g:573:4: ()
                    // InternalBugsDsl.g:574:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getValueAccess().getValueAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBugsDsl.g:580:4: ( (lv_value_1_0= ruleNumeric ) )
                    // InternalBugsDsl.g:581:5: (lv_value_1_0= ruleNumeric )
                    {
                    // InternalBugsDsl.g:581:5: (lv_value_1_0= ruleNumeric )
                    // InternalBugsDsl.g:582:6: lv_value_1_0= ruleNumeric
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
                    // InternalBugsDsl.g:601:3: ( (lv_id_2_0= ruleArrayID ) )
                    {
                    // InternalBugsDsl.g:601:3: ( (lv_id_2_0= ruleArrayID ) )
                    // InternalBugsDsl.g:602:4: (lv_id_2_0= ruleArrayID )
                    {
                    // InternalBugsDsl.g:602:4: (lv_id_2_0= ruleArrayID )
                    // InternalBugsDsl.g:603:5: lv_id_2_0= ruleArrayID
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
    // InternalBugsDsl.g:624:1: entryRuleArrayID returns [EObject current=null] : iv_ruleArrayID= ruleArrayID EOF ;
    public final EObject entryRuleArrayID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayID = null;


        try {
            // InternalBugsDsl.g:624:48: (iv_ruleArrayID= ruleArrayID EOF )
            // InternalBugsDsl.g:625:2: iv_ruleArrayID= ruleArrayID EOF
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
    // InternalBugsDsl.g:631:1: ruleArrayID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )? ) ;
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
            // InternalBugsDsl.g:637:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )? ) )
            // InternalBugsDsl.g:638:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )? )
            {
            // InternalBugsDsl.g:638:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )? )
            // InternalBugsDsl.g:639:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )?
            {
            // InternalBugsDsl.g:639:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBugsDsl.g:640:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBugsDsl.g:640:4: (lv_name_0_0= RULE_ID )
            // InternalBugsDsl.g:641:5: lv_name_0_0= RULE_ID
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

            // InternalBugsDsl.g:657:3: (otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBugsDsl.g:658:4: otherlv_1= '[' ( (lv_indexes_2_0= ruleArrayRange ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArrayIDAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalBugsDsl.g:662:4: ( (lv_indexes_2_0= ruleArrayRange ) )
                    // InternalBugsDsl.g:663:5: (lv_indexes_2_0= ruleArrayRange )
                    {
                    // InternalBugsDsl.g:663:5: (lv_indexes_2_0= ruleArrayRange )
                    // InternalBugsDsl.g:664:6: lv_indexes_2_0= ruleArrayRange
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

                    // InternalBugsDsl.g:681:4: (otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==25) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalBugsDsl.g:682:5: otherlv_3= ',' ( (lv_indexes_4_0= ruleArrayRange ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayIDAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalBugsDsl.g:686:5: ( (lv_indexes_4_0= ruleArrayRange ) )
                    	    // InternalBugsDsl.g:687:6: (lv_indexes_4_0= ruleArrayRange )
                    	    {
                    	    // InternalBugsDsl.g:687:6: (lv_indexes_4_0= ruleArrayRange )
                    	    // InternalBugsDsl.g:688:7: lv_indexes_4_0= ruleArrayRange
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
                    	    break loop12;
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
    // InternalBugsDsl.g:715:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalBugsDsl.g:715:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalBugsDsl.g:716:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalBugsDsl.g:722:1: ruleRelation returns [EObject current=null] : (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_StochasticRelation_0 = null;

        EObject this_DeterministicRelation_1 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:728:2: ( (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation ) )
            // InternalBugsDsl.g:729:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )
            {
            // InternalBugsDsl.g:729:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalBugsDsl.g:730:3: this_StochasticRelation_0= ruleStochasticRelation
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
                    // InternalBugsDsl.g:739:3: this_DeterministicRelation_1= ruleDeterministicRelation
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
    // InternalBugsDsl.g:751:1: entryRuleStochasticRelation returns [EObject current=null] : iv_ruleStochasticRelation= ruleStochasticRelation EOF ;
    public final EObject entryRuleStochasticRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStochasticRelation = null;


        try {
            // InternalBugsDsl.g:751:59: (iv_ruleStochasticRelation= ruleStochasticRelation EOF )
            // InternalBugsDsl.g:752:2: iv_ruleStochasticRelation= ruleStochasticRelation EOF
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
    // InternalBugsDsl.g:758:1: ruleStochasticRelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? ) ;
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
            // InternalBugsDsl.g:764:2: ( ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? ) )
            // InternalBugsDsl.g:765:2: ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? )
            {
            // InternalBugsDsl.g:765:2: ( () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )? )
            // InternalBugsDsl.g:766:3: () ( (lv_name_1_0= ruleArrayID ) ) otherlv_2= '~' ( (lv_distrib_3_0= ruleDensity ) ) (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )?
            {
            // InternalBugsDsl.g:766:3: ()
            // InternalBugsDsl.g:767:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStochasticRelationAccess().getStochasticRelationAction_0(),
              					current);
              			
            }

            }

            // InternalBugsDsl.g:773:3: ( (lv_name_1_0= ruleArrayID ) )
            // InternalBugsDsl.g:774:4: (lv_name_1_0= ruleArrayID )
            {
            // InternalBugsDsl.g:774:4: (lv_name_1_0= ruleArrayID )
            // InternalBugsDsl.g:775:5: lv_name_1_0= ruleArrayID
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
            // InternalBugsDsl.g:796:3: ( (lv_distrib_3_0= ruleDensity ) )
            // InternalBugsDsl.g:797:4: (lv_distrib_3_0= ruleDensity )
            {
            // InternalBugsDsl.g:797:4: (lv_distrib_3_0= ruleDensity )
            // InternalBugsDsl.g:798:5: lv_distrib_3_0= ruleDensity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStochasticRelationAccess().getDistribDensityEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            // InternalBugsDsl.g:815:3: (otherlv_4= '()' | (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( (LA16_0==16) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalBugsDsl.g:816:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStochasticRelationAccess().getLeftParenthesisRightParenthesisKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:821:4: (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' )
                    {
                    // InternalBugsDsl.g:821:4: (otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')' )
                    // InternalBugsDsl.g:822:5: otherlv_5= '(' ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* ) otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getStochasticRelationAccess().getLeftParenthesisKeyword_4_1_0());
                      				
                    }
                    // InternalBugsDsl.g:826:5: ( ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )* )
                    // InternalBugsDsl.g:827:6: ( (lv_params_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )*
                    {
                    // InternalBugsDsl.g:827:6: ( (lv_params_6_0= ruleExpression ) )
                    // InternalBugsDsl.g:828:7: (lv_params_6_0= ruleExpression )
                    {
                    // InternalBugsDsl.g:828:7: (lv_params_6_0= ruleExpression )
                    // InternalBugsDsl.g:829:8: lv_params_6_0= ruleExpression
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

                    // InternalBugsDsl.g:846:6: (otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==25) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalBugsDsl.g:847:7: otherlv_7= ',' ( (lv_params_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getStochasticRelationAccess().getCommaKeyword_4_1_1_1_0());
                    	      						
                    	    }
                    	    // InternalBugsDsl.g:851:7: ( (lv_params_8_0= ruleExpression ) )
                    	    // InternalBugsDsl.g:852:8: (lv_params_8_0= ruleExpression )
                    	    {
                    	    // InternalBugsDsl.g:852:8: (lv_params_8_0= ruleExpression )
                    	    // InternalBugsDsl.g:853:9: lv_params_8_0= ruleExpression
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
                    	    break loop15;
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
    // InternalBugsDsl.g:882:1: entryRuleDeterministicRelation returns [EObject current=null] : iv_ruleDeterministicRelation= ruleDeterministicRelation EOF ;
    public final EObject entryRuleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeterministicRelation = null;


        try {
            // InternalBugsDsl.g:882:62: (iv_ruleDeterministicRelation= ruleDeterministicRelation EOF )
            // InternalBugsDsl.g:883:2: iv_ruleDeterministicRelation= ruleDeterministicRelation EOF
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
    // InternalBugsDsl.g:889:1: ruleDeterministicRelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) ) ;
    public final EObject ruleDeterministicRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:895:2: ( ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) ) )
            // InternalBugsDsl.g:896:2: ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) )
            {
            // InternalBugsDsl.g:896:2: ( () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) ) )
            // InternalBugsDsl.g:897:3: () ( (lv_name_1_0= ruleArrayID ) ) (otherlv_2= '<-' | otherlv_3= '=' ) ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) )
            {
            // InternalBugsDsl.g:897:3: ()
            // InternalBugsDsl.g:898:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDeterministicRelationAccess().getDeterministicRelationAction_0(),
              					current);
              			
            }

            }

            // InternalBugsDsl.g:904:3: ( (lv_name_1_0= ruleArrayID ) )
            // InternalBugsDsl.g:905:4: (lv_name_1_0= ruleArrayID )
            {
            // InternalBugsDsl.g:905:4: (lv_name_1_0= ruleArrayID )
            // InternalBugsDsl.g:906:5: lv_name_1_0= ruleArrayID
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

            // InternalBugsDsl.g:923:3: (otherlv_2= '<-' | otherlv_3= '=' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
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
                    // InternalBugsDsl.g:924:4: otherlv_2= '<-'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDeterministicRelationAccess().getLessThanSignHyphenMinusKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:929:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDeterministicRelationAccess().getEqualsSignKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalBugsDsl.g:934:3: ( ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression ) )
            // InternalBugsDsl.g:935:4: ( ( ruleExpression ) )=> (lv_expressions_4_0= ruleExpression )
            {
            // InternalBugsDsl.g:939:4: (lv_expressions_4_0= ruleExpression )
            // InternalBugsDsl.g:940:5: lv_expressions_4_0= ruleExpression
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
    // InternalBugsDsl.g:961:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalBugsDsl.g:961:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalBugsDsl.g:962:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalBugsDsl.g:968:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:974:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalBugsDsl.g:975:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalBugsDsl.g:975:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt18=1;
                }
                break;
            case 23:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
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
                    // InternalBugsDsl.g:976:3: kw= '+'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:982:3: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:988:3: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:994:3: kw= '/'
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
    // InternalBugsDsl.g:1003:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalBugsDsl.g:1003:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalBugsDsl.g:1004:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalBugsDsl.g:1010:1: ruleFunction returns [EObject current=null] : ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) ;
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
            // InternalBugsDsl.g:1016:2: ( ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) )
            // InternalBugsDsl.g:1017:2: ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            {
            // InternalBugsDsl.g:1017:2: ( ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            // InternalBugsDsl.g:1018:3: ( (lv_operation_0_0= ruleFunctionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            {
            // InternalBugsDsl.g:1018:3: ( (lv_operation_0_0= ruleFunctionOperator ) )
            // InternalBugsDsl.g:1019:4: (lv_operation_0_0= ruleFunctionOperator )
            {
            // InternalBugsDsl.g:1019:4: (lv_operation_0_0= ruleFunctionOperator )
            // InternalBugsDsl.g:1020:5: lv_operation_0_0= ruleFunctionOperator
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

            // InternalBugsDsl.g:1037:3: (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            else if ( (LA21_0==16) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalBugsDsl.g:1038:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1043:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalBugsDsl.g:1043:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    // InternalBugsDsl.g:1044:5: otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalBugsDsl.g:1048:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    int alt20=2;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // InternalBugsDsl.g:1049:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')'
                            {
                            // InternalBugsDsl.g:1049:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) )
                            // InternalBugsDsl.g:1050:7: ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) )
                            {
                            // InternalBugsDsl.g:1056:7: ( (lv_params_3_0= ruleExpression ) )
                            // InternalBugsDsl.g:1057:8: (lv_params_3_0= ruleExpression )
                            {
                            // InternalBugsDsl.g:1057:8: (lv_params_3_0= ruleExpression )
                            // InternalBugsDsl.g:1058:9: lv_params_3_0= ruleExpression
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

                            // InternalBugsDsl.g:1076:6: (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==25) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalBugsDsl.g:1077:7: otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalBugsDsl.g:1081:7: ( (lv_params_5_0= ruleExpression ) )
                            	    // InternalBugsDsl.g:1082:8: (lv_params_5_0= ruleExpression )
                            	    {
                            	    // InternalBugsDsl.g:1082:8: (lv_params_5_0= ruleExpression )
                            	    // InternalBugsDsl.g:1083:9: lv_params_5_0= ruleExpression
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
                            	    break loop19;
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
    // InternalBugsDsl.g:1112:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // InternalBugsDsl.g:1112:53: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalBugsDsl.g:1113:2: iv_ruleDistribution= ruleDistribution EOF
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
    // InternalBugsDsl.g:1119:1: ruleDistribution returns [EObject current=null] : ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) ;
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
            // InternalBugsDsl.g:1125:2: ( ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) ) )
            // InternalBugsDsl.g:1126:2: ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            {
            // InternalBugsDsl.g:1126:2: ( ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ) )
            // InternalBugsDsl.g:1127:3: ( (lv_distrib_0_0= ruleDistributionOperator ) ) (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            {
            // InternalBugsDsl.g:1127:3: ( (lv_distrib_0_0= ruleDistributionOperator ) )
            // InternalBugsDsl.g:1128:4: (lv_distrib_0_0= ruleDistributionOperator )
            {
            // InternalBugsDsl.g:1128:4: (lv_distrib_0_0= ruleDistributionOperator )
            // InternalBugsDsl.g:1129:5: lv_distrib_0_0= ruleDistributionOperator
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

            // InternalBugsDsl.g:1146:3: (otherlv_1= '()' | (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            else if ( (LA24_0==16) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalBugsDsl.g:1147:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDistributionAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1152:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalBugsDsl.g:1152:4: (otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
                    // InternalBugsDsl.g:1153:5: otherlv_2= '(' ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDistributionAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalBugsDsl.g:1157:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
                    int alt23=2;
                    alt23 = dfa23.predict(input);
                    switch (alt23) {
                        case 1 :
                            // InternalBugsDsl.g:1158:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')'
                            {
                            // InternalBugsDsl.g:1158:6: ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) )
                            // InternalBugsDsl.g:1159:7: ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) )
                            {
                            // InternalBugsDsl.g:1165:7: ( (lv_params_3_0= ruleExpression ) )
                            // InternalBugsDsl.g:1166:8: (lv_params_3_0= ruleExpression )
                            {
                            // InternalBugsDsl.g:1166:8: (lv_params_3_0= ruleExpression )
                            // InternalBugsDsl.g:1167:9: lv_params_3_0= ruleExpression
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

                            // InternalBugsDsl.g:1185:6: (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==25) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalBugsDsl.g:1186:7: otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getDistributionAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalBugsDsl.g:1190:7: ( (lv_params_5_0= ruleExpression ) )
                            	    // InternalBugsDsl.g:1191:8: (lv_params_5_0= ruleExpression )
                            	    {
                            	    // InternalBugsDsl.g:1191:8: (lv_params_5_0= ruleExpression )
                            	    // InternalBugsDsl.g:1192:9: lv_params_5_0= ruleExpression
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
                            	    break loop22;
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
    // InternalBugsDsl.g:1221:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBugsDsl.g:1221:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalBugsDsl.g:1222:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalBugsDsl.g:1228:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBugsDsl.g:1234:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalBugsDsl.g:1235:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalBugsDsl.g:1235:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalBugsDsl.g:1236:3: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
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
            // InternalBugsDsl.g:1244:3: ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=22 && LA25_0<=23)||(LA25_0>=31 && LA25_0<=32)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBugsDsl.g:1245:4: () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalBugsDsl.g:1245:4: ()
            	    // InternalBugsDsl.g:1246:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBugsDsl.g:1252:4: ( (lv_op_2_0= ruleOperator ) )
            	    // InternalBugsDsl.g:1253:5: (lv_op_2_0= ruleOperator )
            	    {
            	    // InternalBugsDsl.g:1253:5: (lv_op_2_0= ruleOperator )
            	    // InternalBugsDsl.g:1254:6: lv_op_2_0= ruleOperator
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

            	    // InternalBugsDsl.g:1271:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalBugsDsl.g:1272:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalBugsDsl.g:1272:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalBugsDsl.g:1273:6: lv_right_3_0= ruleTerminalExpression
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
            	    break loop25;
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
    // InternalBugsDsl.g:1295:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalBugsDsl.g:1295:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalBugsDsl.g:1296:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalBugsDsl.g:1302:1: ruleTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) ) ;
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
            // InternalBugsDsl.g:1308:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) ) )
            // InternalBugsDsl.g:1309:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) )
            {
            // InternalBugsDsl.g:1309:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= ruleValue ) ) | ( (lv_function_4_0= ruleFunction ) ) | ( (lv_distribution_5_0= ruleDistribution ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
                {
                alt26=2;
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
                {
                alt26=3;
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
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalBugsDsl.g:1310:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalBugsDsl.g:1310:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalBugsDsl.g:1311:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
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
                    // InternalBugsDsl.g:1329:3: ( (lv_value_3_0= ruleValue ) )
                    {
                    // InternalBugsDsl.g:1329:3: ( (lv_value_3_0= ruleValue ) )
                    // InternalBugsDsl.g:1330:4: (lv_value_3_0= ruleValue )
                    {
                    // InternalBugsDsl.g:1330:4: (lv_value_3_0= ruleValue )
                    // InternalBugsDsl.g:1331:5: lv_value_3_0= ruleValue
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
                    // InternalBugsDsl.g:1349:3: ( (lv_function_4_0= ruleFunction ) )
                    {
                    // InternalBugsDsl.g:1349:3: ( (lv_function_4_0= ruleFunction ) )
                    // InternalBugsDsl.g:1350:4: (lv_function_4_0= ruleFunction )
                    {
                    // InternalBugsDsl.g:1350:4: (lv_function_4_0= ruleFunction )
                    // InternalBugsDsl.g:1351:5: lv_function_4_0= ruleFunction
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
                    // InternalBugsDsl.g:1369:3: ( (lv_distribution_5_0= ruleDistribution ) )
                    {
                    // InternalBugsDsl.g:1369:3: ( (lv_distribution_5_0= ruleDistribution ) )
                    // InternalBugsDsl.g:1370:4: (lv_distribution_5_0= ruleDistribution )
                    {
                    // InternalBugsDsl.g:1370:4: (lv_distribution_5_0= ruleDistribution )
                    // InternalBugsDsl.g:1371:5: lv_distribution_5_0= ruleDistribution
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
    // InternalBugsDsl.g:1392:1: ruleDistributionOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) ) ;
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
            // InternalBugsDsl.g:1398:2: ( ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) ) )
            // InternalBugsDsl.g:1399:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) )
            {
            // InternalBugsDsl.g:1399:2: ( (enumLiteral_0= 'dbern' ) | (enumLiteral_1= 'dbin' ) | (enumLiteral_2= 'dchisqr' ) | (enumLiteral_3= 'ddexp' ) | (enumLiteral_4= 'dexp' ) | (enumLiteral_5= 'df' ) | (enumLiteral_6= 'dgen.gamma' ) | (enumLiteral_7= 'dhyper' ) | (enumLiteral_8= 'dlogis' ) | (enumLiteral_9= 'dlnorm' ) | (enumLiteral_10= 'dnegbin' ) | (enumLiteral_11= 'dnchisqr' ) | (enumLiteral_12= 'dpar' ) | (enumLiteral_13= 'dpois' ) | (enumLiteral_14= 'dt' ) | (enumLiteral_15= 'dweib' ) )
            int alt27=16;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt27=1;
                }
                break;
            case 34:
                {
                alt27=2;
                }
                break;
            case 35:
                {
                alt27=3;
                }
                break;
            case 36:
                {
                alt27=4;
                }
                break;
            case 37:
                {
                alt27=5;
                }
                break;
            case 38:
                {
                alt27=6;
                }
                break;
            case 39:
                {
                alt27=7;
                }
                break;
            case 40:
                {
                alt27=8;
                }
                break;
            case 41:
                {
                alt27=9;
                }
                break;
            case 42:
                {
                alt27=10;
                }
                break;
            case 43:
                {
                alt27=11;
                }
                break;
            case 44:
                {
                alt27=12;
                }
                break;
            case 45:
                {
                alt27=13;
                }
                break;
            case 46:
                {
                alt27=14;
                }
                break;
            case 47:
                {
                alt27=15;
                }
                break;
            case 48:
                {
                alt27=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalBugsDsl.g:1400:3: (enumLiteral_0= 'dbern' )
                    {
                    // InternalBugsDsl.g:1400:3: (enumLiteral_0= 'dbern' )
                    // InternalBugsDsl.g:1401:4: enumLiteral_0= 'dbern'
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
                    // InternalBugsDsl.g:1408:3: (enumLiteral_1= 'dbin' )
                    {
                    // InternalBugsDsl.g:1408:3: (enumLiteral_1= 'dbin' )
                    // InternalBugsDsl.g:1409:4: enumLiteral_1= 'dbin'
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
                    // InternalBugsDsl.g:1416:3: (enumLiteral_2= 'dchisqr' )
                    {
                    // InternalBugsDsl.g:1416:3: (enumLiteral_2= 'dchisqr' )
                    // InternalBugsDsl.g:1417:4: enumLiteral_2= 'dchisqr'
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
                    // InternalBugsDsl.g:1424:3: (enumLiteral_3= 'ddexp' )
                    {
                    // InternalBugsDsl.g:1424:3: (enumLiteral_3= 'ddexp' )
                    // InternalBugsDsl.g:1425:4: enumLiteral_3= 'ddexp'
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
                    // InternalBugsDsl.g:1432:3: (enumLiteral_4= 'dexp' )
                    {
                    // InternalBugsDsl.g:1432:3: (enumLiteral_4= 'dexp' )
                    // InternalBugsDsl.g:1433:4: enumLiteral_4= 'dexp'
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
                    // InternalBugsDsl.g:1440:3: (enumLiteral_5= 'df' )
                    {
                    // InternalBugsDsl.g:1440:3: (enumLiteral_5= 'df' )
                    // InternalBugsDsl.g:1441:4: enumLiteral_5= 'df'
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
                    // InternalBugsDsl.g:1448:3: (enumLiteral_6= 'dgen.gamma' )
                    {
                    // InternalBugsDsl.g:1448:3: (enumLiteral_6= 'dgen.gamma' )
                    // InternalBugsDsl.g:1449:4: enumLiteral_6= 'dgen.gamma'
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
                    // InternalBugsDsl.g:1456:3: (enumLiteral_7= 'dhyper' )
                    {
                    // InternalBugsDsl.g:1456:3: (enumLiteral_7= 'dhyper' )
                    // InternalBugsDsl.g:1457:4: enumLiteral_7= 'dhyper'
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
                    // InternalBugsDsl.g:1464:3: (enumLiteral_8= 'dlogis' )
                    {
                    // InternalBugsDsl.g:1464:3: (enumLiteral_8= 'dlogis' )
                    // InternalBugsDsl.g:1465:4: enumLiteral_8= 'dlogis'
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
                    // InternalBugsDsl.g:1472:3: (enumLiteral_9= 'dlnorm' )
                    {
                    // InternalBugsDsl.g:1472:3: (enumLiteral_9= 'dlnorm' )
                    // InternalBugsDsl.g:1473:4: enumLiteral_9= 'dlnorm'
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
                    // InternalBugsDsl.g:1480:3: (enumLiteral_10= 'dnegbin' )
                    {
                    // InternalBugsDsl.g:1480:3: (enumLiteral_10= 'dnegbin' )
                    // InternalBugsDsl.g:1481:4: enumLiteral_10= 'dnegbin'
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
                    // InternalBugsDsl.g:1488:3: (enumLiteral_11= 'dnchisqr' )
                    {
                    // InternalBugsDsl.g:1488:3: (enumLiteral_11= 'dnchisqr' )
                    // InternalBugsDsl.g:1489:4: enumLiteral_11= 'dnchisqr'
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
                    // InternalBugsDsl.g:1496:3: (enumLiteral_12= 'dpar' )
                    {
                    // InternalBugsDsl.g:1496:3: (enumLiteral_12= 'dpar' )
                    // InternalBugsDsl.g:1497:4: enumLiteral_12= 'dpar'
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
                    // InternalBugsDsl.g:1504:3: (enumLiteral_13= 'dpois' )
                    {
                    // InternalBugsDsl.g:1504:3: (enumLiteral_13= 'dpois' )
                    // InternalBugsDsl.g:1505:4: enumLiteral_13= 'dpois'
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
                    // InternalBugsDsl.g:1512:3: (enumLiteral_14= 'dt' )
                    {
                    // InternalBugsDsl.g:1512:3: (enumLiteral_14= 'dt' )
                    // InternalBugsDsl.g:1513:4: enumLiteral_14= 'dt'
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
                    // InternalBugsDsl.g:1520:3: (enumLiteral_15= 'dweib' )
                    {
                    // InternalBugsDsl.g:1520:3: (enumLiteral_15= 'dweib' )
                    // InternalBugsDsl.g:1521:4: enumLiteral_15= 'dweib'
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


    // $ANTLR start "ruleDensity"
    // InternalBugsDsl.g:1531:1: ruleDensity returns [Enumerator current=null] : ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) ) ;
    public final Enumerator ruleDensity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBugsDsl.g:1537:2: ( ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) ) )
            // InternalBugsDsl.g:1538:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) )
            {
            // InternalBugsDsl.g:1538:2: ( (enumLiteral_0= 'dnorm' ) | (enumLiteral_1= 'dunif' ) | (enumLiteral_2= 'dbeta' ) | (enumLiteral_3= 'dgamma' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt28=1;
                }
                break;
            case 50:
                {
                alt28=2;
                }
                break;
            case 51:
                {
                alt28=3;
                }
                break;
            case 52:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalBugsDsl.g:1539:3: (enumLiteral_0= 'dnorm' )
                    {
                    // InternalBugsDsl.g:1539:3: (enumLiteral_0= 'dnorm' )
                    // InternalBugsDsl.g:1540:4: enumLiteral_0= 'dnorm'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityAccess().getDnormEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDensityAccess().getDnormEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBugsDsl.g:1547:3: (enumLiteral_1= 'dunif' )
                    {
                    // InternalBugsDsl.g:1547:3: (enumLiteral_1= 'dunif' )
                    // InternalBugsDsl.g:1548:4: enumLiteral_1= 'dunif'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityAccess().getDunifEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDensityAccess().getDunifEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBugsDsl.g:1555:3: (enumLiteral_2= 'dbeta' )
                    {
                    // InternalBugsDsl.g:1555:3: (enumLiteral_2= 'dbeta' )
                    // InternalBugsDsl.g:1556:4: enumLiteral_2= 'dbeta'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDensityAccess().getDbetaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDensityAccess().getDbetaEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBugsDsl.g:1563:3: (enumLiteral_3= 'dgamma' )
                    {
                    // InternalBugsDsl.g:1563:3: (enumLiteral_3= 'dgamma' )
                    // InternalBugsDsl.g:1564:4: enumLiteral_3= 'dgamma'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalBugsDsl.g:1574:1: ruleFunctionOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) ) ;
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
            // InternalBugsDsl.g:1580:2: ( ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) ) )
            // InternalBugsDsl.g:1581:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) )
            {
            // InternalBugsDsl.g:1581:2: ( (enumLiteral_0= 'acos' ) | (enumLiteral_1= 'acosh' ) | (enumLiteral_2= 'asin' ) | (enumLiteral_3= 'asinh' ) | (enumLiteral_4= 'atan' ) | (enumLiteral_5= 'log' ) | (enumLiteral_6= 'exp' ) | (enumLiteral_7= 'c' ) | (enumLiteral_8= 'mean' ) | (enumLiteral_9= 'sqrt' ) )
            int alt29=10;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt29=1;
                }
                break;
            case 54:
                {
                alt29=2;
                }
                break;
            case 55:
                {
                alt29=3;
                }
                break;
            case 56:
                {
                alt29=4;
                }
                break;
            case 57:
                {
                alt29=5;
                }
                break;
            case 58:
                {
                alt29=6;
                }
                break;
            case 59:
                {
                alt29=7;
                }
                break;
            case 60:
                {
                alt29=8;
                }
                break;
            case 61:
                {
                alt29=9;
                }
                break;
            case 62:
                {
                alt29=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalBugsDsl.g:1582:3: (enumLiteral_0= 'acos' )
                    {
                    // InternalBugsDsl.g:1582:3: (enumLiteral_0= 'acos' )
                    // InternalBugsDsl.g:1583:4: enumLiteral_0= 'acos'
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
                    // InternalBugsDsl.g:1590:3: (enumLiteral_1= 'acosh' )
                    {
                    // InternalBugsDsl.g:1590:3: (enumLiteral_1= 'acosh' )
                    // InternalBugsDsl.g:1591:4: enumLiteral_1= 'acosh'
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
                    // InternalBugsDsl.g:1598:3: (enumLiteral_2= 'asin' )
                    {
                    // InternalBugsDsl.g:1598:3: (enumLiteral_2= 'asin' )
                    // InternalBugsDsl.g:1599:4: enumLiteral_2= 'asin'
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
                    // InternalBugsDsl.g:1606:3: (enumLiteral_3= 'asinh' )
                    {
                    // InternalBugsDsl.g:1606:3: (enumLiteral_3= 'asinh' )
                    // InternalBugsDsl.g:1607:4: enumLiteral_3= 'asinh'
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
                    // InternalBugsDsl.g:1614:3: (enumLiteral_4= 'atan' )
                    {
                    // InternalBugsDsl.g:1614:3: (enumLiteral_4= 'atan' )
                    // InternalBugsDsl.g:1615:4: enumLiteral_4= 'atan'
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
                    // InternalBugsDsl.g:1622:3: (enumLiteral_5= 'log' )
                    {
                    // InternalBugsDsl.g:1622:3: (enumLiteral_5= 'log' )
                    // InternalBugsDsl.g:1623:4: enumLiteral_5= 'log'
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
                    // InternalBugsDsl.g:1630:3: (enumLiteral_6= 'exp' )
                    {
                    // InternalBugsDsl.g:1630:3: (enumLiteral_6= 'exp' )
                    // InternalBugsDsl.g:1631:4: enumLiteral_6= 'exp'
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
                    // InternalBugsDsl.g:1638:3: (enumLiteral_7= 'c' )
                    {
                    // InternalBugsDsl.g:1638:3: (enumLiteral_7= 'c' )
                    // InternalBugsDsl.g:1639:4: enumLiteral_7= 'c'
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
                    // InternalBugsDsl.g:1646:3: (enumLiteral_8= 'mean' )
                    {
                    // InternalBugsDsl.g:1646:3: (enumLiteral_8= 'mean' )
                    // InternalBugsDsl.g:1647:4: enumLiteral_8= 'mean'
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
                    // InternalBugsDsl.g:1654:3: (enumLiteral_9= 'sqrt' )
                    {
                    // InternalBugsDsl.g:1654:3: (enumLiteral_9= 'sqrt' )
                    // InternalBugsDsl.g:1655:4: enumLiteral_9= 'sqrt'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
        // InternalBugsDsl.g:1050:7: ( ( ( ruleExpression ) ) )
        // InternalBugsDsl.g:1050:8: ( ( ruleExpression ) )
        {
        // InternalBugsDsl.g:1050:8: ( ( ruleExpression ) )
        // InternalBugsDsl.g:1051:8: ( ruleExpression )
        {
        // InternalBugsDsl.g:1051:8: ( ruleExpression )
        // InternalBugsDsl.g:1052:9: ruleExpression
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
        // InternalBugsDsl.g:1159:7: ( ( ( ruleExpression ) ) )
        // InternalBugsDsl.g:1159:8: ( ( ruleExpression ) )
        {
        // InternalBugsDsl.g:1159:8: ( ( ruleExpression ) )
        // InternalBugsDsl.g:1160:8: ( ruleExpression )
        {
        // InternalBugsDsl.g:1160:8: ( ruleExpression )
        // InternalBugsDsl.g:1161:9: ruleExpression
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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\4\1\30\1\4\2\uffff\2\23\2\4\1\33\2\31\2\23\1\4\2\31";
    static final String dfa_3s = "\1\4\1\36\1\5\2\uffff\2\32\2\5\1\36\4\32\1\5\2\32";
    static final String dfa_4s = "\3\uffff\1\1\1\2\14\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\2\uffff\1\3\1\uffff\2\4",
            "\1\6\1\5",
            "",
            "",
            "\1\7\5\uffff\1\10\1\11",
            "\1\7\5\uffff\1\10\1\11",
            "\1\13\1\12",
            "\1\15\1\14",
            "\1\3\1\uffff\2\4",
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

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "729:2: (this_StochasticRelation_0= ruleStochasticRelation | this_DeterministicRelation_1= ruleDeterministicRelation )";
        }
    }
    static final String dfa_7s = "\62\uffff";
    static final String dfa_8s = "\1\36\61\uffff";
    static final String dfa_9s = "\1\4\2\uffff\1\22\33\uffff\1\4\6\uffff\2\23\2\4\1\22\2\31\2\23\1\4\2\31";
    static final String dfa_10s = "\1\76\2\uffff\1\40\33\uffff\1\5\6\uffff\2\32\2\5\1\40\4\32\1\5\2\32";
    static final String dfa_11s = "\1\uffff\2\1\1\uffff\32\1\1\2\1\uffff\6\1\14\uffff";
    static final String dfa_12s = "\1\0\2\uffff\1\2\46\uffff\1\1\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\2\7\uffff\1\36\1\uffff\1\36\1\1\1\uffff\1\36\3\uffff\2\36\1\uffff\1\36\5\uffff\2\36\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "",
            "",
            "\1\45\3\uffff\1\40\1\41\1\37\1\44\1\uffff\1\36\1\uffff\2\36\1\42\1\43",
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
            "\1\50\5\uffff\1\51\1\52",
            "\1\50\5\uffff\1\51\1\52",
            "\1\54\1\53",
            "\1\56\1\55",
            "\1\45\3\uffff\1\40\1\41\1\uffff\1\44\1\uffff\1\36\1\uffff\2\36\1\42\1\43",
            "\1\51\1\52",
            "\1\51\1\52",
            "\1\57\5\uffff\1\51\1\52",
            "\1\57\5\uffff\1\51\1\52",
            "\1\61\1\60",
            "\1\51\1\52",
            "\1\51\1\52"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1048:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA20_0==16) && (synpred2_InternalBugsDsl())) {s = 1;}

                        else if ( (LA20_0==RULE_INT) && (synpred2_InternalBugsDsl())) {s = 2;}

                        else if ( (LA20_0==RULE_ID) ) {s = 3;}

                        else if ( (LA20_0==53) && (synpred2_InternalBugsDsl())) {s = 4;}

                        else if ( (LA20_0==54) && (synpred2_InternalBugsDsl())) {s = 5;}

                        else if ( (LA20_0==55) && (synpred2_InternalBugsDsl())) {s = 6;}

                        else if ( (LA20_0==56) && (synpred2_InternalBugsDsl())) {s = 7;}

                        else if ( (LA20_0==57) && (synpred2_InternalBugsDsl())) {s = 8;}

                        else if ( (LA20_0==58) && (synpred2_InternalBugsDsl())) {s = 9;}

                        else if ( (LA20_0==59) && (synpred2_InternalBugsDsl())) {s = 10;}

                        else if ( (LA20_0==60) && (synpred2_InternalBugsDsl())) {s = 11;}

                        else if ( (LA20_0==61) && (synpred2_InternalBugsDsl())) {s = 12;}

                        else if ( (LA20_0==62) && (synpred2_InternalBugsDsl())) {s = 13;}

                        else if ( (LA20_0==33) && (synpred2_InternalBugsDsl())) {s = 14;}

                        else if ( (LA20_0==34) && (synpred2_InternalBugsDsl())) {s = 15;}

                        else if ( (LA20_0==35) && (synpred2_InternalBugsDsl())) {s = 16;}

                        else if ( (LA20_0==36) && (synpred2_InternalBugsDsl())) {s = 17;}

                        else if ( (LA20_0==37) && (synpred2_InternalBugsDsl())) {s = 18;}

                        else if ( (LA20_0==38) && (synpred2_InternalBugsDsl())) {s = 19;}

                        else if ( (LA20_0==39) && (synpred2_InternalBugsDsl())) {s = 20;}

                        else if ( (LA20_0==40) && (synpred2_InternalBugsDsl())) {s = 21;}

                        else if ( (LA20_0==41) && (synpred2_InternalBugsDsl())) {s = 22;}

                        else if ( (LA20_0==42) && (synpred2_InternalBugsDsl())) {s = 23;}

                        else if ( (LA20_0==43) && (synpred2_InternalBugsDsl())) {s = 24;}

                        else if ( (LA20_0==44) && (synpred2_InternalBugsDsl())) {s = 25;}

                        else if ( (LA20_0==45) && (synpred2_InternalBugsDsl())) {s = 26;}

                        else if ( (LA20_0==46) && (synpred2_InternalBugsDsl())) {s = 27;}

                        else if ( (LA20_0==47) && (synpred2_InternalBugsDsl())) {s = 28;}

                        else if ( (LA20_0==48) && (synpred2_InternalBugsDsl())) {s = 29;}

                        else if ( (LA20_0==EOF||LA20_0==13||LA20_0==15||LA20_0==18||(LA20_0>=22 && LA20_0<=23)||LA20_0==25||(LA20_0>=31 && LA20_0<=32)) ) {s = 30;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_42 = input.LA(1);

                         
                        int index20_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA20_42==27||(LA20_42>=29 && LA20_42<=30)) ) {s = 30;}

                        else if ( (LA20_42==22) && (synpred2_InternalBugsDsl())) {s = 32;}

                        else if ( (LA20_42==23) && (synpred2_InternalBugsDsl())) {s = 33;}

                        else if ( (LA20_42==31) && (synpred2_InternalBugsDsl())) {s = 34;}

                        else if ( (LA20_42==32) && (synpred2_InternalBugsDsl())) {s = 35;}

                        else if ( (LA20_42==25) && (synpred2_InternalBugsDsl())) {s = 36;}

                        else if ( (LA20_42==18) && (synpred2_InternalBugsDsl())) {s = 37;}

                         
                        input.seek(index20_42);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA20_3==24) ) {s = 31;}

                        else if ( (LA20_3==27||(LA20_3>=29 && LA20_3<=30)) ) {s = 30;}

                        else if ( (LA20_3==22) && (synpred2_InternalBugsDsl())) {s = 32;}

                        else if ( (LA20_3==23) && (synpred2_InternalBugsDsl())) {s = 33;}

                        else if ( (LA20_3==31) && (synpred2_InternalBugsDsl())) {s = 34;}

                        else if ( (LA20_3==32) && (synpred2_InternalBugsDsl())) {s = 35;}

                        else if ( (LA20_3==25) && (synpred2_InternalBugsDsl())) {s = 36;}

                        else if ( (LA20_3==18) && (synpred2_InternalBugsDsl())) {s = 37;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\1\2\2\uffff\1\1\46\uffff\1\0\7\uffff}>";
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_14;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1157:5: ( ( ( ( ( ruleExpression ) ) )=> ( (lv_params_3_0= ruleExpression ) ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_42 = input.LA(1);

                         
                        int index23_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_42==27||(LA23_42>=29 && LA23_42<=30)) ) {s = 30;}

                        else if ( (LA23_42==22) && (synpred3_InternalBugsDsl())) {s = 32;}

                        else if ( (LA23_42==23) && (synpred3_InternalBugsDsl())) {s = 33;}

                        else if ( (LA23_42==31) && (synpred3_InternalBugsDsl())) {s = 34;}

                        else if ( (LA23_42==32) && (synpred3_InternalBugsDsl())) {s = 35;}

                        else if ( (LA23_42==25) && (synpred3_InternalBugsDsl())) {s = 36;}

                        else if ( (LA23_42==18) && (synpred3_InternalBugsDsl())) {s = 37;}

                         
                        input.seek(index23_42);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_3==24) ) {s = 31;}

                        else if ( (LA23_3==27||(LA23_3>=29 && LA23_3<=30)) ) {s = 30;}

                        else if ( (LA23_3==22) && (synpred3_InternalBugsDsl())) {s = 32;}

                        else if ( (LA23_3==23) && (synpred3_InternalBugsDsl())) {s = 33;}

                        else if ( (LA23_3==31) && (synpred3_InternalBugsDsl())) {s = 34;}

                        else if ( (LA23_3==32) && (synpred3_InternalBugsDsl())) {s = 35;}

                        else if ( (LA23_3==25) && (synpred3_InternalBugsDsl())) {s = 36;}

                        else if ( (LA23_3==18) && (synpred3_InternalBugsDsl())) {s = 37;}

                         
                        input.seek(index23_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_0==16) && (synpred3_InternalBugsDsl())) {s = 1;}

                        else if ( (LA23_0==RULE_INT) && (synpred3_InternalBugsDsl())) {s = 2;}

                        else if ( (LA23_0==RULE_ID) ) {s = 3;}

                        else if ( (LA23_0==53) && (synpred3_InternalBugsDsl())) {s = 4;}

                        else if ( (LA23_0==54) && (synpred3_InternalBugsDsl())) {s = 5;}

                        else if ( (LA23_0==55) && (synpred3_InternalBugsDsl())) {s = 6;}

                        else if ( (LA23_0==56) && (synpred3_InternalBugsDsl())) {s = 7;}

                        else if ( (LA23_0==57) && (synpred3_InternalBugsDsl())) {s = 8;}

                        else if ( (LA23_0==58) && (synpred3_InternalBugsDsl())) {s = 9;}

                        else if ( (LA23_0==59) && (synpred3_InternalBugsDsl())) {s = 10;}

                        else if ( (LA23_0==60) && (synpred3_InternalBugsDsl())) {s = 11;}

                        else if ( (LA23_0==61) && (synpred3_InternalBugsDsl())) {s = 12;}

                        else if ( (LA23_0==62) && (synpred3_InternalBugsDsl())) {s = 13;}

                        else if ( (LA23_0==33) && (synpred3_InternalBugsDsl())) {s = 14;}

                        else if ( (LA23_0==34) && (synpred3_InternalBugsDsl())) {s = 15;}

                        else if ( (LA23_0==35) && (synpred3_InternalBugsDsl())) {s = 16;}

                        else if ( (LA23_0==36) && (synpred3_InternalBugsDsl())) {s = 17;}

                        else if ( (LA23_0==37) && (synpred3_InternalBugsDsl())) {s = 18;}

                        else if ( (LA23_0==38) && (synpred3_InternalBugsDsl())) {s = 19;}

                        else if ( (LA23_0==39) && (synpred3_InternalBugsDsl())) {s = 20;}

                        else if ( (LA23_0==40) && (synpred3_InternalBugsDsl())) {s = 21;}

                        else if ( (LA23_0==41) && (synpred3_InternalBugsDsl())) {s = 22;}

                        else if ( (LA23_0==42) && (synpred3_InternalBugsDsl())) {s = 23;}

                        else if ( (LA23_0==43) && (synpred3_InternalBugsDsl())) {s = 24;}

                        else if ( (LA23_0==44) && (synpred3_InternalBugsDsl())) {s = 25;}

                        else if ( (LA23_0==45) && (synpred3_InternalBugsDsl())) {s = 26;}

                        else if ( (LA23_0==46) && (synpred3_InternalBugsDsl())) {s = 27;}

                        else if ( (LA23_0==47) && (synpred3_InternalBugsDsl())) {s = 28;}

                        else if ( (LA23_0==48) && (synpred3_InternalBugsDsl())) {s = 29;}

                        else if ( (LA23_0==EOF||LA23_0==13||LA23_0==15||LA23_0==18||(LA23_0>=22 && LA23_0<=23)||LA23_0==25||(LA23_0>=31 && LA23_0<=32)) ) {s = 30;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
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
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x7FE1FFFE00010030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x7FE1FFFE00010032L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180C00002L});

}