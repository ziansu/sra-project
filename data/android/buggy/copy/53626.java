public double calcMaxSpeed(double s) {
    return (org.usfirst.frc4904.robot.RobotMap.maxVel) / (1 + (((plantWidth) * (splineGenerator.calcCurvature(s))) / 2));
}