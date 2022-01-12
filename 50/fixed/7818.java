java.util.function.Supplier<java.lang.AssertionError> nullMappingError(java.lang.Enum<?> element) {
    return () -> {
        return new java.lang.AssertionError(java.lang.String.format("Null mapping for %s", element));
    };
}