public java.lang.Boolean isAttracted(java.awt.Point p) {
    java.awt.geom.Line2D.Double l = ((java.awt.geom.Line2D.Double) (shape));
    return (l.ptSegDist(p)) < 20;
}