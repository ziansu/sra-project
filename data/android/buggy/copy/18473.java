@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    updateYouServer((-1), NO_HANGOUT, you.getLatitude(), you.getLongitude(), NOTHING);
}