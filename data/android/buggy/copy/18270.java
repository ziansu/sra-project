public void closeAll(final java.lang.String message) {
    synchronized(servers) {
        for (com.dmdirc.Server server : servers) {
            server.disconnect(message);
            server.close();
        }
    }
}