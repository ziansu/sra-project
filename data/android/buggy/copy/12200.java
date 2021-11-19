protected void initialize() {
    manipulatorTalon.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
    manipulatorTalon.changeControlMode(TalonControlMode.Position);
    Robot.gearManipulator.stopPID();
}