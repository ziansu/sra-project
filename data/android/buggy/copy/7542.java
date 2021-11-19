public void stopResizing() {
    if (!(validSize(moveTool))) {
        moveTool.resetResize();
    }
    moveTool = null;
    repaint();
    updateBuffer();
}