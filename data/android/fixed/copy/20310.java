private void activateBeacon(double pusherPower) throws java.lang.InterruptedException {
    boolean foundBeacon = dDrive.stopAtBeacon(this.getColor(), 5000);
    if (!foundBeacon) {
        throw new java.lang.IllegalStateException("No Beacon");
    }
    this.pressButton(pusherPower);
}