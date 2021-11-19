public round_robin.Event activeProcessLeft(long clock) {
    activeProcess = null;
    return switchProcess(clock);
}