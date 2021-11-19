@java.lang.Override
public void run() {
    try {
        this.setFile();
        this.scheduleNextRollover();
        this.removeOldFiles();
    } catch (java.io.IOException e) {
        e.printStackTrace(java.lang.System.err);
    }
}