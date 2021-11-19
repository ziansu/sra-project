public boolean cancel() {
    if ((curTask) == null) {
        return false;
    }
    curTask = null;
    return true;
}