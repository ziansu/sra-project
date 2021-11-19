public synchronized void suspend() {
    state = com.micabytes.gfx.BitmapSurfaceRenderer.CacheState.DISABLED;
}