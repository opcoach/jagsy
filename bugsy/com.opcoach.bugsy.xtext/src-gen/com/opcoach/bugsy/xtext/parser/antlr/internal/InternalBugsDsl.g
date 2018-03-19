/*
 * generated by Xtext 2.12.0
 */
grammar InternalBugsDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.opcoach.bugsy.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleBugsModel
entryRuleBugsModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBugsModelRule()); }
	iv_ruleBugsModel=ruleBugsModel
	{ $current=$iv_ruleBugsModel.current; }
	EOF;

// Rule BugsModel
ruleBugsModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBugsModelAccess().getBugsModelAction_0(),
					$current);
			}
		)
		otherlv_1='model'
		{
			newLeafNode(otherlv_1, grammarAccess.getBugsModelAccess().getModelKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getBugsModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBugsModelAccess().getInstructionsInstructionParserRuleCall_3_0());
				}
				lv_instructions_3_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBugsModelRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_3_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getBugsModelAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getForParserRuleCall_0());
		}
		this_For_0=ruleFor
		{
			$current = $this_For_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getRelationParserRuleCall_1());
		}
		this_Relation_1=ruleRelation
		{
			$current = $this_Relation_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFor
entryRuleFor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForRule()); }
	iv_ruleFor=ruleFor
	{ $current=$iv_ruleFor.current; }
	EOF;

// Rule For
ruleFor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getForAccess().getForAction_0(),
					$current);
			}
		)
		otherlv_1='for'
		{
			newLeafNode(otherlv_1, grammarAccess.getForAccess().getForKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getForAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				lv_variable_3_0=RULE_ID
				{
					newLeafNode(lv_variable_3_0, grammarAccess.getForAccess().getVariableIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getForRule());
					}
					setWithLastConsumed(
						$current,
						"variable",
						lv_variable_3_0,
						"com.opcoach.bugsy.xtext.BugsDsl.ID");
				}
			)
		)
		otherlv_4='in'
		{
			newLeafNode(otherlv_4, grammarAccess.getForAccess().getInKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForAccess().getRangeForRangeParserRuleCall_5_0());
				}
				lv_range_5_0=ruleForRange
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRule());
					}
					set(
						$current,
						"range",
						lv_range_5_0,
						"com.opcoach.bugsy.xtext.BugsDsl.ForRange");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getForAccess().getRightParenthesisKeyword_6());
		}
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForAccess().getContentsInstructionParserRuleCall_8_0());
				}
				lv_contents_8_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRule());
					}
					add(
						$current,
						"contents",
						lv_contents_8_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getForAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleNumeric
entryRuleNumeric returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNumericRule()); }
	iv_ruleNumeric=ruleNumeric
	{ $current=$iv_ruleNumeric.current.getText(); }
	EOF;

// Rule Numeric
ruleNumeric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getNumericAccess().getINTTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getNumericAccess().getFloatParserRuleCall_1());
		}
		this_Float_1=ruleFloat
		{
			$current.merge(this_Float_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIndex
entryRuleIndex returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIndexRule()); }
	iv_ruleIndex=ruleIndex
	{ $current=$iv_ruleIndex.current.getText(); }
	EOF;

// Rule Index
ruleIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getIndexAccess().getINTTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getIndexAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleForRange
entryRuleForRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForRangeRule()); }
	iv_ruleForRange=ruleForRange
	{ $current=$iv_ruleForRange.current; }
	EOF;

// Rule ForRange
ruleForRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getForRangeAccess().getLowIndexParserRuleCall_0_0());
				}
				lv_low_0_0=ruleIndex
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRangeRule());
					}
					set(
						$current,
						"low",
						lv_low_0_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Index");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getForRangeAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForRangeAccess().getHighIndexParserRuleCall_2_0());
				}
				lv_high_2_0=ruleIndex
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRangeRule());
					}
					set(
						$current,
						"high",
						lv_high_2_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Index");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleArrayRange
entryRuleArrayRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayRangeRule()); }
	iv_ruleArrayRange=ruleArrayRange
	{ $current=$iv_ruleArrayRange.current; }
	EOF;

// Rule ArrayRange
ruleArrayRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowIndexParserRuleCall_0_0());
				}
				lv_low_0_0=ruleIndex
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArrayRangeRule());
					}
					set(
						$current,
						"low",
						lv_low_0_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Index");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getColonKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayRangeAccess().getHighIndexParserRuleCall_1_1_0());
					}
					lv_high_2_0=ruleIndex
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayRangeRule());
						}
						set(
							$current,
							"high",
							lv_high_2_0,
							"com.opcoach.bugsy.xtext.BugsDsl.Index");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleFloat
entryRuleFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFloatRule()); }
	iv_ruleFloat=ruleFloat
	{ $current=$iv_ruleFloat.current.getText(); }
	EOF;

// Rule Float
ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2());
		}
		(
			kw='E'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFloatAccess().getEKeyword_3_0());
			}
			(
				kw='+'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getFloatAccess().getPlusSignKeyword_3_1_0());
				}
				    |
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getFloatAccess().getHyphenMinusKeyword_3_1_1());
				}
			)
			this_INT_6=RULE_INT
			{
				$current.merge(this_INT_6);
			}
			{
				newLeafNode(this_INT_6, grammarAccess.getFloatAccess().getINTTerminalRuleCall_3_2());
			}
		)?
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getValueAccess().getValueAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getValueAccess().getValueNumericParserRuleCall_0_1_0());
					}
					lv_value_1_0=ruleNumeric
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getValueRule());
						}
						set(
							$current,
							"value",
							lv_value_1_0,
							"com.opcoach.bugsy.xtext.BugsDsl.Numeric");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getValueAccess().getIdArrayIDParserRuleCall_1_0());
				}
				lv_id_2_0=ruleArrayID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getValueRule());
					}
					set(
						$current,
						"id",
						lv_id_2_0,
						"com.opcoach.bugsy.xtext.BugsDsl.ArrayID");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleArrayID
entryRuleArrayID returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayIDRule()); }
	iv_ruleArrayID=ruleArrayID
	{ $current=$iv_ruleArrayID.current; }
	EOF;

// Rule ArrayID
ruleArrayID returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getArrayIDAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getArrayIDRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"com.opcoach.bugsy.xtext.BugsDsl.ID");
				}
			)
		)
		(
			otherlv_1='['
			{
				newLeafNode(otherlv_1, grammarAccess.getArrayIDAccess().getLeftSquareBracketKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayIDAccess().getIndexesArrayRangeParserRuleCall_1_1_0());
					}
					lv_indexes_2_0=ruleArrayRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayIDRule());
						}
						add(
							$current,
							"indexes",
							lv_indexes_2_0,
							"com.opcoach.bugsy.xtext.BugsDsl.ArrayRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getArrayIDAccess().getCommaKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getArrayIDAccess().getIndexesArrayRangeParserRuleCall_1_2_1_0());
						}
						lv_indexes_4_0=ruleArrayRange
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getArrayIDRule());
							}
							add(
								$current,
								"indexes",
								lv_indexes_4_0,
								"com.opcoach.bugsy.xtext.BugsDsl.ArrayRange");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_5=']'
			{
				newLeafNode(otherlv_5, grammarAccess.getArrayIDAccess().getRightSquareBracketKeyword_1_3());
			}
		)?
	)
;

// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	iv_ruleRelation=ruleRelation
	{ $current=$iv_ruleRelation.current; }
	EOF;

// Rule Relation
ruleRelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRelationAccess().getStochasticRelationParserRuleCall_0());
		}
		this_StochasticRelation_0=ruleStochasticRelation
		{
			$current = $this_StochasticRelation_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRelationAccess().getDeterministicRelationParserRuleCall_1());
		}
		this_DeterministicRelation_1=ruleDeterministicRelation
		{
			$current = $this_DeterministicRelation_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStochasticRelation
entryRuleStochasticRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStochasticRelationRule()); }
	iv_ruleStochasticRelation=ruleStochasticRelation
	{ $current=$iv_ruleStochasticRelation.current; }
	EOF;

// Rule StochasticRelation
ruleStochasticRelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStochasticRelationAccess().getStochasticRelationAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStochasticRelationAccess().getNameArrayIDParserRuleCall_1_0());
				}
				lv_name_1_0=ruleArrayID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.opcoach.bugsy.xtext.BugsDsl.ArrayID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='~'
		{
			newLeafNode(otherlv_2, grammarAccess.getStochasticRelationAccess().getTildeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStochasticRelationAccess().getDistribDensityEnumRuleCall_3_0());
				}
				lv_distrib_3_0=ruleDensity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
					}
					set(
						$current,
						"distrib",
						lv_distrib_3_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Density");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='()'
			{
				newLeafNode(otherlv_4, grammarAccess.getStochasticRelationAccess().getLeftParenthesisRightParenthesisKeyword_4_0());
			}
			    |
			(
				otherlv_5='('
				{
					newLeafNode(otherlv_5, grammarAccess.getStochasticRelationAccess().getLeftParenthesisKeyword_4_1_0());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsExpressionParserRuleCall_4_1_1_0_0());
							}
							lv_params_6_0=ruleExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
								}
								add(
									$current,
									"params",
									lv_params_6_0,
									"com.opcoach.bugsy.xtext.BugsDsl.Expression");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_7=','
						{
							newLeafNode(otherlv_7, grammarAccess.getStochasticRelationAccess().getCommaKeyword_4_1_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getStochasticRelationAccess().getParamsExpressionParserRuleCall_4_1_1_1_1_0());
								}
								lv_params_8_0=ruleExpression
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getStochasticRelationRule());
									}
									add(
										$current,
										"params",
										lv_params_8_0,
										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)
				otherlv_9=')'
				{
					newLeafNode(otherlv_9, grammarAccess.getStochasticRelationAccess().getRightParenthesisKeyword_4_1_2());
				}
			)
		)?
	)
