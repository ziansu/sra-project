public double calcCurve() {
    double angle = gyro.getAngle();
    double curve = angle * (kP);
    java.lang.System.out.println(((("angle: " + angle) + " curve: ") + curve));
    return curve;
}