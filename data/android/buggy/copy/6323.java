@com.tuanpm.RCTMqtt.ReactMethod
public void disconnect(final int clientRef) {
    clients.get(clientRef).disconnect();
}