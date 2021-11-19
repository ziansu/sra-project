void resetRelicArm() throws java.lang.InterruptedException {
    relicArm.setPosition(0);
    telemetry.addData("Relic Arm", relicArm.getPosition());
    telemetry.update();
}