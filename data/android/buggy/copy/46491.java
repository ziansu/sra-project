com.twitter.heron.scheduler.yarn.HeronMasterDriver.HeronWorker lookupByWorkerId(java.lang.String workerId) {
    com.twitter.heron.scheduler.yarn.HeronMasterDriver.HeronWorker worker = null;
    synchronized(workerMap) {
        worker = workerMap.get(workerId);
    }
    if (worker == null) {
        com.twitter.heron.scheduler.yarn.HeronMasterDriver.LOG.log(java.util.logging.Level.WARNING, "Container for executor id: {0} not found.", workerId);
    }
    return worker;
}