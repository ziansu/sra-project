private double getSquaredistances(KdTree.Node n, Point2D p) {
    double sqrdist;
    Point2D pt = n.getPoint();
    sqrdist = pt.distanceSquaredTo(p);
    return sqrdist;
}