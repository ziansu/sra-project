public void startVelocity() {
    vectorDriveActive = true;
    driveThreadActive = true;
    driveThread.start();
}