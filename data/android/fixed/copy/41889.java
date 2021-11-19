public void startThread() {
    close = true;
    client = new com.example.tapsi.geodoor.SocketClientHandler.ClientThread();
    t = new java.lang.Thread(client);
    t.start();
}