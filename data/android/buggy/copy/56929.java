private java.lang.String getNewURLs() {
    if (this.useExternalFile) {
        return this.getNewURLsFromConfig();
    }
    return this.getNewPropertyURLs();
}