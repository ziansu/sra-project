@java.lang.Override
public void dispose() {
    super.dispose();
    synchronized(this) {
        for (final gov.pnnl.svf.update.WorkerUpdateTaskRunnable runnable : runnables) {
            runnable.disposed(this);
        }
    }
}