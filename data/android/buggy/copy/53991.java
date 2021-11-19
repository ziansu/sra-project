public void startStrategy(nl.tudelft.jpacman.strategy.PacmanStrategy strategy) {
    this.strategy = strategy;
    synchronized(startStopLock) {
        if (isInProgress()) {
            return ;
        }
        strategy.executeStrategy();
    }
}