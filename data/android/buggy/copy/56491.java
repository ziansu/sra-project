public void turnArmLeft(int angle) {
    int turn = java.lang.Math.max(RobotMovement.SensorArm.MAXLEFT, ((motor.getTachoCount()) + angle));
    motor.rotateTo(turn);
}