public freenet.keys.FreenetURI getURI() {
    try {
        return new freenet.keys.FreenetURI(mURI);
    } catch (java.net.MalformedURLException e) {
        throw new java.lang.RuntimeException("SHOULD NEVER HAPPEN", e);
    }
}