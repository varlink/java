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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dentrassi.varlink.idl.varlinkIdl.Object#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends TypeAliasDefinition, ElementType
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link de.dentrassi.varlink.idl.varlinkIdl.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getObject_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Object
