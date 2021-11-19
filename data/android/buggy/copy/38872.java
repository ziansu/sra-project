@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    synchronized(this) {
        activityStack.pop();
    }
}