public boolean peerDiscovery() {
    return java.lang.Boolean.parseBoolean(prop.getProperty("peer.discovery", "true"));
}