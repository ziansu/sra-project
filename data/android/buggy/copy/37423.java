@java.lang.Override
public java.util.Set<com.github.rinde.rinsim.geom.Connection<E>> getConnections() {
    return com.google.common.collect.ImmutableSet.copyOf(data.values());
}