public synchronized void verifyWeShouldTryToAllocateMoreTimestamps() {
    if ((previousAllocationFailure) instanceof com.palantir.timestamp.MultipleRunningTimestampServiceError) {
        throw wrapMultipleRunningTImestampServiceError(previousAllocationFailure);
    }
}