public void update(T obj) {
    javax.persistence.EntityTransaction tx = entitymanager.getTransaction();
    tx.begin();
    try {
        entitymanager.merge(obj);
    } finally {
        tx.commit();
    }
}