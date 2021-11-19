public void updateView(int dX, int dY) {
    this.viewport = createShiftedViewport(dX, dY);
    drawViewport();
}