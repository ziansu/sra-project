public void removePeriodicSyncTime(int index) {
    ensurePeriodicSyncTimeSize(index);
    periodicSyncTimes.remove(index);
}