public double getAngle() {
    if (((this.hasGyro) == false) || ((this.gyro) == null)) {
        return 339339;
    }
    return this.gyro.getAngle();
}