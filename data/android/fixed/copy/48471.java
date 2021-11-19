@java.lang.Override
public io.stallion.dataAccess.filtering.FilterChain<T> filterChain() {
    return new io.stallion.dataAccess.filtering.FilterChain<T>(io.stallion.dataAccess.LocalMemoryStash.getBucket(), this);
}