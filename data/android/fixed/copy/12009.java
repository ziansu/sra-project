public void delete(java.lang.Integer id) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    com.cloud.entities.User user = ((com.cloud.entities.User) (session.get(com.cloud.entities.User.class, id)));
    session.delete(user);
}