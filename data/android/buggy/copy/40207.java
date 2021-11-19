public void startWatchDog() {
    if ((watchDog) != null)
        watchDog.start();
    else
        logger.error("Attempted to start a non-existant WatchDog.");
    
}