public void removePropertyChangeListener(java.lang.String propertyName, java.beans.PropertyChangeListener listener) {
    java.util.Vector listeners = ((java.util.Vector) (specificPropertyListeners.get(propertyName)));
    if (listeners != null) {
        listeners.remove(listener);
    }
}