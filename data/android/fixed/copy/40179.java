@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    if (panning) {
        panning = false;
        model.setActive(true);
    }
}