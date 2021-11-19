@java.lang.Override
public T update(T t) {
    em.merge(t);
    return t;
}