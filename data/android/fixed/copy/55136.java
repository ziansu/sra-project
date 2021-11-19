@java.lang.Override
public synchronized boolean isCached(java.lang.String key, long position, long length) {
    com.google.android.exoplayer.upstream.cache.CachedContent cachedContent = index.get(key);
    return (cachedContent != null) && (cachedContent.isCached(position, length));
}