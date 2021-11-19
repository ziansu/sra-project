@java.lang.Override
public synchronized void onTaskFailure(long taskId) {
    for (com.bolyartech.forge.task.Listener<T> l : mListeners) {
        l.onExchangeOutcome(taskId, true, null);
    }
    mTasks.remove(taskId);
}