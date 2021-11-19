public void stopService() {
    serviceManager.stop();
    if (wakeLock.isHeld())
        wakeLock.release();
    
}