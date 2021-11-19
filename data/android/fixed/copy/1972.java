private java.lang.String getPage(java.lang.String url) {
    java.lang.String domain = getDomain(url);
    if (domain == null) {
        url = "";
    }else {
        url = url.replace(domain, "");
    }
    return url;
}