@java.lang.Override
public void deleteAll() {
    java.lang.String queryString = "DELETE p FROM Passenger p";
    javax.persistence.TypedQuery<java.lang.String> query = entityManager.createQuery(queryString, java.lang.String.class);
    return query.getResultList();
}