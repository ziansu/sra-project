private void onUnchoke(com.jtorrent.storage.PieceRepository repo) {
    com.jtorrent.peer.Peer._logger.debug("received UNCHOKE from peer {}", getHostAddress());
    _peerChoking = false;
    askForNewPiece(repo);
}