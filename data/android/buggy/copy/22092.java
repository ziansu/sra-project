public boolean isInside(double x, double y) {
    return (getDistance(this.x, this.y, x, y)) <= (this.r);
}