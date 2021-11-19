private void fireChangeEvent(java.lang.Object element) {
    final com.google.gwt.dom.client.NativeEvent changeEvent = com.google.gwt.dom.client.Document.get().createChangeEvent();
    org.jboss.errai.ui.shared.TemplateUtil.asElement(element).dispatchEvent(changeEvent);
}