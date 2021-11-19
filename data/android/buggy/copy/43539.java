@org.apache.nifi.annotation.lifecycle.OnUnscheduled
public void shutdownExecutor() {
    try {
        executor.shutdown();
    } finally {
        if (this.externalProcess.isAlive()) {
            this.getLogger().info("Process hasn't terminated, forcing the interrupt");
            this.externalProcess.destroy();
        }
    }
}