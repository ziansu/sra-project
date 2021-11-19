public void finishActivity(android.app.Activity activity) {
    if ((activity != null) && (!(activity.isFinishing()))) {
        activityStack.remove(activity);
        activity.finish();
    }
}