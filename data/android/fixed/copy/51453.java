@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConvertAndSendWithRequestMessageNull() {
    this.classUnderTest.convertAndSend(requestExchangeName, routingKey, null);
}