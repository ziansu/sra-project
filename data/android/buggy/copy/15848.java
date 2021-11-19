public void moveFrontBeacon() throws java.lang.InterruptedException {
    telemetry.addData("reached", "sonesh is a garbage programmer");
    telemetry.update();
    FrontBeaconPusher.setPosition(0.9);
    java.lang.Thread.sleep(1000);
    FrontBeaconPusher.setPosition(0.15);
}