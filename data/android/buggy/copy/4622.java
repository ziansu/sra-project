@java.lang.Override
public void onConnectionEnd() {
    timer.cancel();
    timer.purge();
    client.stop();
    lmo.tcp.bridge.client.BridgeClientForm.logger.info("server connection ended, starting again");
    client.connect();
}