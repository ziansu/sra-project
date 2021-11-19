@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/json")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@org.apache.ambari.view.proxy.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public org.json.simple.JSONObject postJson(@javax.ws.rs.QueryParam(value = "url")
java.lang.String url, @javax.ws.rs.QueryParam(value = "type")
java.lang.String type, org.apache.ambari.view.proxy.MultivaluedMap<java.lang.String, java.lang.String> data) {
    return getJson(url, type, data);
}