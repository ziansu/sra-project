private java.net.URL createUrl(java.lang.String relativeUrl, java.lang.String serverUrl) throws java.net.MalformedURLException, java.net.URISyntaxException {
    return new java.net.URI((serverUrl + relativeUrl)).toURL();
}