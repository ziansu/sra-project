@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    grocText.setText(java.lang.String.valueOf((progress + 1)));
}