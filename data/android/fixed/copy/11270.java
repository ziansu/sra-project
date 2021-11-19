@java.lang.Override
protected void afterTestsStopped() throws java.lang.Exception {
    stopAllGrids();
    org.apache.ignite.internal.processors.cache.GridCacheAbstractSelfTest.storeStgy = null;
}