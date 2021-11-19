public boolean setStartTime(java.time.ZonedDateTime startTime) {
    if (startTime.isBefore(this.endTime)) {
        this.startTime = startTime;
        return true;
    }
    return false;
}