public com.noname.server.cache.CredentialCache retrieve(java.lang.Long key) {
    final java.lang.Object value = cache.get(key);
    return value != null ? ((com.noname.server.cache.CredentialCache) (value)) : null;
}