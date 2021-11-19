@java.lang.Override
public T insert(T t) {
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(t);
    tx.commit();
    return findByExample(t).get(0);
}