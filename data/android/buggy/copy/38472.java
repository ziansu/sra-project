public synchronized void addListener(final org.jboss.as.ejb3.deployment.DeploymentRepositoryListener listener) {
    listener.listenerAdded(this);
    listeners.add(listener);
}