public void drive(double forward, double rotation) {
    throttle = 0.0;
    DRIVE.tankDrive(((throttle) * forward), ((throttle) * rotation), false);
}