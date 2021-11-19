private void error(com.redmintie.game.util.net.Client client, byte code) {
    client.getOutputBuffer().put(code);
    try {
        client.send(1);
    } catch (java.io.IOException ex) {
    }
    clientDisconnected(client);
}