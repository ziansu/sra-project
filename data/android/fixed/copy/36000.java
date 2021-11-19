boolean isTimedOut() {
    if (((triggerHandle) != null) && (triggerHandle.isDone())) {
        return true;
    }
    return false;
}