public static void Vibrate(android.content.Context context, long milliseconds) {
    android.os.Vibrator vib = ((android.os.Vibrator) (context.getSystemService(Service.VIBRATOR_SERVICE)));
    vib.vibrate(milliseconds);
}