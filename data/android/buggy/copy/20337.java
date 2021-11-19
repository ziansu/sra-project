public void menuSelected(com.vaadin.ui.MenuBar.MenuItem selectedItem) {
    java.lang.Object value = documentsTree.getValue();
    handleUserMarkupCollectionExportRequest(value, false);
}