public void setDrivePower(double power) {
    leftMotor.setPower((-power));
    rightMotor.setPower(power);
}