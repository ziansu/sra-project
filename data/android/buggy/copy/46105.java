public void closeAll() {
    synchronized(servers) {
        for (com.dmdirc.Server server : servers) {
            server.disconnect();
            server.close();
        }
    }
}