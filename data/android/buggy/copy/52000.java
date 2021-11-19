static final net.spy.memcached.MemcachedClient retrieveClient(long clientHandle) {
    return org.exist.xquery.modules.memcached.MemcachedModule.clients.get(java.lang.Long.valueOf(clientHandle));
}