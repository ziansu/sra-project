@com.assignment.controller.GetMapping(value = "/product")
public java.util.List<com.assignment.entity.Product> getProducts() {
    java.util.List<com.assignment.entity.Product> products = productService.getProducts();
    return products;
}