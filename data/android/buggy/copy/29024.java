@java.lang.Override
public boolean isConnected() {
    synchronized(mySocketObject) {
        return ((myConnected) && ((mySocket) != null)) && (!(mySocket.isClosed()));
    }
}