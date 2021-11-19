@javax.annotation.Nonnull
protected <T, R> com.hazelcast.jet.AbstractProcessor.FlatMapper<T, R> flatMapper(@javax.annotation.Nonnull
java.util.function.Function<? super T, ? extends com.hazelcast.jet.Traverser<? extends R>> mapper) {
    return flatMapper((-1), mapper);
}