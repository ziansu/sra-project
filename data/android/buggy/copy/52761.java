public com.github.fluent.hibernate.HibernateRequest<T> pagination(com.github.fluent.hibernate.Pagination pagination) {
    pagination.addToCriteria(criteria);
    return this;
}