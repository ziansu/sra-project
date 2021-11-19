public final void interruptWorker() {
    if ((workerRef) == null)
        return ;
    
    if (workerRef.isAlive()) {
        workerRef.interrupt();
    }
    workerRef.cleanAfterInterrupt();
}