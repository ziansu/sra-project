private void createContent() {
    content = new com.google.gwt.user.client.ui.HTMLPanel("<!-- content -->");
    content.getElement().setId("content");
    content.getElement().setClassName("container");
    com.google.gwt.user.client.ui.RootPanel.get().add(content);
}