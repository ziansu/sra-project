public static java.io.File resolveRelativeFilePath(java.net.URI baseURI, java.lang.String nonURIConformingFilePath) {
    return eu.asterics.mw.services.ResourceRegistry.resolveRelativeFilePath(baseURI, nonURIConformingFilePath, true);
}