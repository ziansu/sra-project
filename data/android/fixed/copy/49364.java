@java.lang.Override
public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    double delta = 0.05F * (e.getPreciseWheelRotation());
    scale += delta;
    revalidate();
    repaint();
}