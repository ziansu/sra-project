@java.lang.Override
public synchronized void shutdown() {
    shutdownSocketAcceptor();
    closeServerSocket();
    stop();
    connectionListeners.clear();
}