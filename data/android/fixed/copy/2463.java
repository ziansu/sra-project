public boolean hit(java.awt.Rectangle rectangle, java.awt.Shape shape, boolean b) {
    if ((gc) != null)
        return gc.hit(rectangle, shape, b);
    else
        return false;
    
}