@java.lang.Override
public void activate(final org.jboss.errai.bus.server.api.MessageQueue queue) {
    synchronized(queue.getActivationLock()) {
        queue.setActivationCallback(null);
        cont.resume();
    }
}