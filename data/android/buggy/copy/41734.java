public final com.zynap.domain.IDomainObject create(com.zynap.domain.IDomainObject domainObject) {
    getHibernateTemplate().save(domainObject);
    getHibernateTemplate().flush();
    return domainObject;
}