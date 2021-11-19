public org.hibernate.Session getSession() {
    if ((session) == null) {
        startNewSession();
    }
    return session;
}