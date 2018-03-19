/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.serializer;

import com.google.inject.Inject;
import com.opcoach.bugsy.xtext.services.BugsDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BugsDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BugsDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DeterministicRelation_EqualsSignKeyword_2_1_or_LessThanSignHyphenMinusKeyword_2_0;
	protected AbstractElementAlias match_Distribution_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0;
	protected AbstractElementAlias match_Function_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0;
	protected AbstractElementAlias match_StochasticRelation_LeftParenthesisRightParenthesisKeyword_4_0_q;
	protected AbstractElementAlias match_TerminalExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_TerminalExpression_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BugsDslGrammarAccess) access;
		match_DeterministicRelation_EqualsSignKeyword_2_1_or_LessThanSignHyphenMinusKeyword_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeterministicRelationAccess().getEqualsSignKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeterministicRelationAccess().getLessThanSignHyphenMinusKeyword_2_0()));
		match_Distribution_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDistributionAccess().getLeftParenthesisKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getDistributionAccess().getLeftParenthesisRightParenthesisKeyword_1_0()));
		match_Function_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getLeftParenthesisRightParenthesisKeyword_1_0()));
		match_StochasticRelation_LeftParenthesisRightParenthesisKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getStochasticRelationAccess().getLeftParenthesisRightParenthesisKeyword_4_0());
		match_TerminalExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_TerminalExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DeterministicRelation_EqualsSignKeyword_2_1_or_LessThanSignHyphenMinusKeyword_2_0.equals(syntax))
				emit_DeterministicRelation_EqualsSignKeyword_2_1_or_LessThanSignHyphenMinusKeyword_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Distribution_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0.equals(syntax))
				emit_Distribution_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Function_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0.equals(syntax))
				emit_Function_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_StochasticRelation_LeftParenthesisRightParenthesisKeyword_4_0_q.equals(syntax))
				emit_StochasticRelation_LeftParenthesisRightParenthesisKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TerminalExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_TerminalExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TerminalExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_TerminalExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '<-' | '='
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ArrayID (ambiguity) expressions+=Expression
	 */
	protected void emit_DeterministicRelation_EqualsSignKeyword_2_1_or_LessThanSignHyphenMinusKeyword_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '()' | '('
	 *
	 * This ambiguous syntax occurs at:
	 *     distrib=DistributionOperator (ambiguity) (rule end)
	 */
	protected void emit_Distribution_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '()' | '('
	 *
	 * This ambiguous syntax occurs at:
	 *     operation=FunctionOperator (ambiguity) (rule end)
	 */
	protected void emit_Function_LeftParenthesisKeyword_1_1_0_or_LeftParenthesisRightParenthesisKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '()'?
	 *
	 * This ambiguous syntax occurs at:
	 *     distrib=Density (ambiguity) (rule end)
	 */
	protected void emit_StochasticRelation_LeftParenthesisRightParenthesisKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) distribution=Distribution
	 *     (rule start) (ambiguity) function=Function
	 *     (rule start) (ambiguity) value=Value
	 *     (rule start) (ambiguity) {Expression.left=}
	 */
	protected void emit_TerminalExpression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Expression.left=}
	 */
	protected void emit_TerminalExpression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
