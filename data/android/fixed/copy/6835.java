protected void execute() {
    double output = Robot.instance.oi.getShooterElevatorInput();
    Robot.instance.elevator.elevatorActuator.set(output);
}