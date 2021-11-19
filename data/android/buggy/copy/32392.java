public void setComponent(com.yalin.style.render.StyleBlurRenderer renderer, com.yalin.style.render.RenderController.Callbacks callbacks) {
    this.mRenderer = renderer;
    this.mCallbacks = callbacks;
    reloadCurrentWallpaper();
}