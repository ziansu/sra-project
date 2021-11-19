public void runIntakeMotor() {
    if ((intakeOpticalSensor.get()) == true) {
        Robot.intake.intakeMotor.set(RobotConstants.intakeGrabSpeed);
    }else {
        Robot.intake.intakeMotor.set(0);
    }
}