@java.lang.Override
public void addItem(com.flectosystems.extspark.model.Item item) {
    org.hibernate.classic.Session s = sessionFactory.openSession();
    s.beginTransaction();
    s.save(item);
    s.getTransaction().commit();
}