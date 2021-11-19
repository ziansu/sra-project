static final synchronized void shutdownClient(final long clientHandle) {
    final net.spy.memcached.MemcachedClient client = org.exist.xquery.modules.memcached.MemcachedModule.clients.remove(java.lang.Long.valueOf(clientHandle));
    client.shutdown();
}