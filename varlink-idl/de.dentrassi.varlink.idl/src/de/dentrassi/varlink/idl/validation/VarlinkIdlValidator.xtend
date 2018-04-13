/*******************************************************************************
 * Copyright (c) 2017, 2018 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package de.dentrassi.varlink.idl.validation

import de.dentrassi.varlink.idl.varlinkIdl.Field
import org.eclipse.xtext.validation.Check
import de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage

class VarlinkIdlValidator extends AbstractVarlinkIdlValidator {

	public static final val FIELD_NOT_LOWER_CASE = "field.notLowerCase"

	@Check
	def checkFieldName(Field field) {
		if (field.name === null || field.name.empty) {
			return;
		}

		if (field.name.startsWith("_")) {
			error("Field names must not start with '_'", field, VarlinkIdlPackage.Literals.FIELD__NAME);
		}
		
		if (field.name.endsWith("_")) {
			error("Field names must not end with '_'", field, VarlinkIdlPackage.Literals.FIELD__NAME);
		}

		if (!Character.isLowerCase(field.name.charAt(0))) {
			error("Field names should start with lower case letter", field, VarlinkIdlPackage.Literals.FIELD__NAME,
				FIELD_NOT_LOWER_CASE);
		}

	}
}
