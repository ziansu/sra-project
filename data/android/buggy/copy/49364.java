@java.lang.Override
public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    double delta = 0.05F * (e.getPreciseWheelRotation());
    scale += delta;
    java.lang.System.out.println(("Mouse rolled : " + (scale)));
    revalidate();
    repaint();
}