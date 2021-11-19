public void renderMinimap() {
    this.repaint();
    MINIMAP_THREAD.interrupt();
}