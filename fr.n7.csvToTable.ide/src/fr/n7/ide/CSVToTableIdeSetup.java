/*
 * generated by Xtext 2.23.0
 */
package fr.n7.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.CSVToTableRuntimeModule;
import fr.n7.CSVToTableStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CSVToTableIdeSetup extends CSVToTableStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CSVToTableRuntimeModule(), new CSVToTableIdeModule()));
	}
	
}