@java.lang.Override
public void onScrollEnd(com.googlecode.mgwt.ui.client.widget.panel.scroll.ScrollEndEvent event) {
    int page = scrollPanel.getCurrentPageX();
    carouselIndicatorContainer.setSelectedIndex(page);
    currentPage = page;
    com.google.gwt.event.logical.shared.SelectionEvent.fire(this, currentPage);
}