@java.lang.Override
public void run() {
    synchronized(this) {
        try {
            r.run();
        } finally {
            currentRunningJob = null;
        }
    }
}