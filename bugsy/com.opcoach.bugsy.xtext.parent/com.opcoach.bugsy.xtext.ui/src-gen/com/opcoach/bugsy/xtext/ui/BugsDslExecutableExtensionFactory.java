/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.ui;

import com.google.inject.Injector;
import com.opcoach.bugsy.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BugsDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtextActivator.getInstance().getInjector(XtextActivator.COM_OPCOACH_BUGSY_XTEXT_BUGSDSL);
	}
	
}
