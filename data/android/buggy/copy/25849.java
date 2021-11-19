@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String getString(java.lang.String json) throws java.lang.Exception {
    java.lang.System.out.println(json);
    com.google.gson.JsonObject obj = new com.google.gson.JsonParser().parse(json).getAsJsonObject();
    java.lang.System.out.println(obj);
    return obj.toString();
}