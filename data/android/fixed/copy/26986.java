public void init() {
    RIGHT = hardwareMap.dcMotor.get("motor1");
    LEFT = hardwareMap.dcMotor.get("motor2");
    LIFT_TILT = hardwareMap.dcMotor.get("motor3");
    LIFT = hardwareMap.dcMotor.get("motor4");
}