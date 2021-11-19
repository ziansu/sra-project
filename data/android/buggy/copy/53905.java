public org.xcolab.util.http.UriBuilder resource(java.lang.String resourceName, java.lang.Object id) {
    org.springframework.util.Assert.notNull(id, "id cannot be null");
    uriComponentsBuilder.path(((("/" + resourceName) + "/") + (id.toString())));
    return this;
}