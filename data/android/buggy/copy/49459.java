@java.lang.Override
public void runOpMode() throws java.lang.InterruptedException {
    robot.initialize(hardwareMap);
    robot.servoJewel.setPosition(0.0);
    waitForStart();
    robot.colorSensor.red();
    robot.colorSensor.blue();
    selectJewel(robot, red);
}