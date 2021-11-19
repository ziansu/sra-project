org.apache.ignite.internal.processors.cache.GridCacheEntryEx entryEx() {
    org.apache.ignite.internal.processors.cache.IgniteCacheOffheapManagerImpl.DataRow dr = new org.apache.ignite.internal.processors.cache.IgniteCacheOffheapManagerImpl.DataRow(0, link);
    dr.initData();
    return cctx.cache().entryEx(dr.key());
}