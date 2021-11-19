@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    float value = minYaw + (progress * stepYaw);
    CurrentYawSpeed.setText(java.lang.Float.toString(value));
}