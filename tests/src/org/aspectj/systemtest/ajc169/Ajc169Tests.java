/*******************************************************************************
 * Copyright (c) 2008 Contributors 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andy Clement - initial API and implementation
 *******************************************************************************/
package org.aspectj.systemtest.ajc169;

import java.io.File;

import junit.framework.Test;

import org.aspectj.testing.XMLBasedAjcTestCase;

public class Ajc169Tests extends org.aspectj.testing.XMLBasedAjcTestCase {

	// public void testAmbiguousMethod_298665() {
	// runTest("ambiguous method");
	// }

	// public void testStaticallyAnalyzableIf_292262_1() {
	// runTest("if with statically recognizable code");
	// }

	// public void testAdvisingPrivilegedAccessMethod_307147() {
	// runTest("advising privileged access method");
	// }

	public void testPipeliningAndGenerics_309336() {
		runTest("pipelining and generics");
	}

	public void testCrashParamAnnos_309440() {
		runTest("crash param annos");
	}

	// 1.6.9 M1 below here
	public void testSubtleGenericsIssue_308773() {
		runTest("subtle generics problem");
	}

	public void testAdvisingPrivilegedAccessMember_307120() {
		runTest("advising privileged access member");
	}

	public void testAdvisingPrivilegedAccessMember_307120_2() {
		runTest("advising privileged access member - 2");
	}

	public void testTypePatternCategories_44365_Class() {
		runTest("type category type patterns - class");
	}

	public void testTypePatternCategories_44365_Interface() {
		runTest("type category type patterns - interface");
	}

	public void testTypePatternCategories_44365_Enum() {
		runTest("type category type patterns - enum");
	}

	public void testTypePatternCategories_44365_Annotation() {
		runTest("type category type patterns - annotation");
	}

	public void testTypePatternCategories_44365_Anonymous() {
		runTest("type category type patterns - anonymous");
	}

	public void testTypePatternCategories_44365_Inner() {
		runTest("type category type patterns - inner");
	}

	public void testTypePatternCategories_44365_Inner_2() {
		runTest("type category type patterns - inner - 2");
	}

	public void testTypePatternCategories_44365_Inner_3() {
		runTest("type category type patterns - inner - 3");
	}

	public void testTypePatternCategories_44365_Aspect() {
		runTest("type category type patterns - aspect");
	}

	public void testTypePatternCategories_44365_e1() {
		runTest("type category type patterns - e1");
	}

	public void testTypePatternCategories_44365_e3() {
		runTest("type category type patterns - e3");
	}

	public void testTypePatternCategories_44365_e2() {
		runTest("type category type patterns - e2");
	}

	public void testChecker() {
		runTest("inserts in messages");
	}

	/*
	 * public void testVerifyError() { runTest("verifyerror on atAj"); }
	 */
	public void testDeclareTypeWarning1() {
		runTest("declare type warning - 1");
	}

	public void testDeclareTypeWarning2() {
		runTest("declare type warning - 2");
	}

	public void testDeclareTypeWarning3() {
		runTest("declare type warning - 3");
	}

	public void testDeclareTypeError1() {
		runTest("declare type error - 1");
	}

	public void testPr298388() {
		runTest("declare mixin and generics");
	}

	public void testPr292584() {
		runTest("annotation around advice verifyerror");
	}

	// ---

	public static Test suite() {
		return XMLBasedAjcTestCase.loadSuite(Ajc169Tests.class);
	}

	@Override
	protected File getSpecFile() {
		return new File("../tests/src/org/aspectj/systemtest/ajc169/ajc169.xml");
	}

}