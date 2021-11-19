@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testSendMessageForNull_placeHolderMethodTwo() throws java.lang.IllegalArgumentException {
    classUnderTest.sendMessage(exchange, replyToAddress, responseKey, responseMessage, null);
}