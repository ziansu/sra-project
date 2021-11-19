public void tankDriveMagicMotion(double left, double right) {
    final int FULL_SPEED_ROTATION_INCREMENT = 3000;
    driveParameters.rightWheelRotations = left / FULL_SPEED_ROTATION_INCREMENT;
    driveParameters.leftWheelRotations = right / FULL_SPEED_ROTATION_INCREMENT;
    rightFront.set(driveParameters.rightWheelRotations);
    leftFront.set(driveParameters.leftWheelRotations);
}