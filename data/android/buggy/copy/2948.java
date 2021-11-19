@com.assignment.controller.GET
@com.assignment.controller.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response getStudents() {
    java.util.List<com.assignment.entity.Product> products = productService.getProducts();
    return javax.ws.rs.core.Response.ok(products).build();
}