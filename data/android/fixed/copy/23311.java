@Test
public void getClientId_clientInstantiateWithAnId() {
    Client myClient = new Client("Client1");
    myClient.save();
    assertTrue(((myClient.getClientId()) > 0));
}