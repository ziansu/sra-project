private java.lang.String normalizeUrl(java.lang.String url, java.lang.String user) throws java.io.IOException {
    org.kitesdk.spring.hbase.example.model.WebPageRedirectModel redirectModel = getRedirect(url, user);
    if (redirectModel != null) {
        return redirectModel.getDestinationUrl();
    }else {
        return url;
    }
}