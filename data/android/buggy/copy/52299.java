private boolean controlling(android.graphics.Point p1, android.graphics.Point p2) {
    if ((threatening(p1, p2)) && (!(isFrozen(p1))))
        return true;
    
    return false;
}