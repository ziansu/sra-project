public static void refreshCache() {
    com.runwaysdk.dataaccess.cache.ObjectCache.initialized = false;
    try {
        com.runwaysdk.dataaccess.cache.ObjectCache.globalCache.removeAll();
    } catch (java.lang.IllegalStateException e) {
    }
}