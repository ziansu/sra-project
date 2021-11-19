public java.util.List<nl.cimsolutions.snel_transport.models.Product> getAllProducts() {
    java.lang.System.out.println("Before running my query.");
    return findAll("SELECT p FROM Product p ORDER BY p.id");
}