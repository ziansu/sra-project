private void showTelemetry() throws java.lang.InterruptedException {
    while (opModeIsActive()) {
        telemetry();
        idle();
    } 
}