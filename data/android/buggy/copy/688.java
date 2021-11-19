public void stopServer() {
    if ((server) != null) {
        server.stop();
        btnStopServer.setDisable(true);
        btnStartServer.setDisable(true);
        server = null;
        return ;
    }
}