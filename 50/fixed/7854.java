@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
private static boolean isSystemAlertPermissionGranted(android.content.Context context) {
    return ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.M)) || (android.provider.Settings.canDrawOverlays(context));
}