public void connectToPeerViaMasterServer(java.util.UUID peerToConnect) {
    if ((masterServer) != null) {
        masterServer.addToSendQue(net.corpwar.lib.corpnet.util.SerializationUtils.getInstance().serialize(new net.corpwar.lib.corpnet.ConnectToPeer(peerToConnect)), NetworkSendType.PEER_DATA);
    }
}