@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    if (e.isAltDown()) {
        renderer.setMouseX(e.getX());
        renderer.setMouseY(e.getY());
    }
}