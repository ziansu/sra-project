public void broadcast(java.io.Serializable message, org.atmosphere.gwt.server.GwtAtmosphereResource resource) {
    if (message == null) {
        return ;
    }
    resource.getBroadcaster().broadcast(message);
}