@java.lang.Override
public java.util.List<org.zenframework.z8.server.ie.TransportRoute> getRoutes(final java.lang.String domain) {
    return java.util.Arrays.<org.zenframework.z8.server.ie.TransportRoute>asList(new org.zenframework.z8.server.ie.TransportRoute(guid.create(), domain, org.zenframework.z8.server.ie.RmiTransport.PROTOCOL, store.get(domain), 0, true));
}