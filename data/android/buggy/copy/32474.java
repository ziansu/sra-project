public void finishActivity(android.app.Activity activity) {
    if (activity != null) {
        de.mpg.mpdl.labcam.code.common.AppManager.activityStack.remove(activity);
        activity.finish();
        activity = null;
    }
}