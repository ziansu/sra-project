public java.lang.String view(int productId) {
    currentProduct.setProduct(productService.getProductFromId(3));
    return "catalogue_product";
}