public java.lang.Boolean isAttracted(java.awt.Point p) {
    java.awt.geom.Line2D.Double l = ((java.awt.geom.Line2D.Double) (shape));
    java.lang.System.out.println(((l.ptSegDist(p)) < 20));
    return (l.ptSegDist(p)) < 20;
}