private void drawH(float x1, float x2, float y) {
    state.configureGC(wrapper);
    wrapper.drawLine(x1, y, x2, y);
}