@org.junit.Test
public void testGetPurchaseOrderStatus() {
    com.netbuilder.entities.PurchaseOrderTest.tester = new com.netbuilder.entities.PurchaseOrder(1, "Confirmed");
    assertEquals("Confirmed", com.netbuilder.entities.PurchaseOrderTest.tester.getPurchaseOrderStatus());
}