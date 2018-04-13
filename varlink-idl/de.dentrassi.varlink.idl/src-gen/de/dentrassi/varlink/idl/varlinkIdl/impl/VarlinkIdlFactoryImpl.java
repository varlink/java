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
package de.dentrassi.varlink.idl.varlinkIdl.impl;

import de.dentrassi.varlink.idl.varlinkIdl.Arguments;
import de.dentrassi.varlink.idl.varlinkIdl.Array;
import de.dentrassi.varlink.idl.varlinkIdl.BasicType;
import de.dentrassi.varlink.idl.varlinkIdl.Dictionary;
import de.dentrassi.varlink.idl.varlinkIdl.ElementType;
import de.dentrassi.varlink.idl.varlinkIdl.Field;
import de.dentrassi.varlink.idl.varlinkIdl.Interface;
import de.dentrassi.varlink.idl.varlinkIdl.Member;
import de.dentrassi.varlink.idl.varlinkIdl.Method;
import de.dentrassi.varlink.idl.varlinkIdl.Optional;
import de.dentrassi.varlink.idl.varlinkIdl.Result;
import de.dentrassi.varlink.idl.varlinkIdl.TypeAlias;
import de.dentrassi.varlink.idl.varlinkIdl.TypeAliasDefinition;
import de.dentrassi.varlink.idl.varlinkIdl.TypeReference;
import de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlFactory;
import de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VarlinkIdlFactoryImpl extends EFactoryImpl implements VarlinkIdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VarlinkIdlFactory init()
  {
    try
    {
      VarlinkIdlFactory theVarlinkIdlFactory = (VarlinkIdlFactory)EPackage.Registry.INSTANCE.getEFactory(VarlinkIdlPackage.eNS_URI);
      if (theVarlinkIdlFactory != null)
      {
        return theVarlinkIdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VarlinkIdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarlinkIdlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VarlinkIdlPackage.INTERFACE: return createInterface();
      case VarlinkIdlPackage.MEMBER: return createMember();
      case VarlinkIdlPackage.TYPE_ALIAS: return createTypeAlias();
      case VarlinkIdlPackage.TYPE_ALIAS_DEFINITION: return createTypeAliasDefinition();
      case VarlinkIdlPackage.ENUM: return createEnum();
      case VarlinkIdlPackage.OBJECT: return createObject();
      case VarlinkIdlPackage.FIELD: return createField();
      case VarlinkIdlPackage.ELEMENT_TYPE: return createElementType();
      case VarlinkIdlPackage.ARRAY: return createArray();
      case VarlinkIdlPackage.DICTIONARY: return createDictionary();
      case VarlinkIdlPackage.OPTIONAL: return createOptional();
      case VarlinkIdlPackage.TYPE_REFERENCE: return createTypeReference();
      case VarlinkIdlPackage.BASIC_TYPE: return createBasicType();
      case VarlinkIdlPackage.METHOD: return createMethod();
      case VarlinkIdlPackage.ARGUMENTS: return createArguments();
      case VarlinkIdlPackage.RESULT: return createResult();
      case VarlinkIdlPackage.ERROR: return createError();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAlias createTypeAlias()
  {
    TypeAliasImpl typeAlias = new TypeAliasImpl();
    return typeAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAliasDefinition createTypeAliasDefinition()
  {
    TypeAliasDefinitionImpl typeAliasDefinition = new TypeAliasDefinitionImpl();
    return typeAliasDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.dentrassi.varlink.idl.varlinkIdl.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.dentrassi.varlink.idl.varlinkIdl.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType createElementType()
  {
    ElementTypeImpl elementType = new ElementTypeImpl();
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dictionary createDictionary()
  {
    DictionaryImpl dictionary = new DictionaryImpl();
    return dictionary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Optional createOptional()
  {
    OptionalImpl optional = new OptionalImpl();
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arguments createArguments()
  {
    ArgumentsImpl arguments = new ArgumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Result createResult()
  {
    ResultImpl result = new ResultImpl();
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.dentrassi.varlink.idl.varlinkIdl.Error createError()
  {
    ErrorImpl error = new ErrorImpl();
    return error;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarlinkIdlPackage getVarlinkIdlPackage()
  {
    return (VarlinkIdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VarlinkIdlPackage getPackage()
  {
    return VarlinkIdlPackage.eINSTANCE;
  }

} //VarlinkIdlFactoryImpl
