@org.junit.Test
public void testSetSupplier() {
    com.qa.tangerinedream.entities.Supplier supplier = new com.qa.tangerinedream.entities.Supplier(0, false);
    productsupplier.setSupplier(supplier);
    assertEquals(supplier, productsupplier.getSupplier());
}