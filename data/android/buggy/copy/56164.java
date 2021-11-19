public round_robin.Event activeProcessLeft(long clock) {
    if ((activeProcess) == null) {
        activeProcess = cpuQueue.pop();
        return switchProcess(clock);
    }
    return null;
}