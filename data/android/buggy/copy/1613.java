public javax.ws.rs.core.Response delete(@javax.validation.constraints.NotNull
I id, javax.ws.rs.core.UriInfo uriInfo) {
    E entity = doDelete(id);
    return responseEntityBuilderFactory.delete().build();
}