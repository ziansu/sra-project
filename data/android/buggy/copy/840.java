protected boolean isFinished() {
    pid.doPID(org.usfirst.frc.team2212.robot.Robot.driveTrain.forwardGet());
    return pid.hasArrived();
}