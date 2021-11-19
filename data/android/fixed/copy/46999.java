public void calibrate() {
    if (((this.hasGyro) == false) || ((this.gyro) == null)) {
        return ;
    }
    this.gyro.calibrate();
}