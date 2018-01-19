/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.opcoach.bugsy.xtext.BugsDslRuntimeModule;
import com.opcoach.bugsy.xtext.BugsDslStandaloneSetup;
import com.opcoach.bugsy.xtext.ide.BugsDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class BugsDslIdeSetup extends BugsDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    BugsDslRuntimeModule _bugsDslRuntimeModule = new BugsDslRuntimeModule();
    BugsDslIdeModule _bugsDslIdeModule = new BugsDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_bugsDslRuntimeModule, _bugsDslIdeModule));
  }
}
