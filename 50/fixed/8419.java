@java.lang.Override
public synchronized void clientDidDisconnect(com.tc.net.ClientID client) {
    com.tc.util.Assert.assertTrue(this.connectedClients.contains(client));
    this.connectedClients.remove(client);
}