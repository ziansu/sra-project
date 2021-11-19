public void stopWatchDog() {
    if ((this.watchDog) != null)
        this.watchDog.stop();
    else
        logger.error("Attempted to stop a non-existant WatchDog.");
    
}