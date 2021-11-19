@java.lang.Override
public net.spy.memcached.internal.CollectionFuture<java.lang.Long> asyncBopDecr(java.lang.String key, long subkey, int by, long initial, byte[] eFlag) {
    return this.getClient().asyncBopDecr(key, subkey, by, initial, eFlag);
}