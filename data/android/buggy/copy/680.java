public void fullScreen(java.lang.String renderer, int display) {
    if (insideSettings("fullScreen", renderer, display)) {
        fullScreen = true;
        this.renderer = renderer;
        this.display = display;
    }
}