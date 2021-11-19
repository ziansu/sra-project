@java.lang.Override
public java.net.URL getUrl() {
    try {
        return new java.net.URL(getUrlString());
    } catch (java.net.MalformedURLException e) {
        return address.util.UrlUtil.generateValidBlankUrl();
    }
}