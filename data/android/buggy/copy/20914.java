public void incRetries() {
    (retries)++;
    waitUntil = (java.lang.System.currentTimeMillis()) + 1000;
}