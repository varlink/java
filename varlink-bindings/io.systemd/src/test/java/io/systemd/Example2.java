package io.systemd;

import static de.dentrassi.varlink.Varlink.varlink;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.List;

import org.eclipse.scada.utils.str.Tables;

import de.dentrassi.varlink.Varlink;
import io.systemd.Network;
import io.systemd.Network.Netdev;

public class Example2 {
    public static void main(final String[] args) throws Exception {

        try (final Varlink v = varlink()) {

            // shorter & sync way

            final List<Netdev> devices1 = v
                    .resolveSync(Network.class)
                    .sync()
                    .list();

            dump(devices1);

            // longer & async way

            final List<Netdev> devices2 = v
                    .resolver()
                    .async()
                    .resolve(Network.class)
                    .thenCompose(network -> network.async().list())
                    .get();

            dump(devices2);

        }

    }

    private static void dump(final List<Netdev> devices) {

        final List<List<String>> data = devices
                .stream()
                .map(device -> asList(Integer.toString(device.getIfindex()), device.getIfname()))
                .collect(toList());

        Tables.showTable(System.out, asList("Idx", "Name"), data, 2);
    }
}
