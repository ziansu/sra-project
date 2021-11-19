public void run() {
    discoverPeers();
    handler.postDelayed(nearbyPeersChecker, PEER_DISCOVERY_INTERVAL);
}