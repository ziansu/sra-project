@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (progress == 0) {
        progress = 1;
    }
    timer = progress;
    timerTextView.setText(java.lang.String.valueOf(timer));
}