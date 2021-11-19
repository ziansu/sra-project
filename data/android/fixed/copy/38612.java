@java.lang.Override
public boolean isTerminated() {
    synchronized(lock) {
        return (shutdown) && ((runningTasks) == 0);
    }
}