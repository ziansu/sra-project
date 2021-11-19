public void connectToSeednode(freenet.node.SeedServerTestPeerNode node) throws freenet.io.comm.PeerParseException, freenet.io.comm.ReferenceSignatureVerificationException, freenet.node.FSParseException, freenet.node.OpennetDisabledException {
    peers.addPeer(node, false, false);
}