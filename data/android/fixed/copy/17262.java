public <T> java.util.Optional<T> getWhere(java.lang.Class<T> cls, java.lang.String column, java.lang.Object value) {
    return get(where(cls, column, value));
}