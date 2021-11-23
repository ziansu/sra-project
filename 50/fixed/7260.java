private double travelledHorizontalDistance(double dt) {
    return ((this.getHorizontalVelocity()) * dt) + (((this.getHorizontalAcceleration()) * (java.lang.Math.pow(dt, 2))) / 2);
}