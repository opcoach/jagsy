/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.tests

import com.google.inject.Inject
import com.opcoach.bugsy.xtext.bugsDsl.BugsModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(BugsDslInjectorProvider)
class BugsDslParsingTest {
	@Inject
	ParseHelper<BugsModel> parseHelper

	@Test
	def void testLoadModel1() {
		val result = parseHelper.parse('''
			model { 
						for ( ed in 1:N2 ) { }
							 a  <- dnegbin(n, a)
							  
						# Comment 1
						d <- dpois()
							tutu <- acosh ()
							test ~ dbeta(3,NZ)
							NZ <- dgen.gamma() 
							titi ~ dnorm(0, 3, 2)
							   toto <- c( 0, 0 , 0, tau) 
							   test ~ dnorm( test)
							   afq <- dgen.gamma(afq)
							   afq ~ dunif(afq,afq,tutu)
							   tutu <- asin(afq,tau)
							   for ( a3 in 0:N3 ) { 
							   	  # Must loop on this...
							   	  test2 ~ dnorm()
							   	  test33 <- dbin(1, 9)
							   }
							   }
							   
				
		''')
		Assert.assertNotNull(result)
		println("Errors in testLoadModel1  : " + result.eResource.errors)
		Assert.assertTrue(result.eResource.errors.isEmpty)

	}

	@Test
	def void testLoadModelFromRefGuide() {
		val result = parseHelper.parse('''
			model {
			    for (i in 1:N) {
			    	Y[i]   ~ dnorm(mu[i], tau)
				mu[i] <- alpha + beta * (x[i] - x.bar)
				   	
				}
			
				x.bar <- mean(x)
				alpha ~ dnorm(0.0, 1.0E-4)
				beta ~ dnorm(0.0, 1.0E-4)
				sigma<- 1.0/sqrt(tau)
				tau ~ dgamma(1.0E-3, 1.0E-3)
				 
				  }	
		''')
		Assert.assertNotNull(result)
		println("Errors in testLoadModelFromRefGuide  : " + result.eResource.errors)

		Assert.assertTrue(result.eResource.errors.isEmpty)

	}

	@Test
	def void testIssue2_mismatchedVariable() {
		// mismatched input 'a' expected '}' 
		// See : https://github.com/opcoach/jagsy/issues/2
		val result = parseHelper.parse('''
			model{
			a ~ dnorm(1,1)
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in testIssue 2 : " + result.eResource.errors)

		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void testIssue3() {
		// Density Function in deterministic definition 
		// See : https://github.com/opcoach/jagsy/issues/3
		// Assert.fail("Density Function in deterministic definition (Test to Be Fixed)");
		val result = parseHelper.parse('''
			model{
			ab <- dnorm(1,1)
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in testIssue 3 : " + result.eResource.errors)

		Assert.assertTrue(!result.eResource.errors.isEmpty)
	}

	@Test
	def void testIssue4() {
		// Simple addition sign tagged as error
		// See : https://github.com/opcoach/jagsy/issues/4
		val result = parseHelper.parse('''
			model{
			ab <- (1+2)
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in testIssue 4 : " + result.eResource.errors)

		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void testIssue5_ParenthesesInExpression() {
		// Obligation to use parentheses in expression 
		// See : https://github.com/opcoach/jagsy/issues/5
		val result = parseHelper.parse('''
			model{
			ab <- ac
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in Issue 5 : " + result.eResource.errors)

		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void testIssue7_IndexedVariablesNotWorking() {
		// Indexed Variables not working
		// See : https://github.com/opcoach/jagsy/issues/7
		val result = parseHelper.parse('''
			model{
			ab[1] <- (1)
			ab[2] <- (1)
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in Issue 7 : " + result.eResource.errors)

		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void testIssue8_MaximumLimitForRange() {
		// maximum limit of the definition of a range of indices tagged as error
		// See : https://github.com/opcoach/jagsy/issues/8
		val result = parseHelper.parse('''
			model{
			for(ib in 1:3){
			}
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in Issue 8 : " + result.eResource.errors)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void testIssue9_LiteralExpressionsAsParametersTaggedAsError() {
		// See : https://github.com/opcoach/jagsy/issues/9
		val result = parseHelper.parse('''
			model{
			ab <- exp(3mu)
			mu <- 5
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in Issue 9 : " + result.eResource.errors)
		Assert.assertTrue(!result.eResource.errors.isEmpty)
	}

	@Test
	def void testIssue10_ManageMultiDimensionalArrays() {
		// See : https://github.com/opcoach/jagsy/issues/10
		val result = parseHelper.parse('''
			model {
			for (i in 1:10) {
			for (j in 1:10) {
			Y[i,j] ~ dnorm(mu[i,j], tau)
			}
			}
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in Issue 10 : " + result.eResource.errors)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void testVectorConstruction() {
		val result = parseHelper.parse('''
			model {
			y <- c(x1, x2, x3)
			v <- c(a)
			v <- c(a[1,1], a[2,1], a[1,2], a[2,2])
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in testVectorConstruction : " + result.eResource.errors)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void testIssue16_RangeIndexNotAllowed() {
		// See : https://github.com/opcoach/jagsy/issues/16
		val result = parseHelper.parse('''
			model{
			for(j in 1:M){
			for(i in 1:N){
			a[j,i] ~ dnorm(mu[j],taub)
			}
			mu[j] ~ dnorm(0,1)
			}
			tau[1:2,1:2] ~ dnorm( x2[1:2, 1:2], 2)
			taub ~ dgamma(0.01,0.01)
			mu ~ dnorm(0,1)
			}
		''')
		Assert.assertNotNull(result)
		println("Errors in Issue 16 : " + result.eResource.errors)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

}
