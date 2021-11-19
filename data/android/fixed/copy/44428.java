@java.lang.Override
void closeEhcache(final java.lang.String alias, final org.ehcache.Ehcache<?, ?> ehcache) {
    super.closeEhcache(alias, ehcache);
    caches.remove(ehcache);
}