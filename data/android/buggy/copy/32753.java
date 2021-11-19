public void insert(Point2D p) {
    if (p == null)
        throw new java.lang.IllegalArgumentException();
    
    root = put(root, p, false);
}