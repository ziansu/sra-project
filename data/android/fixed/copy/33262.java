public void execute(java.lang.Runnable r) {
    counter.threadStarted();
    executor.execute(() -> {
        try {
            r.run();
        } finally {
            counter.threadFinished();
        }
    });
}