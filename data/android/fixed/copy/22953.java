public T findById(Id id) {
    T t = ((T) (getSessionFactory().getCurrentSession().get(getEntityClass(), id)));
    if (t != null)
        initialize(t);
    
    return t;
}