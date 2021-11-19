public void removeSelectionChangeListener(org.vaadin.aceeditor.AceEditor.SelectionChangeListener listener) {
    removeListener(org.vaadin.aceeditor.AceEditor.SelectionChangeEvent.EVENT_ID, org.vaadin.aceeditor.AceEditor.SelectionChangeEvent.class, listener);
    getState().listenToSelectionChanges = true;
}