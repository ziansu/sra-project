private java.lang.String getPage(java.lang.String url) {
    java.lang.String domain = getDomain(url);
    return url.replace(domain, "");
}