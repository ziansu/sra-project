public static java.io.InputStream getResourceAsStream(java.net.URL url, boolean install, boolean overwrite) throws java.lang.Exception {
    return new java.io.FileInputStream(org.aksw.kbox.KBox.getResource(url, install, overwrite));
}