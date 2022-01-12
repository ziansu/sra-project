public void insert(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException();
    
    if (!(set.contains(p)))
        set.add(p);
    
}