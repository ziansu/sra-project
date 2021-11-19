public void addSessionStateListener(org.jsmpp.session.SessionStateListener l) {
    synchronized(sessionStateListeners) {
        sessionStateListeners.add(l);
    }
}