private void resume() {
    synchronized(lock) {
        if (!(pendingPause.getAndSet(false))) {
            lock.notify();
        }else {
        }
    }
}