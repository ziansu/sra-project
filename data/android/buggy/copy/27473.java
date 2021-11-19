private boolean isTimeUpdate() {
    long diff = (java.lang.System.currentTimeMillis()) - (lastStatusUpdate);
    return diff >= (updateInterval);
}