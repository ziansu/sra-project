public void setCacheEnabled(boolean enabled) {
    useCache = enabled;
    if (!enabled) {
        synchronized(cImgLock) {
            this.cImg = null;
        }
    }
}