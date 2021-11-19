@java.lang.Override
public java.util.List<T> doInTransaction(org.hibernate.Session session) {
    session.createCriteria(persistentClass);
    return list(attachSession(session));
}