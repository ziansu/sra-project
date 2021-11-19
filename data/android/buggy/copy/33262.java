public void execute(java.lang.Runnable r) {
    executor.execute(() -> {
        counter.threadStarted();
        try {
            r.run();
        } finally {
            counter.threadFinished();
        }
    });
}