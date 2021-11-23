public boolean persist(DataAccess.Entity.User user) {
    javax.persistence.EntityManager em = emf1.createEntityManager();
    em.persist(user);
    return true;
}