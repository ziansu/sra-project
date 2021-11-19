public void fireConnectionClosed() {
    javax.sql.ConnectionEvent event = new javax.sql.ConnectionEvent(this);
    java.util.concurrent.CopyOnWriteArrayList<javax.sql.ConnectionEventListener> copyListeners = new java.util.concurrent.CopyOnWriteArrayList<javax.sql.ConnectionEventListener>(connectionEventListeners);
    for (javax.sql.ConnectionEventListener listener : copyListeners) {
        listener.connectionClosed(event);
    }
}