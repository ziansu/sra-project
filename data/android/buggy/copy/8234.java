public void disabled_testConcurrentLoading() throws java.lang.InterruptedException {
    com.google.common.cache.CacheLoadingTest.testConcurrentLoading(com.github.benmanes.caffeine.cache.Caffeine.newBuilder());
}