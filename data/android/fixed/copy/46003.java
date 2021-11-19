public boolean contains(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException();
    
    return this.contain(this.root, p, true);
}