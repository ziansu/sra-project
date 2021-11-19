public boolean cancel() {
    if ((curTask) == null) {
        return false;
    }
    curTask.reset();
    return true;
}