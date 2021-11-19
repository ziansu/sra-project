boolean validServer(CommonLibs.DataStructure.IPAddress ip) {
    try {
        java.net.Socket socket = new java.net.Socket();
        socket.connect(new java.net.InetSocketAddress(ip.hostname, ip.port), 12000);
        return true;
    } catch (java.io.IOException e) {
        return false;
    }
}