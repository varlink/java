/**
 * ******************************************************************************
 * Copyright (c) 2018 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *  ******************************************************************************
 */
package de.dentrassi.varlink.idl.varlinkIdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dentrassi.varlink.idl.varlinkIdl.Interface#getName <em>Name</em>}</li>
 *   <li>{@link de.dentrassi.varlink.idl.varlinkIdl.Interface#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getInterface_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.dentrassi.varlink.idl.varlinkIdl.Interface#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link de.dentrassi.varlink.idl.varlinkIdl.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getInterface_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // Interface
