public static <T> T getScalar(org.reactivestreams.Publisher<? extends T> source) {
    java.util.Objects.requireNonNull(source);
    com.github.akarnokd.rs.ScalarSubscriber<T> s = new com.github.akarnokd.rs.ScalarSubscriber();
    source.subscribe(s);
    return s.get();
}