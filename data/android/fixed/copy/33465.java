@java.lang.Override
public void checkIfProductInStock(com.acme.ecommerce.domain.Product product, int quantity) throws java.lang.Exception {
    if ((product.getQuantity()) < quantity) {
        throw new com.acme.ecommerce.web.exceptions.QuantityExceedsStockException();
    }
}