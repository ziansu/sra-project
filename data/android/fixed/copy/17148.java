@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testSendMessageForNull_replyToAddressMethodOne() throws java.lang.IllegalArgumentException {
    classUnderTest.sendMessage(exchange, null, responseKey, responseMessage);
}