private double timeSpan(double time) {
    if ((startTime) <= (-1)) {
        startTime = time;
    }
    return time - (startTime);
}