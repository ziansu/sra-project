public com.bugull.mongo.BuguUpdater<T> popLast(java.lang.String id, java.lang.String key) {
    append(Operator.POP, key, 1);
    return this;
}