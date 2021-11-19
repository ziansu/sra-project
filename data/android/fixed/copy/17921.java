private java.net.URL createUrl(java.lang.String relativeUrl) throws java.net.MalformedURLException, java.net.URISyntaxException {
    return new java.net.URL(serverUrl, relativeUrl);
}