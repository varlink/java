package de.dentrassi.varlink.maven;

import java.io.IOException;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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

    public void loadFrom(final Path path) throws IOException {

        new VarlinkIdlStandaloneSetup().createInjectorAndDoEMFRegistration();

        final ResourceSet resourceSet = new ResourceSetImpl();

        final URI uri = URI.createURI(path.toUri().toString());

        // initialize package
        VarlinkIdlPackage.eINSTANCE.eClass();

        final Resource r = resourceSet.createResource(uri);
        r.load(null);

        final EObject c = r.getContents().get(0);
        if (!(c instanceof Interface)) {
            throw new IllegalStateException(String.format("File '%s' does not contain a Varlink interface", path));
        }

        this.interfaces.add((Interface) c);
    }

}
