protected void initialize() {
    Robot.chassis.drive(leftPower, rightPower);
    Robot.chassis.getEncoderLeft().reset();
    Robot.chassis.getEncoderRight().reset();
}