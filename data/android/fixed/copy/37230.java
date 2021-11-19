@org.junit.Test
public void testAddMessageId() throws java.lang.Exception {
    int idMessage = it.bisignano.mychatserver.MyChatServer.addMessage(m1);
    org.junit.Assert.assertEquals(0, idMessage);
}