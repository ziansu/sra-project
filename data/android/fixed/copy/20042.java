public java.lang.String getUrl() {
    return resource.getUri().replace(parent.getUrl(), "");
}