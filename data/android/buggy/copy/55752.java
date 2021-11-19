@org.junit.Test(expected = java.lang.NullPointerException.class)
public void setNameExceptionTest() {
    es.supermarket.comparator.api.Product product = productFactory.createProduct("product_one");
    product.setName(null);
}