public void addEvent(int eventID) {
    this.hybridEventsWork[((this.numberEvents)++)] = new matching.eventProcessor.parallel.HybridEvent(eventID);
    startThreads();
}