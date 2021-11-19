public java.net.URL toUrl() {
    try {
        return toUri().toURL();
    } catch (java.net.MalformedURLException e) {
        throw new java.lang.IllegalArgumentException("Invalid url", e);
    }
}