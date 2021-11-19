@java.lang.Override
public void sessionInitialized() {
    try {
        mySocket = mySocket.connect();
    } catch (com.neovisionaries.ws.client.WebSocketException e) {
        e.printStackTrace();
    }
}