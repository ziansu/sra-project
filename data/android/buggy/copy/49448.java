public int wrapY(int y) {
    y = y % (this.oceanHeight);
    if (y < 0) {
        y = y + (this.oceanHeight);
    }
    return x;
}