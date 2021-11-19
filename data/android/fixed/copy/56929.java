private java.lang.String getNewURLs() {
    if (useExternalFile) {
        return getNewURLsFromConfig();
    }
    return getNewPropertyURLs();
}