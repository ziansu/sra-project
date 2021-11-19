@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = false)
public com.catalina.tokobat.entity.Apotek update(com.catalina.tokobat.entity.Apotek apotek) {
    em = org.springframework.orm.jpa.EntityManagerFactoryUtils.getTransactionalEntityManager(getJpaTemplate().getEntityManagerFactory());
    apotek = em.merge(apotek);
    em.flush();
    em.close();
    return apotek;
}