@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    android.util.Log.d(com.byagowi.persiancalendar.view.AthanVolumePreference.TAG, ("volume: " + progress));
    com.byagowi.persiancalendar.view.AthanVolumePreference.audioManager.setStreamVolume(AudioManager.STREAM_ALARM, progress, 0);
}