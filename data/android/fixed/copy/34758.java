@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testSendMessageForNull_replyToAddressMethodTwo() throws java.lang.IllegalArgumentException {
    classUnderTest.sendMessage(exchange, null, responseKey, responseMessage, placeHolder);
}