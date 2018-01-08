/**
 * ******************************************************************************
 * Copyright (c) 2017 Red Hat Inc
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dentrassi.varlink.idl.varlinkIdl.TypeAlias#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getTypeAlias()
 * @model
 * @generated
 */
public interface TypeAlias extends Member
{
  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(TypeAliasDefinition)
   * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getTypeAlias_Definition()
   * @model containment="true"
   * @generated
   */
  TypeAliasDefinition getDefinition();

  /**
   * Sets the value of the '{@link de.dentrassi.varlink.idl.varlinkIdl.TypeAlias#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(TypeAliasDefinition value);

} // TypeAlias
