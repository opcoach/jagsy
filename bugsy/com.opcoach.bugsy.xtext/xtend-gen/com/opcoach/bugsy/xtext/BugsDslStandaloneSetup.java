/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext;

import com.opcoach.bugsy.xtext.BugsDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BugsDslStandaloneSetup extends BugsDslStandaloneSetupGenerated {
  public static void doSetup() {
    new BugsDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
