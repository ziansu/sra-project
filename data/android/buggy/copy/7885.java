public void setUseReadOnlyDataCache(boolean useReadOnlyDataCache) {
    if (readOnlyDataCacheAvailable) {
        this.useReadOnlyDataCache = useReadOnlyDataCache;
    }else {
        exc.openacc.ACC.warning("Read-only data cache is unavailable");
    }
}