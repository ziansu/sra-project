@java.lang.Override
public void run() {
    while (isRunning()) {
        checkInterrupted();
        org.threadly.concurrent.TaskWrapper nextTask = workerPool.workerIdle(this);
        if (nextTask != null) {
            nextTask.runTask();
        }
    } 
}