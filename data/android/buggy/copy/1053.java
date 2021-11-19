private int ensureVertical(int y) {
    y = java.lang.Math.max(y, (y + (height)));
    y = java.lang.Math.min(y, this.y);
    return y;
}