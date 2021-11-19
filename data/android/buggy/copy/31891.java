public void execute(org.hibernate.Session session, org.hibernate.Transaction transaction) {
    session.update(entity);
    session.clear();
}