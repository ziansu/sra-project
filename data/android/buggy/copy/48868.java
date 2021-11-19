public <T> T execute(final java.util.function.Supplier<T> function) {
    return execute(( T) -> function.get());
}