private int getPositionFromTouch(float x) {
    return getPositionFromCoordinates(((int) ((getScrollX()) + x)));
}