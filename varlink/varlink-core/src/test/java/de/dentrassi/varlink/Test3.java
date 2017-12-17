package de.dentrassi.varlink;

import static de.dentrassi.varlink.spi.CallRequest.of;
import static io.glutamate.util.Collections.map;
import static org.varlink.Resolver.ADDRESS;

import java.util.concurrent.CompletableFuture;

import de.dentrassi.varlink.internal.VarlinkImpl;
import de.dentrassi.varlink.spi.CallResponse;
import de.dentrassi.varlink.spi.Connection;

public class Test3 {
    public static void main(final String[] args) throws Exception {

        try (
                final VarlinkImpl v = new VarlinkImpl();
                final Connection connection = v.newConnection(ADDRESS);) {

            final CompletableFuture<CallResponse> r = connection
                    .call(of("org.varlink.service.GetInterfaceDescription",
                            map(map -> {
                                map.put("interface", "org.varlink.resolverX");
                            })));

            final CallResponse response = r.get();

            System.out.println(response);

        }

    }
}
