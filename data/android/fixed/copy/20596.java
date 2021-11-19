@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testSendMessageForNull_responseKeyMethodOne() throws java.lang.IllegalArgumentException {
    classUnderTest.sendMessage(exchange, replyToAddress, null, responseMessage);
}