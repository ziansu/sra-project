public void saveOldContent() {
    oldContent = org.vaadin.patrik.client.EditorWidgets.getValue(getCurrentEditorWidget());
    com.vaadin.client.VConsole.log(("data: " + (oldContent)));
}