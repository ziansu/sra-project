@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    synchronized(this) {
        activityStack.push(new java.lang.ref.WeakReference(activity));
    }
}