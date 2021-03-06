/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.tests;

import com.google.inject.Inject;
import com.opcoach.bugsy.xtext.bugsDsl.BugsModel;
import com.opcoach.bugsy.xtext.tests.BugsDslInjectorProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(BugsDslInjectorProvider.class)
@SuppressWarnings("all")
public class BugsDslParsingTest {
  @Inject
  private ParseHelper<BugsModel> parseHelper;
  
  @Test
  public void testLoadModel1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("for ( ed in 1:N2 ) { }");
      _builder.newLine();
      _builder.append("\t\t\t\t ");
      _builder.append("a  <- dnegbin(n, a)");
      _builder.newLine();
      _builder.append("\t\t\t\t  ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("# Comment 1");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("d <- dpois()");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("tutu <- acosh ()");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("test ~ dbeta(3,NZ)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("NZ <- dgen.gamma() ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("titi ~ dnorm(0, 3, 2)");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("toto <- c( 0, 0 , 0, tau) ");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("test ~ dnorm( test)");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("afq <- dgen.gamma(afq)");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("afq ~ dunif(afq,afq,tutu)");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("tutu <- asin(afq,tau)");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("for ( a3 in 0:N3 ) { ");
      _builder.newLine();
      _builder.append("\t\t\t\t   \t  ");
      _builder.append("# Must loop on this...");
      _builder.newLine();
      _builder.append("\t\t\t\t   \t  ");
      _builder.append("test2 ~ dnorm()");
      _builder.newLine();
      _builder.append("\t\t\t\t   \t  ");
      _builder.append("test33 <- dbin(1, 9)");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in testLoadModel1  : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLoadModelFromRefGuide() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("for (i in 1:N) {");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("Y[i]   ~ dnorm(mu[i], tau)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("mu[i] <- alpha + beta * (x[i] - x.bar)");
      _builder.newLine();
      _builder.append("\t   \t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("x.bar <- mean(x)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alpha ~ dnorm(0.0, 1.0E-4)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("beta ~ dnorm(0.0, 1.0E-4)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sigma<- 1.0/sqrt(tau)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("tau ~ dgamma(1.0E-3, 1.0E-3)");
      _builder.newLine();
      _builder.append("\t ");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("}\t");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in testLoadModelFromRefGuide  : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue2_mismatchedVariable() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("a ~ dnorm(1,1)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in testIssue 2 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("ab <- dnorm(1,1)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in testIssue 3 : " + _errors);
      InputOutput.<String>println(_plus);
      boolean _isEmpty = result.eResource().getErrors().isEmpty();
      boolean _not = (!_isEmpty);
      Assert.assertTrue(_not);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue4_SimpleAdditionInParameter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("ab <- (1+2)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in testIssue 4 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue5_ParenthesesInExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("ab <- ac");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 5 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue7_IndexedVariablesNotWorking() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("ab[1] <- (1)");
      _builder.newLine();
      _builder.append("ab[2] <- (1)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 7 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue8_MaximumLimitForRange() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("for(ib in 1:3){");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 8 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue9_LiteralExpressionsAsParametersTaggedAsError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("ab <- exp(3mu)");
      _builder.newLine();
      _builder.append("mu <- 5");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 9 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue10_ManageMultiDimensionalArrays() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model {");
      _builder.newLine();
      _builder.append("for (i in 1:10) {");
      _builder.newLine();
      _builder.append("for (j in 1:10) {");
      _builder.newLine();
      _builder.append("Y[i,j] ~ dnorm(mu[i,j], tau)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 10 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVectorConstruction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model {");
      _builder.newLine();
      _builder.append("y <- c(x1, x2, x3)");
      _builder.newLine();
      _builder.append("v <- c(a)");
      _builder.newLine();
      _builder.append("v <- c(a[1,1], a[2,1], a[1,2], a[2,2])");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in testVectorConstruction : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue11_ManageLenghtFunction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("model {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("for (i in 1:length(Y)) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Y[i] ~ dnorm(mu[i], tau)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 11 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue13_ManageDataBlock() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("data {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("D <- dnegbin(Y)  ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("model {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("for (i in 1:N) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("for (j in 1:M) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Z[i,j] <- dnegbin(alpha[i] + beta[j], tau)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 13 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue16_RangeIndexNotAllowed() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("for(j in 1:M){");
      _builder.newLine();
      _builder.append("for(i in 1:N){");
      _builder.newLine();
      _builder.append("a[j,i] ~ dnorm(mu[j],taub)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("mu[j] ~ dnorm(0,1)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("tau[1:2,1:2] ~ dnorm( x2[1:2, 1:2], 2)");
      _builder.newLine();
      _builder.append("taub ~ dgamma(0.01,0.01)");
      _builder.newLine();
      _builder.append("mu ~ dnorm(0,1)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 16 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue22_dweibDistributionFunction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("for(i in 1:N){");
      _builder.newLine();
      _builder.append("t[i] ~ dweib(r, mu[i])");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 22 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue23_sortFunction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("alpha[1:3] <- sort(alpha0)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 23 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue22_weibulDistributionFunction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("for(i in 1:N){");
      _builder.newLine();
      _builder.append("t[i] ~ weibul(r, mu[i])");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 22 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue24_inverseRaisesAnError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("A <- inverse(B)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 24 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIssue26_lengthRaisesAnError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model{");
      _builder.newLine();
      _builder.append("A <- length(B)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BugsModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      EList<Resource.Diagnostic> _errors = result.eResource().getErrors();
      String _plus = ("Errors in Issue 26 : " + _errors);
      InputOutput.<String>println(_plus);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
