/*
 * generated by Xtext 2.12.0
 */
package de.dentrassi.varlink.idl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class VarlinkIdlStandaloneSetup extends VarlinkIdlStandaloneSetupGenerated {

	def static void doSetup() {
		new VarlinkIdlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
