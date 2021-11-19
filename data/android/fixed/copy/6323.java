@com.tuanpm.RCTMqtt.ReactMethod
public void disconnect(final int clientRef) {
    if ((clients.get(clientRef)) != null) {
        clients.get(clientRef).disconnect();
    }
}