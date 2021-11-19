@javax.ws.rs.GET
@javax.ws.rs.Path(value = "{from}/{to}")
@javax.ws.rs.Produces(value = { "application/xml" , "application/json" })
public java.util.List<org.glassfish.movieplex7.entities.Movie> findRange(@javax.ws.rs.PathParam(value = "from")
java.lang.Integer from, @javax.ws.rs.PathParam(value = "to")
java.lang.Integer to) {
    return super.findRange(new int[]{ from - 1 , to });
}