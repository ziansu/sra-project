public final java.util.Set<java.lang.String> getDescendantsOf(java.net.URI parentURI) {
    java.lang.String parentId = getId(parentURI);
    return getDescendantsOf(parentId);
}