@java.lang.Override
public void finalize() throws java.lang.Throwable {
    if (org.apache.ofbiz.base.util.Debug.verboseOn()) {
        org.apache.ofbiz.base.util.Debug.logVerbose(new java.lang.Exception("UtilCache.CacheSoftRef.finalize()"), ("Finalize UtilCache SoftReference - " + (org.apache.ofbiz.base.util.cache.CacheSoftReference.get())), org.apache.ofbiz.base.util.cache.CacheSoftReference.module);
    }
    super.finalize();
}