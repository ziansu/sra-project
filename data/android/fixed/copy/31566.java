public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D queryPoint) {
    if ((root) == null) {
        return null;
    }
    return nearest(root, queryPoint, 0, root.p);
}