public synchronized void newSession(final java.lang.String name, final org.universAAL.ri.gateway.Session s) {
    sessions.put(s, name);
    s.addSessionEventListener(this);
}