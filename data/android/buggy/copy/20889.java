@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((networkReceiver) != null) {
        this.unregisterReceiver(networkReceiver);
    }
    java.lang.Process.killProcess(java.lang.Process.myPid());
}