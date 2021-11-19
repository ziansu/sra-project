public java.lang.String get(java.lang.String url) {
    return httpGet(appendAccessToken(url));
}