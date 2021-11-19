@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    android.media.MediaPlayer.create(getApplicationContext(), R.raw.highway_info);
    delayedHide(100);
}