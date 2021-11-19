@java.lang.Override
public java.util.List<org.zenframework.z8.server.ie.TransportRoute> getRoutes(java.lang.String domain) {
    return transportRoutes.readRoutes(domain, null, false);
}