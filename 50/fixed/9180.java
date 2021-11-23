public java.lang.String view(int productId) {
    currentProduct.setProduct(productService.getProductFromId(productId));
    return "catalogue_product";
}