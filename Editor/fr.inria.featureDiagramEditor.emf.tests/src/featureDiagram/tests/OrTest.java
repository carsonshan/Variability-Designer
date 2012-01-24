/*******************************************************************************
 * Copyright (c) 2010-2012 Marie Gouyette
 * INRIA-IRISA-Triskell Team 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Marie Gouyette - initial API and implementation
 *     INRIA-IRISA-Triskell Team
 *     Contact: marie.gouyette@gmail.com
 ******************************************************************************/

/** 
 * This project contains the EMF editor test code of the Feature Diagram metamodel inspired from  the article of Perrouin et al. Reconciling Automation and Flexibility in Product Derivation
	(Software Product Line Conference, 2008 , SPLC�08, 12th Conference).
	This code is  generated with the genmodel file.
 * */

package featureDiagram.tests;

import featureDiagram.FeatureDiagramFactory;
import featureDiagram.Or;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrTest.class);
	}

	/**
	 * Constructs a new Or test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Or test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Or getFixture() {
		return (Or)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureDiagramFactory.eINSTANCE.createOr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OrTest
