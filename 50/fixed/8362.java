@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
public static void tintTaskDescription(int colorId, java.lang.String name, android.app.Activity activity) {
    android.app.ActivityManager.TaskDescription tDesc = new android.app.ActivityManager.TaskDescription(name, null, activity.getResources().getColor(colorId));
    activity.setTaskDescription(tDesc);
}