protected void execute() {
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putBoolean("Is MechDrive executing?", true);
    Robot.driveTrain.controllerDrive(Robot.oi.driveStick);
}