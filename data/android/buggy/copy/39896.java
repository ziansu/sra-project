public double getRotationPosition() {
    return (leftDriveMotor.getCurrentPosition()) - (rightDriveMotor.getCurrentPosition());
}