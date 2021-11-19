public long timePassed() {
    if ((stopClock) == false) {
        return (java.lang.System.currentTimeMillis()) - (startTime);
    }else {
        return maxTime;
    }
}