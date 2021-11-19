public void startPosition() {
    vectorDriveActive = false;
    driveThreadActive = true;
    if (!(driveThread.isAlive()))
        driveThread.start();
    
}