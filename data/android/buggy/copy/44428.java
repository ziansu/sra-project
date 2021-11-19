@java.lang.Override
void closeEhcache(final java.lang.String alias, final org.ehcache.Ehcache<?, ?> ehcache, final java.util.Deque<org.ehcache.Releasable> releasables) {
    super.closeEhcache(alias, ehcache, releasables);
    caches.remove(ehcache);
}