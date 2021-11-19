protected void end() {
    Robot.driveTrain.visionStop();
    Robot.shooterSubsystem.stopShoot();
    Robot.pControls.retract();
    Robot.driveTrain.relay.set(Relay.Value.kOff);
    myTimer.reset();
}