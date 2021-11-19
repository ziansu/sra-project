public T findByUniqueColumnValue(java.lang.Object value, java.lang.String columnName) {
    org.hibernate.Criteria criteria = createEntityCriteria();
    criteria.add(org.hibernate.criterion.Restrictions.eq(columnName, value));
    return ((T) (criteria.uniqueResult()));
}