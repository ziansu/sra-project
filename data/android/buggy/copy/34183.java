public double getAngle() {
    if ((this.hasGyro) == false) {
        return 339339;
    }
    return this.gyro.getAngle();
}