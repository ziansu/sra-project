protected javax.ws.rs.core.Response build(javax.ws.rs.core.Response.Status status, java.lang.Object entity, java.lang.String path) {
    return javax.ws.rs.core.Response.status(status).header(de.hwrberlin.it2014.sweproject.rest.Resource.ALLOW_ORIGIN_HEADER, de.hwrberlin.it2014.sweproject.rest.Resource.WILDCARD).entity(createEntity(path, status, entity)).build();
}