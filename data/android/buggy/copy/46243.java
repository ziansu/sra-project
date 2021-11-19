private void merge(java.io.File publicFile, java.io.File privateFile) throws java.io.IOException {
    config = load(privateFile);
    ca.twoducks.vor.ossindex.report.Configuration c1 = load(publicFile);
    config.merge(c1);
}