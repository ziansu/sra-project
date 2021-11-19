@java.lang.Override
public T getByUniqueProperty(final java.lang.String propertyName, final java.lang.Object value) {
    org.hibernate.Criteria criteria = createCriteria();
    criteria.add(org.hibernate.criterion.Restrictions.eq(propertyName, value));
    return uniqueResult(criteria);
}