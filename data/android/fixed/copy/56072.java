@org.springframework.web.bind.annotation.RequestMapping(value = "/getAllEmployees", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@io.swagger.annotations.ApiOperation(value = "Getting All Products")
public java.util.List<com.newt.entity.Product> getAllProducts() {
    java.util.List<com.newt.entity.Product> productList = productService.getAllProducts();
    return productList;
}