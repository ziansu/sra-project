public synchronized void shutdown() {
    super.shutdown();
    if ((exporter) != null)
        exporter.interrupt();
    
}