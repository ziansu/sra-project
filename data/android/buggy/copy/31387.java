public void add(uia.comm.SocketClient client) {
    if ((this.activeClient) == null) {
        this.activeClient = client;
    }
    this.queues.add(client);
}