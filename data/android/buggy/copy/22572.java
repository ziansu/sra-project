private void enableHighlightingIfRequired() {
    net.thucydides.core.pages.jquery.JQueryEnabledPage jQueryEnabledPage = net.thucydides.core.pages.jquery.JQueryEnabledPage.withDriver(driver);
    if ((jQueryEnabledPage.isJQueryIntegrationEnabled()) && (!(jQueryEnabledPage.isJQueryAvailable()))) {
        jQueryEnabledPage.injectJQueryPlugins();
    }
}