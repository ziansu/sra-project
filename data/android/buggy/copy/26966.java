protected java.lang.String c(com.mojang.authlib.GameProfile profile) {
    return org.torch.server.cache.TorchUserCache.authUUID() ? profile.getId().toString() : profile.getName().toLowerCase();
}