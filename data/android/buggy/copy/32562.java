public void save(T obj) {
    javax.persistence.EntityTransaction tx = entitymanager.getTransaction();
    tx.begin();
    try {
        entitymanager.persist(obj);
    } finally {
        tx.commit();
    }
}