public com.jtorrent.storage.Piece getDownloadingPiece(com.jtorrent.peer.Peer peer) {
    synchronized(peer) {
        com.jtorrent.storage.PieceRepository.RequestedPiece rp = _requestedPiecesMap.get(peer.getHexPeerID());
        if (rp == null) {
            return null;
        }
        return rp.getPiece();
    }
}