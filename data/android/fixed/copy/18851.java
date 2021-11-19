public void stopServer() {
    de.hartz.vpn.main.server.MetaServer.run = false;
    try {
        serverSocket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    de.hartz.vpn.main.server.MetaServer.instance = null;
    de.hartz.vpn.main.server.MetaServer.running = false;
}