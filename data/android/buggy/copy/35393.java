@org.junit.Test
public void testSendMessage() throws java.io.IOException, java.net.URISyntaxException {
    org.apache.http.HttpResponse response = com.teamdev.RequestMethods.sendMessage(validToken, "testMessage", registeredUserId.id, registeredChatId.id);
    assertEquals("response status must be 200", 200, response.getStatusLine().getStatusCode());
}