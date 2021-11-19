private void playMedia() {
    java.lang.String title = getMediaStateListener().getTitle();
    playUri(mLocalVideoUri, title, mStartPositionMillis);
}