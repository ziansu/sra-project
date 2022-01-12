private static synchronized void stopVibrate() {
    if ((org.catrobat.catroid.utils.VibratorUtil.vibrator) != null) {
        android.util.Log.d(org.catrobat.catroid.utils.VibratorUtil.TAG, "stopVibrate()");
        org.catrobat.catroid.utils.VibratorUtil.vibrator.cancel();
    }
}