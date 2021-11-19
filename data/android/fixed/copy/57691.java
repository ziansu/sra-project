@java.lang.Override
public final void run() {
    if (waitNextWatchingRequested) {
        waitNextWatchingDone = true;
    }
    if (isRunning) {
        return ;
    }
    isRunning = true;
    rootDirectoryWatcher.watch();
    if (waitNextWatchingRequested) {
        waitNextWatchingRequested = false;
    }
    isRunning = false;
}