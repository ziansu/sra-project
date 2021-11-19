@java.lang.Override
public void isLeader() {
    job = executorService.scheduleAtFixedRate(this, 0, intervalSeconds, java.util.concurrent.TimeUnit.SECONDS);
}