@java.lang.Override
public void onClose(hu.berzsenyi.exchange.net.TCPServerClient client) {
    synchronized(this.clients) {
        this.clients.remove(client);
        if ((this.listener) != null)
            this.listener.onClientDisconnected(client);
        
    }
}