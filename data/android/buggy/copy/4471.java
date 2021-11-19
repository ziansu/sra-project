@java.lang.Override
public int route(java.lang.Object key) {
    return ((key.hashCode()) % ((numberOfRoutes) + 1)) - 1;
}