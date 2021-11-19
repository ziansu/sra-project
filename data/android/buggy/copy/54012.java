@org.junit.Test
public void addTest() {
    Supplier savedSupplier = model.get(airCanada.getId());
    assertEquals(airCanada.getName(), savedSupplier.getName());
}