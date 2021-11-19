private int ensureVertical(int y) {
    y = java.lang.Math.max(y, y);
    y = java.lang.Math.min(y, (y + (height)));
    return y;
}