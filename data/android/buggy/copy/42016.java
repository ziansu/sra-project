@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/add")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response addProduct(java.lang.String requestBody) {
    java.lang.String responseBody = orderController.addOrder(requestBody);
    return javax.ws.rs.core.Response.ok(responseBody, MediaType.APPLICATION_JSON).build();
}