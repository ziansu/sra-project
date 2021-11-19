public void closeServerSocket() {
    debugln("......Closing RxPServerSocket");
    if (!(this.socket.isClosed()))
        this.socket.close();
    
    debugln("........DatagramSocket on RxPServerSocket side is now closed");
    this.isEstablished = false;
}