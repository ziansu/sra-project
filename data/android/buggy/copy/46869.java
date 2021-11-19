protected java.lang.String b(com.mojang.authlib.GameProfile profile) {
    return org.torch.server.cache.TorchUserCache.authUUID() ? profile.getId().toString() : profile.getName().toLowerCase();
}