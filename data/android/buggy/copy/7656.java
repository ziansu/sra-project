protected void skipNextIteration() {
    if ((stepSkipIterationCounter) == 0) {
        (stepSkipIterationCounter)++;
        clearCommunicationAgent();
        progressCommandReceiverToSkipNextIteration();
    }
}