public T getOrCompute(java.util.function.Supplier<T> supplier) {
    final T result = value;
    return result == null ? maybeCompute(supplier) : result;
}