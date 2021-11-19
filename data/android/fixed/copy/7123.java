@java.lang.Override
public void run() {
    if (!(userIsSeeking)) {
        seekBar.setProgress(getCurrentPosition());
        textCurrentTime.setText(getTimeString(getCurrentPosition()));
    }
}