private java.lang.String getPreviousCommand() {
    if ((pointer) > 0) {
        (pointer)--;
    }
    return historyLog.get(pointer);
}