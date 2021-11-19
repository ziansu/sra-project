@java.lang.Override
protected void onPause() {
    cleanUp();
    super.onPause();
}