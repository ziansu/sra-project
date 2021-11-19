private void doNoisy(java.lang.Runnable body) {
    boolean wasNoisy = NOISY;
    NOISY = true;
    try {
        body.run();
    } finally {
        NOISY = wasNoisy;
    }
}