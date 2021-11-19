@java.lang.Override
protected void onResume() {
    super.onResume();
    if (mPaused) {
        broadcastResult(null, Activity.RESULT_CANCELED);
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}