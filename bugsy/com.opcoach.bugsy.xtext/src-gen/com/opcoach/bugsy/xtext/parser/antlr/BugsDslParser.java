/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.parser.antlr;

import com.google.inject.Inject;
import com.opcoach.bugsy.xtext.parser.antlr.internal.InternalBugsDslParser;
import com.opcoach.bugsy.xtext.services.BugsDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class BugsDslParser extends AbstractAntlrParser {

	@Inject
	private BugsDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBugsDslParser createParser(XtextTokenStream stream) {
		return new InternalBugsDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "BugsModel";
	}

	public BugsDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BugsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
