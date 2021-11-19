public double getGyro() {
    double finalAngle = 90 + ((gyro.getAngle()) - 360);
    finalAngle = finalAngle % 360;
    return finalAngle;
}