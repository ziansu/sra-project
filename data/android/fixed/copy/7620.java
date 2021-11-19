public void newSession() {
    currentSession = new munk.Session(((currentSession.getSessionNumber()) + 1));
    sessions.add(currentSession);
}