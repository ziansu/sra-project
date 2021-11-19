public void zoomOut() {
    if ((mScale) > 0.25F) {
        mScale -= 0.25F;
        run();
    }
}