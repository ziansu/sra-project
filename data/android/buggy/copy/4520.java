@org.junit.Test
public void customerLocationLog2() throws asgn2Exceptions.CustomerException, asgn2Exceptions.LogHandlerException, asgn2Exceptions.PizzaException {
    cusRes.processLog("C:\\Users\\You\\Documents\\PizzaParty\\asgn2\\logs\\20170102.txt");
    double loc = 0;
    assertEquals(cusRes.getCustomerByIndex(3).getDeliveryDistance(), loc);
}