public boolean containsItem(java.lang.String name, java.lang.String... categories) {
    return useCache ? cachedEntries.containsKey(generateCacheKey(name, categories)) : containsKey(name, categories);
}