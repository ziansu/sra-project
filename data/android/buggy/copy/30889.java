private void init(int port) throws java.io.IOException {
    net.ilexiconn.pixle.network.PixleNetworkManager.init(server);
    server = new com.esotericsoftware.kryonet.Server();
    server.bind(port);
    server.addListener(this);
    level = new net.ilexiconn.pixle.level.ServerLevel();
}