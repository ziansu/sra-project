@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    yearsTerm.setText(((yearsBar.getProgress()) + " Year(s)"));
}