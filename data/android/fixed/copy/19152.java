public void zoomOut() {
    scale -= 0.1;
    if ((scale) < 0.2) {
        scale = 0.2;
    }
    rescaleMap();
}