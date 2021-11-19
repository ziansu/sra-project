private boolean isInsideBounds(int x, int y) {
    return (((x >= 0) && (x < (fieldWidth))) && (y >= 0)) && (y < (fieldHeight));
}