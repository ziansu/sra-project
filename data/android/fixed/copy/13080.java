protected javax.ws.rs.core.Response build(javax.ws.rs.core.Response.Status status, java.lang.Object entity, java.lang.String path) {
    return javax.ws.rs.core.Response.status(status).entity(createEntity(path, status, entity)).build();
}