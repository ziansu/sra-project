public java.util.Collection<T> findAll() {
    javax.persistence.Query query = entityManager.createNativeQuery(("SELECT * FROM " + (entityClass.getSimpleName())));
    return query.getResultList();
}