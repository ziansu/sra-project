public io.swagger.inflector.models.ResponseContext formTest(io.swagger.inflector.models.RequestContext request, java.lang.String user) {
    java.lang.System.out.println(("found it! " + user));
    return new io.swagger.inflector.models.ResponseContext().status(Status.OK).contentType(MediaType.APPLICATION_JSON_TYPE).entity(user);
}