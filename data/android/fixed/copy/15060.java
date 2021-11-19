private java.lang.Object getFromCache(gov.ca.cwds.rest.services.cms.CachingSystemCodeService.CacheKey cacheEntryKey) {
    java.lang.Object obj = null;
    try {
        obj = systemCodeCache.get(cacheEntryKey);
    } catch (java.lang.Exception e) {
        gov.ca.cwds.rest.services.cms.CachingSystemCodeService.LOGGER.warn(("getFromCache -> Unable to load object for key: " + cacheEntryKey), e);
    }
    return obj;
}