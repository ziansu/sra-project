@java.lang.Override
public boolean contains(int x, int y) {
    java.awt.geom.Ellipse2D.Double ellip = new java.awt.geom.Ellipse2D.Double(startx, starty, width, height);
    return ellip.intersects((x - 1), (y - 1), 1, 1);
}