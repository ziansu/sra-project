@org.junit.Test
public void testSetDeliveryAddress() {
    com.netbuilder.entities.CustomerOrderTest.test.setDeliveryAddress("adddess1244");
    assertEquals(com.netbuilder.entities.CustomerOrderTest.test.getDeliveryAddress(), "adddess1244");
}