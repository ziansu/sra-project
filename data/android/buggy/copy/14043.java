public boolean isInside(ua.nure.shopynskyi.Task2.Circle c) {
    return (getDistance(this.x, this.y, c.x, c.y)) <= ((this.r) - (c.r));
}