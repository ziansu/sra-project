@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    tvMaxKm.setText(((seekBar.getProgress()) + "km"));
}