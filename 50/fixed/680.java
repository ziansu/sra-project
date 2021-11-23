public void fullScreen(java.lang.String renderer) {
    if (insideSettings("fullScreen", renderer)) {
        this.fullScreen = true;
        this.renderer = renderer;
    }
}