@java.lang.Override
public void run() {
    try {
        while (true) {
            java.lang.Thread.sleep(10000);
            validateRegistryEntry();
            replicateFile(replication_factor);
        } 
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}