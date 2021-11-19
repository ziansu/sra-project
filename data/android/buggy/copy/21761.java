@android.support.annotation.Nullable
public java.lang.Object getCache(java.lang.String name) {
    try {
        return com.xushuzhan.quiltnews.cache.CacheFileManger.readFromCache(name);
    } catch (java.io.IOException e) {
        android.util.Log.d(com.xushuzhan.quiltnews.cache.Cache.TAG, ("getCache: " + (e.getMessage())));
        return null;
    }
}