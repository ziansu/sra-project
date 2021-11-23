public boolean contains(edu.princeton.cs.algs4.Point2D p) {
    KdTree.checkNull(p);
    return contains(root, p);
}