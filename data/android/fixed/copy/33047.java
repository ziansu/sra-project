@org.testng.annotations.Test
public void testGetRabbitMqProducer() {
    java.lang.System.out.println("getRabbitMqProducer");
    at.ac.tuwien.dsg.comot.messaging.util.Config config = null;
    at.ac.tuwien.dsg.comot.messaging.ComotMessagingService instance = null;
    at.ac.tuwien.dsg.comot.messaging.api.Producer expResult = null;
    at.ac.tuwien.dsg.comot.messaging.api.Producer result = instance.getRabbitMqProducer();
    assertEquals(result, expResult);
    fail("The test case is a prototype.");
}