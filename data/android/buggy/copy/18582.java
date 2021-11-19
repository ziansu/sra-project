@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    mCurrentTimeTV.setText(android.text.format.DateUtils.formatElapsedTime((i / 1000)));
}