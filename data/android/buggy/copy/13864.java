public com.github.fluent.hibernate.HibernateRequest<T> maxResults(int maxResults) {
    criteria.setMaxResults(maxResults);
    return this;
}