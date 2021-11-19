public boolean restartTopology() {
    boolean result = true;
    for (com.twitter.heron.scheduler.yarn.HeronMasterDriver.HeronWorker worker : multiKeyWorkerMap.getHeronWorkers()) {
        result &= restartWorker(worker.workerId);
    }
    return result;
}