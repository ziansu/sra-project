@java.lang.Override
public void mouseEntered(java.awt.event.MouseEvent e) {
    if ((c) != null) {
        e.getComponent().setCursor(blankCursor);
    }
    edu.chl.Game.handler.MouseInput.onCanvas = true;
}