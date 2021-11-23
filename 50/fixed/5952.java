protected net.serenitybdd.core.pages.RenderedPageObjectView getRenderedView() {
    if ((renderedView) == null) {
        renderedView = new net.serenitybdd.core.pages.RenderedPageObjectView(driver, this, getWaitForTimeout(), true);
    }
    return renderedView;
}