@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{param}")
public javax.ws.rs.core.Response getMsg(@javax.ws.rs.PathParam(value = "param")
java.lang.String msg) {
    java.lang.String output = "Jersey say : " + msg;
    return javax.ws.rs.core.Response.status(200).entity(output).build();
}