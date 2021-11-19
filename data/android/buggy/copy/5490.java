private org.hibernate.Session getSession() {
    if ((session) == null) {
        session = sessionFactory.openSession();
    }else {
        session = sessionFactory.getCurrentSession();
    }
    return session;
}