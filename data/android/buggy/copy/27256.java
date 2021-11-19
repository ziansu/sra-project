@com.itemis.maven.plugins.cdi.annotations.MojoProduces
private com.itemis.maven.plugins.cdi.logging.MavenLogWrapper createLogWrapper() {
    com.itemis.maven.plugins.cdi.logging.MavenLogWrapper log = new com.itemis.maven.plugins.cdi.logging.MavenLogWrapper(getLog());
    if (this.enableLogTimestamps) {
        log.enableLogTimestamps();
    }
    return log;
}