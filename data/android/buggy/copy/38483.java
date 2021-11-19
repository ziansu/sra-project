public void start() {
    java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();
    java.util.concurrent.Future<?> future = executor.submit(mAcceptTask);
}