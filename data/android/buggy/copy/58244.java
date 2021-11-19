public void saveOrUpdate(org.my.adventure.dao_manager.api.entities.Common object) {
    org.hibernate.Session session = sessionFactory.openSession();
    session.saveOrUpdate(object);
    session.flush();
    session.close();
}