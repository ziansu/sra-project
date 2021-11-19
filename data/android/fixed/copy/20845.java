@javax.ws.rs.Path(value = "/{searchString}")
@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response getProductsBySearch(@javax.ws.rs.PathParam(value = "searchString")
java.lang.String search) {
    java.lang.System.out.println(search);
    return javax.ws.rs.core.Response.ok(ctrl.getProductsBySearch(search)).build();
}