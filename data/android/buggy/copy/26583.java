protected long _count(org.hibernate.Criteria criteria) {
    criteria.setProjection(org.hibernate.criterion.Projections.rowCount());
    return ((java.lang.Long) (criteria.uniqueResult()));
}