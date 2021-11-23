public T getById(java.lang.Long id) {
    return ((T) (getSession().get(getPersistentClass(), id)));
}