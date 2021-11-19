@java.lang.Override
public void setCoordsA(java.awt.geom.Point2D p) {
    dispC = jmri.util.MathUtil.subtract(center, p);
    pointA = p;
}