public com.bugull.mongo.BuguUpdater<T> popFirst(java.lang.String key) {
    append(Operator.POP, key, (-1));
    return this;
}