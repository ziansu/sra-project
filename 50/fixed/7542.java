public void stopResizing() {
    if ((moveTool) != null) {
        if (!(validSize(moveTool))) {
            moveTool.resetResize();
        }
        moveTool = null;
        repaint();
        updateBuffer();
    }
}