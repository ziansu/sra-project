private void init(int port) throws java.io.IOException {
    server = new com.esotericsoftware.kryonet.Server();
    server.bind(port);
    server.addListener(this);
    net.ilexiconn.pixle.network.PixleNetworkManager.init(server);
    level = new net.ilexiconn.pixle.level.ServerLevel();
}