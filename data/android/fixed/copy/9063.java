@java.lang.Override
public void stop() {
    running.set(false);
    try {
        thread.join();
    } catch (java.lang.InterruptedException ignored) {
    }
}