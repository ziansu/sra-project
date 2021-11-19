public synchronized void addPeer(com.networking.model.Peer peer) {
    peers.add(peer);
    peer.start();
}