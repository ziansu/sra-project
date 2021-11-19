public void setCacheEnabled(boolean enabled) {
    useCache = enabled;
    if (!enabled) {
        synchronized(cImgLock) {
            this.cImg = null;
        }
    }
    java.lang.System.out.println(("FilterTree.CacheableNode.setCacheEnabled " + enabled));
}