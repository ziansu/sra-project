public void put(org.eclipse.aether.RepositorySystemSession session, java.lang.Object key, java.lang.Object data) {
    if (data != null) {
        cache.put(key, data);
    }
}