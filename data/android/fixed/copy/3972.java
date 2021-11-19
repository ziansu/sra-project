@java.lang.Override
protected void onResume() {
    super.onResume();
    lock = false;
    if ((login_video) != null) {
        login_video.start();
    }
}