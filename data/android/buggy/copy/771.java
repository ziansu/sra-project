public void pivotRight(double Time, double Power) {
    leftDriveMotor.setPower(Power);
    rightDriveMotor.setPower((-Power));
    sleep(Time);
}