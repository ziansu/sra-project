protected void skipNextIteration() {
    (stepSkipIterationCounter)++;
    clearCommunicationAgent();
    progressCommandReceiverToSkipNextIteration();
}