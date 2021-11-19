@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/helloworld")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
public javax.ws.rs.core.Response helloWorld(@javax.ws.rs.QueryParam(value = "name")
java.lang.String name) {
    return javax.ws.rs.core.Response.ok(java.lang.String.format("Hello %s!", (name == null ? "no name" : name))).build();
}