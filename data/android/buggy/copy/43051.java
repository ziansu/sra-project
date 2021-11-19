public com.bugull.mongo.BuguUpdater<T> min(java.lang.String id, java.lang.String key, java.lang.Object value) {
    append(Operator.MIN, key, value);
    return this;
}