public synchronized com.jtorrent.storage.Piece getDownloadingPiece(com.jtorrent.peer.Peer peer) {
    com.jtorrent.storage.PieceRepository.RequestedPiece rp = _requestedPiecesMap.get(peer.getHexPeerID());
    if (rp == null) {
        return null;
    }
    return rp.getPiece();
}