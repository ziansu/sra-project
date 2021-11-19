private java.lang.Thread startHeartbeatThread() {
    java.lang.Thread heartbeat = new java.lang.Thread(new server.MulticastHeartbeatSender(this));
    heartbeat.start();
    consoleMessage("started heartbeat thread", 2);
    return heartbeat;
}