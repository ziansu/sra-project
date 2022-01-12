public protocol.Servlet getServletAtLocation(java.lang.String location) {
    if (locationMapping.containsKey(location)) {
        return locationMapping.get(location);
    }
    return new server.DefaultServlet(parent);
}