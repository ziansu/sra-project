@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public void create(ua.org.oa.podkopayv.zmarket3.model.Product product) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.save(product);
}