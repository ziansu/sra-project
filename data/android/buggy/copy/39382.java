public void activate(org.jboss.errai.bus.server.api.MessageQueue queue) {
    queue.setActivationCallback(null);
    java.lang.System.out.println("activate jetty continuation");
    cont.resume();
}