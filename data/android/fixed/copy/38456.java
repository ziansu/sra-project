public double calcCurve() {
    double angle = gyro.getAngle();
    double curve = angle * (kP);
    return curve;
}