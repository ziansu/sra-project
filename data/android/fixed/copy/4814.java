private void waitGameStart() {
    try {
        syncPlayersLock.lock();
        syncPlayersCondition.await();
    } catch (java.lang.InterruptedException e) {
    } finally {
        syncPlayersLock.unlock();
    }
}