public void end() {
    javax.persistence.EntityManager em = entityManager.get();
    if (null == em) {
        return ;
    }
    em.close();
    entityManager.remove();
}