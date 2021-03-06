/*******************************************************************************
 * Copyright (c) 2018 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package de.dentrassi.varlink.idl.serializer;

import com.google.inject.Inject;
import de.dentrassi.varlink.idl.services.VarlinkIdlGrammarAccess;
import de.dentrassi.varlink.idl.varlinkIdl.Arguments;
import de.dentrassi.varlink.idl.varlinkIdl.Array;
import de.dentrassi.varlink.idl.varlinkIdl.BasicType;
import de.dentrassi.varlink.idl.varlinkIdl.Dictionary;
import de.dentrassi.varlink.idl.varlinkIdl.Field;
import de.dentrassi.varlink.idl.varlinkIdl.Interface;
import de.dentrassi.varlink.idl.varlinkIdl.Method;
import de.dentrassi.varlink.idl.varlinkIdl.Optional;
import de.dentrassi.varlink.idl.varlinkIdl.Result;
import de.dentrassi.varlink.idl.varlinkIdl.TypeAlias;
import de.dentrassi.varlink.idl.varlinkIdl.TypeReference;
import de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class VarlinkIdlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VarlinkIdlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == VarlinkIdlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case VarlinkIdlPackage.ARGUMENTS:
				sequence_Arguments(context, (Arguments) semanticObject); 
				return; 
			case VarlinkIdlPackage.ARRAY:
				sequence_Array(context, (Array) semanticObject); 
				return; 
			case VarlinkIdlPackage.BASIC_TYPE:
				sequence_BasicType(context, (BasicType) semanticObject); 
				return; 
			case VarlinkIdlPackage.DICTIONARY:
				sequence_Dictionary(context, (Dictionary) semanticObject); 
				return; 
			case VarlinkIdlPackage.ENUM:
				sequence_Enum(context, (de.dentrassi.varlink.idl.varlinkIdl.Enum) semanticObject); 
				return; 
			case VarlinkIdlPackage.ERROR:
				sequence_Error(context, (de.dentrassi.varlink.idl.varlinkIdl.Error) semanticObject); 
				return; 
			case VarlinkIdlPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case VarlinkIdlPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case VarlinkIdlPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case VarlinkIdlPackage.OBJECT:
				sequence_Object(context, (de.dentrassi.varlink.idl.varlinkIdl.Object) semanticObject); 
				return; 
			case VarlinkIdlPackage.OPTIONAL:
				sequence_Optional(context, (Optional) semanticObject); 
				return; 
			case VarlinkIdlPackage.RESULT:
				sequence_Result(context, (Result) semanticObject); 
				return; 
			case VarlinkIdlPackage.TYPE_ALIAS:
				sequence_TypeAlias(context, (TypeAlias) semanticObject); 
				return; 
			case VarlinkIdlPackage.TYPE_REFERENCE:
				sequence_TypeReference(context, (TypeReference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Arguments returns Arguments
	 *
	 * Constraint:
	 *     arguments=Object
	 */
	protected void sequence_Arguments(ISerializationContext context, Arguments semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.ARGUMENTS__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.ARGUMENTS__ARGUMENTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArgumentsAccess().getArgumentsObjectParserRuleCall_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementType returns Array
	 *     Array returns Array
	 *
	 * Constraint:
	 *     type=ElementType
	 */
	protected void sequence_Array(ISerializationContext context, Array semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.ARRAY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.ARRAY__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArrayAccess().getTypeElementTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementType returns BasicType
	 *     BasicType returns BasicType
	 *
	 * Constraint:
	 *     (type='bool' | type='int' | type='float' | type='string' | type='object')
	 */
	protected void sequence_BasicType(ISerializationContext context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementType returns Dictionary
	 *     Dictionary returns Dictionary
	 *
	 * Constraint:
	 *     type=ElementType
	 */
	protected void sequence_Dictionary(ISerializationContext context, Dictionary semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.DICTIONARY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.DICTIONARY__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDictionaryAccess().getTypeElementTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeAliasDefinition returns Enum
	 *     Enum returns Enum
	 *     ElementType returns Enum
	 *
	 * Constraint:
	 *     (fields+=ValidID fields+=ValidID*)
	 */
	protected void sequence_Enum(ISerializationContext context, de.dentrassi.varlink.idl.varlinkIdl.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Error
	 *     Error returns Error
	 *
	 * Constraint:
	 *     (name=ID properties=Object)
	 */
	protected void sequence_Error(ISerializationContext context, de.dentrassi.varlink.idl.varlinkIdl.Error semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.MEMBER__NAME));
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.ERROR__PROPERTIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.ERROR__PROPERTIES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getErrorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getErrorAccess().getPropertiesObjectParserRuleCall_2_0(), semanticObject.getProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     (name=ValidID type=ElementType)
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.FIELD__NAME));
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.FIELD__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldAccess().getNameValidIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFieldAccess().getTypeElementTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (name=InterfaceName members+=Member*)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Method
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (name=ID arguments=Arguments result=Result)
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.MEMBER__NAME));
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.METHOD__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.METHOD__ARGUMENTS));
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.METHOD__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.METHOD__RESULT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMethodAccess().getArgumentsArgumentsParserRuleCall_2_0(), semanticObject.getArguments());
		feeder.accept(grammarAccess.getMethodAccess().getResultResultParserRuleCall_4_0(), semanticObject.getResult());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeAliasDefinition returns Object
	 *     Object returns Object
	 *     ElementType returns Object
	 *
	 * Constraint:
	 *     (fields+=Field? fields+=Field*)
	 */
	protected void sequence_Object(ISerializationContext context, de.dentrassi.varlink.idl.varlinkIdl.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementType returns Optional
	 *     Optional returns Optional
	 *
	 * Constraint:
	 *     type=ElementType
	 */
	protected void sequence_Optional(ISerializationContext context, Optional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.OPTIONAL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.OPTIONAL__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOptionalAccess().getTypeElementTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Result returns Result
	 *
	 * Constraint:
	 *     result=Object
	 */
	protected void sequence_Result(ISerializationContext context, Result semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.RESULT__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.RESULT__RESULT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResultAccess().getResultObjectParserRuleCall_0(), semanticObject.getResult());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Member returns TypeAlias
	 *     TypeAlias returns TypeAlias
	 *
	 * Constraint:
	 *     (name=ValidID definition=TypeAliasDefinition)
	 */
	protected void sequence_TypeAlias(ISerializationContext context, TypeAlias semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.MEMBER__NAME));
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.TYPE_ALIAS__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.TYPE_ALIAS__DEFINITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAliasAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeAliasAccess().getDefinitionTypeAliasDefinitionParserRuleCall_2_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementType returns TypeReference
	 *     TypeReference returns TypeReference
	 *
	 * Constraint:
	 *     name=[TypeAlias|ID]
	 */
	protected void sequence_TypeReference(ISerializationContext context, TypeReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VarlinkIdlPackage.Literals.TYPE_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VarlinkIdlPackage.Literals.TYPE_REFERENCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeReferenceAccess().getNameTypeAliasIDTerminalRuleCall_0_1(), semanticObject.eGet(VarlinkIdlPackage.Literals.TYPE_REFERENCE__NAME, false));
		feeder.finish();
	}
	
	
}
