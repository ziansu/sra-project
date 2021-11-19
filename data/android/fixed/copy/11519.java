private static final java.util.function.Supplier<java.lang.String> resolve(final java.util.function.Supplier<? extends java.lang.CharSequence> supplier) {
    return supplier == null ? null : () -> supplier.get().toString();
}