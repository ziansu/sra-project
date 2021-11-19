public void notifySlaveCount(int numSlaves) {
    if ((numSlavesFinished) >= 1) {
        sol.getSolution().markReady();
        sol.notifySolution();
    }
}