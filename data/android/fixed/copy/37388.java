@java.lang.Override
public T insert(T t) {
    em.persist(t);
    return t;
}