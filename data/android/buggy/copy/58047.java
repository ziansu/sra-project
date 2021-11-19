protected void initialize() {
    Robot.driveSubsystem.releaseBrake();
    Robot.driveSubsystem.resetEncoders();
    java.lang.System.out.println(distance);
}