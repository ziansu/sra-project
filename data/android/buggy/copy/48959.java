@java.lang.Override
protected void onDestroy() {
    this.stopService(service);
    save();
    gameThreadRunning = false;
    dbHelper.close();
    super.onDestroy();
}