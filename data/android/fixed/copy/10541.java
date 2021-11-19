Vector2D left() {
    double m = x;
    x = -(y);
    y = m;
    return this;
}