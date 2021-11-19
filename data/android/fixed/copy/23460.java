public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("encoder value right", java.lang.Math.abs(RobotMap.encoderRight.get()));
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("encoder value left", java.lang.Math.abs(RobotMap.encoderLeft.get()));
}