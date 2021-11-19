static java.lang.Runnable decorateRunnable(com.codahale.metrics.Timer timer, java.lang.Runnable runnable) {
    return () -> {
        try (com.codahale.metrics.Timer.Context context = timer.time()) {
            runnable.run();
        }
    };
}