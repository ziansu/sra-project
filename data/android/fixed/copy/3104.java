public void stopRun() {
    synchronized(this) {
        Strategy.logger.info(("STOPPED : " + (this.runFlag)));
        this.runFlag = false;
    }
}