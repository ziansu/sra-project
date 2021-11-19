public java.lang.String getUrl() {
    return resource.getUri().replaceAll(parent.getUrl(), "");
}