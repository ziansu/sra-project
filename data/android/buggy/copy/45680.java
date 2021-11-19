@java.lang.Override
protected void onHide() {
    this.renderer.beginCache(this.cacheId);
    this.renderer.endCache();
}