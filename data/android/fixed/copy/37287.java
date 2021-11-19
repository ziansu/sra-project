public boolean mouseMoved(gui.lwjgl.components.GUI gui, int x, int y, int dX, int dY) {
    if (isInComponent(x, y)) {
        highlight = true;
        return false;
    }
    highlight = false;
    return false;
}