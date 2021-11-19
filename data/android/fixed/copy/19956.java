public static void switchOffSound(android.content.Context context) {
    com.github.varepsilon.TempSwitcher.AlarmReceiver.setRingerMode(context, AudioManager.RINGER_MODE_VIBRATE);
}