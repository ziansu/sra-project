protected void processPong(org.bitcoinj.core.Pong m) {
    for (org.bitcoinj.core.Peer.PendingPing ping : pendingPings) {
        if ((m.getNonce()) == (ping.nonce)) {
            pendingPings.remove(ping);
            ping.complete();
            return ;
        }
    }
}