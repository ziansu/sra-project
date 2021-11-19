public static org.hibernate.SessionFactory getSessionFactory() {
    if ((com.exercise6.util.HibernateUtil.sessionFactory) == null) {
        com.exercise6.util.HibernateUtil.sessionFactory = com.exercise6.util.HibernateUtil.buildSessionFactory();
    }
    return com.exercise6.util.HibernateUtil.sessionFactory;
}