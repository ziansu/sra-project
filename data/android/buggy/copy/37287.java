public boolean mouseMoved(gui.lwjgl.components.GUI gui, int x, int y, int dX, int dY) {
    if (isInComponent(x, y)) {
        highlight = true;
        return true;
    }
    highlight = false;
    return false;
}