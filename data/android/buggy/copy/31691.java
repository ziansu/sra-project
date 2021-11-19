public static void Vibrate(final android.app.Activity activity, long milliseconds) {
    android.os.Vibrator vib = ((android.os.Vibrator) (activity.getSystemService(Service.VIBRATOR_SERVICE)));
    vib.vibrate(milliseconds);
}