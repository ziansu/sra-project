public void removeSessionStateListener(org.jsmpp.session.SessionStateListener l) {
    synchronized(sessionStateListeners) {
        sessionStateListeners.remove(l);
    }
}