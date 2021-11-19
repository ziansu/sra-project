public boolean exists(java.util.function.Predicate<? super T> filter) {
    return getList().stream().anyMatch(filter);
}