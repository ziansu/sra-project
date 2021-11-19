@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.List<java.lang.String> doGet() {
    return java.util.Arrays.asList("iPad", "iPod", "iPhone");
}