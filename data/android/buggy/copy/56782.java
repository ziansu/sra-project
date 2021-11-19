public java.util.List<T> getAll(java.lang.Class<T> clazz) {
    org.mongodb.morphia.query.Query<T> truc = ds.createQuery(clazz);
    return truc.asList();
}