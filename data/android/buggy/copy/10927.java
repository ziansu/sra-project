public void firePTPropertyChangeListeners(final org.mihalis.opal.propertyTable.PTProperty property) {
    for (final org.mihalis.opal.propertyTable.PTPropertyChangeListener listener : this.changeListeners) {
        listener.propertyHasChanged(property);
    }
}