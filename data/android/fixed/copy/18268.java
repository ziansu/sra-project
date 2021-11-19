@java.lang.Override
public void setCachedVanityUrls(java.lang.String hostId, java.util.Set<com.dotcms.vanityurl.model.CachedVanityUrl> cachedVanityUrlList) {
    cache.put(((getCachedVanityUrlGroup()) + hostId), cachedVanityUrlList, getCachedVanityUrlGroup());
}