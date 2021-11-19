private java.lang.Thread startHeartbeatThread() {
    java.lang.Thread heartbeat = new java.lang.Thread(new server.MulticastHeartbeatSender(this));
    consoleMessage("started heartbeat thread", 2);
    return heartbeat;
}