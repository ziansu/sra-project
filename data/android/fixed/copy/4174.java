public <T> java.util.Optional<T> get(java.lang.Class<T> cls, java.lang.Object id) {
    return getWhere(cls, "id", id);
}