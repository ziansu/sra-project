private void initialize() {
    this.treeItem = new com.google.gwt.user.client.ui.TreeItem(getReference(this.databaseIdentifier));
    initWidget(getReference(this.databaseIdentifier));
}