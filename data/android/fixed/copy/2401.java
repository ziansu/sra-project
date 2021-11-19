public void disconnect() {
    if ((socket) != null) {
        try {
            socket.close();
        } finally {
            this.state = org.jyre.ZrePeer.State.DISCONNECTED;
            this.socket = null;
            this.endpoint = null;
        }
    }
}