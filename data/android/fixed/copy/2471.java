@org.junit.Test(expected = com.mobilejazz.cacheio.exceptions.CacheErrorException.class)
public void shouldThrowACacheErrorException() throws java.lang.Exception {
    when(persistence.obtain(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY)).thenThrow(com.mobilejazz.cacheio.exceptions.CacheErrorException.class);
    com.mobilejazz.cacheio.manager.entity.CacheEntry<java.lang.Object> cacheEntry = cache.obtain(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY);
}