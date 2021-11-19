public void leftIo(long clock) {
    timeSpentInIo += clock - (timeOfLastEvent);
    timeOfNextIo = clock + (avgIoInterval);
    timeToNextIoOperation = calcuateTimeToNextIoOperation(clock);
    timeOfLastEvent = clock;
}