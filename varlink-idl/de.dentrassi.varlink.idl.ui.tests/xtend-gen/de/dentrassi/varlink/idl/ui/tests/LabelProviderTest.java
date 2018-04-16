/**
 * Copyright (c) 2018 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jens Reimann - initial API and implementation
 */
package de.dentrassi.varlink.idl.ui.tests;

import com.google.inject.Inject;
import de.dentrassi.varlink.idl.ui.tests.VarlinkIdlUiInjectorProvider;
import de.dentrassi.varlink.idl.varlinkIdl.Array;
import de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(VarlinkIdlUiInjectorProvider.class)
@SuppressWarnings("all")
public class LabelProviderTest {
  @Inject
  private ILabelProvider labelProvider;
  
  @Test
  public void testLabel1() {
    Array array = VarlinkIdlFactory.eINSTANCE.createArray();
    Assert.assertEquals("Array", this.labelProvider.getText(array));
  }
}
