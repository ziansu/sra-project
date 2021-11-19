@java.lang.Override
public com.dotcms.vanityurl.model.CachedVanityUrl add(final java.lang.String key, final com.dotcms.vanityurl.model.VanityUrl vanityUrl) {
    com.dotcms.vanityurl.model.CachedVanityUrl cachedVanityUrl = new com.dotcms.vanityurl.model.CachedVanityUrl(vanityUrl);
    com.dotcms.cache.VanityUrlCacheImpl.cache.put(((getPrimaryGroup()) + key), cachedVanityUrl, getPrimaryGroup());
    return cachedVanityUrl;
}