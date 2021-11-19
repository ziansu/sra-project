public void addListener(final org.jboss.as.ejb3.deployment.DeploymentRepositoryListener listener) {
    synchronized(this) {
        listeners.add(listener);
    }
    listener.listenerAdded(this);
}