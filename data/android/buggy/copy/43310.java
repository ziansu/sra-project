public javax.ws.rs.core.Response toResponse(javax.ws.rs.BadRequestException exception) {
    return javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST).entity(javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).entity(exception.getMessage()).type(MediaType.TEXT_PLAIN).build()).build();
}