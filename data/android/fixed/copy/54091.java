public com.conveyal.gtfs.GTFSFeed get(java.lang.String id) {
    try {
        return cache.get(id);
    } catch (java.util.concurrent.ExecutionException e) {
        com.conveyal.gtfs.GTFSCache.LOG.error("Error loading local MapDB.", e);
        deleteLocalDBFiles(id);
        return null;
    }
}