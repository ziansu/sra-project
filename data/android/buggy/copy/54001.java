@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    mMap.clear();
    circleOptions.radius((progress * 50));
    mMap.addCircle(circleOptions);
}