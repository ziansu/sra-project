@java.lang.Override
public T find(java.lang.Integer id) {
    return em.find(entityClass, id);
}