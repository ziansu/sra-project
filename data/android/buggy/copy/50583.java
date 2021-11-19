protected void initialize() {
    Robot.logger.log("Initialize", 1);
    Robot.driveTrain.resetEncoders();
    finished = false;
    timer.reset();
    Robot.shooterArm.setPosition(startPot);
}