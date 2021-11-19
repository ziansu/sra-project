public void propertyChange(java.beans.PropertyChangeEvent event) {
    if (this.updating) {
        return ;
    }
    this.updating = true;
    if (org.eclipse.virgo.ide.runtime.core.IServer.PROPERTY_ARTEFACT_ORDER.equals(event.getPropertyName())) {
        initialize();
    }
    this.updating = false;
}