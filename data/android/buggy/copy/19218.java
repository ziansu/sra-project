@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progressValue, boolean fromUser) {
    User = fromUser;
    progress = ((int) (java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(progressValue)));
}