public boolean resetIfHoursElapsed(long hours) {
    if ((getHoursElapsed()) >= hours) {
        resetTimeKeeper();
        return true;
    }
    return false;
}