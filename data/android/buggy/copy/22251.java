@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((mPlayer) == null) {
        init();
    }else {
        mPlayer.start();
    }
}