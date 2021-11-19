@com.google.gwt.uibinder.client.UiHandler(value = "cancelButton")
void cancel(final com.google.gwt.event.dom.client.ClickEvent event) {
    hide();
    editor.close();
}