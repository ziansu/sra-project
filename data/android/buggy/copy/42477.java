@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progresValue, boolean fromUser) {
    progress = progresValue;
    sunView.redraw(progress);
}