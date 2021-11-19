public <T> boolean permitAccess(T relation, java.util.function.Predicate<T> predicate) {
    return (relation != null) && (predicate.test(relation));
}