;

// Entry rule entryRuleDeterministicRelation
entryRuleDeterministicRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeterministicRelationRule()); }
	iv_ruleDeterministicRelation=ruleDeterministicRelation
	{ $current=$iv_ruleDeterministicRelation.current; }
	EOF;

// Rule DeterministicRelation
ruleDeterministicRelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDeterministicRelationAccess().getDeterministicRelationAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDeterministicRelationAccess().getNameArrayIDParserRuleCall_1_0());
				}
				lv_name_1_0=ruleArrayID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.opcoach.bugsy.xtext.BugsDsl.ArrayID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='<-'
			{
				newLeafNode(otherlv_2, grammarAccess.getDeterministicRelationAccess().getLessThanSignHyphenMinusKeyword_2_0());
			}
			    |
			otherlv_3='='
			{
				newLeafNode(otherlv_3, grammarAccess.getDeterministicRelationAccess().getEqualsSignKeyword_2_1());
			}
		)
		(
			((
				ruleExpression
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getDeterministicRelationAccess().getExpressionsExpressionParserRuleCall_3_0());
				}
				lv_expressions_4_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeterministicRelationRule());
					}
					add(
						$current,
						"expressions",
						lv_expressions_4_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOperator
entryRuleOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	iv_ruleOperator=ruleOperator
	{ $current=$iv_ruleOperator.current.getText(); }
	EOF;

// Rule Operator
ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3());
		}
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getOperationFunctionOperatorEnumRuleCall_0_0());
				}
				lv_operation_0_0=ruleFunctionOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"operation",
						lv_operation_0_0,
						"com.opcoach.bugsy.xtext.BugsDsl.FunctionOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='()'
			{
				newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
			}
			    |
			(
				otherlv_2='('
				{
					newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_1_0());
				}
				(
					(
						((
							(
								ruleExpression
							)
						)
						)=>
						(
							(
								{
									newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_1_1_1_0_0_0());
								}
								lv_params_3_0=ruleExpression
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getFunctionRule());
									}
									add(
										$current,
										"params",
										lv_params_3_0,
										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)
					(
						otherlv_4=','
						{
							newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_1_1_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_1_1_1_1_1_0());
								}
								lv_params_5_0=ruleExpression
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getFunctionRule());
									}
									add(
										$current,
										"params",
										lv_params_5_0,
										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
					otherlv_6=')'
					{
						newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_1_1_2());
					}
				)?
			)
		)
	)
;

// Entry rule entryRuleDistribution
entryRuleDistribution returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDistributionRule()); }
	iv_ruleDistribution=ruleDistribution
	{ $current=$iv_ruleDistribution.current; }
	EOF;

// Rule Distribution
ruleDistribution returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDistributionAccess().getDistribDistributionOperatorEnumRuleCall_0_0());
				}
				lv_distrib_0_0=ruleDistributionOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDistributionRule());
					}
					set(
						$current,
						"distrib",
						lv_distrib_0_0,
						"com.opcoach.bugsy.xtext.BugsDsl.DistributionOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='()'
			{
				newLeafNode(otherlv_1, grammarAccess.getDistributionAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
			}
			    |
			(
				otherlv_2='('
				{
					newLeafNode(otherlv_2, grammarAccess.getDistributionAccess().getLeftParenthesisKeyword_1_1_0());
				}
				(
					(
						((
							(
								ruleExpression
							)
						)
						)=>
						(
							(
								{
									newCompositeNode(grammarAccess.getDistributionAccess().getParamsExpressionParserRuleCall_1_1_1_0_0_0());
								}
								lv_params_3_0=ruleExpression
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getDistributionRule());
									}
									add(
										$current,
										"params",
										lv_params_3_0,
										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)
					(
						otherlv_4=','
						{
							newLeafNode(otherlv_4, grammarAccess.getDistributionAccess().getCommaKeyword_1_1_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getDistributionAccess().getParamsExpressionParserRuleCall_1_1_1_1_1_0());
								}
								lv_params_5_0=ruleExpression
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getDistributionRule());
									}
									add(
										$current,
										"params",
										lv_params_5_0,
										"com.opcoach.bugsy.xtext.BugsDsl.Expression");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
					otherlv_6=')'
					{
						newLeafNode(otherlv_6, grammarAccess.getDistributionAccess().getRightParenthesisKeyword_1_1_1_2());
					}
				)?
			)
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0());
		}
		this_TerminalExpression_0=ruleTerminalExpression
		{
			$current = $this_TerminalExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_1_1_0());
					}
					lv_op_2_0=ruleOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"op",
							lv_op_2_0,
							"com.opcoach.bugsy.xtext.BugsDsl.Operator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleTerminalExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.opcoach.bugsy.xtext.BugsDsl.TerminalExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTerminalExpression
entryRuleTerminalExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalExpressionRule()); }
	iv_ruleTerminalExpression=ruleTerminalExpression
	{ $current=$iv_ruleTerminalExpression.current; }
	EOF;

// Rule TerminalExpression
ruleTerminalExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueValueParserRuleCall_1_0());
				}
				lv_value_3_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionParserRuleCall_2_0());
				}
				lv_function_4_0=ruleFunction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
					}
					set(
						$current,
						"function",
						lv_function_4_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Function");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDistributionDistributionParserRuleCall_3_0());
				}
				lv_distribution_5_0=ruleDistribution
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
					}
					set(
						$current,
						"distribution",
						lv_distribution_5_0,
						"com.opcoach.bugsy.xtext.BugsDsl.Distribution");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule DistributionOperator
ruleDistributionOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='dbern'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDbernEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDistributionOperatorAccess().getDbernEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='dbin'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDbinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDistributionOperatorAccess().getDbinEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='dchisqr'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDchisqrEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDistributionOperatorAccess().getDchisqrEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='ddexp'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDdexpEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDistributionOperatorAccess().getDdexpEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='dexp'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDexpEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getDistributionOperatorAccess().getDexpEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='df'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDfEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getDistributionOperatorAccess().getDfEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='dgen.gamma'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDgengammEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getDistributionOperatorAccess().getDgengammEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='dhyper'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDhyperEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getDistributionOperatorAccess().getDhyperEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='dlogis'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDlogisEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getDistributionOperatorAccess().getDlogisEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='dlnorm'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDlnormEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getDistributionOperatorAccess().getDlnormEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='dnegbin'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDnegbinEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getDistributionOperatorAccess().getDnegbinEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='dnchisqr'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDnchisqrEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getDistributionOperatorAccess().getDnchisqrEnumLiteralDeclaration_11());
			}
		)
		    |
		(
			enumLiteral_12='dpar'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDparEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_12, grammarAccess.getDistributionOperatorAccess().getDparEnumLiteralDeclaration_12());
			}
		)
		    |
		(
			enumLiteral_13='dpois'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDpoisEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_13, grammarAccess.getDistributionOperatorAccess().getDpoisEnumLiteralDeclaration_13());
			}
		)
		    |
		(
			enumLiteral_14='dt'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDtEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_14, grammarAccess.getDistributionOperatorAccess().getDtEnumLiteralDeclaration_14());
			}
		)
		    |
		(
			enumLiteral_15='dweib'
			{
				$current = grammarAccess.getDistributionOperatorAccess().getDweibEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_15, grammarAccess.getDistributionOperatorAccess().getDweibEnumLiteralDeclaration_15());
			}
		)
	)
;

// Rule Density
ruleDensity returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='dnorm'
			{
				$current = grammarAccess.getDensityAccess().getDnormEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDensityAccess().getDnormEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='dunif'
			{
				$current = grammarAccess.getDensityAccess().getDunifEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDensityAccess().getDunifEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='dbeta'
			{
				$current = grammarAccess.getDensityAccess().getDbetaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDensityAccess().getDbetaEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='dgamma'
			{
				$current = grammarAccess.getDensityAccess().getDgammaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDensityAccess().getDgammaEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule FunctionOperator
ruleFunctionOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='acos'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getAcosEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getFunctionOperatorAccess().getAcosEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='acosh'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getAcoshEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getFunctionOperatorAccess().getAcoshEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='asin'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getAsinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getFunctionOperatorAccess().getAsinEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='asinh'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getAsinhEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getFunctionOperatorAccess().getAsinhEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='atan'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getAtanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getFunctionOperatorAccess().getAtanEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='log'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getLogEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getFunctionOperatorAccess().getLogEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='exp'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getEpEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getFunctionOperatorAccess().getEpEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='c'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getCEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getFunctionOperatorAccess().getCEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='mean'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getMeanEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getFunctionOperatorAccess().getMeanEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='sqrt'
			{
				$current = grammarAccess.getFunctionOperatorAccess().getSqrtEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getFunctionOperatorAccess().getSqrtEnumLiteralDeclaration_9());
			}
		)
	)
;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'.'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
