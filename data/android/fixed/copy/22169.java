public void teleopInit() {
    if ((autonomousCommand) != null)
        autonomousCommand.cancel();
    
}