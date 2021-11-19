public void disableIntervalLoop() {
    setIsLoopMode(preLoopMode);
    isIntervalLoop = false;
    autoLoopHandler.removeCallbacks(transformTask);
}