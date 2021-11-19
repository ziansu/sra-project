public void disabledPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    org.usfirst.frc4089.FRC2016Robot.Util.VisionProcessing.Process();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto Options", org.usfirst.frc4089.FRC2016Robot.Robot.srSend);
}