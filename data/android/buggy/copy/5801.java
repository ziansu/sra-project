protected void initialize() {
    org.usfirst.frc.team5427.robot.util.Log.init("initialized Shoot");
    shootSpeed = org.usfirst.frc.team5427.robot.util.Config.LAUNCH_SPEED;
    Robot.launcher.setShootSpeed(shootSpeed);
}