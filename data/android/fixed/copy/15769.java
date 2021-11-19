public void stop() {
    java.lang.Boolean value = active.get();
    if (value == null ? false : value) {
        handler.removeCallbacks(runnable);
    }
}