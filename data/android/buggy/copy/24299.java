@java.lang.Override
protected void execute() {
    shooter.turnOffConveyor();
    shooter.setLoaderGatePosition();
    shooter.setLaoderWheelPositionUp();
    shooter.turnOffShooterWheel();
}