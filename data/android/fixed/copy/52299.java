private boolean controlling(android.graphics.Point p1, android.graphics.Point p2) {
    return (threatening(p1, p2)) && (!(isFrozen(p1)));
}