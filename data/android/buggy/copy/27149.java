public models.User findByEmail(java.lang.String email) {
    java.lang.String sql = "select e from users e where e.email=:email";
    javax.persistence.TypedQuery<models.User> email1 = jpaApi.em().createQuery(sql, getEntityClass()).setParameter("email", email);
    return getSingleResultOrNull(email1);
}