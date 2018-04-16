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
package de.dentrassi.varlink.maven;

import java.io.IOException;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.dentrassi.varlink.idl.VarlinkIdlStandaloneSetup;
import de.dentrassi.varlink.idl.varlinkIdl.Interface;
import de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage;

public class Loader {

    public List<Interface> interfaces = new LinkedList<>();

    public List<Interface> getInterfaces() {
        return this.interfaces;
    }

    public List<Diagnostic> loadFrom(final Path path) throws IOException {

        new VarlinkIdlStandaloneSetup().createInjectorAndDoEMFRegistration();

        final ResourceSet resourceSet = new ResourceSetImpl();

        final URI uri = URI.createFileURI(path.toString());

        // initialize package
        VarlinkIdlPackage.eINSTANCE.eClass();

        final Resource r = resourceSet.createResource(uri);
        r.load(null);

        final EObject c = r.getContents().get(0);
        if (!(c instanceof Interface)) {
            throw new IllegalStateException(String.format("File '%s' does not contain a Varlink interface", path));
        }

        this.interfaces.add((Interface) c);

        return r.getErrors();
    }

}
