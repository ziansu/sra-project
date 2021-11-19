protected void notifyDidReceiveInvitationFromPeer(com.nclab.ncmultipeerconnectivity.NCMCPeerID peerID) {
    if ((this.mDiscoveredPeripherals) != null) {
        this.mPeripheralService.notifyDidReceiveInvitationFromPeer(peerID);
    }
}