private boolean selectedDebugIntervalShouldBeReset() {
    return (!(latestDebugIntervals.isEmpty())) && (((selectedDebugInterval) == null) || (!(latestDebugIntervals.contains(selectedDebugInterval))));
}