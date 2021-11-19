@java.lang.Override
protected boolean isFinished() {
    if (((leftFollower.error) < 0.1) && ((rightFollower.error) < 0.1)) {
        return true;
    }
    return false;
}