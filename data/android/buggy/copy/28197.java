public void shutDownLiveThreads() {
    boolean isTerminated = executor.isTerminated();
    while (!isTerminated) {
        executor.shutdownNow();
        isTerminated = executor.isTerminated();
    } 
}