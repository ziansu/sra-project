public static void printMotors() {
    telemetry.addData("01:", ("Left Motor: " + (leftSpeed)));
    telemetry.addData("02:", ("Right Motor: " + (rightSpeed)));
}