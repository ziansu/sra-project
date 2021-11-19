@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mPlayerReady = false;
    mPlayer.release();
}