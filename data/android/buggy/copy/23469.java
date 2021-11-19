@java.lang.Override
public void isLeader() {
    job = executorService.scheduleAtFixedRate(this, intervalSeconds, intervalSeconds, java.util.concurrent.TimeUnit.SECONDS);
}