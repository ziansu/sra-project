@java.lang.Override
public void teleopInit() {
    leds.activateTeleop();
    arm.calibrate(true);
    shooter.stop();
    arm.pickupAllStop();
    driveAuto.setPIDstate(false);
    drive.setPIDstate(true);
}