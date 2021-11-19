public <T, T2> java.util.Optional<T> get(java.lang.Class<T> cls, T2 id) {
    return getWhere(cls, "id", id);
}