@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConvertAndSendWithRoutingKeyNull() {
    org.mockito.Mockito.doNothing().when(this.rabbitTemplate).convertAndSend(requestExchangeName, routingKey, this.requestMessage);
    this.classUnderTest.convertAndSend(requestExchangeName, null, this.requestMessage);
}