private void removePeer(java.lang.String id) {
    fr.pchab.webrtcclient.WebRtcClient.Peer peer = peers.get(id);
    mListener.onRemoveRemoteStream(peer.endPoint);
    peer.pc.close();
    peers.remove(peer.id);
    endPoints[peer.endPoint] = false;
}