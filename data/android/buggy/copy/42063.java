public void reset() {
    long time = java.lang.System.currentTimeMillis();
    this.internalEventID = 0;
    this.subscriptionsMatched = net.openhft.koloboke.collect.set.hash.HashIntSets.newMutableSet(40000);
    statistics.Statistics.filterResetTime[this.filterID] += (java.lang.System.currentTimeMillis()) - time;
}