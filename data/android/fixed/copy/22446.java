@javax.annotation.Nullable
public com.mojang.authlib.GameProfile peekCachedProfile(java.lang.String username) {
    org.torch.server.cache.TorchUserCache.UserCacheEntry entry = caches.getIfPresent(username.toLowerCase(java.util.Locale.ROOT));
    return entry == null ? null : entry.profile;
}