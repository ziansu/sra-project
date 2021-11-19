public void stopRun() {
    Strategy.logger.info(("STOPPED : " + (this.runFlag)));
    this.runFlag = false;
}