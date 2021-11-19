public void setThreadCount(int threadCount) {
    this.threadCount = (java.lang.Runtime.getRuntime().availableProcessors()) + threadCount;
}