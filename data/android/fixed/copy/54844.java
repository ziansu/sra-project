@java.lang.Override
protected void onStart() {
    android.util.Log.d(com.mixey69.roulettevideochat.MainActivity.LOG_TAG, "onStart");
    super.onStart();
    mConnectionManager.init(this);
}