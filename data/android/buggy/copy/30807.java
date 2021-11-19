@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = false)
public com.catalina.tokobat.entity.User addNewUser(com.catalina.tokobat.entity.User user) {
    em = org.springframework.orm.jpa.EntityManagerFactoryUtils.getTransactionalEntityManager(getJpaTemplate().getEntityManagerFactory());
    em.merge(user);
    em.flush();
    em.close();
    return user;
}