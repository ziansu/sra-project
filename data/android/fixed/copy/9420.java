@org.junit.Test(expected = java.lang.Exception.class)
public void negativeServieObjectTest() throws java.lang.Exception {
    try {
        com.foodybuddy.service.OrderService orderService = new com.foodybuddy.service.impl.OrderServiceImpl(null);
    } catch (java.lang.Exception ex) {
        com.foodybuddy.service.OrderServiceTest.log.error(ex);
        throw ex;
    }
}