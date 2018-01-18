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
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dentrassi.varlink.idl.varlinkIdl.TypeReference#isMulti <em>Multi</em>}</li>
 *   <li>{@link de.dentrassi.varlink.idl.varlinkIdl.TypeReference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends ElementType
{
  /**
   * Returns the value of the '<em><b>Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi</em>' attribute.
   * @see #setMulti(boolean)
   * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getTypeReference_Multi()
   * @model
   * @generated
   */
  boolean isMulti();

  /**
   * Sets the value of the '{@link de.dentrassi.varlink.idl.varlinkIdl.TypeReference#isMulti <em>Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi</em>' attribute.
   * @see #isMulti()
   * @generated
   */
  void setMulti(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(TypeAlias)
   * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getTypeReference_Name()
   * @model
   * @generated
   */
  TypeAlias getName();

  /**
   * Sets the value of the '{@link de.dentrassi.varlink.idl.varlinkIdl.TypeReference#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(TypeAlias value);

} // TypeReference
