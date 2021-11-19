protected boolean isBrowserXslEnabled() {
    return (((browserManufacturer) == (de.webfilesys.gui.RequestHandler.BROWSER_MSIE)) || ((browserManufacturer) == (de.webfilesys.gui.RequestHandler.BROWSER_MOZILLA))) && ((browserVersion) >= 6);
}