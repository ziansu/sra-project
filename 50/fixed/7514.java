public void start(int interval) {
    _executor.scheduleWithFixedDelay(new com.nchen.impl.Monitor.NoiseTask(), 0, 1, java.util.concurrent.TimeUnit.SECONDS);
    _executor.scheduleWithFixedDelay(new com.nchen.impl.Monitor.CheckTask(), interval, interval, java.util.concurrent.TimeUnit.SECONDS);
}