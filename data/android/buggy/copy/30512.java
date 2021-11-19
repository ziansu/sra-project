@com.google.gwt.uibinder.client.UiHandler(value = "revisionsPanel")
public void onPanelScrolled(com.google.gwt.event.dom.client.ScrollEvent ignored) {
    if ((revisionsPanel.getVerticalScrollPosition()) == (revisionsPanel.getMaximumVerticalScrollPosition())) {
        revisionsPanel.getElement().focus();
        delegate.onScrolledToButton();
    }
}