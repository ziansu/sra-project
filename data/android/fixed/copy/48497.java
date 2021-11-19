@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConvertAndSendWithRoutingKeyNull() {
    this.classUnderTest.convertAndSend(requestExchangeName, null, this.requestMessage);
}