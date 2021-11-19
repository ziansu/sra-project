@java.lang.Override
public void teleopInit() {
    if (((auton) != null) && (auton.isRunning())) {
        auton.cancel();
    }
    drivetrainSubsystem.resetSensors();
}