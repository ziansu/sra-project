private boolean freezing(android.graphics.Point p1, android.graphics.Point p2) {
    if ((threatening(p1, p2)) && (!(isSafe(p2))))
        return true;
    
    return false;
}