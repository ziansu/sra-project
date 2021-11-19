public void stop() {
    launchTask.cancel(true);
    try {
        ss.close();
    } catch (java.io.IOException e) {
    }
}