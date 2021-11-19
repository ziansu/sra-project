public java.lang.String getDescription() {
    Entitys.Product product = productService.findProductById(1);
    return product.getDescription();
}