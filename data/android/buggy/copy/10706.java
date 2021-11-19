@java.lang.Override
protected void onDestroy() {
    storeIP();
    android.os.Process.killProcess(android.os.Process.myPid());
    super.onDestroy();
}