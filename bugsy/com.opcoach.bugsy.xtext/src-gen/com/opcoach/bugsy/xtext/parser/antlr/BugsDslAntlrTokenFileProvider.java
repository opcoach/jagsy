/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BugsDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/opcoach/bugsy/xtext/parser/antlr/internal/InternalBugsDsl.tokens");
	}
}