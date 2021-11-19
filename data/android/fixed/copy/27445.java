@java.lang.Override
public synchronized boolean act(com.xengine.android.toolkit.sm.XAction action) {
    if (action == null) {
        return false;
    }
    return mActionQueue.offer(action);
}