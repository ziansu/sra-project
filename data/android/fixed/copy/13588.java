public int getUsageCount(java.lang.String id) {
    return store.getInt(key(id));
}