public Session.UserSession getSession(int sessionType) {
    org.leface.tomwyr.flashcards.session.Session.UserSession session = sessionMap.get(sessionType, null);
    return session != null ? new org.leface.tomwyr.flashcards.session.SessionTracker(session, this) : null;
}