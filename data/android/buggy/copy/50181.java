@org.junit.Test
public void testSendToAllClients() {
    java.lang.String text = "";
    java.lang.String from = "";
    server.Server instance = new server.Server();
    instance.sendToAllClients(text, from);
    fail("The test case is a prototype.");
}