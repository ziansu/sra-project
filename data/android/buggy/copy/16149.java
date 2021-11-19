@org.junit.Test
public void testUpdatePurchaseOrder() {
    com.netbuilder.entities.PurchaseOrderTest.tester = new com.netbuilder.entities.PurchaseOrder(1, "Confirmed");
    com.netbuilder.entities.PurchaseOrderTest.tester.updatePurchaseOrder(5, "Unconfirmed");
    assertEquals("Unconfirmed", com.netbuilder.entities.PurchaseOrderTest.tester.getPurchaseOrderStatus());
    assertEquals(5, com.netbuilder.entities.PurchaseOrderTest.tester.getPurchaseOrderID());
}