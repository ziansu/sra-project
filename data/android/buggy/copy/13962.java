@java.lang.Override
public void create(ua.org.oa.podkopayv.zmarket3.model.Product product) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.save(product);
    session.getTransaction().commit();
}