public javax.ws.rs.core.Response delete(@javax.validation.constraints.NotNull
I id, javax.ws.rs.core.UriInfo uriInfo) {
    doDelete(id);
    return responseEntityBuilderFactory.delete().build();
}