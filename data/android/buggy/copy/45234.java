@java.lang.Override
public T doInTransaction(org.hibernate.Session session) {
    return ((T) (session.save(entity)));
}