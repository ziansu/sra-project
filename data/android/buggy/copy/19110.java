@java.lang.Override
public void run2() throws org.apache.geode.cache.CacheException {
    org.apache.geode.cache.Region region = getRootRegion().getSubregion(regionName);
    assertEquals(100, region.size());
}