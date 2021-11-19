public void setSquares(int x, int y) {
    if ((x < 1) || (y < 0)) {
        throw new java.lang.IllegalArgumentException("There must be as least 1 row/column!");
    }
    xSqrs = x;
    ySqrs = y;
    refresh();
}