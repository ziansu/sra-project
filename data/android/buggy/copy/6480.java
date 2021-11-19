public void insert(edu.princeton.cs.algs4.Point2D p) {
    KdTree.checkNull(p);
    root = put(root, root, p, true);
}