public java.util.TreeMap<version2.prototype.Scheduler.ProcessName, java.lang.Integer> GetWorkersInQueuePerProcess() {
    return cloneTreeMapProcessNameInteger(workersInQueuePerProcess, true);
}