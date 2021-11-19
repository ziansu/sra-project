public Collection.Key[] keys(int access) {
    java.util.Set<railo.runtime.Key> set = keySet(access);
    return set.toArray(new railo.runtime.type.Collection.Key[set.size()]);
}