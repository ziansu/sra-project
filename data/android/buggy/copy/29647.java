public void runIntakeMotor() {
    if ((intakeOpticalSensor.get()) == false) {
        Robot.intake.intakeMotor.set(RobotConstants.intakeGrabSpeed);
    }else {
        Robot.intake.intakeMotor.set(0);
    }
}