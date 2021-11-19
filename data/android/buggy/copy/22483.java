private void outputTelemetry() {
    telemetry.addData("Conveyor motor power", DragonoidsGlobal.conveyor.getPower());
    telemetry.addData("Servo Position", DragonoidsGlobal.gate.getPosition());
}