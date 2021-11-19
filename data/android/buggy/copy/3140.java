@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((motherService) != null) {
        unbindService(this);
    }
}