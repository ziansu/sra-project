private int ensureVertical(int y) {
    y = java.lang.Math.max(y, this.y);
    y = java.lang.Math.min(y, ((this.y) + (height)));
    return y;
}