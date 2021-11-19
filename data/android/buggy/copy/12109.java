protected void initialize() {
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Recovery Time", 0.0);
    timer.reset();
    jetsonPwr.disablePWM();
    jetsonPwr.set(false);
    jetsonTimer.reset();
    jetsonTimer.start();
}