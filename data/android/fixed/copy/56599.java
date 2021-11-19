@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testSendMessageForNull_responseKeyMethodTwo() throws java.lang.IllegalArgumentException {
    classUnderTest.sendMessage(exchange, replyToAddress, null, responseMessage, placeHolder);
}