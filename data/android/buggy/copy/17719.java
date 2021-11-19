private edu.princeton.cs.algs4.Point2D get(edu.princeton.cs.algs4.Point2D p) {
    boolean matchedPrevious = false;
    return get(root, p, 0, matchedPrevious);
}