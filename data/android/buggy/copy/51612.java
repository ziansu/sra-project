@java.lang.Override
protected void onPause() {
    if (isFinishing()) {
        cleanUp();
    }else {
        mPlayer.pause();
    }
    super.onPause();
}