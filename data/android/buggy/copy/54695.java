public T path(java.lang.String path) {
    this.path += encodePath(path);
    return com.cloudant.client.internal.URIBaseMethods.returnThis();
}