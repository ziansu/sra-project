public void autonomousPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    org.usfirst.frc4089.FRC2016Robot.Util.VisionProcessing.Process();
}