public boolean isDownloadingPiece(com.jtorrent.peer.Peer peer) {
    synchronized(peer) {
        return (_requestedPiecesMap.get(peer.getHexPeerID())) != null;
    }
}