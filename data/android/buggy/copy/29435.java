public model.Product createProduct(java.lang.String name, java.lang.String code, java.lang.Float price, java.lang.String description, java.lang.Integer stockQuantity) {
    model.Product product = new model.Product(name, code, price, description, stockQuantity);
    em.persist(product);
    return product;
}