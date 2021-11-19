protected void usePIDOutput(double output) {
    if (calibrate()) {
        moveArm(output);
    }else {
        moveArm(0);
    }
}