public long getPeriodicSyncTime(int index) {
    if (((periodicSyncTimes) == null) || ((periodicSyncTimes.size()) < (index + 1))) {
        return 0;
    }
    return periodicSyncTimes.get(index);
}