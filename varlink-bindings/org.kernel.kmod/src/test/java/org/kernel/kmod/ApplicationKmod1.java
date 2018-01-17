/*******************************************************************************
 * Copyright (c) 2017 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package org.kernel.kmod;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.scada.utils.str.Tables;
import org.kernel.kmod.Kmod.LoadedModule;

import de.dentrassi.varlink.Varlink;

public class ApplicationKmod1 {
    public static void main(final String[] args) throws Exception {

        try (Varlink v = Varlink.varlink()) {

            // get kernel modules

            final LoadedModule[] modules = v.resolveSync(Kmod.class).sync().list();

            // dump table

            final List<List<String>> data = new LinkedList<>();

            for (final LoadedModule m : modules) {
                final List<String> row = new LinkedList<>();
                data.add(row);

                row.add(m.getName());
                row.add("" + m.getSize());
                row.add("" + m.getUse_count());
                row.add(String.join(", ", m.getUsed_by()));
            }

            Tables.showTable(System.out, Arrays.asList("Name", "Size", "Count", "Used by"), data, 2);
        }

    }
}
