protected boolean isFinished() {
    if ((speed) > 0) {
        return intake.isWhiskerSwitchTriggered();
    }
    return false;
}