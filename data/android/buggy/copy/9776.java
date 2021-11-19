public void removeSocket(java.lang.String username) {
    synchronized(mappedSockets) {
        mappedSockets.remove(username);
    }
}