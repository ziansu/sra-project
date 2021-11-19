@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mPlayer) != null) {
        mPlayer.setPlayWhenReady(true);
    }
}