@java.lang.Override
public T update(T t) {
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.merge(t);
    tx.commit();
    return findByExample(t).get(0);
}