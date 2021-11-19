public synchronized void post(java.lang.Runnable runnable) {
    postDelayed(runnable, 0, java.util.concurrent.TimeUnit.MILLISECONDS);
}