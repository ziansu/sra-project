public boolean resetIfHoursElapsed(long hours) {
    if (hours >= (getHoursElapsed())) {
        resetTimeKeeper();
        return true;
    }
    return false;
}