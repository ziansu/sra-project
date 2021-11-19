@java.lang.Override
public void addPropertyChangeListener(org.eclipse.jface.util.IPropertyChangeListener listener) {
    if (!(propertyChangeListeners.contains(listener))) {
        propertyChangeListeners.add(listener);
    }
}