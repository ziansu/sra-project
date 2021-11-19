public void setRunning(boolean running) {
    this.isRunning = running;
    if (!running) {
        uw.hcrlab.kubi.screen.RobotFaceUtils.showAction(robotFace, Action.SLEEP);
        kubiFaceDown();
    }
}