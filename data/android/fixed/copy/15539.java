private int getPositionFromTouch(float x) {
    return getPositionFromCoordinates(((getScrollX()) + x));
}