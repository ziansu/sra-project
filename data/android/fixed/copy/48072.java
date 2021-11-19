private boolean isActionMoveVertical(float xDiff, float yDiff) {
    return (java.lang.Math.atan2(yDiff, xDiff)) > ((java.lang.Math.PI) / 8);
}