@java.lang.Override
public void removePropertyChangeListener(org.eclipse.jface.util.IPropertyChangeListener listener) {
    if (propertyChangeListeners.contains(listener)) {
        propertyChangeListeners.remove(listener);
    }
}