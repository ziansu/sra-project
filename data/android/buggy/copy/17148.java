@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testSendMessageForNull_replyToAddressMethodOne() throws java.lang.IllegalArgumentException {
    org.mockito.Mockito.doNothing().when(messageProducer).convertAndSend(null, responseKey, responseMessage);
    classUnderTest.sendMessage(exchange, null, responseKey, responseMessage);
}