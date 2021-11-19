@Test
public void getClientId_clientInstantiateWithAnId() {
    Client testClient = new Client("Client1");
    myClient.save();
    assertTrue(((myClient.getClientId()) > 0));
}