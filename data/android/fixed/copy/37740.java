private java.lang.String getPreviousCommand() {
    if ((pointer) <= 0) {
        return historyLog.get(pointer);
    }
    (pointer)--;
    return historyLog.get(pointer);
}