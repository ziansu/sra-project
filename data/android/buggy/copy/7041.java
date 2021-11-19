public boolean getFlagSoftStopCondition() {
    if (!(isBoost)) {
        return false;
    }
    return isSoftStopCondition;
}