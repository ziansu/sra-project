@java.lang.Deprecated
public boolean next() {
    int amount = Settings.IMP.QUEUE.PARALLEL_THREADS;
    long time = 20;
    return next(amount, time);
}