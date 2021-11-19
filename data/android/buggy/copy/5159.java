@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    double value = ((progress * stepAgl) * 30) / 52;
    CurrentAngle.setText(java.lang.Double.toString(value));
}