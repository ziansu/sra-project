public javax.ws.rs.core.Response toResponse(javax.ws.rs.NotFoundException exception) {
    return javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).entity(exception.getMessage()).type(MediaType.TEXT_PLAIN).build();
}