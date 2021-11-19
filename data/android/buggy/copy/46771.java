public void autonomousPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    autonomousCommand = new org.usfirst.frc6408.XForward.Dance();
    autonomousCommand.cancel();
}