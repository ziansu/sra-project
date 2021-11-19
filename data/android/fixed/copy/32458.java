void cancel() {
    controller = null;
    if (isScrollEvent) {
        isScrollEvent = false;
        imageMatrix = viewMatrix();
        invalidate();
    }
}