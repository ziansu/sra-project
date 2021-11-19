@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (isBound) {
        getApplicationContext().unbindService(this);
        isBound = false;
    }
}