@java.lang.Override
protected void onPause() {
    super.onPause();
    sm.unregisterListener(this);
}