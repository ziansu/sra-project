public void cancel() {
    canceled = true;
    java.lang.Thread.currentThread().interrupt();
}