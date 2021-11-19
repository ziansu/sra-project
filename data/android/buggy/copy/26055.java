public void moveToMouse(java.awt.event.MouseEvent e) {
    if ((getGrid().isMouseInsideGrid(e)) == true) {
        int newX = getMousePosition(e);
        shiftToPosition(newX);
    }
}