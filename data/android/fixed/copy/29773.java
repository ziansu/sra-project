public void multiCastMessage(Request req) {
    req.setReqType("New");
    for (int peerServerID : peerServerSocketMap.keySet()) {
        java.net.Socket s = peerServerSocketMap.get(peerServerID);
        sendMessage(peerServerID, req);
    }
}