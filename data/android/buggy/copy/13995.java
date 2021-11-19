@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(timeout);
        this.pthread.interrupt();
    } catch (java.lang.InterruptedException e) {
    }
}