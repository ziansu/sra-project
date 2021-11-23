public void setUseReadOnlyDataCache(boolean useReadOnlyDataCache) {
    if ((!(readOnlyDataCacheAvailable)) && useReadOnlyDataCache) {
        exc.openacc.ACC.warning("Read-only data cache is unavailable");
        return ;
    }
    this.useReadOnlyDataCache = useReadOnlyDataCache;
}