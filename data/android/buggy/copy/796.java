@java.lang.Override
public void run() {
    try {
        r.run();
    } finally {
        synchronized(this) {
            currentRunningJob = null;
        }
    }
}