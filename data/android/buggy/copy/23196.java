public android.app.Activity getCurrentActivity() {
    android.app.Activity activity = com.hitomi.aslibrary.ActivityManager.activityStack.lastElement();
    return activity;
}