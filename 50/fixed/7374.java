public void close() {
    if ((this.timer) != null)
        this.timer.cancel();
    
    if ((this.websocket) != null)
        this.websocket.close();
    
}