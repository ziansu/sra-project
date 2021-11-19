private void stopCollection(java.lang.String key) {
    synchronized(this.logCollector) {
        org.slf4j.MDC.remove(key);
        if ((this.logCollector) != null) {
            this.logCollector.stopCollection(key);
        }
    }
}