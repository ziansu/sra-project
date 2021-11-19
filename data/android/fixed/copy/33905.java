public void finishActivity() {
    android.app.Activity activity = com.hitomi.aslibrary.ActivityManager.activityStack.get(((com.hitomi.aslibrary.ActivityManager.activityStack.size()) - 1));
    finishActivity(activity);
}