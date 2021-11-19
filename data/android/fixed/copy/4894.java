public round_robin.Event insertProcess(java.lang.Process p, long clock) {
    cpuQueue.add(p);
    if ((activeProcess) == null) {
        return this.switchProcess(clock);
    }
    return null;
}