@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((bfv.enemyThread) != null) {
        bfv.enemyThread.paused = true;
    }
    android.util.Log.i("Stop--", "OnStop");
}