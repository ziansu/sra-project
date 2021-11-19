static final synchronized void shutdownClient(long clientHandle) {
    net.spy.memcached.MemcachedClient client = org.exist.xquery.modules.memcached.MemcachedModule.clients.get(clientHandle);
    client.shutdown();
    org.exist.xquery.modules.memcached.MemcachedModule.clients.remove(java.lang.Long.valueOf(clientHandle));
}